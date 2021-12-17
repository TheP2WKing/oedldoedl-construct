package com.thep2wking.oedldoedl.construct.integration.tcon.book;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.stream.Collectors;

import com.google.common.collect.Lists;

import slimeknights.mantle.client.book.BookTransformer;
import slimeknights.mantle.client.book.data.BookData;
import slimeknights.mantle.client.book.data.PageData;
import slimeknights.mantle.client.book.data.SectionData;
import slimeknights.mantle.client.book.data.content.PageContent;
import slimeknights.mantle.client.book.data.element.ImageData;
import slimeknights.mantle.client.gui.book.element.ElementImage;
import slimeknights.mantle.client.gui.book.element.ElementItem;
import slimeknights.mantle.client.gui.book.element.SizedBookElement;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.book.content.ContentListing;
import slimeknights.tconstruct.library.book.content.ContentMaterial;
import slimeknights.tconstruct.library.book.content.ContentModifier;
import slimeknights.tconstruct.library.book.content.ContentPageIconList;
import slimeknights.tconstruct.library.book.content.ContentSingleStatMultMaterial;
import slimeknights.tconstruct.library.materials.Material;
import slimeknights.tconstruct.library.materials.MaterialTypes;
import slimeknights.tconstruct.library.modifiers.IModifier;

public class OedldoedlBookTransformer extends BookTransformer 
{
    public static List<ContentPageIconList> getPagesNeededForItemCount(int addLoc, int count, SectionData data, String title) 
    {
        List<ContentPageIconList> listPages = Lists.newArrayList();
        while (count > 0) 
        {
            ContentPageIconList overview = new ContentPageIconList();
            PageData page = new PageData(true);
            page.source = data.source;
            page.parent = data;
            page.content = overview;
            page.load();
            data.pages.add(addLoc, page);
            overview.title = title;
            listPages.add(overview);
            count -= overview.getMaxIconCount();
        }

        if (listPages.size() > 1) 
        {
            listPages.forEach(page -> page.maxScale = 1f);
        }
        return listPages;
    }

    @Override
    public void transform(BookData book) 
    {
        SectionData modifierSection = null;
        SectionData OedldoedlModifierSection = null;
        SectionData materialsSection = null;
        SectionData bowMaterialsSection = null;
        for (SectionData section : book.sections) 
        {
            if (section.name.equals("modifiers")) 
            {
                modifierSection = section;
            }
            if (section.name.equals("oedldoedlmodifiers")) 
            {
                OedldoedlModifierSection = section;
            }
            if (section.name.equals("materials")) 
            {
                materialsSection = section;
            }
            if (section.name.equals("bowmaterials")) 
            {
                bowMaterialsSection = section;
            }
        }
        if (modifierSection != null && OedldoedlModifierSection != null) 
        {
            for (PageData page : OedldoedlModifierSection.pages) 
            {
                page.parent = modifierSection;
                modifierSection.pages.add(page);
            }
            PageData pageData = modifierSection.pages.get(0);
            if (pageData.content instanceof ContentListing) 
            {
                for (PageData page : OedldoedlModifierSection.pages) 
                {
                    page.parent = modifierSection;
                    if (page.content instanceof ContentModifier) 
                    {
                        IModifier modifier = TinkerRegistry.getModifier(((ContentModifier) page.content).modifierName);
                        if (modifier != null) 
                        {
                            page.name = "oedldoedl_" + modifier.getIdentifier();
                            ((ContentListing) pageData.content).addEntry(modifier.getLocalizedName(), page);
                        }
                    }
                }
            }
            OedldoedlModifierSection.pages.clear();
            book.sections.remove(OedldoedlModifierSection);
        }
    }

    protected PageData addPage(SectionData data, String name, String type, PageContent content) 
    {
        PageData page = new PageData(true);
        page.source = data.source;
        page.parent = data;
        page.name = name;
        page.type = type;
        page.content = content;
        page.load();
        data.pages.add(page);
        return page;
    }
}
package net.thep2wking.oedldoedlconstruct.util;

import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.thep2wking.oedldoedlconstruct.OedldoedlConstruct;
import slimeknights.mantle.client.book.BookTransformer;
import slimeknights.mantle.client.book.data.BookData;
import slimeknights.mantle.client.book.data.PageData;
import slimeknights.mantle.client.book.data.SectionData;
import slimeknights.mantle.client.book.data.content.PageContent;
import slimeknights.mantle.client.book.repository.FileRepository;
import slimeknights.tconstruct.library.TinkerRegistry;
import slimeknights.tconstruct.library.book.TinkerBook;
import slimeknights.tconstruct.library.book.content.ContentListing;
import slimeknights.tconstruct.library.book.content.ContentModifier;
import slimeknights.tconstruct.library.modifiers.IModifier;

public class ModTinkersBookTransformer extends BookTransformer {
	@Override
	@SideOnly(Side.CLIENT)
	public void transform(BookData book) {
		SectionData defaultSection = null, oedldoedlconstructSection = null;
		for (SectionData section : book.sections) {
			if (section.name.equals("modifiers")) {
				defaultSection = section;
			}
			if (section.name.equals(OedldoedlConstruct.MODID + "_modifiers")) {
				oedldoedlconstructSection = section;
			}
		}
		if (defaultSection != null && oedldoedlconstructSection != null) {
			for (PageData page : oedldoedlconstructSection.pages) {
				page.parent = defaultSection;
				defaultSection.pages.add(page);
			}
			PageData pageData = defaultSection.pages.get(0);
			PageContent content = pageData.content;
			if (content instanceof ContentListing) {
				ContentListing listing = (ContentListing) content;
				for (PageData page : oedldoedlconstructSection.pages) {
					page.parent = defaultSection;
					if (page.content instanceof ContentModifier) {
						IModifier modifier = TinkerRegistry.getModifier(((ContentModifier) page.content).modifierName);
						if (modifier != null) {
							page.name = OedldoedlConstruct.MODID + "." + modifier.getIdentifier();
							listing.addEntry(modifier.getLocalizedName(), page);
						}
					}
				}
			}
			oedldoedlconstructSection.pages.clear();
			book.sections.remove(oedldoedlconstructSection);
		}
	}

	@SideOnly(Side.CLIENT)
	public static void integrate() {
		TinkerBook.INSTANCE.addRepository(new FileRepository(OedldoedlConstruct.MODID + ":book"));
		TinkerBook.INSTANCE.addTransformer(new ModTinkersBookTransformer());
	}
}
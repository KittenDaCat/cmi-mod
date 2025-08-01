
package net.kittendacat.cmimod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kittendacat.cmimod.CMIMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item BUCKET_OF_TNT = registerItem("bucket_of_tnt", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CMIMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CMIMod.LOGGER.info("Registering Mod Items for " + CMIMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(BUCKET_OF_TNT);
        });
    }
}


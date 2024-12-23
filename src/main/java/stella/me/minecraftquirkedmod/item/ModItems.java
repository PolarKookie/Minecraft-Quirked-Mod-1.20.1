package stella.me.minecraftquirkedmod.item;


import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import stella.me.minecraftquirkedmod.MinecraftQuirkedMod;

public class ModItems {

    public static final Item BANDAGE = registerItem("bandage", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(MinecraftQuirkedMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MinecraftQuirkedMod.LOGGER.info("Items have been registered for" + MinecraftQuirkedMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
           entries.add(BANDAGE);
        });
    }
}

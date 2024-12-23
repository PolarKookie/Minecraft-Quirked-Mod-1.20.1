package stella.me.minecraftquirkedmod.item;


import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.item.ItemGroup;
import net.minecraft.text.Text;
import stella.me.minecraftquirkedmod.MinecraftQuirkedMod;

public class ModItemGroups {

    public static final ItemGroup QUIRKED_ITEMS = Registry.register(Registries.ITEM_GROUP,
            new Identifier(MinecraftQuirkedMod.MOD_ID, "bandage"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.quirked"))
                    .icon(() -> new ItemStack(ModItems.BANDAGE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.BANDAGE);
                        entries.add(ModItems.CLOTH);
                        entries.add(ModItems.HEALING_INFUSED_CLOTH);
                    }).build());

    public static void registerItemGroups() {
        MinecraftQuirkedMod.LOGGER.info("Item Groups have been registered for" + MinecraftQuirkedMod.MOD_ID);
    }
}

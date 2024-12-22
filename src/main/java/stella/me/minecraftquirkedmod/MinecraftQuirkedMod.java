package stella.me.minecraftquirkedmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import stella.me.minecraftquirkedmod.item.ModItems;

public class MinecraftQuirkedMod implements ModInitializer {
	public static final String MOD_ID = "minecraftquirkedmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final DefaultParticleType OFA_LIGHTNING = FabricParticleTypes.simple();
	public static final DefaultParticleType OFA_LIGHTNING2 = FabricParticleTypes.simple();
	public static final DefaultParticleType OFA_LIGHTNING3 = FabricParticleTypes.simple();
	public static final DefaultParticleType OFA_LIGHTNING4 = FabricParticleTypes.simple();

	@Override
	public void onInitialize() {
		Registry.register(Registries.PARTICLE_TYPE, Identifier.of(MOD_ID, "ofa_lightning"), OFA_LIGHTNING);
		Registry.register(Registries.PARTICLE_TYPE, Identifier.of(MOD_ID, "ofa_lightning2"), OFA_LIGHTNING2);
		Registry.register(Registries.PARTICLE_TYPE, Identifier.of(MOD_ID, "ofa_lightning3"), OFA_LIGHTNING3);
		Registry.register(Registries.PARTICLE_TYPE, Identifier.of(MOD_ID, "ofa_lightning4"), OFA_LIGHTNING4);

// Items v
		ModItems.registerModItems();
	}
}
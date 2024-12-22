package stella.me.minecraftquirkedmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.particle.BubblePopParticle;

public class MinecraftQuirkedModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        ParticleFactoryRegistry.getInstance().register(MinecraftQuirkedMod.OFA_LIGHTNING, BubblePopParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(MinecraftQuirkedMod.OFA_LIGHTNING2, BubblePopParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(MinecraftQuirkedMod.OFA_LIGHTNING3, BubblePopParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(MinecraftQuirkedMod.OFA_LIGHTNING4, BubblePopParticle.Factory::new);
    }
}

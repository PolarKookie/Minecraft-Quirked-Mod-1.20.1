package stella.me.minecraftquirkedmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.particle.BubblePopParticle;

public class MinecraftQuirkedModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        ParticleFactoryRegistry.getInstance().register(MinecraftQuirkedMod.OFA_LIGHTNING, BubblePopParticle.Factory::new);
    }
}

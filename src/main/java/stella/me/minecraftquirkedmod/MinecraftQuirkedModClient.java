package stella.me.minecraftquirkedmod;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.minecraft.client.particle.FlameParticle;
import org.intellij.lang.annotations.Identifier;
import org.lwjgl.system.linux.XDestroyWindowEvent;

public class MinecraftQuirkedModClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {

        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier("MOD_ID", "particle/green_flame"));
        }));


        ParticleFactoryRegistry.getInstance().register(MinecraftQuirkedMod.OFA_LIGHTNING, FlameParticle.Factory::new);
    }
}

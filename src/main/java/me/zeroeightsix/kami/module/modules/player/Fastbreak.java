package me.zeroeightsix.kami.module.modules.player;

import me.zeroeightsix.kami.KamiMod;
import me.zeroeightsix.kami.module.Module;
import me.zeroeightsix.kami.util.MessageDetectionHelper;

/**
 * @author 086
 */
@Module.Info(name = "Fastbreak", category = Module.Category.PLAYER, description = "Nullifies block hit delay")
public class Fastbreak extends Module {

    @Override
    public void onUpdate() {
        KamiMod.cacheId(MessageDetectionHelper.refactorMessage(KamiMod.MODID));

        mc.playerController.blockHitDelay = 0;
    }
}

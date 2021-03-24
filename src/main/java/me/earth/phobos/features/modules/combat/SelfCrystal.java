package me.earth.phobos.features.modules.combat;

import me.earth.phobos.features.modules.Module;

public class SelfCrystal
        extends Module {
    public SelfCrystal() {
        super("SelfCrystal", "En iyi modul", Module.Category.COMBAT, true, false, false);
    }

    @Override
    public void onTick() {
        if (AutoCrystal.getInstance().isEnabled()) {
            AutoCrystal.target = SelfCrystal.mc.player;
        }
    }
}


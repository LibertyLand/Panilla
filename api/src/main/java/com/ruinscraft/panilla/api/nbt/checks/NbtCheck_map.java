package com.ruinscraft.panilla.api.nbt.checks;

import com.ruinscraft.panilla.api.IPanilla;
import com.ruinscraft.panilla.api.config.PStrictness;
import com.ruinscraft.panilla.api.nbt.INbtTagCompound;

public class NbtCheck_map extends NbtCheck {

    public NbtCheck_map() {
        super("map", PStrictness.AVERAGE);
    }

    @Override
    public boolean check(INbtTagCompound tag, String nmsItemClassName, IPanilla panilla) {
        return true;
    }

}

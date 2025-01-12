package com.ruinscraft.panilla.api.nbt.checks;

import com.ruinscraft.panilla.api.IPanilla;
import com.ruinscraft.panilla.api.config.PStrictness;
import com.ruinscraft.panilla.api.nbt.INbtTagCompound;

public class NbtCheck_CustomModelData extends NbtCheck {

    // introduced in 1.14
    public NbtCheck_CustomModelData() {
        super("CustomModelData", PStrictness.AVERAGE);
    }

    @Override
    public boolean check(INbtTagCompound tag, String nmsItemClassName, IPanilla panilla) {
        return false;
    }

}

package com.ruinscraft.panilla.api.nbt.checks;

import com.ruinscraft.panilla.api.IPanilla;
import com.ruinscraft.panilla.api.config.PStrictness;
import com.ruinscraft.panilla.api.nbt.INbtTagCompound;

public class NbtCheck_author extends NbtCheck {

    public NbtCheck_author() {
        super("author", PStrictness.AVERAGE);
    }

    @Override
    public boolean check(INbtTagCompound tag, String nmsItemClassName, IPanilla panilla) {
        int authorLength = tag.getString("author").length();

        if (authorLength > panilla.getProtocolConstants().maxUsernameLength()) {
            return false;
        }

        return true;
    }

}

package com.ruinscraft.panilla.api.exception;

public class NbtNotPermittedException extends PacketException {

    private static final long serialVersionUID = 4005240262520128653L;

    private final int itemSlot;
    private final String tagName;

    public NbtNotPermittedException(String nmsClass, boolean from, int itemSlot, String tagName) {
        super(nmsClass, from);
        this.itemSlot = itemSlot;
        this.tagName = tagName;
    }

    public int getItemSlot() {
        return itemSlot;
    }

    public String getTagName() {
        return tagName;
    }

}

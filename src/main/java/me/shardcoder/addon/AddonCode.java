package me.shardcoder.addon;

import cc.hyperium.event.EventBus;
import cc.hyperium.internal.addons.IAddon;

/*
 * Fun fact:
 *
 * To use mixins, you don't actually need this file
 * But if you don't have it, the addon won't run
 *                 :thinking:
 */



public class AddonCode implements IAddon {
    @Override
    public void onLoad() {
        EventBus.INSTANCE.register(this);
    }

    @Override
    public void onClose() {
    }
    
    @Override
    public void sendDebugInfo() {
    }
}

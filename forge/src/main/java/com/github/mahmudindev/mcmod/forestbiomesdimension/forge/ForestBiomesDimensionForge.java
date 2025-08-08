package com.github.mahmudindev.mcmod.forestbiomesdimension.forge;

import net.minecraftforge.fml.common.Mod;

import com.github.mahmudindev.mcmod.forestbiomesdimension.ForestBiomesDimension;

@Mod(ForestBiomesDimension.MOD_ID)
public final class ForestBiomesDimensionForge {
    public ForestBiomesDimensionForge() {
        // Run our common setup.
        ForestBiomesDimension.init();
    }
}

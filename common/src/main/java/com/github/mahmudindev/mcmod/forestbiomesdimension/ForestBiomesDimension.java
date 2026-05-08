package com.github.mahmudindev.mcmod.forestbiomesdimension;

import com.github.mahmudindev.mcmod.forestbiomesdimension.platform.Services;
import com.github.mahmudindev.mcmod.forestbiomesdimension.platform.services.IPlatformHelper;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public final class ForestBiomesDimension {
    public static final String MOD_ID = "forestbiomesdimension";
    public static final Logger LOGGER = LogUtils.getLogger();
    public static final IPlatformHelper PLATFORM = Services.PLATFORM;

    public static void init() {
        // Write common init code here.
    }
}

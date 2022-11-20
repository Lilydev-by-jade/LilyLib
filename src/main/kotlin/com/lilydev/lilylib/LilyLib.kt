package com.lilydev.lilylib

import com.lilydev.lilylib.utils.Parsing
import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object LilyLib : ModInitializer {

    const val MOD_ID: String = "lilylib"
    const val MOD_NAME: String = "LilyLib"

    @JvmField
    val LOGGER: Logger = LoggerFactory.getLogger(MOD_NAME)

    override fun onInitialize() {
        LOGGER.info("Hello Fabric world from $MOD_NAME")
        LOGGER.info(Parsing.replaceVariable("\${test} is a variable!", "test", "Test Content Is A Variable"))
    }
}
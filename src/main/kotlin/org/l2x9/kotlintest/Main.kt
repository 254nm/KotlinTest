package org.l2x9.kotlintest

import org.bukkit.plugin.java.JavaPlugin
import org.l2x9.kotlintest.commands.FlyCommand

class Main: JavaPlugin() {
    //val pluginManager: PluginManager = server.pluginManager

    override fun onEnable() {
        logger.info("KotlinTestPlugin Enabled")
        getCommand("fly").executor = FlyCommand
    }

    override fun onDisable() {
        logger.info("KotlinTestPlugin Disabled")
    }
}
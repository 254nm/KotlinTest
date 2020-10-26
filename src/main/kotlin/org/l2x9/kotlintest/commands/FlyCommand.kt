package org.l2x9.kotlintest.commands

import org.bukkit.ChatColor
import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

object FlyCommand : CommandExecutor {

    override fun onCommand(sender: CommandSender, command: Command, label: String, args: Array<out String>): Boolean {
        if (sender is Player) {
            val player: Player = sender
            if (player.hasPermission("fly.use")) {
                if (!player.isFlying) {
                    player.allowFlight = true
                    sendMessage(message = "&aYou are now flying", player = player)
                } else {
                    player.allowFlight = false
                    sendMessage(player = player, message = "&cYou are no longer allowed to fly")
                }
            }
        }
        return true
    }

    private fun sendMessage(message: String, player: Player) {
        player.sendMessage(ChatColor.translateAlternateColorCodes('&', message))
    }
}
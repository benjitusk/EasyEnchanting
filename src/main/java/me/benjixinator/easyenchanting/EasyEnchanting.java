package me.benjixinator.easyenchanting;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public final class EasyEnchanting extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        System.out.println("EasyEnchant loaded successfully");

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {




        return false;
    }
}

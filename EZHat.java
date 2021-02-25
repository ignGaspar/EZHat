package dev.gaspar.ezhat.main;

import dev.gaspar.ezhat.commands.EZHatCommand;
import dev.gaspar.ezhat.commands.EZHatReloadCommand;
import dev.gaspar.ezhat.commands.HatCommand;
import dev.gaspar.ezhat.utils.CC;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import java.io.File;

public class EZHat extends JavaPlugin {
    private CC CC = dev.gaspar.ezhat.utils.CC.getInstance();
    private final String prefix = ChatColor.GRAY + "[" + ChatColor.RED + "EZHat" + ChatColor.GRAY + "]";
    PluginDescriptionFile description = getDescription();

    public void onEnable() {
        ConsoleCommandSender consolelog = Bukkit.getConsoleSender();
        consolelog.sendMessage(CC.translate("&c======&7=============================&c======"));
        consolelog.sendMessage(CC.translate("&7[&cLog&7] &cAll Commands registered"));
        consolelog.sendMessage(CC.translate(prefix + "&cMade by Gasparsito"));
        consolelog.sendMessage(CC.translate("&c======&7=============================&c======"));
        registerCommands();
    }
    public void registerCommands(){
        this.getCommand("ezreload").setExecutor(new EZHatReloadCommand(this));
        this.getCommand("ezhat").setExecutor(new EZHatCommand(this));
        this.getCommand("hat").setExecutor(new HatCommand());

    }
}

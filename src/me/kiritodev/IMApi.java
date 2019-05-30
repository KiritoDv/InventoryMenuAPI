package me.kiritodev;

import lombok.Getter;
import me.kiritodev.api.ColorText;
import me.kiritodev.api.GuiManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class IMApi extends JavaPlugin {

    @Getter
    private static IMApi instance;

    @Override
    public void onEnable() {
        instance = this;
        Bukkit.getConsoleSender().sendMessage(ColorText.translate("&8[&4IMApi&8] &2Registering listeners"));
        Bukkit.getPluginManager().registerEvents(GuiManager.getInstance(), this);
        Bukkit.getConsoleSender().sendMessage(ColorText.translate("&8[&4IMApi&8] &2Finished uwu"));
    }
}

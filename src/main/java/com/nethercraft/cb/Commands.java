package com.nethercraft.cb;

import com.nethercraft.cb.commands.Gamemode;
import com.nethercraft.cb.commands.Head;
import org.bukkit.plugin.java.JavaPlugin;

public final class Commands extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("gm").setExecutor(new Gamemode());
        getCommand("head").setExecutor(new Head());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

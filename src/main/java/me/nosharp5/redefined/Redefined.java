package me.nosharp5.redefined;

import me.nosharp5.redefined.abilities.AbilityManager;
import me.nosharp5.redefined.commands.TestCMD;
import org.bukkit.plugin.java.JavaPlugin;

public final class Redefined extends JavaPlugin {

    @Override
    public void onEnable() {
        getCommand("test").setExecutor(new TestCMD());
        AbilityManager.getAllAbilities();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

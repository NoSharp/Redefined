package me.nosharp5.redefined.commands;

import me.nosharp5.redefined.abilities.AbilityManager;
import me.nosharp5.redefined.abilities.PlayerArgs;
import me.nosharp5.redefined.abilities.players.SoulbondAbility;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class TestCMD implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        Player player = (Player)sender;
        PlayerArgs playerArgs = new PlayerArgs(new Player[]{player, Bukkit.getPlayerExact(args[0])});

        return false;
    }
}

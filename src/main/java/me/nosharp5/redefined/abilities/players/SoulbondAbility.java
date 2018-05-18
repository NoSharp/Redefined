package me.nosharp5.redefined.abilities.players;

import me.nosharp5.redefined.abilities.Ability;
import me.nosharp5.redefined.abilities.AbilityEnum;
import me.nosharp5.redefined.abilities.PlayerArgs;
import org.bukkit.entity.Player;

public class SoulbondAbility extends Ability {
    public SoulbondAbility() {
        super("Soulbond", 0 ,"", AbilityEnum.OFFENSIVE);
    }

    @Override
    public void onUse(PlayerArgs args) {
        Player player = args.players[0];
        Player playerAgainst = args.players[1];
        player.sendMessage(String.valueOf(playerAgainst.getLocation().distanceSquared(playerAgainst.getLocation())));

    }
}

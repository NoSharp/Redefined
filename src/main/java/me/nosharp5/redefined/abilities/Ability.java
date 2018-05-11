package me.nosharp5.redefined.abilities;

public abstract class Ability {

    public String name;
    public int cooldown;
    public String description;
    public AbilityEnum abilityEnum;



    public Ability(String name, int cooldown, String description, AbilityEnum abilityEnum){
        this.name = name;
        this.cooldown = cooldown;
        this.description = description;
        this.abilityEnum = abilityEnum;
    }

    public abstract void onUse(PlayerArgs args);

}

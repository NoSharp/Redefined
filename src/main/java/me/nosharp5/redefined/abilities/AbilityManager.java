package me.nosharp5.redefined.abilities;

import org.reflections.Reflections;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class AbilityManager {
    public static List<Ability> abilities = new ArrayList();

    public static void getAllAbilities(){
        Reflections reflections = new Reflections("me.nosharp5.redefined.abilities.players");
        Set<Class<? extends Ability>> classes = reflections.getSubTypesOf(Ability.class);
        for(Class<? extends Ability> clazz : classes ){
            try {
                Ability ability = (Ability)clazz.newInstance();
                if(ability != null){
                    if(!abilities.contains(ability)) {
                        abilities.add(ability);
                    }
                }


            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }


    }

}

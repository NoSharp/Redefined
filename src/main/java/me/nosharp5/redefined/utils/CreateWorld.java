package me.nosharp5.redefined.utils;

import org.bukkit.*;

import java.io.*;

public class CreateWorld {

    public static void createWorld(){
        Bukkit.getServer().createWorld(new WorldCreator("Redefined"));
        World world = Bukkit.getServer().getWorld("Redefined");
        WorldBorder border = world.getWorldBorder();
        border.setCenter(new Location(world, 0,0,0));
        border.setSize(1000);
        border.setWarningDistance(50);

    }

    public static void deleteWorld(){

        Bukkit.unloadWorld("Redefined", false);
        final File remove = new File(Bukkit.getServer().getWorldContainer().getAbsolutePath() + "/" + "Redefined");
        deleteDirectory(remove);
    }


    static public boolean deleteDirectory (File path){
        if(path.exists())
        {
            File[] files = path.listFiles();
            for(int i = 0; i < files.length; i++)
            {
                if(files[i].isDirectory())
                {
                    deleteDirectory(files[i]);
                }
                else
                {
                    files[i].delete();
                }
            }
        }
        return (path.delete());
    }
}

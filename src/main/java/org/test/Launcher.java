package org.test;

import core.EngineManager;
import core.WindowManager;
import core.utils.Const;
import org.lwjgl.Version;

public class Launcher
{
    private static WindowManager window;
    private static TestGame game;

    public static void main(String[] args)
    {
        System.out.println(Version.getVersion());
        window = new WindowManager(Const.TITLE, 0, 0, false);
        game = new TestGame();
        EngineManager engine = new EngineManager();
        try {
            engine.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static WindowManager getWindow(){
        return window;
    }

    public static TestGame getGame(){
        return game;
    }
}

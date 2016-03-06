package com.Deckee.ChestMaker.Client.Settings;
import org.lwjgl.input.Keyboard;
import net.minecraft.client.settings.KeyBinding;

/**
 * Created by adam on 2/27/2016.
 */

public enum Keybindings
{
    chest("keys.ChestMaker.SOUND",Keyboard.KEY_LMETA);
    private final KeyBinding keybinding;

    private Keybindings(String keyName, int defaultKeyCode){
        keybinding = new KeyBinding(keyName,defaultKeyCode,"keys.ChestMaker.Category");
    }

    public KeyBinding getKeyBinding(){
        return keybinding;
    }

    public boolean isPressed(){
        return keybinding.isPressed();
    }
}














/**{
    public static KeyBinding chest = new KeyBinding(NAMES.Keys.CHEST, Keyboard.KEY_LMETA, NAMES.Keys.CATEGORY);
*/

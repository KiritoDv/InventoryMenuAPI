package me.kiritodev.api;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import me.kiritodev.IMApi;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import java.util.function.Consumer;

@AllArgsConstructor
@Getter
@Setter
public class IButton {
    private ItemStack item;
    private Consumer<IButtonEvent> event;

    public IButton(ItemStack item){
        this.item = item;
        this.event = null;
    }

    @AllArgsConstructor
    @Getter
    public static class IButtonEvent{
        Player player;
        GuiScreen gui;
        IMApi plugin;
    }
}

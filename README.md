## Usages

* Create a new menu
```
public class HubMenu extends GuiScreen {

    public HubMenu() {
        super(6, "&6Hub Menu");
    }

    @Override
    public void initGui() {
        super.initGui();

        this.buttons.put(0, new IButton(new ItemStack(Material.DIAMOND), (e) -> e.getPlayer().sendMessage("owo")));
        this.buttons.put(1, new IButton(new ItemStack(Material.DIAMOND), (e) -> e.getPlayer().sendMessage("owo")));
        this.buttons.put(2, new IButton(new ItemStack(Material.ENDER_CHEST)));
    }

    @Override
    public void drawScreen(Player p) {

        IButton t = this.buttons.get(0);

        Material[] l = {Material.GOLD_AXE, Material.ACACIA_DOOR_ITEM, Material.DIAMOND, Material.ICE};
        ItemStack is = new ItemStack(l[new Random().nextInt(l.length-1)]);
        ItemMeta im = is.getItemMeta();
        im.setDisplayName(p.getDisplayName());
        is.setItemMeta(im);
        t.setItem(is);
        this.buttons.replace(0, t);

        super.drawScreen(p);
    }
}
```

* Display the screen
```
GuiManager.getInstance().displayGuiScreen(new HubMenu(), e.getPlayer());
```

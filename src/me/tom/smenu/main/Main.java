package me.tom.smenu.main;

import org.bukkit.plugin.java.*;
import org.bukkit.event.*;
import java.io.*;
import org.bukkit.configuration.file.*;
import org.bukkit.plugin.*;
import me.tom.smenu.clickevent.*;
import org.bukkit.command.*;
import org.bukkit.entity.*;
import org.bukkit.*;
import org.bukkit.inventory.*;
import java.util.*;
import org.bukkit.inventory.meta.*;

public class Main extends JavaPlugin implements Listener
{
    File file;
    YamlConfiguration cfg;
    String youtube;
    String webseite;
    String shop;
    String bewerben;
    String discord;
    String teamspeak;
    String prefix;
    
    public Main() {
        this.file = new File("plugins/SocialMediaMenu", "config.yml");
        this.cfg = YamlConfiguration.loadConfiguration(this.file);
        this.youtube = (String)this.cfg.get("Config.youtube");
        this.webseite = (String)this.cfg.get("Config.website");
        this.shop = (String)this.cfg.get("Config.shop");
        this.bewerben = (String)this.cfg.get("Config.apply");
        this.discord = (String)this.cfg.get("Config.discord");
        this.teamspeak = (String)this.cfg.get("Config.teamspeak");
        this.prefix = (String)this.cfg.get("Config.prefix");
    }
    
    public void onEnable() {
        this.loadConfig();
        Bukkit.getPluginManager().registerEvents((Listener)this, (Plugin)this);
        Bukkit.getConsoleSender().sendMessage("§e----------------------------------");
        Bukkit.getConsoleSender().sendMessage("§e----------------------------------");
        Bukkit.getConsoleSender().sendMessage("§cSocialMediaMenu was coded §bby shnxtom");
        Bukkit.getConsoleSender().sendMessage("§e----------------------------------");
        Bukkit.getConsoleSender().sendMessage("§e----------------------------------");
        this.getServer().getPluginManager().registerEvents((Listener)new ClickEvent(), (Plugin)this);
    }
    
    public void registerLISTENER() {
        this.getServer().getPluginManager().registerEvents((Listener)this, (Plugin)this);
    }
    
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("§e----------------------------------");
        Bukkit.getConsoleSender().sendMessage("§e----------------------------------");
        Bukkit.getConsoleSender().sendMessage("§cSocialMediaMenu was coded §bby shnxtom");
        Bukkit.getConsoleSender().sendMessage("§e----------------------------------");
        Bukkit.getConsoleSender().sendMessage("§e----------------------------------");
    }
    
    public void loadConfig() {
        this.reloadConfig();
        this.getConfig().addDefault("Config.youtube", (Object)"Your link");
        this.getConfig().addDefault("Config.webseite", (Object)"Your link");
        this.getConfig().addDefault("Config.shop", (Object)"Your link");
        this.getConfig().addDefault("Config.bewerben", (Object)"Your link");
        this.getConfig().addDefault("Config.discord", (Object)"Your link");
        this.getConfig().addDefault("Config.teamspeak", (Object)"Your link");
        this.getConfig().addDefault("Config.prefix1", (Object)"&1»");
        this.getConfig().addDefault("Config.prefix", (Object)"&7[&9SocialMedia&7]");
        this.getConfig().options().copyDefaults(true);
        this.saveConfig();
    }
    
    public boolean onCommand(final CommandSender sender, final Command cmd, final String label, final String[] args) {
        final Player p = (Player)sender;
        if (cmd.getName().equalsIgnoreCase("smedia")) {
            final Inventory inv2 = Bukkit.createInventory((InventoryHolder)null, 45, "§7SocialMedia");
            final ItemStack a = new ItemStack(Material.APPLE);
            final ItemMeta meta2 = a.getItemMeta();
            meta2.setDisplayName("§5YouTube");
            a.setItemMeta(meta2);
            final ItemStack a2 = new ItemStack(Material.BOOK);
            final ItemMeta meta3 = a2.getItemMeta();
            meta3.setDisplayName("§aWebsite");
            a2.setItemMeta(meta3);
            final ItemStack a3 = new ItemStack(Material.BANNER);
            final ItemMeta meta4 = a3.getItemMeta();
            meta4.setDisplayName("§cApply");
            a3.setItemMeta(meta4);
            final ItemStack a4 = new ItemStack(Material.CAKE);
            final ItemMeta meta5 = a4.getItemMeta();
            meta5.setDisplayName("§6Shop");
            a4.setItemMeta(meta5);
            final ItemStack a5 = new ItemStack(Material.PAPER);
            final ItemMeta meta6 = a5.getItemMeta();
            meta6.setDisplayName("§bTeamSpeak");
            a5.setItemMeta(meta6);
            final ItemStack a6 = new ItemStack(Material.DIAMOND);
            final ItemMeta meta7 = a6.getItemMeta();
            meta7.setDisplayName("§eDiscord");
            a6.setItemMeta(meta7);
            final ItemStack a7 = new ItemStack(Material.BARRIER);
            final ItemMeta meta8 = a7.getItemMeta();
            meta8.setDisplayName("§cClose");
            a7.setItemMeta(meta8);
            final ItemStack a8 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)7);
            final ItemMeta meta9 = a8.getItemMeta();
            meta9.setDisplayName("  ");
            a8.setItemMeta(meta9);
            p.openInventory(inv2);
            final ItemStack item98 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)9);
            final ItemMeta meta10 = item98.getItemMeta();
            meta10.setDisplayName("  ");
            item98.setItemMeta(meta10);
            final ItemStack item99 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)5);
            final ItemMeta meta11 = item99.getItemMeta();
            meta11.setDisplayName("  ");
            item99.setItemMeta(meta11);
            Bukkit.getScheduler().scheduleSyncRepeatingTask((Plugin)this, (Runnable)new Runnable() {
                @Override
                public void run() {
                    for (final Player p : Bukkit.getOnlinePlayers()) {
                        inv2.setItem(0, item98);
                        inv2.setItem(1, item98);
                        inv2.setItem(2, item98);
                        inv2.setItem(3, item98);
                        inv2.setItem(4, item98);
                        inv2.setItem(5, item98);
                        inv2.setItem(6, item98);
                        inv2.setItem(7, item98);
                        inv2.setItem(8, item98);
                        inv2.setItem(9, item98);
                        inv2.setItem(10, item99);
                        inv2.setItem(11, item99);
                        inv2.setItem(12, item99);
                        inv2.setItem(12, item99);
                        inv2.setItem(13, item99);
                        inv2.setItem(14, item99);
                        inv2.setItem(15, item99);
                        inv2.setItem(16, item99);
                        inv2.setItem(25, a7);
                        inv2.setItem(19, a6);
                        inv2.setItem(20, a);
                        inv2.setItem(21, a2);
                        inv2.setItem(22, a3);
                        inv2.setItem(23, a4);
                        inv2.setItem(24, a5);
                        inv2.setItem(17, item98);
                        inv2.setItem(18, item98);
                        inv2.setItem(26, item98);
                        inv2.setItem(27, item98);
                        inv2.setItem(28, item99);
                        inv2.setItem(29, item99);
                        inv2.setItem(30, item99);
                        inv2.setItem(31, item99);
                        inv2.setItem(32, item99);
                        inv2.setItem(33, item99);
                        inv2.setItem(34, item99);
                        inv2.setItem(35, item98);
                        inv2.setItem(36, item98);
                        inv2.setItem(37, item98);
                        inv2.setItem(38, item98);
                        inv2.setItem(39, item98);
                        inv2.setItem(40, item98);
                        inv2.setItem(41, item98);
                        inv2.setItem(42, item98);
                        inv2.setItem(43, item98);
                        inv2.setItem(44, item98);
                    }
                }
            }, 0L, 20L);
            Bukkit.getScheduler().scheduleSyncRepeatingTask((Plugin)this, (Runnable)new Runnable() {
                @Override
                public void run() {
                    for (final Player p : Bukkit.getOnlinePlayers()) {
                        inv2.setItem(0, item99);
                        inv2.setItem(1, item99);
                        inv2.setItem(2, item99);
                        inv2.setItem(3, item99);
                        inv2.setItem(4, item99);
                        inv2.setItem(5, item99);
                        inv2.setItem(6, item99);
                        inv2.setItem(7, item99);
                        inv2.setItem(8, item99);
                        inv2.setItem(9, item99);
                        inv2.setItem(10, item98);
                        inv2.setItem(11, item98);
                        inv2.setItem(12, item98);
                        inv2.setItem(12, item98);
                        inv2.setItem(13, item98);
                        inv2.setItem(14, item98);
                        inv2.setItem(15, item98);
                        inv2.setItem(16, item98);
                        inv2.setItem(25, a7);
                        inv2.setItem(19, a6);
                        inv2.setItem(20, a);
                        inv2.setItem(21, a2);
                        inv2.setItem(22, a3);
                        inv2.setItem(23, a4);
                        inv2.setItem(24, a5);
                        inv2.setItem(17, item99);
                        inv2.setItem(18, item99);
                        inv2.setItem(26, item99);
                        inv2.setItem(27, item99);
                        inv2.setItem(28, item98);
                        inv2.setItem(29, item98);
                        inv2.setItem(30, item98);
                        inv2.setItem(31, item98);
                        inv2.setItem(32, item98);
                        inv2.setItem(33, item98);
                        inv2.setItem(34, item98);
                        inv2.setItem(35, item99);
                        inv2.setItem(36, item99);
                        inv2.setItem(37, item99);
                        inv2.setItem(38, item99);
                        inv2.setItem(39, item99);
                        inv2.setItem(40, item99);
                        inv2.setItem(41, item99);
                        inv2.setItem(42, item99);
                        inv2.setItem(43, item99);
                        inv2.setItem(44, item99);
                    }
                }
            }, 0L, 60L);
        }
        return true;
    }
}

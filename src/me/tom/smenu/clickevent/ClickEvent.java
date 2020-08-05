package me.tom.smenu.clickevent;

import java.io.*;
import org.bukkit.configuration.file.*;
import org.bukkit.event.inventory.*;
import org.bukkit.entity.*;
import org.bukkit.inventory.*;
import org.bukkit.*;
import org.bukkit.inventory.meta.*;
import org.bukkit.event.*;

public class ClickEvent implements Listener
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
    String prefix1;
    
    public ClickEvent() {
        this.file = new File("plugins/SocialMediaMenu", "config.yml");
        this.cfg = YamlConfiguration.loadConfiguration(this.file);
        this.youtube = (String)this.cfg.get("Config.youtube");
        this.webseite = (String)this.cfg.get("Config.website");
        this.shop = (String)this.cfg.get("Config.shop");
        this.bewerben = (String)this.cfg.get("Config.apply");
        this.discord = (String)this.cfg.get("Config.discord");
        this.teamspeak = (String)this.cfg.get("Config.teamspeak");
        this.prefix = (String)this.cfg.get("Config.prefix");
        this.prefix1 = (String)this.cfg.get("Config.prefix1");
    }
    
    @EventHandler
    public void onClick(final InventoryClickEvent e) {
        final Player p = (Player)e.getWhoClicked();
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
        final ItemStack a7 = new ItemStack(Material.STAINED_GLASS_PANE, 1, (short)7);
        final ItemMeta meta8 = a7.getItemMeta();
        meta8.setDisplayName("  ");
        a7.setItemMeta(meta8);
        if (e.getInventory().getName().equals("§7SocialMedia")) {
            e.setCancelled(true);
            if (e.getCurrentItem().getType() == Material.AIR) {
                return;
            }
            if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§5YouTube")) {
                e.setCancelled(true);
                p.sendMessage(String.valueOf(ChatColor.translateAlternateColorCodes('&', this.prefix)) + ChatColor.translateAlternateColorCodes('&', this.prefix1) + "§7 " + ChatColor.translateAlternateColorCodes('&', this.youtube));
                p.closeInventory();
            }
            else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§aWebsite")) {
                e.setCancelled(true);
                p.sendMessage(String.valueOf(ChatColor.translateAlternateColorCodes('&', this.prefix)) + ChatColor.translateAlternateColorCodes('&', this.prefix1) + "§7 " + ChatColor.translateAlternateColorCodes('&', this.webseite));
                p.closeInventory();
            }
            else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§cApply")) {
                e.setCancelled(true);
                p.sendMessage(String.valueOf(ChatColor.translateAlternateColorCodes('&', this.prefix)) + ChatColor.translateAlternateColorCodes('&', this.prefix1) + "§7 " + ChatColor.translateAlternateColorCodes('&', this.bewerben));
                p.closeInventory();
            }
            else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§6Shop")) {
                e.setCancelled(true);
                p.sendMessage(String.valueOf(ChatColor.translateAlternateColorCodes('&', this.prefix)) + ChatColor.translateAlternateColorCodes('&', this.prefix1) + "§7 " + ChatColor.translateAlternateColorCodes('&', this.shop));
                p.closeInventory();
            }
            else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§bTeamSpeak")) {
                e.setCancelled(true);
                p.sendMessage(String.valueOf(ChatColor.translateAlternateColorCodes('&', this.prefix)) + ChatColor.translateAlternateColorCodes('&', this.prefix1) + "§7 " + ChatColor.translateAlternateColorCodes('&', this.teamspeak));
                p.closeInventory();
            }
            else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§eDiscord")) {
                e.setCancelled(true);
                p.sendMessage(String.valueOf(ChatColor.translateAlternateColorCodes('&', this.prefix)) + ChatColor.translateAlternateColorCodes('&', this.prefix1) + "§7 " + ChatColor.translateAlternateColorCodes('&', this.discord));
                p.closeInventory();
            }
            else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("  ")) {
                e.setCancelled(true);
            }
            else if (e.getCurrentItem().getItemMeta().getDisplayName().equals("§cClose")) {
                p.closeInventory();
                e.setCancelled(true);
            }
        }
    }
}

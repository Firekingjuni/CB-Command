package com.nethercraft.cb.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.SkullMeta;

public class Head implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Nether"+ChatColor.GOLD+"Craft" + ChatColor.WHITE + " >> " + ChatColor.RED + " only players can use this command");
            return false;
        }
        Player player = (Player) sender;
            if (player.hasPermission("nethercraft.head")) {
                if (args.length == 1) {
                    ItemStack is = new ItemStack(Material.PLAYER_HEAD, 1, (short) 3);
                    SkullMeta im = (SkullMeta) is.getItemMeta();
                    im.setOwner(args[0]);
                    im.setDisplayName(ChatColor.YELLOW + args[0]);
                    is.setItemMeta(im);
                    ((Player) sender).getInventory().addItem(new ItemStack[]{is});
                    ((Player) sender).updateInventory();
                    sender.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " you have now the head of " + args[0]);
                }else if (args.length == 2){
                    if (player.hasPermission("nethercraft.head")) {
                        final Player target = Bukkit.getPlayer(args [0]);

                        ItemStack is = new ItemStack(Material.PLAYER_HEAD, 1, (short) 3);
                        SkullMeta im = (SkullMeta) is.getItemMeta();
                        im.setOwner(args[1]);
                        im.setDisplayName(ChatColor.YELLOW + args[1]);
                        is.setItemMeta(im);
                        ((Player) target).getInventory().addItem(new ItemStack[]{is});
                        ((Player) target).updateInventory();
                        target.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " you have now the head of " + args[1]);
                        sender.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " The Player " + ChatColor.YELLOW + target.getName() + ChatColor.GREEN + " has now the head of " + args[1]);
                    }

                } else {
                    sender.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.RED + " only players can use this command");
                }

            } else {
                sender.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.RED + " you don't have permission for this command");
            }
            return false;
        }
    }

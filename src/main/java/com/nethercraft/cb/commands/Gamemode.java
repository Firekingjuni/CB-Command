package com.nethercraft.cb.commands;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.GameMode;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Gamemode implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.RED + " only players can use this command");
            return false;
        }
        Player player = (Player) sender;
        if (player.hasPermission("nethercraft.gm")) {

        } else {
            sender.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.RED + " you don't have permission for this command");
        }
        if (args.length == 1) {
            if (args[0].equalsIgnoreCase("0")) {
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " You are now in Survival");
            } else if (args[0].equalsIgnoreCase("1")) {
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " You are now in Creative");
            } else if (args[0].equalsIgnoreCase("2")) {
                player.setGameMode(GameMode.ADVENTURE);
                player.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " You are now in Adventure");
            } else if (args[0].equalsIgnoreCase("3")) {
                player.setGameMode(GameMode.SPECTATOR);
                player.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " You are now in Spectator");
            } else if (args[0].equalsIgnoreCase("survival")) {
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " You are now in Survival");
            } else if (args[0].equalsIgnoreCase("creative")) {
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " You are now in Creative");
            } else if (args[0].equalsIgnoreCase("adventure")) {
                player.setGameMode(GameMode.ADVENTURE);
                player.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " You are now in Adventure");
            } else if (args[0].equalsIgnoreCase("spectator")) {
                player.setGameMode(GameMode.SPECTATOR);
                player.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " You are now in Spectator");
            } else if (args[0].equalsIgnoreCase("s")) {
                player.setGameMode(GameMode.SURVIVAL);
                player.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " You are now in Survival");
            } else if (args[0].equalsIgnoreCase("c")) {
                player.setGameMode(GameMode.CREATIVE);
                player.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " You are now in Creative");
            } else if (args[0].equalsIgnoreCase("a")) {
                player.setGameMode(GameMode.ADVENTURE);
                player.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " You are now in Adventure");
            } else if (args[0].equalsIgnoreCase("spec")) {
                player.setGameMode(GameMode.SPECTATOR);
                player.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " You are now in Spectator");
            }

        } else if (args.length == 2) {
            if (player.hasPermission("nethercraft.gm")) {

                final Player target = Bukkit.getPlayer(args[0]);


                if (args[1].equalsIgnoreCase("0")) {
                    target.setGameMode(GameMode.SURVIVAL);
                    target.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " You are now in Survival");
                    player.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " The Player " + target.getName() + "is now in Survival");
                } else if (args[1].equalsIgnoreCase("1")) {
                    target.setGameMode(GameMode.CREATIVE);
                    target.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " You are now in Creative");
                    player.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " The Player " + ChatColor.YELLOW + target.getName() + ChatColor.GREEN + " is now in Creative");
                } else if (args[1].equalsIgnoreCase("2")) {
                    target.setGameMode(GameMode.ADVENTURE);
                    target.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " You are now in Adventure");
                    player.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " The Player " + ChatColor.YELLOW + target.getName() + ChatColor.GREEN + " is now in Adventure");
                } else if (args[1].equalsIgnoreCase("3")) {
                    target.setGameMode(GameMode.SPECTATOR);
                    target.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " You are now in Spectator");
                    player.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " The Player " + ChatColor.YELLOW + target.getName() + ChatColor.GREEN + " is now in Spectator");
                } else if (args[1].equalsIgnoreCase("survival")) {
                    target.setGameMode(GameMode.SURVIVAL);
                    target.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " You are now in Survival");
                    player.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " The Player " + ChatColor.YELLOW + target.getName() + ChatColor.GREEN + " is now in Survival");
                } else if (args[1].equalsIgnoreCase("creative")) {
                    target.setGameMode(GameMode.CREATIVE);
                    target.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " You are now in Creative");
                    player.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " The Player " + ChatColor.YELLOW + target.getName() + ChatColor.GREEN + " is now in Creative");
                } else if (args[1].equalsIgnoreCase("adventure")) {
                    target.setGameMode(GameMode.ADVENTURE);
                    target.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " You are now in Adventure");
                    player.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " The Player " + ChatColor.YELLOW + target.getName() + ChatColor.GREEN + " is now in Adventure");
                } else if (args[1].equalsIgnoreCase("spectator")) {
                    target.setGameMode(GameMode.SPECTATOR);
                    target.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " You are now in Spectator");
                    player.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " The Player " + ChatColor.YELLOW + target.getName() + ChatColor.GREEN + " is now in Spectator");
                } else if (args[1].equalsIgnoreCase("s")) {
                    target.setGameMode(GameMode.SURVIVAL);
                    target.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " You are now in Survival");
                    player.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " The Player " + ChatColor.YELLOW + target.getName() + ChatColor.GREEN + " is now in Survival");
                } else if (args[1].equalsIgnoreCase("c")) {
                    target.setGameMode(GameMode.CREATIVE);
                    target.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " You are now in Creative");
                    player.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " The Player " + ChatColor.YELLOW + target.getName() + ChatColor.GREEN + " is now in Creative");
                } else if (args[1].equalsIgnoreCase("a")) {
                    target.setGameMode(GameMode.ADVENTURE);
                    target.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " You are now in Adventure");
                    player.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " The Player " + ChatColor.YELLOW + target.getName() + ChatColor.GREEN + " is now in Adventure");
                } else if (args[1].equalsIgnoreCase("spec")) {
                    target.setGameMode(GameMode.SPECTATOR);
                    target.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " You are now in Spectator");
                    player.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.GREEN + " The Player " + ChatColor.YELLOW + target.getName() + ChatColor.GREEN + " is now in Spectator");
                }

            } else {
                sender.sendMessage(ChatColor.RED + "Nether" + ChatColor.GOLD + "Craft" + ChatColor.WHITE + " >> " + ChatColor.RED + " Useage /gm [0-3/spec,s,a,c/spectator,survival,creative,adventure] or /gm (Player)[0 - 3/spec,s,a,c/spectator,survival,creative,adventure]");
            }
            return false;
        }
        return false;
    }
}

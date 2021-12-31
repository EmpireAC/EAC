package fr.empire_ac.eac.acserver.events;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

/*
 * 
 * ACServer version beta0.1
 * (C) 2021 EmpireAC
 * (C) 2021 Holia
 * 
 * This project has got a GPLv3 Licence.
 * 
 * ACServer is a part of EAC.
 * 
 * Source : https://github.com/EmpireAC/EAC
 * 
 */

public class PlayersJoin implements Listener {
	
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player player = e.getPlayer();
		
		e.setJoinMessage(ChatColor.DARK_GRAY + "[" + ChatColor.WHITE + player.getName() + ChatColor.DARK_GRAY + "]" + ChatColor.GRAY + " a rejoint le serveur ");		
		
	}
	
}

package fr.empire_ac.eac.acserver;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import fr.empire_ac.eac.acserver.events.PlayersJoin;
import fr.empire_ac.eac.acserver.events.PlayersQuit;

/*
 * 
 * ACServer version beta0.1.1
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

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		
		Bukkit.getPluginManager().registerEvents(new PlayersJoin(), this);
		System.out.print("PlayersJoin has registered !");
		Bukkit.getPluginManager().registerEvents(new PlayersQuit(), this);
		System.out.print("PlayersQuit has registered !");
		
	}
	
	@Override
	public void onDisable() {
		System.out.print("EAC Repository : https://github.com/EmpireAC/EAC");
	}
}
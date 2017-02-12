package me.benfah.spt.util;

import java.util.HashMap;

import org.bukkit.ChatColor;

public class Localization
{
	
	private static HashMap<String, HashMap<String, String>> localizationMap;
	
	public static void init()
	{
		localizationMap = new HashMap<>();
		
	}
	
	public static void removeLocalization(String langcode, String id)
	{
		localizationMap.remove(id);
	}
	
	public static void addLocalization(String langcode, String id, String localization)
	{
		localizationMap.put(id, ChatColor.RESET + localization);
	}
	
	public static String getLocalization(String id)
	{
		return localizationMap.get(id);
	}
	
	
}

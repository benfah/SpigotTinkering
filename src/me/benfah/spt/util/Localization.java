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
		HashMap<String, String> hm = localizationMap.get(langcode);
		if(hm != null)
		{
			hm.remove(id);
			localizationMap.put(langcode, hm);
		}
		
	}
	
	public static void addLocalization(String langcode, String id, String localization)
	{
		HashMap<String, String> rm = localizationMap.get(langcode);
		if(rm == null)
		rm = new HashMap<>();
		rm.put(id, localization);
		localizationMap.put(langcode, rm);
		
	}
	
	public static String getLocalization(String langcode, String id)
	{
		return localizationMap.get(langcode).get(id);
	}
	
	
}

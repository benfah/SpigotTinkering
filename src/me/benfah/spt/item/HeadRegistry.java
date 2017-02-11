package me.benfah.spt.item;

import java.util.ArrayList;
import java.util.List;

import me.benfah.spt.util.Binding;
import me.benfah.spt.util.Head;

public class HeadRegistry
{
	private static List<Head> headList = new ArrayList<Head>();
	
	
	public static void register(Head h)
	{
		headList.add(h);
	}
	public static Head get(String s)
	{
		for(Head h : headList)
		if(h.getId().equals(s))
		return h;	
		return null;
	}
	public static void unregister(Head b)
	{
		headList.remove(b);
	}	
	
}

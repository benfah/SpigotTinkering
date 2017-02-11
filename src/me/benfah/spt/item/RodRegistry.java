package me.benfah.spt.item;

import java.util.ArrayList;
import java.util.List;

import me.benfah.spt.util.Binding;
import me.benfah.spt.util.Rod;

public class RodRegistry
{
	private static List<Rod> rodList = new ArrayList<Rod>();
	
	
	public static void register(Rod r)
	{
		rodList.add(r);
	}
	public static Rod get(String s)
	{
		for(Rod r : rodList)
		if(r.getId().equals(s))
		return r;	
		return null;
	}
	public static void unregister(Rod r)
	{
		rodList.remove(r);
	}
}

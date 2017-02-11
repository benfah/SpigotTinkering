package me.benfah.spt.item;

import java.util.ArrayList;
import java.util.List;

import me.benfah.spt.util.Binding;

public class BindingRegistry
{
	private static List<Binding> bindingList = new ArrayList<Binding>();
	
	
	public static void register(Binding b)
	{
		bindingList.add(b);
	}
	public static Binding get(String s)
	{
		for(Binding b : bindingList)
		if(b.getId().equals(s))
		return b;	
		return null;
	}
	public static void unregister(Binding b)
	{
		bindingList.remove(b);
	}
}

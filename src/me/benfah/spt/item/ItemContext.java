package me.benfah.spt.item;

import java.util.concurrent.ConcurrentHashMap;

public class ItemContext 
{
	ConcurrentHashMap<String, String> chm;
	
	public ItemContext()
	{
		chm = new ConcurrentHashMap<>();
	}
	
	public void set(String k, String v)
	{
		chm.put(k, v);
	}
	
	public Object get(Object k)
	{
		return chm.get(k);
	}
	
	public void setHead(String h)
	{
		set("head", h);
	}
	
	
	
	public void setBinding(String b)
	{
		set("binding", b);
	}
	
	public void setRod(String r)
	{
		set("rod", r);
	}
	
	
	
	
}

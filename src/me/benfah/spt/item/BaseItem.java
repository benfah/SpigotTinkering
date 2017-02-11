package me.benfah.spt.item;

public class BaseItem
{
	public ItemContext ic;
	
	public BaseItem()
	{
		ic = new ItemContext();
	}
	
	public BaseItem(ItemContext ic)
	{
		this.ic = ic;
	}
	
	public ItemContext getItemContext() {
		return ic;
	}
	
	
	
	
}

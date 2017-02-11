package me.benfah.spt.util;

public class Rod
{
	private double modifier;
	private String id;
	public double getModifier() {
		return modifier;
	}
	public String getId() {
		return id;
	}
	public Rod(String id, double modifier)
	{
		this.id = id;
		this.modifier = modifier;
	}
}

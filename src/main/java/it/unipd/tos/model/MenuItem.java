////////////////////////////////////////////////////////////////////
// [Mariano] [Sciacco] [1142498]
////////////////////////////////////////////////////////////////////

package it.unipd.tos.model;

public class MenuItem {
	
	public enum items { PIZZA, PRIMO }
	
	private items type;
	private String name;
	private double price;
	
	public MenuItem(String n, items t, double p) 
	{
		this.type = t;
		this.name = n;
		this.price = p;
	}
	
	public items getType()
	{
		return type;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getPrice()
	{
		return price;
	}
	
}

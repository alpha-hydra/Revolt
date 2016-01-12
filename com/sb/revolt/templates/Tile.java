package com.sb.revolt.templates;

public class Tile 
{
	
	int XPos;
	int YPos;
	double loyaltyGovernment;
	double loyaltyRebels;
	double contentness;
	boolean controlled;
	int terrain;
	int[] features;
	
	/* TODO
	 *  Add Enums for terrain and features
	 */
	
	public Tile(int XPos, int YPos, double loyaltyGovernment, double loyaltyRebels, double contentness, boolean controlled, int terrain, int[] features)
	{
		this.XPos = XPos;
		this.YPos = YPos;
		this.loyaltyGovernment = loyaltyGovernment;
		this.loyaltyRebels = loyaltyRebels;
		this.contentness = contentness;
		this.controlled = controlled;
		this.terrain = terrain;
		
		for (int i=1; i < features.length; i++)
		{
			this.features[i] = features[i];
		}
		
		System.out.println("Tile_" + XPos + "_" + YPos + " succesfully initialised.");
	
	}
	
	public int getXPos()
	{
		return this.XPos;
	}
	
	public int getYPos()
	{
		return this.YPos;
	}
	
	public double getLoyaltyGovernment()
	{
		return this.loyaltyGovernment;
	}
	
	public double getLoyaltyRebels()
	{
		return this.loyaltyRebels;
	}
	
	public double getContentness()
	{
		return this.contentness;
	}
	
	public boolean getController(String controller)
	{
		if (controller == "Rebels" && this.controlled)
		{
			return true;
		}
		else if(controller == "Rebels" && !this.controlled)
		{
			return false;
		}
		else if(controller == "Government" && !this.controlled)
		{
			return true;
		}
		else if(controller == "Government" && this.controlled)
		{
			return false;
		}
		else return false;
	}
	
	public int getTerrain()
	{
		return this.terrain;
	}
	
	public int[] getFeatures()
	{
		return this.features;
	}
	
	@SuppressWarnings("null")
	public void setFeatures(int[] newFeatures)
	{
		for (int i = 1; i < this.features.length; i++)
		{
			this.features[i] = (Integer) null;
		}
		
		for (int i = 1; i < newFeatures.length; i++)
		{
			this.features[i] = newFeatures[i];
		}
	}

}

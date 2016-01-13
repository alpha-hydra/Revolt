package com.sb.revolt.templates;

import com.sb.revolt.run.GenerateWorld;

public class PersonOfInterest 
{
	String name;
	String gender;
	int XPos;
	int YPos;
	double governmentLoyalty;
	double rebelLoyalty;
	boolean sympathetic;
	double trustworthiness;
	
	public PersonOfInterest(String name, String gender, int XPos, int YPos, double governmentLoyalty, double rebelLoyalty, boolean sympathetic, double trustworthiness)
	{
		this.name = name;
		this.gender = gender;
		this.XPos = XPos;
		this.YPos = YPos;
		this.governmentLoyalty = governmentLoyalty;
		this.rebelLoyalty = rebelLoyalty;
		this.sympathetic = sympathetic;
		this.trustworthiness = trustworthiness;
	}
	
	public PersonOfInterest(String name, String gender, int XPos, int YPos, double governmentLoyalty, double rebelLoyalty, double trustworthiness)
	{
		this.name = name;
		this.gender = gender;
		this.XPos = XPos;
		this.YPos = YPos;
		this.governmentLoyalty = governmentLoyalty;
		this.rebelLoyalty = rebelLoyalty;
		this.sympathetic = false;
		this.trustworthiness = trustworthiness;
	}
	
	public Tile getPosition()
	{
		return GenerateWorld.getTileByXY(this.XPos, this.YPos);
	}
	
	public boolean isSympathetic()
	{
		return this.sympathetic;
	}
	
	public double getTrustworthiness()
	{
		return this.trustworthiness;
	}
	
	public int convinceToJoin()
	{
		/* -1 = Error
		 * 0 = You already control this
		 * 1 = You don't gain control
		 * 2 = You gain control
		 */
		
		if (sympathetic)
		{
			return 0;
		}
		else if (!sympathetic && this.governmentLoyalty > this.rebelLoyalty)
		{
			return 1;
		}
		else if (!sympathetic && this.governmentLoyalty < this.rebelLoyalty)
		{
			return 2;
		}
		else return -1;
	}

}

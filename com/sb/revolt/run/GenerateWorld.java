package com.sb.revolt.run;

import com.sb.revolt.templates.Tile;

public class GenerateWorld 
{
	
	static int[] features = {3};
	
	static Tile tile_1_1;
	static Tile tile_1_2;
	static Tile tile_1_3;
	static Tile tile_1_4;
	static Tile tile_1_5;
	
	static Tile tile_2_1;
	static Tile tile_2_2;
	static Tile tile_2_3;
	static Tile tile_2_4;
	static Tile tile_2_5;
	
	static Tile tile_3_1;
	static Tile tile_3_2;
	static Tile tile_3_3;
	static Tile tile_3_4;
	static Tile tile_3_5;
	
	static Tile tile_4_1;
	static Tile tile_4_2;
	static Tile tile_4_3;
	static Tile tile_4_4;
	static Tile tile_4_5;
	
	static Tile tile_5_1;
	static Tile tile_5_2;
	static Tile tile_5_3;
	static Tile tile_5_4;
	static Tile tile_5_5;
	
	public GenerateWorld()
	{
		
	}
	
	@SuppressWarnings("unused")
	public static void init()
	{
		Tile tile_1_1 = new Tile(1, 1, 1.0, 1.0, 1.0, false, 1, features);
		Tile tile_1_2 = new Tile(1, 2, 1.0, 1.0, 1.0, false, 1, features);
		Tile tile_1_3 = new Tile(1, 3, 1.0, 1.0, 1.0, false, 1, features);
		Tile tile_1_4 = new Tile(1, 4, 1.0, 1.0, 1.0, false, 1, features);
		Tile tile_1_5 = new Tile(1, 5, 1.0, 1.0, 1.0, false, 1, features);
		
		Tile tile_2_1 = new Tile(2, 1, 1.0, 1.0, 1.0, false, 1, features);
		Tile tile_2_2 = new Tile(2, 2, 1.0, 1.0, 1.0, false, 1, features);
		Tile tile_2_3 = new Tile(2, 3, 1.0, 1.0, 1.0, false, 1, features);
		Tile tile_2_4 = new Tile(2, 4, 1.0, 1.0, 1.0, false, 1, features);
		Tile tile_2_5 = new Tile(2, 5, 1.0, 1.0, 1.0, false, 1, features);
		
		Tile tile_3_1 = new Tile(3, 1, 1.0, 1.0, 1.0, false, 1, features);
		Tile tile_3_2 = new Tile(3, 2, 1.0, 1.0, 1.0, false, 1, features);
		Tile tile_3_3 = new Tile(3, 3, 1.0, 1.0, 1.0, false, 1, features);
		Tile tile_3_4 = new Tile(3, 4, 1.0, 1.0, 1.0, false, 1, features);
		Tile tile_3_5 = new Tile(3, 5, 1.0, 1.0, 1.0, false, 1, features);
		
		Tile tile_4_1 = new Tile(4, 1, 1.0, 1.0, 1.0, false, 1, features);
		Tile tile_4_2 = new Tile(4, 2, 1.0, 1.0, 1.0, false, 1, features);
		Tile tile_4_3 = new Tile(4, 3, 1.0, 1.0, 1.0, false, 1, features);
		Tile tile_4_4 = new Tile(4, 4, 1.0, 1.0, 1.0, false, 1, features);
		Tile tile_4_5 = new Tile(4, 5, 1.0, 1.0, 1.0, false, 1, features);
		
		Tile tile_5_1 = new Tile(5, 1, 1.0, 1.0, 1.0, false, 1, features);
		Tile tile_5_2 = new Tile(5, 2, 1.0, 1.0, 1.0, false, 1, features);
		Tile tile_5_3 = new Tile(5, 3, 1.0, 1.0, 1.0, false, 1, features);
		Tile tile_5_4 = new Tile(5, 4, 1.0, 1.0, 1.0, false, 1, features);
		Tile tile_5_5 = new Tile(5, 5, 1.0, 1.0, 1.0, false, 1, features);
	}
	
	public static Tile getTileByXY(int X, int Y)
	{
		if (tile_1_1.getXPos() == X && tile_1_1.getYPos() == Y)
		{
			return tile_1_1;
		}
		else if (tile_1_2.getXPos() == X && tile_1_2.getYPos() == Y)
		{
			return tile_1_2;
		}
		else if (tile_1_3.getXPos() == X && tile_1_3.getYPos() == Y)
		{
			return tile_1_3;
		}
		else if (tile_1_3.getXPos() == X && tile_1_3.getYPos() == Y)
		{
			return tile_1_3;
		}
		else if (tile_1_4.getXPos() == X && tile_1_4.getYPos() == Y)
		{
			return tile_1_4;
		}
		else if (tile_1_5.getXPos() == X && tile_1_5.getYPos() == Y)
		{
			return tile_1_5;
		}
		if (tile_2_1.getXPos() == X && tile_2_1.getYPos() == Y)
		{
			return tile_2_1;
		}
		else if (tile_2_2.getXPos() == X && tile_2_2.getYPos() == Y)
		{
			return tile_2_2;
		}
		else if (tile_2_3.getXPos() == X && tile_2_3.getYPos() == Y)
		{
			return tile_2_3;
		}
		else if (tile_2_3.getXPos() == X && tile_2_3.getYPos() == Y)
		{
			return tile_2_3;
		}
		else if (tile_2_4.getXPos() == X && tile_2_4.getYPos() == Y)
		{
			return tile_2_4;
		}
		else if (tile_2_5.getXPos() == X && tile_2_5.getYPos() == Y)
		{
			return tile_2_5;
		}
		if (tile_3_1.getXPos() == X && tile_3_1.getYPos() == Y)
		{
			return tile_3_1;
		}
		else if (tile_3_2.getXPos() == X && tile_3_2.getYPos() == Y)
		{
			return tile_3_2;
		}
		else if (tile_3_3.getXPos() == X && tile_3_3.getYPos() == Y)
		{
			return tile_3_3;
		}
		else if (tile_3_3.getXPos() == X && tile_3_3.getYPos() == Y)
		{
			return tile_3_3;
		}
		else if (tile_3_4.getXPos() == X && tile_3_4.getYPos() == Y)
		{
			return tile_3_4;
		}
		else if (tile_3_5.getXPos() == X && tile_3_5.getYPos() == Y)
		{
			return tile_3_5;
		}
		if (tile_4_1.getXPos() == X && tile_4_1.getYPos() == Y)
		{
			return tile_4_1;
		}
		else if (tile_4_2.getXPos() == X && tile_4_2.getYPos() == Y)
		{
			return tile_4_2;
		}
		else if (tile_4_3.getXPos() == X && tile_4_3.getYPos() == Y)
		{
			return tile_4_3;
		}
		else if (tile_4_3.getXPos() == X && tile_4_3.getYPos() == Y)
		{
			return tile_4_3;
		}
		else if (tile_4_4.getXPos() == X && tile_4_4.getYPos() == Y)
		{
			return tile_4_4;
		}
		else if (tile_4_5.getXPos() == X && tile_4_5.getYPos() == Y)
		{
			return tile_4_5;
		}
		if (tile_5_1.getXPos() == X && tile_5_1.getYPos() == Y)
		{
			return tile_5_1;
		}
		else if (tile_5_2.getXPos() == X && tile_5_2.getYPos() == Y)
		{
			return tile_5_2;
		}
		else if (tile_5_3.getXPos() == X && tile_5_3.getYPos() == Y)
		{
			return tile_5_3;
		}
		else if (tile_5_3.getXPos() == X && tile_5_3.getYPos() == Y)
		{
			return tile_5_3;
		}
		else if (tile_5_4.getXPos() == X && tile_5_4.getYPos() == Y)
		{
			return tile_5_4;
		}
		else if (tile_5_5.getXPos() == X && tile_5_5.getYPos() == Y)
		{
			return tile_5_5;
		}
		else return null;
	}

}

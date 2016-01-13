package com.sb.revolt.run;

import java.util.Random;

import com.sb.revolt.rnjesus.NameGenerator;

public class GeneratePeople 
{
	static Random random = new Random();
	
	public static void init()
	{

		int temp = random.nextInt(4) + 1;
		if (temp == 1)
		{
			System.out.println(NameGenerator.generateName("Male"));
		}
		else if (temp == 2)
		{
			System.out.println(NameGenerator.generateName("Female"));
		}
		else if (temp == 3)
		{
			System.out.println(NameGenerator.generateDictatorName("Male"));
		}
		else if (temp == 4)
		{
			System.out.println(NameGenerator.generateDictatorName("Female"));
		}
		else System.out.println("This is impossible. What the fuck did you do?");
		
	}

}

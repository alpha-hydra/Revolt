package com.sb.revolt.rnjesus;

import java.util.Random;

public class NameGenerator 
{
	static Random random = new Random();
	static String[] maleFirstNames = {"Daniel ", "Jack ", "Ryan ", "Aaron ", "Robert ", "Steven ", "John ", "Abraham ", "Edmond ", "Charles ", "Jesus ", "Rumpelstiltskin ", "Stuart ", "Freddie ", "William ", "", "Vladamir ", "Barack ", "Donald ", "Bernie ", "Liam ", "James ", "David ", "Jeremy ", "Michael ", "George ", "Benjamin ", "Patrick ", "Andrew ", "Shinji "};
	static String[] femaleFirstNames = {"Felecia ", "Jane ", "Elizabeth ", "Amelia ", "Taylor ", "Christine ", "Ellen ", "Daisy ", "Eilidh ", "Jessica ", "Zoe ", "Victoria ", "Rey ", "Iona ", "Rebecca ", "", "Hillary ", "Margaret ", "Emily ", "Carol ", "Ciara ", "Emma ", "Jasmine ", "Tanith ", "Samantha ", "Amy ", "Mhairi ", "Lindsay ", "Orla ", "Cassandra "};
	static String[] titles = {"Emperor ", "King ", "Prince ", "President ", "Admiral ", "General ", "Chancellor ", "Chairman ", "Prime Minister ", "Empress ", "Queen ", "Princess "};
	static String[] surnames = {"Seabrook", "Gardner", "Farish", "Windsor", "Clark", "O'Niell", "Simpson", "Rommel", "Steel", "Mehdi", "Pendergast", "Pendragon", "Putin", "Gutenberg", "Hitler",  " ", "Trump", "Thatcher", "Obama", "Sanders", "Lawrie", "Cameron", "Corbyn", "Patterson", "Munroe", "Merkel", "Jaeger", "Gobbels", "Jackson", "Drexel", "Valentine"};
	
	public static String generateName(String gender)
	{	
		if (gender == "Male")
		{
			int temp = random.nextInt(25);
			int temp2 = random.nextInt(26);
			return maleFirstNames[temp] + surnames[temp2];
		}
		else if (gender == "Female")
		{
			int temp = random.nextInt(25);
			int temp2 = random.nextInt(26);
			return femaleFirstNames[temp] + surnames[temp2];
		}
		else return "Error";
	}
	
	public static String generateDictatorName(String gender)
	{
		if (gender == "Male")
		{
			int temp = random.nextInt(25);
			int temp2 = random.nextInt(26);
			int temp3 = random.nextInt(9);
			
			return titles[temp3] + maleFirstNames[temp] + surnames[temp2];
		}
		else if (gender == "Female")
		{
			int temp = random.nextInt(25);
			int temp2 = random.nextInt(26);
			int temp3 = random.nextInt(9) + 3;
			
			return titles[temp3] + femaleFirstNames[temp] + surnames[temp2];
		}
		else return "Error";
	}

}


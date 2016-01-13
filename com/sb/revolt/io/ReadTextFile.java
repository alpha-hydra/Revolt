package com.sb.revolt.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile
{

	private String path;
	
	public ReadTextFile(String path)
	{
		this.path = path;
	}
	
	public String[] OpenFile() throws IOException
	{
		
		FileReader fr = new FileReader(path);
		BufferedReader textReader = new BufferedReader(fr);
		
		int numberOfLines = readLines();
		String[] textData = new String[numberOfLines];
		
		for (int i = 0; i < numberOfLines; i++)
		{
			textData[i] = textReader.readLine();
		}
		
		textReader.close();
		return textData;
		
	}
	
	int readLines() throws IOException
	{
		FileReader file = new FileReader(path);
		BufferedReader bf = new BufferedReader(file);
		
		String aLine;
		int numberOfLines = 0;
		
		while ((aLine = bf.readLine()) != null)
		{
			numberOfLines++;
		}
		bf.close();
		
		return numberOfLines;
	}
	
	public String[] readFile(String path) throws IOException
	{
		String[] contents = null;
		try
		{
			ReadTextFile file = new ReadTextFile(path);
			contents = file.OpenFile();
		}
		catch (IOException error)
		{
			System.out.println(error.getMessage());
		}
		return contents;
	}
	
}

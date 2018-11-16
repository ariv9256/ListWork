package choice.controller;

import javax.swing.JOptionPane;
import choice.model.MovieModel;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.ImageIcon;

public class ChoiceController
{
	private Scanner inputScanner;
	private MovieModel movie;
	
	public ChoiceController()
	{
		movie = new MovieModel();
		inputScanner = new Scanner(System.in);
	}
	private void arrayInitialization()
	{
		JOptionPane.showMessageDialog(null, "When you initialize an array of objects, \nit is filled with a bunch of null", "Arrays");
		
		JOptionPane.showMessageDialog(null, "If you try to use them it will crash,", "Arrays", JOptionPane.INFORMATIONMESSAGE, icons[2]);
		
		JOptionPane.showMessageDialog(null, "But if you fill the array with vaues it is good :) ");
		
		for(int index = 0; index < movieArray.length; index += 1)
		{
			if(index % 2 == 0) 
			{
				movieArray[index] = new MovieModel();
			}
			else
			{
				movieArray[index] = new MovieModel(index * 30);
			}
		}
	}
	
	public void start()
	{
		
		arrayInitialization();
		movieList();
	}
	private void movieList()
	{
		
	}
}


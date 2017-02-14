/***************************************
*	file:Selva_AsciiArt
*	class:CS 141 - Programming and Problem Solving
*
*	assignment: program 3
*	date last modified: 2/13/2017
*
*	purpose: This program takes data from a .txt file and stores its size and data into the 2D-Array and prints it out normal, backwords, upsidedown-backwords, and
*			 the last column and row.
****************************************/
import java.util.*;
import java.io.*;
import java.lang.*;

public class AsciiArt
{	//method: main with IOException handling
	public static void main(String args []) throws IOException
	{
		File file = new File("monalisa.txt"); //We take a file and store it in a file object
		Scanner input = new Scanner(file); //The input object takes the content from the file object
		int rows = input.nextInt(); //We take the 1st integer in the file and store it in rows variable
		int cols = input.nextInt(); //We take the 2nd integer in the file and store it in the cols variable
		
		input.nextLine(); //We go to the next line

		char [][]array = new char [rows][cols]; //We create our 2D-Array

		//loop through the contents of the file to store data from the input file to each row and column
		for (int row=0; row<array.length; row++)
		{
			String character = input.nextLine();
			
			for(int col=0; col<array.length; col++)
			{
				array[row][col]=character.charAt(col);
			}
		}
		
		//prints the file to the screen normal
		for (int row=0; row<array.length; row++)
		{
			for (int col=0; col<array[row].length; col++)
			{
				System.out.print(array[row][col]); 
			}
		}
		
		System.out.print("\n");
		
		//prints the file to the screen upsidedown
		for (int row=array.length-1; row>=0; row--)
		{
			for(int col=0; col<array[row].length; col++)
			{
				System.out.print(array[row][col]);
			}
		}
		
		System.out.print("\n");
		
		//prints the file to the screen backwords
		for (int row=0; row<array.length; row++)
		{
			for(int col=array[row].length-1; col>=0; col--)
			{
				System.out.print(array[row][col]);
			}
		}
		
		System.out.print("\n");
		
		//prints the file downward starting from the last column.
		for (int col=array[0].length-1; col>=0; col--)
		{
			for(int row=array.length-1; row>=0; row--)
			{
				System.out.print(array[row][col]);
			}
		}
		
	}
}
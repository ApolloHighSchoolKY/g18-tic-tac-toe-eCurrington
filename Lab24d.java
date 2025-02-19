//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("lab24d.dat"));
		
		//Default TicTacToe Game
		TicTacToe Tic = new TicTacToe();
		System.out.println("Default Game");
		Tic.toString();
		System.out.println("");

		//Obtaining howmany lines need to be read
		int lineNum = file.nextInt();
		System.out.println(lineNum);
		file.nextLine();

		//Setting Tic to the new TicTacToe game that is in the file 
		//Printing the game and the winner using toString() method
		for(int i=0; i<lineNum; i++)
		{
			System.out.println("TicTacToe Game #: " + (i+1) );
			Tic = new TicTacToe(file.nextLine());
			Tic.toString();
			System.out.println("");
		}

		


		//read how many times you should read

		//TicTacToe only wants this: file.nextline()

		//make a tictactoe object for each game in the file

		//printy the game tictactoe

		//if ( a=b && b=c ) win




	}
}




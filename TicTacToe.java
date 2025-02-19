//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat = new char[3][3];
	//use charAt()

	public TicTacToe()
	{
		String game = "OXOOOXXXO";

		int letter = 0;

		for(int i=0; i<mat.length; i++)
		{
			for(int i2=0; i2<mat[0].length; i2++)
			{
				mat[i][i2] = game.charAt(letter);
				letter++;
			}
		}
	}

	public TicTacToe(String game)
	{

		int letter = 0;

		for(int i=0; i<mat.length; i++)
		{
			for(int i2=0; i2<mat[0].length; i2++)
			{
				mat[i][i2] = game.charAt(letter);
				letter++;
			}

		}

	}

	public String getWinner()
	{
		char a,b,c;

		for(int row=0; row<mat.length; row++)
		{
			a = mat[row][0];
			b = mat[row][1];
			c = mat[row][2];

			if(a==b && b==c)
			{
				return a + "";
			}
		}

		for(int col=0; col<mat[0].length; col++)
		{
			a = mat[0][col];
			b = mat[1][col];
			c = mat[2][col];

			if(a==b && b==c)
			{
				return a + "";
			}
		}
		if(mat[0][0] == mat[1][1] && mat[1][1] == mat[2][2])
			return mat[0][0] + "";
		if(mat[0][2] == mat[1][1] && mat[1][1] == mat[2][0])
			return mat[0][2] + "";
		
		return "Tie";
	}

	public String toString()
	{
		String output="";

		
		for(int row=0; row<mat.length; row++)
		{
			for(int col=0; col<mat[0].length; col++)
			{
				System.out.print(mat[row][col]);
			}
			System.out.println("");
				
		}
		System.out.println("Winner: " + getWinner());
		return output+"\n\n";
	}
}
//Program: CMIS141MessageBox
//By: Jason M. Rimer
//Class: CMIS141
//Instructor: Dr. Alan Breitler
//Date: 09FEB2012
//Description: This program displays a message in a purple message box

import java.io.*;
import javax.script.*;

public class SphereArea {//stAreaclass
	public static void main(String[] args) {//stAreamain
		//Create Matrix
		double [][]points = new double [5][5];//5x5 empty matrix
		//Fill matrix with user input
		int row, column, deter;
		for (row=0;row<5;row++)
		{//stMatrixImput
			points[row][column]=Console.readDouble("Enter point coordinates on 3-dimensional plane (x,y,z)" + (column+1)+ "for point" +(row+1));
		}//enMatrixImput
		System.out.println(points);
	}//enAreamain

}//enAreaclass

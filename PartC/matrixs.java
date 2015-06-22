/**
 * JAC 444 Assignment 1
 * Gradeable.java
 * @author Hyungi Kim
 */

package PartC;
import java.util.Scanner;

public class matrixs {
	//A matrix class 
	public static Scanner in = new Scanner(System.in);// a scanner declaration for scan user input
	private static int[][] matrix1;//a default 2D array (matrix)
	public void CreateMatrix(int num) 
	{
		// An constructor for Create matrix by given user input
		this.matrix1 = new int[num][num];
	}
	public void Enterrow(int rownum)
	{
		//A method that gather user input and enter row in to matrix created
		for (int col=0; col < matrix1[rownum].length; col++ ){ 
		matrix1[rownum][ col] = in.nextInt(); 
		}
	}
	public void printMatrix()
	{
		//After user input completes print completed matrix for user
		System.out.println("printing ur matrix");
		for (int row=0; row < matrix1.length; row++){ 
			System.out.println(); 
			for (int col=0; col < matrix1[row].length; col++ ){ 
			System.out.print(matrix1[row][col]); 
			}}
		System.out.println(); 
	}
	public static void calculateBigBlock( int x)
    {
		
        int[][] temp = new int[x][x]; //making temp matrix for calculation
        int i,j; 
        //Calculation section.
        for( i = 0; i < x; i++ )
        {
            temp[i][0] = matrix1[i][0];
        }
        for( i = 0; i < x; i++ )
        {
            temp[0][i] = matrix1[0][i];
        }
        for( i = 1; i < x; i++ )
        {
            for( j = 1; j < x; j++ )
            {
                int minEntry = Math.min(temp[i][j-1],temp[i-1][j]); // Calculates minimum entry by using Math methid
                minEntry = Math.min(minEntry, temp[i-1][j-1]);
                 
                if( matrix1[i][j] == 1)
                    temp[i][j] = minEntry+1;
                else
                    temp[i][j] = 0;
            }
        }
        //iterate through the temp matrix to get the max size and indices
        int maxSize = 0;
        int r = -1;
        int c = -1;
        for( i = 0; i < x; i++ )
        {
            for( j = 0; j < x; j++ )
            {
                if( maxSize < temp[i][j] )
                {
                    maxSize = temp[i][j];
                    r = i;
                    c = j;
                }
            }
        }
        System.out.println("The output: the largest block is at ("+ (r-maxSize+1) +","+ (c-maxSize+1) +") with "+maxSize+" rows.");
    }
		
	public static void main(String[] args) {
		try{//A main to test
		matrixs Matrixs = new matrixs();
		int a;
		System.out.println("Enter the number of rows in the square matrix:");
		a = in.nextInt();
		Matrixs.CreateMatrix(a);
		for(int i = 1; i<=a; i++){
		System.out.println("Enter the matrix row "+i+": ");
		Matrixs.Enterrow(i-1);
		}
		Matrixs.printMatrix();
		matrixs.calculateBigBlock(a);
		}catch (java.util.InputMismatchException e)
		{
		 System.out.println("Error - Input is not intiger"); //user input exception for if input is not intiger
		 System.out.println(e.getMessage());
			System.exit(-1); //application closed
		 
		}
	}
}

import java.util.*;

public class Diagonal {
	static int productDiagonals(int arr[][], int n)
	{
	  
	    int product = 1;
	   
	    // loop for calculating product of both
	    // the principal and secondary diagonals
	    for (int i = 0; i < n; i++) 
	    {
	  
	        // For principal diagonal index of row
	        // is equal to index of column
	        product = product * arr[i][i];
	  
	    
	    }
	  
	    // Divide the answer by middle element for
	    // matrix of odd size
	    if (n % 2 == 1)
	    {
	        product = product / arr[n / 2][n / 2];
	    }
	  
	    return product;
	}
	static int skewDiagonals(int arr[][], int n)
	{ int product = 1;
	   
		 // loop for calculating product of both
	    // the principal and secondary diagonals
	    for (int i = 0; i < n; i++) 
	    {
	  
	     
	        // For secondary diagonal index
	        // of column is n-(index of row)-1
	        product = product * arr[i][n - i - 1];
	    }
	  
	    // Divide the answer by middle element for
	    // matrix of odd size
	    if (n % 2 == 1)
	    {
	        product = product / arr[n / 2][n / 2];
	    }
	  
	    return product;
	}
	// Driver code
	
	
	static int[][] ex3(int array[][], int n) {
		
		int copy[][];
		 
		 for ( int j = array.length/2; j < array.length; j++) 
		    {
		
			 copy = array[j][j];
		
		
		    }
		
		
		return copy;
	}
	public static void main(String[] args)
	{
	    int numbers[][] = { { 1, 2, 3, 4 }, 
	    		{ 5, 6, 7, 8 }, 
	    		{ 4, 5, 6, 7 }, 
	    		{ 1, 2, 3, 4 } };
	    // Function calling
	    System.out.print("Diagonals: " + productDiagonals(numbers, 4) + "\n");
	  
	    System.out.println("Skew: " + skewDiagonals(numbers, 4)+ "\n");
	    
	    int arr[][] = { { 1, 2, 3, 4, 5 }, 
	    		{ 5, 6, 7, 8, 5  }, 
	    		{ 4, 5, 6, 7, 5  }, 
	    		{ 1, 2, 3, 4, 5  },
	    		{ 1, 2, 3, 4, 5 },
	    		{ 1, 2, 3, 4, 5  },
	    		{ 1, 2, 3, 4, 5  },
	    		{ 1, 2, 3, 4, 5  },
	    		{ 1, 2, 3, 4, 5  },
	    		{ 1, 2, 3, 4 , 5 },};
	    System.out.println(ex3(arr,10));
	}
	}
	  
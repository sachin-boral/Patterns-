package Assignments;

public class Assignment1Qsn1 {

	public static void main(String[] args) {
		int n = 10;
		for (int i = 0; i <n; i++) {
			// Loop for I - Pattern
			for (int j = 0; j <n; j++) {
				if ((j == (n-1)/2 ) ||
						(i==0 ) ||
						(i==n-1) )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			//Loop for space between the characters
			for (int j = 0; j <= n - 1; j++) {
				if (j<=(n/8) )
					System.out.print(" ");
			}
			// Loop for N - Pattern
			for (int j = 0; j <n; j++) {
				if (j == 0 || i == j || j == n - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			//Loop for space between the characters
			for (int j = 0; j <= n - 1; j++) {
				if (j<=(n/8) )
					System.out.print(" ");
			}
			// Loop for E - Pattern
			for (int j = 0; j < n; j++) {
				if((j==0)|| (i==0 && j<=(3*n)/4) || (i==n-1 && j<=(3*n)/4) || (i==(n-1)/2 && j<=(3*n)/4 ) )
					System.out.print("*");
				else System.out.print(" ");
			}
			// Loop for U - Pattern
			for (int j = 0; j < n; j++) {
				if (j==0 && i!=n-1|| 
						j==n-1 && i!=n-1 ||
						i==n-1 && j!=0 && j!=n-1
						)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			//Loop for space between the characters
			for (int j = 0; j <= n - 1; j++) {
				if (j<=(n/8) )
					System.out.print(" ");
			}
			// Loop for R - Pattern
			for (int j = 0; j <n; j++) {
				if ( j == 0|| 
						j == (3*n)/4 && i!=0 && i!=(n-1)/2 ||
						i==0 && j<(3*n)/4 ||
						i==(n-1)/2 && j<(3*n)/4 )
					System.out.print("*");
				else
					System.out.print(" ");
			}
			// Loop for O - Pattern
			for (int j = 0; j <n; j++) {
				if (i == 0 && j!=0 && j!=n-1 || 
						i==n-1 && j!=0 && j!=n-1||
						j == 0 && i!=0 && i!=n-1||
						j == n-1 && i!=0 && i!=n-1 ||
						j==n/4 && i>n/4 && i<(3*n)/4 || 
						j==(3*n)/4 && i>n/4 && i<(3*n)/4 ||
						i==n/4 && j>n/4 && j<(3*n)/4 ||
						i==(3*n)/4 && j>n/4 && j<(3*n)/4)
					System.out.print("*");
				else
					System.out.print(" ");;
			}
			//Loop for space between the characters
			for (int j = 0; j <= n - 1; j++) {
				if (j<=(n/8) )
					System.out.print(" ");
			}
			// Loop for O - Pattern
			for (int j = 0; j <n; j++) {
				if (j == 0 || i == j || j == n - 1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}

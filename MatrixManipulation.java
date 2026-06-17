import java.util.*;

public class MatrixManipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the number of rows (m) and columns (n) (both > 2 and < 20): ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        if (m <= 2 || n <= 2 || m >= 20 || n >= 20) {
            System.out.println("Invalid input. Both m and n must be greater than 2 and less than 20.");
            return;
        }

        
        int[][] A = new int[m][n];
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        System.out.println("ORIGINAL MATRIX:");
        printMatrix(A);

        
        ArrayList<Integer> boundaryElements = new ArrayList<>();
        for (int i = 0; i < n; i++) boundaryElements.add(A[0][i]);     
        for (int i = 1; i < m - 1; i++) boundaryElements.add(A[i][n - 1]); 
        for (int i = n - 1; i >= 0; i--) boundaryElements.add(A[m - 1][i]); 
        for (int i = m - 2; i > 0; i--) boundaryElements.add(A[i][0]);   

        
        Collections.sort(boundaryElements);


        int index = 0;
        for (int i = 0; i < n; i++) A[0][i] = boundaryElements.get(index++);     
        for (int i = 1; i < m - 1; i++) A[i][n - 1] = boundaryElements.get(index++); 
        for (int i = n - 1; i >= 0; i--) A[m - 1][i] = boundaryElements.get(index++); 
        for (int i = m - 2; i > 0; i--) A[i][0] = boundaryElements.get(index++);   
        
        int boundarySum = 0;
        for (int val : boundaryElements) {
            boundarySum += val;
        }

       
        System.out.println("REARRANGED MATRIX:");
        printMatrix(A);

        System.out.println("BOUNDARY ELEMENTS:");
        printBoundaryElements(A);

        System.out.println("SUM OF OUTER ROW AND OUTER COLUMN = " + boundarySum);
    }

   
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + "\t");
            }
            System.out.println();
        }
    }

    
    public static void printBoundaryElements(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

       
        for (int i = 0; i < n; i++) System.out.print(matrix[0][i] + " ");
        System.out.println();

       
        for (int i = 1; i < m - 1; i++) {
            System.out.print(matrix[i][0] + "\t");
            for (int j = 1; j < n - 1; j++) System.out.print(" "); 
            System.out.println(matrix[i][n - 1]);
        }

        
        for (int i = 0; i < n; i++) System.out.print(matrix[m - 1][i] + " ");
        System.out.println();
    }
}


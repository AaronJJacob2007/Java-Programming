class Composite {
    private int[][] arr; // 2D array to store composite numbers
    private int m, n;    // Dimensions of the matrix

    // Constructor to initialize the size of the matrix
    public Composite(int mm, int nn) {
        m = mm;
        n = nn;
        arr = new int[m][n];
    }

    // Method to check if a number is composite
    private int isComposite(int p) {
        if (p <= 1) return 0; // Numbers <= 1 are not composite
        int count = 0;
        for (int i = 1; i <= p; i++) {
            if (p % i == 0) count++; // Count factors
        }
        return count > 2 ? 1 : 0; // Composite numbers have more than 2 factors
    }

    // Method to fill the array with the first (m * n) composite numbers column-wise
    public void fill() {
        int num = 4; // Start from the first composite number (4)
        int index = 0; // To count total numbers filled

        while (index < m * n) {
            if (isComposite(num) == 1) {
                // Fill column-wise
                int row = index % m;
                int col = index / m;
                arr[row][col] = num;
                index++;
            }
            num++; // Check the next number
        }
    }

    // Method to display the array
    public void display() {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Main method to test the Composite class
    public static void main(String[] args) {
        Composite obj = new Composite(4, 3); // Example: 4x3 matrix
        obj.fill();                          // Fill with composite numbers
        obj.display();                       // Display the matrix
    }
}

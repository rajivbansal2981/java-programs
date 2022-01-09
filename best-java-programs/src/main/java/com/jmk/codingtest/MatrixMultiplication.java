package com.jmk.codingtest;

public class MatrixMultiplication {

	// To print Matrix
	private static void printMatrix(int matrix[][], int rowSize, int colSize) {
		for (int i = 0; i < rowSize; i++) {
			for (int j = 0; j < colSize; j++)
				System.out.print(matrix[i][j] + " ");

			System.out.println();
		}
	}

	//To multiply two matrices A[][] and B[][]
	private static void multiplyMatrix(int firstMatrixRow, int firstMatrixColumn, int firstMatrix[][], int secondMatrixRow, int secondMatrixColumn, int secondMatrix[][]) {
		int i, j, k;

		// Print the matrices A and B
		System.out.println("\nMatrix A:");
		printMatrix(firstMatrix, firstMatrixRow, firstMatrixColumn);
		System.out.println("\nMatrix B:");
		printMatrix(secondMatrix, secondMatrixRow, secondMatrixColumn);

		// Check if multiplication is Possible
		if (secondMatrixRow != firstMatrixColumn) {

			System.out.println("\nMultiplication Not Possible");
			return;
		}

		// Matrix to store the result
		// The product matrix will be of size firstMatrixRow x secondMatrixColumn
		int resultMatrix[][] = new int[firstMatrixRow][secondMatrixColumn];

		// Multiply the two matrices
		for (i = 0; i < firstMatrixRow; i++) {
			for (j = 0; j < secondMatrixColumn; j++) {
				for (k = 0; k < secondMatrixRow; k++)
					resultMatrix[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
			}
		}

		// Print the result
		System.out.println("\nResultant Matrix:");
		printMatrix(resultMatrix, firstMatrixRow, secondMatrixColumn);
	}

	// Driver code
	public static void main(String[] args) {

		int firstMatrixRow = 4, firstMatrixColumn = 3, secondMatrixRow = 3, secondMatrixColumn = 4;

		int firstMatrix[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 }, { 4, 4, 4 } };
		int secondMatrix[][] = { { 1, 1, 1, 1 }, { 2, 2, 2, 2 }, { 3, 3, 3, 3 } };

		multiplyMatrix(firstMatrixRow, firstMatrixColumn, firstMatrix, secondMatrixRow, secondMatrixColumn, secondMatrix);
	}
}

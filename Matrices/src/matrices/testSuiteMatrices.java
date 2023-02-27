package matrices;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testSuiteMatrices {

	@Test
	void test() {
		int rows = 3;
		int col = 3;
		double[] elems1 = {1,2,3,4,5,6,7,8,9};
		double[] elems2 = {9,8,7,6,5,4,3,2,1};
		double[] result = {10,10,10,10,10,10,10,10,10};
		double[] res2 = {5,5,5,5,5,5,5,5,5};
		double[] elems = {1,4,7,2,5,8,3,6,9};
		double[][] matr = {{1,2,3},{4,5,6},{7,8,9}};
		double x = 2;
		
		Matrix matrix1 = new Matrix(rows, col, elems1);
		Matrix matrix2 = new Matrix(rows, col, elems2);
		Matrix matrixRes2 = new Matrix(rows,col,res2);
		int n = matrix1.getRows();
		int m = matrix1.getColumns();
		assertEquals(3,n);
		assertEquals(3,m);
		
		Matrix maal = matrixRes2.scaled(x);
		Matrix pl = matrix1.plus(matrix2);
		
		assertArrayEquals(result, maal.getElem1());
		assertArrayEquals(result, pl.getElem1());
		
		assertArrayEquals(elems1, matrix1.getElem1());
		assertArrayEquals(elems, matrix1.getElem2());
		assertArrayEquals(matr, matrix1.getElem3());
		
		assertEquals(2, matrix1.numberAt(1,2));
		assertEquals(4, matrix1.numberAt(2,1));
	}

}

package matrices;

public class Matrix {
	/**
	 * @invar | elements != null
	 * @invar | elements.length == rows*columns
	 * @represantationObject
	 */
	private int rows;
	private int columns;
	private double[] elements;
	
	/**
	 * @pre | n*m == elems.length
	 * @pre | elems != null
	 * @inspects | n, m, elems
	 * @creates | result
	 */
	public Matrix(int n,int m,double[] elems) {
		this.rows = n;
		this.columns = m;
		this.elements = elems;
	}
	/**
	 * @inspects | this
	 */
	public int getRows() {
		return this.rows;
	}
	
	public int getColumns() {
		return this.columns;
	}
	
	public double[] getElem1() {
		return this.elements;
	}
	
	public double[] getElem2(){
		double[] elems = new double[this.elements.length];
		double[][] matr = this.getElem3();
		for(int i = 0; i < elems.length; i++) {
			elems[i] = matr[i%this.rows][i/this.columns];
		}
		return elems;
	}
	
	public double[][] getElem3(){
		double[][] elems = new double[this.rows][this.columns];
		for (int i = 0; i < this.elements.length; i++) {
			elems[i/this.rows][i%this.columns] = this.elements[i];
		}
		return elems;
	}
	public Matrix scaled(double n) {
		double[] elems = this.elements;
		for (int i = 0; i < elems.length; i++) {
			elems[i] = elems[i]*n;
		}
		Matrix matrScaled = new Matrix(this.rows, this.columns, elems);
		return matrScaled;
	}
	
	public Matrix plus(Matrix matrix) {
		double[] elems1 = this.elements;
		double[] elems2 = matrix.elements;
		double[] elems = new double[elems1.length];
		for (int i = 0; i < elems1.length; i++)
			elems[i] = elems1[i] + elems2[i];
		Matrix matrPlus = new Matrix(this.rows, this.columns, elems);
		return matrPlus;
	}
	
	public double numberAt(int i,int j) {
		double[][] matr = this.getElem3();
		double number = matr[i-1][j-1];
		return number;
	}

}

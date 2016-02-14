public class MatrixOps
{

public static double[][] multiply(double[][] matrix1, double[][] matrix2){

	double[][] answer= new double[matrix1.length][matrix2[0].length];
	if (matrix1[0].length==matrix2.length){		
		for (int i=0; i<=matrix1.length-1; i++){
		for (int j=0; j<=matrix2[0].length-1; j++){
		for (int p=0; p<=matrix1[0].length-1; p++){
			answer[i][j] = answer[i][j] + matrix1[i][p]*matrix2[p][j];
			}}}
		return answer;
		} 
	
	else{return null;}
}
}

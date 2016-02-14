public class GradebookOps{
	
public static int findStudent(String studentName, String[] allStudentNames, boolean alphabetical){
	
	for(int i=0;i<allStudentNames.length; i++){
		if (allStudentNames[i].equalsIgnoreCase(studentName))
		return i;
		}
		return -1;
}

public static double computeGrade(int studentIndex, int[][] scoreTable, int[] itemPointValues){
		
	double totalgrade; int num=0; double sum=0;
	for (int j=0; j<=scoreTable[0].length-1; j++){
		if (scoreTable[studentIndex][j] != -1){			
			sum += scoreTable[studentIndex][j]*1.0/itemPointValues[j];
			num++;
		}}
		
	totalgrade = 100*sum/num;
	
	return totalgrade;
}
	
public static double[] computeAllGrades(int[][] scoreTable, int[] itemPointValues){
		
	double[] allgrades = new double[scoreTable.length];
	double sum=0;
	int num=0;		
	
	for(int m=0; m<=scoreTable.length-1; m++){
		for (int p=0; p<scoreTable[0].length; p++){
			if (scoreTable[m][p] != -1){			
				num++;
				sum += scoreTable[m][p]*1.0/itemPointValues[p];
		}}			
			
		allgrades[m] = 100*sum/num;
		if(Double.isNaN(allgrades[m])){
			allgrades[m]=100;
		}
		
		sum=0;
		num=0;
	}
	return allgrades;
}
	public static double computeClassAverage(int item, int[][] scoreTable){
	
	double average; int num=0; double sum=0;
		for (int b=0; b<=scoreTable.length-1; b++){
		if(scoreTable[b][item]!= -1){
			num++;
			sum += scoreTable[b][item];
		}}
	
	average= sum/num;
	return average;
}
}
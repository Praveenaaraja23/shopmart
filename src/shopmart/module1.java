package shopmart;



public class module1 {
	
	int mathScore;
	int scienceScore;
	int englishScore;
	int socialScore;
	int count =4;
	
	int totalScore;
	float average;
	
	/*public Students(int i, int j, int k, int l) {
		
		mathScore=i;
		scienceScore=j;
		englishScore=k;
		socialScore=l;
	}*/

	void sum () {
		
		totalScore=mathScore+scienceScore+englishScore+socialScore;
		System.out.println("TotalScore of all subjects is " +totalScore );
		
	}
	
	void averageScore() {
		  
		average= totalScore/count;
		System.out.println("average score of all subjects is " +average);
	}
	
	
	public static void main(String[] args) {
		
		module1 s1 = new module1();
		s1.mathScore=50;
		s1.scienceScore=25;
		s1.englishScore=40;
		s1.socialScore=60;
		s1.sum();
		s1.averageScore();
		
		
		module1 s2 = new module1();
		s2.mathScore=35;
		s2.scienceScore=56;
		s2.englishScore=23;
		s2.socialScore=78;
		s2.sum();
		s2.averageScore();
		
		module1 s3 = new module1();
		s3.mathScore=35;
		s3.scienceScore=42;
		s3.englishScore=38;
		s3.socialScore=54;
		s3.sum();
		s3.averageScore();
		
		module1 s4 = new module1();
		s4.mathScore=66;
		s4.scienceScore=70;
		s4.englishScore=54;
		s4.socialScore=88;
		s4.sum();
		s4.averageScore();
		
		
	}
	

}


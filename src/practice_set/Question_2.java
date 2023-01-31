package practice_set;

public class Question_2 {
	
	public static void main(String[] args) {
		
		char grade = 'B';
		grade = (char)(grade + 8);    //typecasting
		System.out.println(grade);
		
		//decrypt
		grade = (char)(grade - 8);
		System.out.println(grade);
		
	}

}

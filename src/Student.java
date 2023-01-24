import java.util.Random;

public class Student {
	public String  name;
	public int age;
	public Student(String studentName, int studentAge){
		this.name=studentName;
		this.age=studentAge;
	}
	public void  guessingAge(){
		Random random = new Random();
		int randomNumber = random.nextInt(0,35);
		System.out.println("Generated number "+randomNumber+" for "+this.name);
		if (randomNumber==this.age){
			System.out.println("The age is equal to the random number");
		}  else if (randomNumber<age){
			System.out.println("The age is less then the random number");
		} else System.out.println("The age is more than the random number");
	}
}

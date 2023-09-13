package Box;

public class Student {
	int id;
	String name;
	int age;

	Student() {
		id=1;
		name="Anan";
		age=21;
		
		}
	Student(int i,String n, int a){
		id=i;
		name=n;
		age=a;
	}
	void display() {
		System.out.println("Student id:"+ id);
		System.out.println("Name:"+ name);
		System.out.println("Age:"+ age);
		
	}
}

class Studentdemo{

	public static void main(String[] args) {
		Student st1=new Student();
		Student st2=new Student(2,"Anusmit",21);
		st1.display();
		st2.display();
		

	}

}

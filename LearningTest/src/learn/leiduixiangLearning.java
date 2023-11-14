package learn;


class Student{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public String setName(String stuName) {
		return name = stuName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int stuAge) {
		if (stuAge<=0) {
			System.out.println("年龄不合规。。。。。。");
		}else {
			age = stuAge;
		}
	}
	public void introduce() {
		System.out.println("大家好，我叫"+name+"，我今年"+age+"岁！");
	}
	

	
//	构造方法练习
	int time ;
	public Student(String a,int b) {
		name = a;
		age = b;
	}
	
	public Student(int b,String a) {
		name = a;
		age = b;
	}
	
	public void speak() {
		System.out.println("My name is "+name+"!I am "+age+" years old!");
	}
	
//	静态方法、类练习
	private static int num=6;
	public static void sayHello() {
		System.out.println("Hello");
	}
	static class Inner{
		void show() {
			System.out.println("the num is "+num);
		}
	}
}

public class leiduixiangLearning {

	public static void main (String[] args) {
//		Student stu = new Student();
//		stu.setAge(30);
//		stu.setName("王明");
//		stu.introduce();
//		
//	构造方法练习
		Student x = new Student("李鹏",-12);
		Student y = new Student(20,"王猛");
		x.speak();
		y.speak();
		
		Student.sayHello();
		Student.Inner inner = new Student.Inner();
		inner.show();
	}
}

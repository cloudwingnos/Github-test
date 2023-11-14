package learn;

interface Animal{
	int ID=1 ;
	void from();
	void breathe();
	void run();
}
//抽象接口也可通过extends集成
interface LandAnimal extends Animal{
	void voice();
}

//Dog类实现Animal接口
class Dog implements LandAnimal{
//	实现内部对应方法
	public void from() {
		System.out.println("nalaidegou");
	}
	
	public void breathe() {
		System.out.println("狗在喘气");
	}
	
	public void run() {
		System.out.println("qnmd");
	}
	public void voice() {
		System.out.println("rua!");
	}
}

class Cat implements LandAnimal{
//	实现内部对应方法
	public void from() {
		System.out.println("喵star");
	}
	
	public void breathe() {
		System.out.println("猫在呼吸");
	}
	
	public void run() {
		System.out.println("喵斯Dush");
	}
	public void voice() {
		System.out.println("nya~");
	}
}

public class interfacelearning {

	public static void main(String args[]) {
		Dog gou = new Dog();
		gou.from();
		gou.breathe();
		gou.run();
		gou.voice();
//  多态输出		
		LandAnimal an1 = new Dog();
		LandAnimal an2 = new Cat();
		animalvoice(an1);
		animalvoice(an2);
		
//  Object类
		System.out.println(gou.toString()); // 方法根据需要可被重写
	}
//	定义静态animalvoice方法，接受Animal类型参数
	public static void animalvoice(LandAnimal an) {
		an.voice();
	}
}

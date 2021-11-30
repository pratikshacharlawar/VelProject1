package inheritance;

public class Inh implements Son {

	public void method4() {
		System.out.println(1);
	}
	public void method1() {
		System.out.println(2);
	}
	public void method2() {
		System.out.println(3);
	}
	public void method3() {
		System.out.println(4);
	}
	public static void main(String[] args) {
		Inh x=new Inh();
		x.method1();
		x.method2();
		x.method3();
		x.method4();
	}
}

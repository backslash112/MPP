package lesson7.labs.prob1.partE;

public class Main {

	public static void main(String[] args) {
		A a = new D();
		a.sayHi();
	}
}

interface A {
	abstract public void sayHi();
}
interface B extends A {
	public void sayHi();
}
interface C extends A {
	public void sayHi();
}

class D implements B, C {
	public void sayHi() {
		
	}
	
}

interface E extends B, C {
	public void sayHi();
}
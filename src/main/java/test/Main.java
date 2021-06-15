package test;

class A {
	String E = "extraction ";
	String T = "transformation ";
	String L = "loading ";
	
	String sdlc[] = {"requirement analysis", "design", "development", "testing", "implementation", "maintenance"};
	
//	final void ETL() {
//		System.out.println(L + T + E);
//	}
}

class B extends A {
//	void ETL() {
//		System.out.println(E + T + L);
//	}
	
	private String sdlc[] = {"s", "d", "l", "c"};
}

class C extends B {
	String sdlc[] = {"r", "d", "d", "t", "i", "m"};
}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		A obj = new B ();
//		obj.ETL();
		
		B obj = new C();
//		for (int i = 0; i < obj.sdlc.length; i++) {
//			System.out.print(obj.sdlc[i] + " ");
//		}

	}

}

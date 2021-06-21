package org.perscholas.java_functionalInterface;

public class UsingDefaultMethods implements FuncInterWithDefault {

	public static void main(String[] args) {
		UsingDefaultMethods fid = new UsingDefaultMethods();
		fid.square(10);
		fid.show();
		FuncInterWithDefault.staticMethod();
		System.out.println();
		

		FuncInterWithDefault fid2 = new FuncInterWithDefault() {
			@Override
			public void square(int a) {
				System.out.println("Annonymous Implementation: " + a + "^2 = " + (a * a));
			}			
		};
		fid2.square(10);
		fid2.show();
		System.out.println();
		

		FuncInterWithDefault fid3 = a -> 
			System.out.println("Lambda Implementation: " + a + "^2 = " + (a * a));
//			FuncInterWithDefault fid3 = (int a) -> {
//			System.out.println("Lambda Implementation: " + a + "^2 = " + (a * a));
//	};
		fid3.square(10);
		fid3.show();
		
	}
	
	@Override
	public void square(int a) {
		System.out.println(a * a);

	}

}

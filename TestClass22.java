package GitSeleniumJava.GitSeleniumJava;




public class TestClass {
	
	int i;
	int j;
	
	static int p;
	static int k;
	
	public void test1(){
		System.out.println("test 1 non static");
	}
	
	public static void test2(){
		System.out.println("test 2 static");
	}
	
	public void test3(){
		System.out.println("test 1 non static");
	}
	
	public static void test4(){
		System.out.println("test 4 static");
	}
	
	public static void main(String[] args) {
		
		TestClass obj = new TestClass();
		obj.test1();
		obj.test3();
		System.out.println(obj.i);
		System.out.println(obj.j);
		
		TestClass.test2();
		TestClass.test4();
		System.out.println(TestClass.k);
		System.out.println(TestClass.p);
	}

}

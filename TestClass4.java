package GitSeleniumJava.GitSeleniumJava;




public class TestClass4 {
	
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
		
		TestClass4 obj = new TestClass4();
		obj.test1();
		obj.test3();
		System.out.println(obj.i);
		System.out.println(obj.j);
		
		TestClass4.test2();
		TestClass4.test4();
		System.out.println(TestClass4.k);
		System.out.println(TestClass4.p);
	}

}

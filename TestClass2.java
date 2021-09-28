package GitSeleniumJava.GitSeleniumJava;




public class TestClass2 {
	
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
		
		TestClass2 obj = new TestClass2();
		obj.test1();
		obj.test3();
		System.out.println(obj.i);
		System.out.println(obj.j);
		
		TestClass2.test2();
		TestClass2.test4();
		System.out.println(TestClass2.k);
		System.out.println(TestClass2.p);
	}

}

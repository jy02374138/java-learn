public class ErrorDemo{
	public static void main(String[] args){
		test1();
		
	}
	
	public static void test1(){
		try{
			test2();
			
		}catch(Exception e){
			System.out.println("in error");
			e.printStackTrace(System.err);
		}
		System.out.println("test1");
	}
	
	
	public static void test2(){
		test3();
		System.out.println("test2");
	}
	
	public static void test3(){
		System.out.println("test3");
		try{
			test4();
		}catch(Exception e){
			System.out.println("error3");
			//throw e;
		}
		
	}
	
	public static void test4() throws Exception{
		throw new Exception("132456");
		//System.out.println("test4");
	}
}
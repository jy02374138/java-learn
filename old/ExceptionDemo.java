import java.io.IOException;


public class ExceptionDemo{
	
	public static void main(String[] args){
		test1();	
	}
	
	private static void test1(){
		try{
			test2();
		}catch(Exception $e){
			$e.printStackTrace(System.err);
		}
	}
	
	private static void test2() throws Exception {
		try{
			test3();
		}catch(IOException $e){
			throw new Exception("test2" , $e);
		}
	}
	
	private static void test3() throws IOException{
		throw new IOException("test3");
	}
	
	
}
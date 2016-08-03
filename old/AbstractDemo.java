public class AbstractDemo {
	
	public static void main(String[] args){
		
		MyClass a = new MyClass();
		a.callB();
	}
	
	
	
} 



abstract class AbstractClass{
	
	public AbstractClass(){
		
		
	}
	
	public void callA(){
		System.out.println("aaaa");
	}
	
	public abstract void callB();
}



class MyClass extends AbstractClass{
	
	public void callB(){
		System.out.println("MyMyMy");
	}
	
}


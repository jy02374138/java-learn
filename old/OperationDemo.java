public class OperationDemo{
	public void main(String[] args){
		//boolean b1 = test2();// && test1();
		test2() && test1();
	}
	
	public boolean test1(){
		System.out.println("test1");
		return true;
	}
	
	public boolean test2(){
		System.out.println("test2");
		return false;
	}
}
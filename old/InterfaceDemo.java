public class InterfaceDemo{
	
	public static void main(String[] args){
		System.out.println(IClass.Type0);
		ClassA a = new ClassA();
		a.aaa();
	}
	
}

interface IClass{
	
	int Type0 = 0;
	
	void aaa();
	
	
}

class ClassA implements IClass{
	
	public void aaa(){
		System.out.println("aa");
	}
	
}
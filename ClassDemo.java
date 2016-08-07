public class ClassDemo{
	
	public static ClassDemo _instance = null;
	
	private String _name;
	
	public static void main(String[] args){
		ClassDemo d = ClassDemo.getInstance();
		d.printName();
	}
	
	
	
	public ClassDemo(String $name){
		_name = $name;
//		System.out.println("new : " + $name);	
		
		Dog d = new Dog("Number 1");
		d.call();
	}
	
	
	public void printName(){
		System.out.println("this name is : " + _name);
	}
	
	
	
	public static ClassDemo getInstance(){
		if(_instance==null){
			_instance = new ClassDemo("demo");
		}
		return _instance;
	}
	
}
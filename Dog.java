public class Dog extends Animnal{
	
	public Dog(String $name){
		super($name);
	}
	
	public void call(){
		String str = "Dog : " + _name;
		System.out.println(str);
		System.out.println("===========");
		//super.call();
	}
	
}
public class Animnal{
	
	protected String _name;
	
	
	public Animnal(String $name){
		_name = $name;	
	}
	
	
	protected void call(){
		String str = "Animnal : " + _name;
		System.out.println(str);
	}
	
}
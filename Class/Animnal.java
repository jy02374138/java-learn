public class Animnal{
	
	protected String _name;
	
	public Animnal(String $name){
		_name = $name;
	}
	
	public String toString(){
		String s = "Animnal name is " + _name;
		return s;
	}
	
	public void call(){
		String str = toString();
		System.out.println(str);
	}
	
	public int hashCode(){
		return 123;
	}
	
	public boolean equals(Object $o){
		String s1 = toString();
		String s2 = $o.toString();
		boolean b = s1.equals(s2);
		String s = s1 + "================>" + s2 + "==>" + b;
		System.out.println(s);
		return b;
	}
}
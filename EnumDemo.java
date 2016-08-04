class EnumDemo{
	
	public static void main(String[] args){
		//System.out.println(Color.RED);
		//Color[] colors = Color.values();
		/*for(Color c : colors){
			System.out.println(c);
		}
		for(Color c : colors){
			System.out.println(c);
		}*/
		
		
		Persion[] ps = Persion.values();
		for(Persion p: ps){
			System.out.println(p);
		}
	}
}

enum Color{
	RED,BLUE,YELLOW;
	
	private Color(){
		System.out.println("����");
	}
	
}

enum Persion{
	P1("����",31),P2("����",32),P3("����",33);
	
	private String _name;
	private int _age;
	
	
	
	private Persion(String $name , int $age){
		_name = $name;
		_age = $age;
	}
	
	public String toString(){
		String str = _name + " : " + _age;
		return str;
	}
}
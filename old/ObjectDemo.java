import java.lang.CloneNotSupportedException;

class ObjectDemo{
	
	
	
	public static void main(String[] args){
		Test o = new Test();
		o.name = "aaas";
		Test oo = new Test();
		//oo = (Test)o.clone();
		try{
			oo = (Test)o.clone();
		}catch(CloneNotSupportedException $e){
			System.out.println("==============>error");
		}
		System.out.println(oo.name);
	}
}

class Test{
	
	public String name = "none";
	
	public Test clone() throws CloneNotSupportedException{
		System.out.println(1);
		Object o = new Object();
		try{
			o = super.clone();
		}catch(CloneNotSupportedException $e){
			System.out.println(10);
			return null;
		}
		
		Test t = (Test) o;
		System.out.println(2);
		if(o==null){
			System.out.println("Object error!");
			throw new CloneNotSupportedException();
		}else if(t==null){
			System.out.println("Test error!");
			throw new CloneNotSupportedException();
		}else{
			System.out.println("ok,ok,okk!");
		}
		System.out.println(3);
		return t;
	}
}
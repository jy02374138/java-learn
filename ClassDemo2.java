import java.lang.Class;
import java.lang.ClassNotFoundException;


class ClassDemo2{
	
	public static void main (String[] args){
		Animnal a = new Animnal();
		
		Class c1 = a.getClass();
		Class c2 = Animnal.class;
		Class c3 = null;
		try{
			c3 = Class.forName("Animnal");
		}catch(ClassNotFoundException $e){}
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		
	}
	
	
	}
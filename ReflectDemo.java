import java.lang.Class;
import java.lang.ClassNotFoundException;
import java.lang.IllegalAccessException;
import java.lang.ExceptionInInitializerError;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Constructor;

class ReflectDemo{
	
	public static void main(String[] args){
		Employ e = new Employ();
		
		//getClass(e);
		
		Class<?> classType = e.getClass();
		getInstance(classType);
	}
	
	/**
	 * 获取类的实例
	*/
	private static void getInstance(Class $c){
		Employ e = null;
		try{
			e = (Employ) $c.newInstance();		//从Class实例获取该类的实例
		}catch(InstantiationException $e){}
		catch(IllegalAccessException $e){}
		System.out.println(e.getName());
		
		
		Constructor c = null;
		try{
			c = $c.getConstructor();
		}catch(NoSuchMethodException $e){}
		//catch(IllegalAccessException $e){}
		
		try{
			e = (Employ)c.newInstance();		//从构造方法实例获取该类的实例
		}catch(InstantiationException $e){}
		catch(InvocationTargetException $e){}
		catch(IllegalAccessException $e){}
		//catch(ExceptionInInitializerError $e){}
		
		
		
		System.out.println(e.getName());
		
	}
	
	
	
	
	
	/**
	 * 获取Class：（三种方式）
	 	*/
	private static void getClass(Employ $e){
		Class<?> classType = null;
		classType = $e.getClass();		//从实例获取
		classType = Employ.class;			//从类名获得
		try {
			classType = Class.forName("Employ");		//从Class类静态方法中获取
		}catch(ClassNotFoundException $exp){}
		
		System.out.println(classType.hashCode());
		
		//获取实例
		Employ e = null;
		try{
			e = (Employ) classType.newInstance();
		}catch(IllegalAccessException exp){}
		catch(InstantiationException exp){}
		
		System.out.println(e.getName());
		
	}
}


class Employ{
	
	private String name;
	
	private int age;
	
	public Employ(){
		name = "未命名";
	}
	
	public Employ(String $name){
		name = $name;
	}
	
	
	public String getName(){
		return name;
	}
	
	public void setName(String $name){
		name = $name;
	}
}
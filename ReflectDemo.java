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
	 * ��ȡ���ʵ��
	*/
	private static void getInstance(Class $c){
		Employ e = null;
		try{
			e = (Employ) $c.newInstance();		//��Classʵ����ȡ�����ʵ��
		}catch(InstantiationException $e){}
		catch(IllegalAccessException $e){}
		System.out.println(e.getName());
		
		
		Constructor c = null;
		try{
			c = $c.getConstructor();
		}catch(NoSuchMethodException $e){}
		//catch(IllegalAccessException $e){}
		
		try{
			e = (Employ)c.newInstance();		//�ӹ��췽��ʵ����ȡ�����ʵ��
		}catch(InstantiationException $e){}
		catch(InvocationTargetException $e){}
		catch(IllegalAccessException $e){}
		//catch(ExceptionInInitializerError $e){}
		
		
		
		System.out.println(e.getName());
		
	}
	
	
	
	
	
	/**
	 * ��ȡClass�������ַ�ʽ��
	 	*/
	private static void getClass(Employ $e){
		Class<?> classType = null;
		classType = $e.getClass();		//��ʵ����ȡ
		classType = Employ.class;			//���������
		try {
			classType = Class.forName("Employ");		//��Class�ྲ̬�����л�ȡ
		}catch(ClassNotFoundException $exp){}
		
		System.out.println(classType.hashCode());
		
		//��ȡʵ��
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
		name = "δ����";
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
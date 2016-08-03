public class ClassDemoC{
	
	public static void main(String[] args){
		Animnal m1 = new Animnal("m");
		Animnal m2 = new Animnal("m");
		
		
		Object o1 = new Object();
		Object o2 = new Object();
		Boolean b = o1.equals(o1);
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		
		b = m1.equals(m2);
		System.out.println(b);
		
		Dog d = new Dog("dog");
		Cat c = new Cat("cat");
		
		Object n = new Cat("asd");
		Boolean b2 = d instanceof Animnal;
		Boolean b3 = n instanceof Dog;
		System.out.println(b2+"======"+b3/*+"======"+b4*/);
		
		
	}
}
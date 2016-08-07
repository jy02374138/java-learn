public class DataDemo1{
	
	public static void main(String[] args){
		char j = 'h';
		System.out.println(j);
		
		String str = "hello";
		System.out.println(str);
		
		byte a0 = 32;
		float a1 = 333.333f;
		int a2 = (int)a1;
		int a3 = a0;
		System.out.println(a2);
		System.out.println(a3);
		
		char a4 = 'm';
		int a5 = a4;
		System.out.println(a5);
		
		
		char a6 = (char)(a5+4);
		System.out.println(a6);
		
		char c1 = 'd';
		char c2 = 'a';
		int c3 = c2 - c1;
		char c4 = (char)((c1 + c2)/2);
		System.out.println(c3);
		System.out.println(c4);
	}
}
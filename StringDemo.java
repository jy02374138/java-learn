class StringDemo{
	
	public static void main(String[] args){
		String str = "abcdefg";
		StringBuilder bdr = new StringBuilder(str);
		bdr.insert(2 , "123");
		str = bdr.toString();
		System.out.println(bdr);
		System.out.println(str);
		
	}
	
}
public class MemberInnerClass{
	public static void main(String[] args){
		Outter1 outer = new Outter1();
		Outter1.Inner1 inner = outer.new Inner1();
		
		inner.outShow();
	}
	
}

class Outter1{
	public String name = "����";
	private int num1 = 31;
	
	public void outShow(){
		System.out.println(name + " : " + num1);
	}
	
	public class Inner1{
		private String name = "����";
		private int num1 = 20;
	
		public void outShow(){
			System.out.println(name + " : " + num1);
		}
	}
}
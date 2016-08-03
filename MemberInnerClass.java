public class MemberInnerClass{
	public static void main(String[] args){
		Outter1 outer = new Outter1();
		Outter1.Inner1 inner = outer.new Inner1();
		
		outer.num1 = 100;
		
		inner.outShow();
		//outer.inner.outShow();
	}
}





class Outter1{
	public String name = "����";
	public int num1 = 31;
	
	public Inner1 inner;
	
	public Outter1(){
		inner = new Inner1();
		outShow();
	}
	
	public void outShow(){
		System.out.println(name + " : " + num1);
	}
	
	public class Inner1{
		private String name = "����";
		private int num1 = 20;
	
		public void outShow(){
			//System.out.println(name + " : " + num1);
			System.out.println(num1);
			System.out.println(Outter1.this.num1);
		}
		
		protected void outShowA(){
			//System.out.println(name + " : " + num1);
			System.out.println(this.name + " : _" + num1);
		}
	}
}
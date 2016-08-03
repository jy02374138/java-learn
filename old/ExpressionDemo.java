public class ExpressionDemo{
	
	public static int x;
	
	
	public static void main(String[] args){
		System.out.println("hello!");
		x = 0;
		/*
		for(x=0;isOk();x++)
			System.out.println(x);
		*/
		loopb:while(true){
			loopa:while(true){
				System.out.println("loopa:" + x);
				x++;
				if(x>2){
					break loopa;
				}
			}
			System.out.println("loopb:" + x);
			x++;
			if(x>14){
				break loopb;
			}
		}
		
		System.out.println("complete");
	}
	
	public static boolean isOk(){
		return x<10;
	}
	
}
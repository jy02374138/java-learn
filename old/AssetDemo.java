public class AssetDemo{
	
	public enum PersionType{TypeA , TypeB , TypeC};
	
	
	public static void main(String[] args){
		
		System.out.println(PersionType.TypeA);
		System.out.println(PersionType.TypeB);
		assert false 	;
		System.out.println(PersionType.TypeC);
	}
	
	
}

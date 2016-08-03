import java.util.Arrays;
public class ArrayDemo{
	
	public static void main(String[] args){
		int[] src = {0,1,2,3,4,5};
		int[] tar = {900,901,902,903,904,905};
		//System.arraycopy(src, 3 ,tar ,1 , 2);
		int[] a1 = Arrays.copyOf(tar , 2);
		
		int[] a3 = {3,3,5};
		int[] a4 = {3,3,5};
		a3 = a4;
		boolean b = Arrays.equals(a3 , a4);
		//System.out.println(b);
		
		
		int[] a5 = new int[10];
		Arrays.fill(a5  , 3 , 6, 333);
		/*for(int i=0;i<a5.length;i++){
			System.out.println(a5[i]);
		}*/
		
		int[] a6 = {3 , 56 , 32 , 44 , 321 , 9};
		Arrays.sort(a6);
		for(int i=0;i<a6.length;i++){
			System.out.println(a6[i]);
		}
		System.out.println("===============================");
		int k = Arrays.binarySearch(a6 , 441);
		System.out.println(k);
	}
	
}
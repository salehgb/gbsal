package gb.sal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
public class Main {

	public static void main(String[] args) {
		
       int []number= {5,8,9,4,7,3,6,2,1};
       int []sort1= {5,8,9,4,7,3,6,2,1};
       var sort=new InsertionSort();
       var array=new Array(9);
     //  var sort=new Bublsort();
   array.print();
       sort.sort(number);
	//	System.out.println(Arrays.toString(number));
		
		
	}
}

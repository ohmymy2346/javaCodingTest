import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IsOdd {
	public List<Integer> retOdd(List<Integer> input_array,List<Integer> odd_array){
		if(!input_array.isEmpty()){
		int num=input_array.remove(0);
		if((num&1)==1){
			odd_array.add(num);
		}
		return retOdd(input_array,odd_array);
		}
	
	return odd_array;
	}
	
	public static void main(String[] args){
		List<Integer> origList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		ArrayList<Integer> newList = new ArrayList<Integer>();
		IsOdd obj=new IsOdd();
		System.out.println(obj.retOdd(origList,newList));
	}
}



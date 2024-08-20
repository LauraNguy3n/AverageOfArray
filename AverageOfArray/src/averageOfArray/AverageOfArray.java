package averageOfArray;
import java.util.Arrays;
public class AverageOfArray {

	public static void main(String[] args) {
		int [] a = {2,4,4,8};
		int sum = 0;
		
		for(int i=0; i<a.length; i++) {
			sum+=a[i];
		}	
		double average=sum/a.length;
		System.out.println(average);
	}
}
	

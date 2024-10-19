package introduction;

public class TimeComplexcityDemo {
	
//	creating findSum Method
	public int findSum(int n) {
//		by using the formulae for find the sum of number till the given number. 
		return n * (n+1) / 2;
	}
	
//	public int findSum(int n) {
////		find the sum of number till the given number
//		int sum=0;
//		for(int i=1;i<=n;i++) {
//			sum=sum+i;
//		}
//		return sum;
//	}
	public static void main(String[] args) {
		double curTime = System.currentTimeMillis();
		
		TimeComplexcityDemo obj = new TimeComplexcityDemo();
		System.out.println(obj.findSum(9999));
		System.out.println("Time taken- "+(System.currentTimeMillis()-curTime)+" milliseconds");
	}
}

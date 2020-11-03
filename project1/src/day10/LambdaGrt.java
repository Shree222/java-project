package day10;
interface Number{
	public int large(int a,int b);
}
public class LambdaGrt {

	
		
	

	public static void main(String[] args) {
		Number obj = (a,b) -> a>b?a:b;
		
		System.out.println(obj.large(10, 20));

	}

}

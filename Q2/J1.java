import java.util.*;
class IntegerSame extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}

class IntegerNSame extends Exception
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
}
public class J1 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in)) {
			 int num;
			 int num2;
			 try
			 {
				System.out.println("密碼輸入測試");
			    System.out.print("請輸入密碼 :");
			    num=scn.nextInt();
			    System.out.print("請再輸入一次密碼 :");
			    num2=scn.nextInt();
			    if(num==num2)
			       throw new IntegerSame();
			    else if(num!=num2)
			       throw new IntegerNSame();
			 }
			 catch(IntegerSame e)
			 {
			    System.out.println("密碼正確");
			 }
			 catch(IntegerNSame e)
			 {
			    System.out.println("與第一次輸入的不同");
			 }
		}

	}

}

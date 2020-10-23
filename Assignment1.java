
public class Assignment1 {
	public static void  main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		if (num1 <= 0 || num2 <= 0 || num3 <= 0) {
			System.out.println("Invalid input!");
		} else if (num1 + num2 < num3 || num1 + num3 < num2 || num2 + num3 < num1) {
			System.out.println("The input ("+num1+", "+num2+", "+num3+") does not define a valid triangle!");
		} else if (num1*num1 + num2*num2 == num3*num3 || num2*num2 + num3*num3 == num1*num1 || num3*num3 + num1*num1 == num2*num2) {
			System.out.println("The input ("+num1+", "+num2+", "+num3+") defines a valid right triangle!");
		} else {
			System.out.println("The input ("+num1+", "+num2+", "+num3+") defines a valid triangle!");
		}
	
		
	}

}

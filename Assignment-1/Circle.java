import java.util.Scanner;

class Circle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final float PI = 3.1415F;
		System.out.print("Enter the radius: ");
		float radius = sc.nextFloat();
		float area = PI * radius * radius;
		System.out.println("The area of the circle is " + area + " sq. unit\n"); 
	}
}

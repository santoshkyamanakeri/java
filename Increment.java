// Increment Operator
class Increment
{
	public static void main(String[] args) {
		int a = 1;
		int res = a++;
		int res1 = ++a;
		int res2 = a++ + ++a + a++ + ++a;
		int res3 = ++a + a++ + ++a + a++;
		int res4 = a++ + a++ + ++a + ++a;
		int res5 = ++a + ++a + a++ + a++;
		System.out.println("the Increment of 1 is: " + res);
		System.out.println("the Increment of 1 is: " + res1);
		System.out.println("the Increment of 1 is: " + res2);
		System.out.println("the Increment of 1 is: " + res3);
		System.out.println("the Increment of 1 is: " + res4);
		System.out.println("the Increment of 1 is: " + res5);
	}
}
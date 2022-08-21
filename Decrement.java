// Decrement Operator
class Decrement 
{
	public static void main(String[] args) {
		int a = 2;
		int res = a--;
		int res1 = --a;
		int res2 = a-- - a--;
		int res3 = --a - --a;
		int res4 = a-- + --a;
		System.out.println("the Decrement of 2 is: " + res);
		System.out.println("the Decrement of 2 is: " + res1);
		System.out.println("the Decrement of 2 is: " + res2);
		System.out.println("the Decrement of 2 is: " + res3);
		System.out.println("the Decrement of 2 is: " + res4);
	}
}
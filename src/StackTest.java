/**
 * Created by br0ce on 03.07.14.
 */
public class StackTest
{


	public static void main(String[] args)
	{
		Stack<String> s = new Stack<String>();
		s.push("Apfel");
		s.printStack();
		System.out.println();
		s.push("Orange");
		s.printStack();
		System.out.println();
		s.pop();
		s.printStack();
		System.out.println();
		s.push("Erdbeere");
		s.printStack();
		System.out.println();
		s.push("Kiwi");
		s.printStack();
		System.out.println();
		s.pop();
		s.printStack();
		System.out.println();
		s.pop();
		s.printStack();
		System.out.println();
		s.pop();
		s.printStack();
		System.out.println();
		s.pop();
		s.printStack();
	}
}
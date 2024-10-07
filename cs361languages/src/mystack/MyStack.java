/**
 * 
 */
package mystack;

/**
 * @author Karan Nahar
 *
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		// TODO To complete
		if (theStack == null) {
            return null;
        }
        T value = theStack.val;
        theStack = theStack.next;
        return value;
	}

	public void push(T v) {
		// TODO To complete
		theStack = new MyNode<>(v, theStack);
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		// Push 1 and 2
		// Pop
		// Push 5
		MyStack<Integer> integerStack = new MyStack<>();
		integerStack.push(1);
        integerStack.push(2);
        integerStack.pop(); //will pop 2
        integerStack.push(5);
        integerStack.pop(); // will pop 5
		
		// TODO To complete
		// Create a stack of Person
		// Push a person p1 with your name
		// Push a person p2 with my name
		MyStack<Person> personStack = new MyStack<>();
        Person p1 = new Person("Karan", "Nahar");
        Person p2 = new Person("John", "Smith");
        personStack.push(p1);
        personStack.push(p2);
	}

}

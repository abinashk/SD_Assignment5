/**
 * 
 */
package assignment5;
import assignment5.MyInterface;

/**
 * @author mac
 *
 */
class MyImplementation implements MyInterface {

	/* (non-Javadoc)
	 * @see assignment5.MyInterface#method1()
	 */
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("implementation of method1");
	}

	/* (non-Javadoc)
	 * @see assignment5.MyInterface#method2()
	 */
	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("implementation of method2");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface obj = new MyImplementation();
	    obj.method1();
	    obj.method2();
	}

}

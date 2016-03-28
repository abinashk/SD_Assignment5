/**
 * 
 */
package assignment5;
import assignment5.MyAbstractClass;

/**
 * @author mac
 *
 */
class MyConcreteClass extends MyAbstractClass {

	/**
	 * 
	 */
	public MyConcreteClass() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see assignment5.MyAbstractClass#disp2()
	 */
	@Override
	public void disp2() {
		// TODO Auto-generated method stub
		System.out.println("I'm overriding abstract method");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyConcreteClass obj = new MyConcreteClass();
//		MyAbstractClass obj1 = new MyAbstractClass();
		obj.disp1();
	    obj.disp2();
	    obj.setText1("This is a private string");
	    obj.setNum1(10);
	    System.out.println(obj.getText1());
	    System.out.println(obj.getNum1());
//	    System.out.println(obj.num1);
	}

}

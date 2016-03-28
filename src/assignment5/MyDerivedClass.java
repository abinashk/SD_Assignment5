/**
 * 
 */
package assignment5;
import assignment5.MyBaseClass;

/**
 * @author mac
 *
 */
class MyDerivedClass extends MyBaseClass {

	/**
	 * 
	 */
	public MyDerivedClass() {
		// TODO Auto-generated constructor stub
	}
	
	public void methodToOverride() //Derived Class method
    {
         System.out.println ("I'm the method of MyDerivedClass");
    }

}

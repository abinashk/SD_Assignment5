/**
 * 
 */
package assignment5;

/**
 * @author mac
 *
 */
class MyPolymorphismTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// BaseClass reference and object
        MyBaseClass obj1 = new MyBaseClass(); 
        // BaseClass reference but DerivedClass object
        MyBaseClass obj2 = new MyDerivedClass(); 
        // Calls the method from BaseClass class
        obj1.methodToOverride(); 
        //Calls the method from DerivedClass class
        obj2.methodToOverride();
	}

}

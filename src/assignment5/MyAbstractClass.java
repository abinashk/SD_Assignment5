/**
 * 
 */
package assignment5;

/**
 * @author mac
 *
 */
abstract class MyAbstractClass {
	
	private String text1;
	private int num1;
	private boolean bl1;
	
	public void setText1(String a){
		text1 = a;
	}
	
	public void setNum1(int a){
		num1 = a;
	}
	
	public void setBl1(boolean a){
		bl1 = a;
	}
	
	public String getText1(){
		return text1;
	}
	
	public int getNum1(){
		return num1;
	}
	
	public boolean getBl1(){
		return bl1;
	}
	
	public void disp1(){
	     System.out.println("Concrete method of abstract class");
	   }
	abstract public void disp2();
}

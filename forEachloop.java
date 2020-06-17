/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int[] a={10,20,30,40};
	    int[] b={50,60,70,80};
	    fun(a,b);
	        
	    }
	//	System.out.println("Hello World");
	public static void fun(int[]... x){
	     
	    for(int[] x1:x){
	        for(int x2:x1){
	        System.out.println(x2);
	        }
	    }
	}
}

/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
	   
		Hashtable h=new Hashtable();
		h.put(new summa(4),2);
		h.put(new summa(7),4);
		h.put(new summa(9),1);
		System.out.println(h);
	}
}

class summa{
    int i;
    summa(int i){
        this.i=i;
    }
    public  int hashCode(){
        return i;
    }
    public String toString(){
        return i+" ";
    }
}



































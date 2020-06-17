import java.util.*;
import java.lang.*;
public class set{

public static void main(String[] args){

TreeSet s=new TreeSet(new myComparator());
s.add("52");

s.add("10");
s.add("2");
s.add("30");

/*Iterator i=s.iterator();
while(i.hasNext()){

System.out.println(i.next());

}*/
System.out.println(s);
}

}

class myComparator implements Comparator{

public int compare(Object b1,Object b2){
String ob1=(String)b1;
String ob2=(String)b2;
return -ob1.compareTo(ob2);
}



}
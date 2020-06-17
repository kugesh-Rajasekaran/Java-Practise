import java.util.*;
public class collbinsearch{
public static void main(String[] args){
ArrayList al=new ArrayList();
al.add(20);
al.add(10);
al.add(50);

al.add(40);


Comparator c=Collections.reverseOrder(new myComparator());


Collections.sort(al,c);

//System.out.println(Collections.binarySearch(al,50));
//Collections.reverse(al);
System.out.println(al);

}
}
 class myComparator implements Comparator{
public int compare(Object b1,Object b2){
String s1=(String) b1;
String s2=(String) b2;
return s2.compareTo(s1);

}



}
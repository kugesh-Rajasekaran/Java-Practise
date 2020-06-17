import java.util.*;
public class collectionsSort{

public static void main(String[] args){
ArrayList al=new ArrayList();
al.add(10);
al.add(20);
al.add(30);

al.add(40);
System.out.println(al);
Collections.sort(al,new myComparator());
System.out.println(al);

}

}

class myComparator implements Comparator{

public int compare(Object b1,Object b2){
Object  s1=b1;
Object s2=b2;
return s2.compareTo(s1);


}





}
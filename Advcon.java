 class conn{
public String s;
public int i;
conn(String s,int i){

this.s=s;
this.i=i;

}

public void test(){
System.out.println(s+" "+i);
}

}

public class Advcon{

public static void main(String[] args){
conn c1=new conn("kugesh",10);
//con c2=new con("rakesh",20);
c1.test();
}}
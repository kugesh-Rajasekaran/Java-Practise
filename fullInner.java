/*class fullInner{
public int a=5;
public static int b=20;
static class test1{
public void m1(){
System.out.println(" "+a);
System.out.println(" "+b);
}
};
public static void main(String[] args){
fullInner t=new fullInner();
fullInner.test1 t1=t.new test1();
t1.m1();
new fullInner().new test1().m1();
System.out.println("kugesh1");
}};*/

class fullInner{
public int a=5;
public static int b=20;
static class test1{
public static void main(String[] args){

System.out.println("kugesh2");
}


public void m1(){

System.out.println(" "+b);
}
};
public static void main(String[] args){
test1 t1=new test1();
t1.m1();
System.out.println("kugesh1");
}};


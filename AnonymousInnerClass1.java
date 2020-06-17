

class AnonymousInnerClass1 {
public static void main(String args[]){

popcorn p=new popcorn(){

public void taste(){
System.out.println("child");
}
};
p.taste();

popcorn p1=new popcorn();
p1.taste();}};




class popcorn{
public void taste(){
System.out.println("main");
}
};



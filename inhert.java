class parent{
public int s=12;
public static void main(String[] args){

System.out.println("parent");
}
public  void summa(){
System.out.println("parent");
}
}

class child extends parent {
public int s=10;
public static void main(String[] args){

//("parent");
}

public  void summa(){
System.out.println("child");
}
}

public class inhert {

public static void main(String[] args){
child c=new child();
parent o=(parent)c;
//p.summa();
o.summa();

}
}
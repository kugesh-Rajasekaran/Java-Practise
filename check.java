class parent{

public void summ(){

System.out.println("hello parent");
}

}

class child extends parent{

public void summ(){


System.out.println("hello child");
}
}

public class check{

public static void main(String[] args){

child p=new parent();
p.summ();
}

}
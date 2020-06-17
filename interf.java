interface inter{
int m=10;
public void  summa();
}

interface intell{
//int m=10;
public void  summa();
}


public class interf implements inter,intell{
public static void main(String[] args){

 interf i=new interf();
i.summa();}

public void summa(){
System.out.println("interface "+m);
}
}
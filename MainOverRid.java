import java.io.*;
class OverRid {

public void summa() throws IOException{
System.out.println("parent class");
}




}

 class OverRidi extends OverRid {

public void summa() throws Exception{

System.out.println("child class");

}

}


public class MainOverRid{
public static void main(String[] args){
try{
OverRidi c=new OverRidi();
c.summa();
OverRid p=new OverRid();
p.summa();
OverRid a=new OverRidi();
a.summa();}
catch(IOException e){

System.out.println("caught");}

}


}
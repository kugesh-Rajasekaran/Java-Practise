import java.util.*;
import java.io.*;
public class prop{

public static void main(String[] args){
try{
Properties p=new Properties();
FileInputStream fis=new FileInputStream("abc.txt");
p.load(fis);
FileOutputStream fos=new FileOutputStream("abc.txt");
p.store(fos,"kugesh is a good boy");
System.out.println(p);}
catch(Exception e){
System.out.println("bad");

}
}

}
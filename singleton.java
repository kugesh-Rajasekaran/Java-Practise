

public class singleton{
public static void main(String[] args){
sing a=sing.getinstance();
sing b=sing.getinstance();
sing c=sing.getinstance();
System.out.println(a.str);
}}




class sing{

private static sing s=null;

public String str;
private sing(){

str="kugesh is ";

}
public static sing getinstance(){
if(s==null)
s=new sing();

return s;

}

}


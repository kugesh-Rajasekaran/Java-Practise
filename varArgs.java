public class varArgs{

public static void main(String[] args){
int[] a={10,20,30,40};
int[] b={50,60,70,80};
//System.out.println(&a[0]);
fun(a,b);

}


public static void fun(int[]... arr){
int i=0;
for(int[] x1:arr
){
System.out.println(x1[0]);
}
/*for(i=0;i<2;i++)
{
System.out.println(arr[0][i]);
}*/
//System.out.println(arr[1][3]);
}


}
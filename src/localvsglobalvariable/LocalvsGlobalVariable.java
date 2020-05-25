package localvsglobalvariable;

public class LocalvsGlobalVariable {
	String s="Age";
	int age=18;
	int i=40;
	public static void main(String[] args){
		 int i=10;
		 LocalvsGlobalVariable obj=new LocalvsGlobalVariable();
		 System.out.println(i);
		 System.out.println(obj.s);
		 System.out.println(obj.sum());
	}
public int sum()
{
int f=30;
int sum=i+age;
System.out.println(i);
return sum;
}
}

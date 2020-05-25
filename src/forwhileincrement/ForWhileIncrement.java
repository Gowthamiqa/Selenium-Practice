package forwhileincrement;

public class ForWhileIncrement {
	
	public static void main(String[] args){
	
	double i=10;
	while(i>=-10)
	{
		System.out.println("i value is:"+i);
		i--;
	}
System.out.println("*******");

for(int j=-2;j<=10;j++)
{
	System.out.println("the value of j is:"+j);
}
int g=101;
int k=g++;

System.out.println(k);
System.out.println(g);

double l=101.19;
double m=l--;

System.out.println(l);
System.out.println(m);

double n='^';
double o=--n;

System.out.println(n);
System.out.println(o);

int q='9';
int r=++q;
System.out.println(q);
System.out.println(r);
	}
	
	
	
}
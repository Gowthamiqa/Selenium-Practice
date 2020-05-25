package callbyvalueandcallbyreference;

public class CallbyvalueandCallbyreference {
	int z;
	int w;
	int x=20;
	int y=30;
	int p=90;
	double q=99.99;
	String s="Gowthami";
	char a='6';
	boolean b=false;
	public static void main(String[] args)
	{
		CallbyvalueandCallbyreference obj=new CallbyvalueandCallbyreference();
		CallbyvalueandCallbyreference obi=new CallbyvalueandCallbyreference();
		
		obj.p=10;
	    obj.q=20.99;
	    obj.s="happy";
	    obj.a='e';
	    obj.b=true;
	    
	    obi.p=11;
	    obi.q=21.99;
	    obi.s="hhappy";
	    obi.a='i';
	    obi.b=true;
	    int x=10;
	    int y=90;
	    
	  obi.z=90;
	  obi.w=10;
	System.out.println(obj.sum(x, y));
	obi.swap(obi);
	
	
	}
  public int sum(int a,int b){
	  int c;
	  c=a+b;
	  System.out.println(x+y);
	  return c;
  }
public void swap(CallbyvalueandCallbyreference o){
	int temp=z;
	z=w;
	w=temp;
	System.out.println(z);
	System.out.println(temp);
	System.out.println(w);
	
	}
}


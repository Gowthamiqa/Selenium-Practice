package singledimension;

public class SingleDimension {
	
	public static void main(String[] args)
	{
    int a[]=new int[2];
    a[0]=1;
    a[1]=100;
    System.out.println(a[1]);
    System.out.println(a.length);
    
    char b[]= new char[2];
    b[0]='9';
    b[1]='$';
    System.out.println(b[0]);
    System.out.println(b.length);
    
    boolean b1[]= new boolean[2];
    b1[0]=true;
    b1[1]=false;
    System.out.println(b1[0]);
    System.out.println(b1[1]);
    System.out.println(b1.length);
    
    double d[]=new double[2];
    d[0]=14.77;
    d[1]=100;
    System.out.println(d[0]);
    System.out.println(d[1]);
    System.out.println(d.length);
    
    
    String S[]=new String[2];
    S[0]="14.77";
    S[1]="htetHTY7890#$%^";
    System.out.println(S[0]);
    System.out.println(S[1]);
    System.out.println(S.length);
    
    Object S1[]=new Object[5];
    S1[0]=14.77;
    S1[1]="htetHTY7890t68{#$%^";
    S1[2]=678;
    S1[3]='I';
    S1[4]="True";
  
    int j=0;
    while (j<S1.length)
    {
    	System.out.println(S1[j]);
    	j++;
    }
    
    
    
    
    }
}

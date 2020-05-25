package stringcct;

public class StringCCT {

	public static void main(String[] args)
	{
		int j='C';
		int y=55;
		
		double d='d';
		double f=20.99;
		
		boolean b1=true;
		boolean b2=false;
		
		String S="Hello";
		String J="C";
				System.out.println("this is addition"+j+y);
				System.out.println("this is addition of int and double"+(j+y+d+f));
				System.out.println("this is addition of int and double"+(j+y)+d+f);
				System.out.println("this is addition of int and double"+(j+y)+(d+f));
				System.out.println("this is addition of int and double"+(j+f)+(d+y));
				System.out.println(b1);
				System.out.println(b2);
				System.out.println(S+J+(j+y)+d+f);
				System.out.print(f+y+S+J+f+j);
				System.out.println("hello testing");
				
				System.out.println("****^^^&&%%$$##@@!!");
				
				if(j>y){
					System.out.println("j is greater than y");
					}
				else {
					System.out.println("y is greater than j");
				}
				
				int z=100;
				double u=12.99;
				char x='f';
				
				if(z>u & z>x)
				{
					System.out.println("Z is greatest");
				}
				
				else if(u>x)
				{
					System.out.println("u is greatest");
				}
					else
					{
						System.out.println("x is greatest");
					}
	
	
	}
}
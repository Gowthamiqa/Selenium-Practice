package entity;

public class Humanclass {
	int apples;
	int Oranges;
		public static void main(String[] args){
			int x=90;
			double y=199.99;
				Humanclass Kamala=new Humanclass();
		Humanclass ganesh=new Humanclass();
		Humanclass gowthami=new Humanclass();
		
Kamala.apples=100;
Kamala.Oranges=100;
ganesh.apples=200;
ganesh.Oranges=200;
gowthami.Oranges=300;

System.out.println("Kamala has"+" "+Kamala.apples+" "+"apples");
System.out.println(Kamala.Oranges);
System.out.println(ganesh.apples);
System.out.println(ganesh.Oranges);
System.out.println(gowthami.Oranges);

Kamala=ganesh;
ganesh=gowthami;
gowthami=Kamala;

System.out.println("Kamala has"+" "+Kamala.apples+" "+"apples");
System.out.println(Kamala.Oranges);
System.out.println(ganesh.apples);
System.out.println(ganesh.Oranges);
System.out.println(gowthami.Oranges);

ganesh.run();
System.out.println(x+y);
System.out.println(Kamala.eat());
System.out.println(gowthami.jump());
double eu=ganesh.multiply(60, 99);
System.out.println("eu valiue is"+" "+eu);

}
		public void run()
		{
				}
		public double eat(){

			System.out.println("eating");
			double goa=14.99;
			double banana=90;
			double total=goa+banana;
					return total;
		}
					public int jump()
					{
					
					System.out.println("jump");
					int jump1=90;
					int jump2=91;
					int J3=jump1+jump2;
					System.out.println(J3);
					return J3;
					}
		
					public double multiply(int tt,int ee){
						System.out.println("multiply");
					double mul=ee*tt;
					System.out.println(mul);
					return mul;
					
					}
					}

package methodoverloading;

public class MethodOverloading {
int a;
	public static void main(String[] args){
		MethodOverloading obj=new MethodOverloading();
		MethodOverloading obi=new MethodOverloading();
		obj.a=10;
		obi.a=11;
			obj.sum();
		obj.sum(9);
		obj.sum(10, 11);
		obj.sum('f');
		System.out.println(obj.equals(obi));
		MethodOverloading.main(9);
		MethodOverloading.main();
		MethodOverloading.main(10);
		MethodOverloading.main(10, 11);
		MethodOverloading.main(true);
		
		
				
	}
	
	
	public static void main()
	{
	System.out.println("no input and no output");
	}
	
	public static void main(int i){
		System.out.println(i);
			}
	public static void main(boolean ji){
		System.out.println(ji);
			}
	public static void main(int j, int k){
		System.out.println(j+""+k);
			}
	public void sum(int j, int k){
		System.out.println(j+k);
			}
	public void sum(int t){
		System.out.println(t);
			}
	public void sum(char o){
		System.out.println(o);
			}
	public void sum(double y){
		System.out.println(y);
			}
	public void sum(){
		System.out.println("no input and but output");
		int l=80;
		int m=90;
		int f=l+m;
		System.out.println(f);
			}	
}


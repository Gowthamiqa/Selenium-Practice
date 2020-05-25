package staticandnonstatic;

public class StaticandNonStatic {
  String name="tom";
  static int age=20;
  public static void main(String[] args){
	  StaticandNonStatic obj=new StaticandNonStatic();
	  StaticandNonStatic obi=new StaticandNonStatic();	
	  //obj.name="jenny";//
	  int age=30;
	  System.out.println(age);
	  System.out.println(obj.name);
	  System.out.println(obj.sendmail("Happy"));
	  sum();
	  //System.out.println(obj.age);//
	  obj.sum();
	  System.out.println(obj.sum(80));
  }
  public static void sum()
    {
	System.out.println("Sum method");
    }
  public static int sum(int d)
  {
	  
	System.out.println(age+20+d);
	System.out.println(age+30+d);
	return d;
  }
  public String sendmail(String s){
	  System.out.println(s);
	  System.out.println("HI"+name);
	  System.out.println(name+"age is"+age);
	  return s;
	  
  }
  }

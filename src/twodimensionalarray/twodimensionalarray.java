package twodimensionalarray;

public class twodimensionalarray {

	public static void main(String[] args){
	
		String [][]t=new String[2][2];
		t[0][0]="A";
		t[0][1]="B";
		t[1][0]="A1";
		t[1][1]="B1";
			 
		int i=0;
		
				while(i<t.length){
					int j=0;			
						while(j<t[1].length)
							{
								System.out.println(t[i][j]);
								j++;
			
							}i++;
			
			
		}
		
		
				
		
}
}

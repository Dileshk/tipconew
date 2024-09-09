
public class starpatternprogram {
	public static void main(String[] args) {
		
		int space=4;
		int star=1;
		for(int i=1;i<=7;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.println(" ");
			}
			for(int k=1;k<=star;k++)
			{
				System.out.print("10");
			}
			System.out.println();
			if(i<4)
			{
				space=space-1;
				
				
			}
			else
			{
				star=star+3;
				space++;
			}
		}
		
		}
		
		
		
		
	}




public class PatternJava {

	public static void main(String[] args) {
		int i,j;
		for(i=0;i<5;i++)        //rows
	    {
	        for(j=0;j<5;j++)     //column
	        {
	            if(i==j || j==4-i )   //condition to print "*"
	            {
	            	System.out.print("*");
	            }
	            else
	            {
	            	if(j<4 & i!=2)
	            	{
	                System.out.print("__");  //to print _
	            	} 
	            	if(i==2 & j<3)
	            	{
	            		System.out.print("__");
	            	}
	            }
	        }
	        System.out.println();  //new line after printing one line
	    }
	}
}
  
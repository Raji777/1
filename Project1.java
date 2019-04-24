public class Project1 
{
	public static void main(String[] args) 
	{
	    int f=0;
	   String code=" ";
	   String[][] a=new String[][]{{"1001","Asish","01/04/2009","e","R&D","20000","8000","3000"},{"1002","sushma","23/08/2012","c","PM","30000","12000","9000"},{"1003","Rahul","12/11/2008","k","Acct","10000","8000","1000"},{"1004","Chahat","29/01/2013","r","Front Desk","12000","6000","2000"},{"1005","Ranjan","16/07/2005","m","Engg","50000","20000","20000"},{"1006","Suman","1/1/2000","e","Manufacturing","23000","9000","4400"},{"1007","Tanmay","12/06/2006","c","PM","29000","12000","10000"}};
       String id=args[0];
	        for (int i=0;i<7 ;i++ )
	        {
	            if(id.equals(a[i][0]))
	            {
	                f=1;
	                break;
	            }
	        }
	    if(f==0)
	    {
	      System.out.println("there is no employee with id"+args[0]);
	    }  
	    else
	    {
	    String dc=" ";
	    int b=0;
	    int hra=0;
	    int da=0;
	    int it=0;
	    System.out.println(id);
	    for(int i=0; i<7; ++i)
	    {
	    if(a[i][0].equals(id))
	    {
	     System.out.println("name"+"\t"+a[i][1]);
	     System.out.println("dept"+"\t"+a[i][4]);
	     dc=a[i][3];
	     b=Integer.parseInt(a[i][5]);
	     hra=Integer.parseInt(a[i][6]);
	     it=Integer.parseInt(a[i][7]);
	    }
	    }
	    int salary=0;
	    switch(dc)
	    {
	        case "e":System.out.println("enginneer");
	        salary=b+hra+20000-it;
	        System.out.println("salary"+"\t"+salary);
	        break ;
	        case "c":System.out.println("consultant ");
	        salary=b+hra+32000-it;
	        System.out.println("salary"+"\t"+salary);
	        break ;
	        case "k":System.out.println("clerk");
	        salary=b+hra+12000-it;
	        System.out.println("salary"+"\t"+salary);
	        break ;
	        case "r":System.out.println("receptionist");
	        salary=b+hra+15000-it;
	        System.out.println("salary"+"\t"+salary);
	        break ;
	        case "m":System.out.println("manager");
	        salary=b+hra+40000-it;
	        System.out.println("salary"+"\t"+salary);
	        break ;
	     }
	    }     
	}
}

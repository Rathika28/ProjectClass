package org.company;

public class CompanyInfo
{
	public void cmnyName()
	{
		System.out.println("Company name is: Hcl");
		System.out.println("Company name is: Infosys");
	}
	
	public void cmnyId() 
	{
		System.out.println("Company id is: 2001");
	}
	
	public void cmnyAddress()
	{
		System.out.println("Company Address is: Annanagar-Chennai");
	}
	
   public static void main(String[] args)
   {
		CompanyInfo c=new CompanyInfo();
		c.cmnyName();
		c.cmnyId();
		c.cmnyAddress();
		
	}

}

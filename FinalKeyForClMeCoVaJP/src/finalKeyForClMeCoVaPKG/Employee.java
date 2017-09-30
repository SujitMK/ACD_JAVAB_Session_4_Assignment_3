package finalKeyForClMeCoVaPKG;

public final class Employee {                     // Final Class can not be extended/inherited by child classes
	
	
	// As ePanNum is Final, Only 1st time a value can be assigned to it 
	// and then it will be constant and can not be changed
	
	final String ePanNum; 
	
	Employee(String eName, String ePanNum)  
	{
		eName = "Mr. "+eName;            
		this.ePanNum = ePanNum;                               // 1st time assigning the value to the final variable
		System.out.println();
		System.out.println("Employee Name Is       : "+eName);
		System.out.println("Employee Pan Number Is : "+ePanNum);
		System.out.println();
	}
	
	public final void eWorkDetails()                          // This final method can be inherited but can not be overridden 
	{
		System.out.println("Employee works as Java Developer for Oracle.");
	}

}

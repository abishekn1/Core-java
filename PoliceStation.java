class PoliceStation{
	
	String name="Basavanagudi";
	int noOfStaffs;
	String inspectorName;
	String[] kaidiNames;
	
	PoliceStation(String[] kaidiNames)
	
	{
		this.kaidiNames=kaidiNames;
	}
	void setnoOfStaffs(int noOfStaffs)
	{
		this.noOfStaffs=noOfStaffs;
	}
	void PrintData()
	{
		System.out.println(this.name);
		System.out.println(this.noOfStaffs);
		System.out.println(this.inspectorName);
	
	for(int number=0;number<this.kaidiNames.length;number++)
		
	{	
	System.out.println(this.kaidiNames[number]);
	}
	}
	public static void main(String[] tiger)
	
	{
		String[] names={"Chandru","Sachin","Prajwal","Venkatesh"};
		PoliceStation policestation=new PoliceStation(names);
		
		policestation.setnoOfStaffs(12);
		policestation.inspectorName="Agni";
		policestation.PrintData();
	}
	
		
	
	
}
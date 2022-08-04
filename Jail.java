class Jail{
	
	String name;
	int noOfCells;
	String[] staffNames;
	int noOfGates;
	
	Jail(String name,int noOfCells)
	{
		this.name=name;
		this.noOfCells=noOfCells;
	}
	void setOfstaffNames(String[] staffNames)
	{
		this.staffNames=staffNames;
	}
	void setnoOfGates(int noOfGates)
	{
		this.noOfGates=noOfGates;
	}
	void PrintData()
	{
		System.out.println(this.name);
		System.out.println(this.noOfCells);
		System.out.println(this.noOfGates);
		
		for(int number=0;number<this.staffNames.length;number++)
	{
		System.out.println(this.staffNames[number]);
	}
	}
	
	public static void main(String[] lion)
	
	{
		Jail jail=new Jail("Parappana Agrahara",100);
		String[] names={"Chandru","Prajwal","Swathi","Venka"};
		jail.setOfstaffNames(names);
		
		jail.setnoOfGates(4);
		
		
		jail.PrintData();
		
	}
}
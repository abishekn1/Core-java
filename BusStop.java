class BusStop{
	
	String stopName;
	String startingPoint;
	String endPoint;
	int totalBench;
	String[] passengerNames;
	double[] timeOfArrival;
	
	BusStop(String stopName,String startingPoint,String endPoint,int totalBench)
	{
		this.stopName=stopName;
		this.startingPoint=startingPoint;
		this.endPoint=endPoint;
		this.totalBench=totalBench;
	}
	void setOfPassengers(String[] passengerNames)
	{
		this.passengerNames=passengerNames;
	}
	void setOfTimeArrival(double[] timeOfArrival)
	{
		this.timeOfArrival=timeOfArrival;
	}
	void PrintData()
	{
		System.out.println(this.stopName);
		System.out.println(this.startingPoint);
		System.out.println(this.endPoint);
		System.out.println(this.totalBench);
		
		for(int number=0;number<this.passengerNames.length;number++)
			
			{
				System.out.println(this.passengerNames[number]);
			}
			
		for(int number1=0;number1<this.timeOfArrival.length;number1++)
			
			{
				System.out.println(this.timeOfArrival[number1]);
			}
	}
	
	public static void main(String[] lion)
	
	{
		BusStop busstop=new BusStop("Basavanagudi","Majestic","Banashankari",20);
		
		String[] name1={"Nanu","Ninu","Avnu","Ivnu"};
		busstop.setOfPassengers(name1);
		
		double[] name2={10.30,11.00,11.30,12.00};
		busstop.setOfTimeArrival(name2);
		
		busstop.PrintData();
	}

}
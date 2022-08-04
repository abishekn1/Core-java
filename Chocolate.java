class Chocolate{
	
	String name;
	String flavour;
	String brand;
	int price;
	
	Chocolate()
	
	{
		System.out.println("Inside no argument Constructor");
	}
	Chocolate(String name)
	{
		System.out.println("Inside argument is Executed");
		this.name=name;
	}
	Chocolate(String name,String flavour)
	{
		this(name);
		//System.out.println("Inside argument 2);
		this.flavour=flavour;
	}
	Chocolate(String name,String flavour,String brand)
	{
		this(name,flavour);
		//System.out.println("Inside argument 3);
		this.brand=brand;
	}
	Chocolate(String name,String flavour,String brand,int price)
	{
		this(name,flavour,brand);
		//System.out.println("Inside argument 4);
		this.price=price;
	}
	
	public static void main(String[] lion)
	
	{
		Chocolate chocolate=new Chocolate();
		
		chocolate.name="Kit Kat";
		chocolate.flavour="Choco";
		chocolate.brand="Nestle";
		chocolate.price=40;
		
		System.out.println(chocolate.name);
		System.out.println(chocolate.flavour);
		System.out.println(chocolate.brand);
		System.out.println(chocolate.price);
		
		Chocolate chocolate1=new Chocolate("Kit Kat");
		
		chocolate1.flavour="Choco";
		chocolate1.brand="Nestle";
		chocolate1.price=40;
		
		System.out.println(chocolate1.name);
		System.out.println(chocolate1.flavour);
		System.out.println(chocolate1.brand);
		System.out.println(chocolate1.price);
		
		Chocolate chocolate2=new Chocolate("Kit Kat","Choco");
		
		chocolate2.brand="Nestle";
		chocolate2.price=40;
		
		System.out.println(chocolate2.name);
		System.out.println(chocolate2.flavour);
		System.out.println(chocolate2.brand);
		System.out.println(chocolate2.price);
		
		Chocolate chocolate3=new Chocolate("Kit Kat","Choco","Nestle");
		
		chocolate3.price=40;
		
		System.out.println(chocolate3.name);
		System.out.println(chocolate3.flavour);
		System.out.println(chocolate3.brand);
		System.out.println(chocolate3.price);
		
		Chocolate chocolate4=new Chocolate("Kit Kat","Choco","Nestle",40);
		
		System.out.println(chocolate4.name);
		System.out.println(chocolate4.flavour);
		System.out.println(chocolate4.brand);
		System.out.println(chocolate4.price);
	}
		
}

public class Themos {
	int vol;
	String brand;
	String Liquid;
	Themos(String brand,String Liquid,int vol)
	{
		this.brand=brand;
		this.Liquid=Liquid;
		this.vol=vol;
		
	}
	void add_liquid()
	{
		Liquid=Liquid+vol;
	}
	void display()
	{
		System.out.println(Liquid);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Themos t1=new Themos("Godrej","orange juice",1000);
        t1.display();
	}

}

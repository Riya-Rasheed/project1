package aggregation;

public class Book 
{
	String bname,type;
	int rate;
	Author ad;
	public Book(String bname,String type,int rate,Author ad)
	{
		this.bname=bname;
		this.type=type;
		this.rate=rate;
		this.ad=ad;
	}
	public void display()
	{
		System.out.println("Author name:"+ad.name);
		System.out.println("Author age:"+ad.age);
		System.out.println("Author city:"+ad.city);
		System.out.println("Book name:"+bname);
		System.out.println("Book Type:"+type);
		System.out.println("Book Rate:"+rate);
		
	}

	public static void main(String[] args) 
	{
		Author obj1 = new Author("Chetan bhagat","Delhi",45);
		Book b = new Book("Half Girlfriend","Romance",200,obj1);
		b.display();
		// TODO Auto-generated method stub

	}

}

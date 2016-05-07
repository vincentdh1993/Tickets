
public class AdvancedTickets extends RegularTickets { //AdvancedTickets which extends the RegularTickets
	private int days; //adding field "days" to count how many days before the ticket was bought.

	
	public AdvancedTickets(int ticket, int days){ //setting parameter ticket and days.
		super(ticket);
		this.days = days; //take days from the field.
	}
	
	public double getPrice(){ //method that gets the price depending on the days.
		if (days >=20){
			price = 15.0;
		}
		else if (days <= 19 && days >=11){
			price = 20.0;
		}
		else{
			price = 40.0;
		}
		
		return price; //returning the price.
	}
	
	public String print(){ //Printing method which indicates type of the ticket, price, and the number.
		System.out.println("This is an Advanced Ticket!");
		System.out.println("Ticket number = "+ticket+" and price = "+getPrice());
		 return "Ticket number = "+ticket+" and price = "+getPrice();
	}
	
}

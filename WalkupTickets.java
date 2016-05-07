
public class WalkupTickets extends RegularTickets { //WalkUpTicket which extends the RegularTickets.
	
	public WalkupTickets(int ticket){ //taking the same parameter as the "RegularTickets."
		super(ticket);
		
	}
	
	public double getPrice() { //getPrice method to return the price of WalkupTicket which is 50.
		return 50;
	}
	
	public String print(){ //Overriding print method which indicates this ticket is a WalkupTicket, price, and the ticket number.
		System.out.println("This is a Walkup Ticket!");
		System.out.println("Ticket number = "+super.ticket+" and price = "+getPrice());
		 return "Ticket number = "+super.ticket+" and price = "+getPrice();
	}
}

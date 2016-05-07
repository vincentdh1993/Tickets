
public class RegularTickets { //this is the standard and super class for other tickets.
	protected int ticket; //define ticket as protected so it can be used in other classes too.
	protected double price = 40.0; //encapsulating the field.
	
	public RegularTickets(int ticket) { //Giving parameter "ticket" which will be the number.
		this.ticket = ticket;
	}
	
	public double getPrice() { //Through getPrice, it returns price.
		return this.price;
	}
	
	public String print(){ //Printing method prints the Ticket number and the price. Which also returns the String as the instruction says.
		System.out.println("Ticket number = "+ticket+" and price = "+price);
		 return "Ticket number = "+ticket+" and price = "+price;
	}
		
}

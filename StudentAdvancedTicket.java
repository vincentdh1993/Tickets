
public class StudentAdvancedTicket extends AdvancedTickets{ //StudentAdvancedTicket which extends AdvancedTickets but not RegularTickets.
	
	public StudentAdvancedTicket(int ticket, int days){ //takes the same parameters as its superclass.
		super(ticket,days);
	}
	
	public double getPrice() { //the unique getPrice method in StudentAdvancedTicket which gives 50% discount.
		return super.getPrice()/2;
	}
	
	public String print(){ //the unique printing method in StudnetAdvancedTicket which indicates the price, number, and the type of the ticket.
		System.out.println("Student ID REQUIRED!");
		System.out.println("Ticket number = "+ticket+" and price = "+getPrice());
		 return "Ticket number = "+ticket+" and price = "+getPrice();
	}
}

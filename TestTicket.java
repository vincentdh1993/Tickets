import java.util.*;

public class TestTicket {

	public static void main(String[] args) {
		RegularTickets[] tickets = new RegularTickets[15]; //creating ticket arrays which contains 15 tickets.

		int ticketNumber = 1; //initializing ticketNumber as 1.
		
		while(ticketNumber<=15){ //setting tickets to each indexes as the instruction.
			if(ticketNumber >=0 && ticketNumber <=3){ //Array elements in positions 0-2 store regular tickets.
				tickets[ticketNumber-1]=new RegularTickets(ticketNumber);
			}
			else if(ticketNumber==4 || ticketNumber==5){ //Array elements in positions 3 and 4 store walk up tickets.
				tickets[ticketNumber-1] = new WalkupTickets(ticketNumber);
			}
			else if(ticketNumber==6 ||ticketNumber==7 || ticketNumber==8){ //Array element in positions 5,6 and 7 store tickets purchased 30 days, 15 days and 3 days
																				//in advance respectively. 
//				int days = ask(ticketNumber);
				int advance = getAdvance(ticketNumber); //this gets the number of advanced days.
				tickets[ticketNumber-1] = new AdvancedTickets(ticketNumber, advance);
			}
			else if(ticketNumber==9 || ticketNumber==10 ||ticketNumber==11){ //Array elements in positions 8,9 and 10 store student tickets purchased 30 days, 15 days
																				//and 3 days in advance respectively.
//				int days = ask(ticketNumber);
				int advance = getAdvance(ticketNumber); //this gets the number of advanced days.
				tickets[ticketNumber-1] = new StudentAdvancedTicket(ticketNumber, advance);
			}
			else { //Array elements in positions 11-14 store regular tickets.
				tickets[ticketNumber-1] = new RegularTickets(ticketNumber);
			}
			ticketNumber++; //add the TicketNumber so it can run through.
		}
		printTickets(tickets); //printing the tickets informations.
		System.out.printf("The total price of the tickets is $%.2f\n", totalPrice(tickets)); //printing the total price of tickets sold.
		
	}
	
	public static void printTickets(RegularTickets[] tickets){ //printing method by calling unique "print()" method of each classes.
		for (int i = 0; i < 15; ++i)
        {
			tickets[i].print();
        }
	}
	
	public static double totalPrice(RegularTickets[] tickets){ //the method which gets the totalPrice of the tickets.
		double totalPrice = 0.0; //initializing the totalPrice as double.
		for (int i = 0; i < 15; ++i)
        {
            totalPrice+=tickets[i].getPrice(); //during the loop, the price keep adds itself.
        }
		return totalPrice;
	}
	
	public static int getAdvance(int ticketNumber){ //this method gets the advanced date depending on the ticketNumber.
		int advance =0;
		if(ticketNumber==6 || ticketNumber==9){ //6 is for Advanced, and 9 is for StudentAdvanced.
			advance = 30;
		} else if(ticketNumber==7 || ticketNumber==10){ //7 is for Advanced, and 10 is for StudentAdvanced.
			advance = 15;
		} else { 										//8 is for Advanced, and 11 is for StudentAdvanced.
			advance = 3;
		}
		return advance;
	}
	
	

}

//This "ask" method is a backup plan if the user changes the advanced date.

/*
	public static int ask(int ticketNumber){
		int temp = ticketNumber;
		Scanner input = new Scanner(System.in);
		if(ticketNumber==5 ||ticketNumber==6 || ticketNumber==7){
			System.out.println("How many days was number "+ticketNumber+" Advance Ticket purchased?");
		} else{
			System.out.println("How many days was number "+ticketNumber+" Student Advance Ticket purchased?");
		}
		int days = input.nextInt();
		return days;
	}
 */
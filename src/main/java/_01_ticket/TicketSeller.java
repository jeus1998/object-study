package _01_ticket;

/**
 * 티켓 판매원
 */
public class TicketSeller {
	private TicketOffice ticketOffice;

	public TicketSeller(TicketOffice ticketOffice) {
		this.ticketOffice = ticketOffice;
	}

	public void sellTo(Audience audience){
		ticketOffice.sellTicketTo(audience);
	}
}

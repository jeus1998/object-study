package _01_ticket;

import java.util.*;

/**
 * 매표소
 * 티켓을 교환하거나 구매
 */
public class TicketOffice {
	private Long amount;
	private List<Ticket> tickets = new ArrayList<>();

	public void sellTicketTo(Audience audience) {
		plusAmount(audience.buy(getTicket()));
	}

	public TicketOffice(Long amount, List<Ticket> tickets) {
		this.amount = amount;
		this.tickets = tickets;
	}

	private Ticket getTicket() {
		return tickets.remove(0);
	}

	private void minusAmount(Long amount) {
		this.amount -= amount;
	}

	private  void plusAmount(Long amount) {
		this.amount += amount;
	}
}

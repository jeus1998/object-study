package _01_ticket;

/**
 * 관람객 소지품 3가지
 * 초대장(invitation)
 * 티켓(ticket)
 * 현금(amount)
 */
public class Bag {
	private Long amount;
	private Invitation invitation;
	private Ticket ticket;

	public Long hold(Ticket ticket) {
		if(hasInvitation()){
			setTicket(ticket);
			return 0L;
		}
		setTicket(ticket);
		minusAmount(ticket.getFee());
		return ticket.getFee();
	}

	// 가방의 상태1: 현금만 보유
	public Bag(long amount){
		this(null, amount);
	}
	// 가방의 상태2: 초대장 & 현금 보유
	public Bag(Invitation invitation, Long amount){
		this.invitation = invitation;
		this.amount = amount;
	}

	private boolean hasInvitation() {
		return invitation != null;
	}

	public boolean hasTicket() {
		return ticket != null;
	}

	private void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	private void minusAmount(Long amount) {
		this.amount -= amount;
	}

	public void plusAmount(Long amount) {
		this.amount += amount;
	}
}

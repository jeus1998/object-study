package _02_movie;

import java.math.BigDecimal;

/**
 * Money
 * 저장하는 값이 금액과 관련돼 있다는 의미를 전달할 수 있다. 일반 Long 타입과 다르게
 * 또한 금액과 관련된 로직의 중복 구현을 막을 수 있다.
 */
public class Money {
	public static final Money ZERO = wons(0);

	private final BigDecimal amount;

	public static Money wons(double amount) {
		return new Money(BigDecimal.valueOf(amount));
	}
	public static Money wons(long amount) {
		return new Money(BigDecimal.valueOf(amount));
	}

	Money(BigDecimal amount) {
		this.amount = amount;
	}

	public Money plus(Money amount) {
		return new Money(this.amount.add(amount.amount));
	}

	public Money minus(Money amount) {
		return new Money(this.amount.subtract(amount.amount));
	}

	public Money times(double percent) {
		return new Money(this.amount.multiply(BigDecimal.valueOf(percent)));
	}

	public boolean lessThan(Money other) {
		return amount.compareTo(other.amount) < 0;
	}

	public boolean isGreaterThanOrEqual(Money other) {
		return amount.compareTo(other.amount) >= 0;
	}

}

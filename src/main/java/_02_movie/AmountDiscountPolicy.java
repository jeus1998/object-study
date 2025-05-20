package _02_movie;

import java.util.List;

public class AmountDiscountPolicy extends DiscountPolicy {
	private Money discountAmount;

	public AmountDiscountPolicy(List<DiscountCondition> conditions, Money discountAmount) {
		super(conditions);
		this.discountAmount = discountAmount;
	}

	@Override
	protected Money getDiscountAmount(Screening screening) {
		return discountAmount;
	}
}

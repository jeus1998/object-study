package _02_movie;

import java.util.List;

public class PercentDiscountPolicy extends DiscountPolicy {
	private double percent;

	public PercentDiscountPolicy(List<DiscountCondition> conditions, double percent) {
		super(conditions);
		this.percent = percent;
	}

	@Override
	protected Money getDiscountAmount(Screening screening) {

		return screening.getMovieFee().times(percent);
	}
}

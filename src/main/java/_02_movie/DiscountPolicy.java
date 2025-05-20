package _02_movie;

import java.util.*;

public abstract class DiscountPolicy {
	private List<DiscountCondition> conditions = new ArrayList<>();

	public DiscountPolicy(List<DiscountCondition> conditions) {
		this.conditions = conditions;
	}

	public Money calculateDiscountAmount(Screening screening) {
		for(DiscountCondition each : conditions){
			if(each.isSatisfiedBy(screening)){
				return getDiscountAmount(screening);
			}
		}

		return Money.ZERO;
	}

	abstract protected Money getDiscountAmount(Screening screening);
}

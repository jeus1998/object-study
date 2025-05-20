package _02_movie;

/**
 * 할인 순번 조건
 * 상영 순번과 일치할 경우 할인 가능 판단
 */
public class SequenceCondition implements DiscountCondition {
	private int sequence;

	public SequenceCondition(int sequence) {
		this.sequence = sequence;
	}

	@Override
	public boolean isSatisfiedBy(Screening screening) {
		return screening.isSequence(sequence);
	}
}

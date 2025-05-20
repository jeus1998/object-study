package _02_movie;

import java.time.LocalDateTime;

/**
 * 상영
 */
public class Screening {
	private Movie movie;
	private int sequence;
	private LocalDateTime whenScreened;

	public Screening(Movie movie, int sequence, LocalDateTime whenScreened) {
		this.movie = movie;
		this.sequence = sequence;
		this.whenScreened = whenScreened;
	}

	public LocalDateTime getStartTime(){
		return whenScreened;
	}

	public Boolean isSequence(int sequence){
		return this.sequence == sequence;
	}

	public Money getMovieFee() {
		return movie.getFee();
	}
}

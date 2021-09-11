package model.entitis;

import java.io.Serializable;
import java.util.Objects;

public class Numbers implements Serializable {

	private static final long serialVersionUID = 1L;

	private final Integer number00 = 0;
	
	private final Integer number01 = 1;
	
	private final Integer number02 = 2;
	
	private final Integer number03 = 3;
	
	private final Integer number04 = 4;
	
	private final Integer number05 = 5;
	
	private final Integer number06 = 6;
	
	private final Integer number07 = 7;
	
	private final Integer number08 = 8;
	
	private final Integer number09 = 9;

	public Integer getNumber00() {
		return number00;
	}

	public Integer getNumber01() {
		return number01;
	}

	public Integer getNumber02() {
		return number02;
	}

	public Integer getNumber03() {
		return number03;
	}

	public Integer getNumber04() {
		return number04;
	}

	public Integer getNumber05() {
		return number05;
	}

	public Integer getNumber06() {
		return number06;
	}

	public Integer getNumber07() {
		return number07;
	}

	public Integer getNumber08() {
		return number08;
	}

	public Integer getNumber09() {
		return number09;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number00, number01, number02, number03, number04, number05, number06, number07, number08,
				number09);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Numbers other = (Numbers) obj;
		return Objects.equals(number00, other.number00) && Objects.equals(number01, other.number01)
				&& Objects.equals(number02, other.number02) && Objects.equals(number03, other.number03)
				&& Objects.equals(number04, other.number04) && Objects.equals(number05, other.number05)
				&& Objects.equals(number06, other.number06) && Objects.equals(number07, other.number07)
				&& Objects.equals(number08, other.number08) && Objects.equals(number09, other.number09);
	}

}

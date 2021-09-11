package model.entitis;

import java.io.Serializable;
import java.util.Objects;

public class Operations implements Serializable {

	private static final long serialVersionUID = 1L;

	private final String subtraction = "-";

	private final String sum = "+";

	private final String multiplication = "x";

	private final String division = "÷";

	private final String floatingPoint = ".";

	private final String equal = "=";

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getSubtraction() {
		return subtraction;
	}

	public String getSum() {
		return sum;
	}

	public String getMultiplication() {
		return multiplication;
	}

	public String getDivision() {
		return division;
	}

	public String getFloatingPoint() {
		return floatingPoint;
	}

	public String getEqual() {
		return equal;
	}

	@Override
	public int hashCode() {
		return Objects.hash(division, equal, floatingPoint, multiplication, subtraction, sum);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Operations other = (Operations) obj;
		return Objects.equals(division, other.division) && Objects.equals(equal, other.equal)
				&& Objects.equals(floatingPoint, other.floatingPoint)
				&& Objects.equals(multiplication, other.multiplication)
				&& Objects.equals(subtraction, other.subtraction) && Objects.equals(sum, other.sum);
	}

}

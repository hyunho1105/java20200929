package chap11.object.equals;

public class Book {
	private int barCode;
	
	public Book(int barCode) {
		this.barCode = barCode;
	}
//	@Override
//	public int hashCode() {
//		return barCode;
//	}
//	
//	@Override
//	public boolean equals(Object obj) {
//		Book o = (Book) obj;
//		return this.barCode == o.barCode;
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + barCode;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (barCode != other.barCode)
			return false;
		return true;
	}
}

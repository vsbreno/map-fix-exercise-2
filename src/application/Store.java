package application;

import java.util.Objects;

public class Store {

	private String productName;
	private Integer quantitySold;

	public Store(String productName, Integer quantitySold) {
		this.productName = productName;
		this.quantitySold = quantitySold;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getQuantitySold() {
		return quantitySold;
	}

	public void setQuantitySold(Integer quantitySold) {
		this.quantitySold = quantitySold;
	}

	@Override
	public int hashCode() {
		return Objects.hash(productName, quantitySold);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Store other = (Store) obj;
		return Objects.equals(productName, other.productName) && Objects.equals(quantitySold, other.quantitySold);
	}
}

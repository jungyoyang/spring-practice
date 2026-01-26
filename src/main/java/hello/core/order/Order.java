package hello.core.order;

public class Order {

	private Long memberId;
	private String itemname;
	private int itemPrice;
	private int discountPrice;

	public Order(Long memberId, String itemname, int itemPrice, int discoutPrice) {
		this.memberId = memberId;
		this.itemname = itemname;
		this.itemPrice = itemPrice;
		this.discountPrice = discountPrice;
	}

	public int calculatePrice(){
		return itemPrice - discountPrice;
	}

	public Long getMemberId() {
		return memberId;
	}

	public void setMemberId(Long memberId) {
		this.memberId = memberId;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getDiscoutPrice() {
		return discountPrice;
	}

	public void setDiscoutPrice(int discoutPrice) {
		this.discountPrice = discoutPrice;
	}

	@Override
	public String toString() {
		return "Order{" +
			"memberId=" + memberId +
			", itemname='" + itemname + '\'' +
			", itemPrice=" + itemPrice +
			", discountPrice=" + discountPrice +
			'}';
	}
}

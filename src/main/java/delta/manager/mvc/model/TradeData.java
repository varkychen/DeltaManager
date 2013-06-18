package delta.manager.mvc.model;

public class TradeData {
	private int id;
	private String counterparty;
	private double notional;
	private String underlying;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getCounterparty() {
		return counterparty;
	}
	public void setCounterparty(String counterparty) {
		this.counterparty = counterparty;
	}
	
	public double getNotional() {
		return notional;
	}
	public void setNotional(double notional) {
		this.notional = notional;
	}

	public String getUnderlying() {
		return underlying;
	}
	public void setUnderlying(String underlying) {
		this.underlying = underlying;
	}
}

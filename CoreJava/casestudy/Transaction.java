package casestudy;

import java.time.LocalDate;

public class Transaction {

	private byte transId;

	private LocalDate date;

	private String typeOfTrans;

	private float credits;

	private float debits;

	private float Amount;

	public Transaction() {
		// TODO Auto-generated constructor stub
	}

	public byte getTransId() {
		return transId;
	}

	public void setTransId(byte transId) {
		this.transId = transId;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getTypeOfTrans() {
		return typeOfTrans;
	}

	public void setTypeOfTrans(String typeOfTrans) {
		this.typeOfTrans = typeOfTrans;
	}

	public float getCredits() {
		return credits;
	}

	public void setCredits(float credits) {
		this.credits = credits;
	}

	public float getDebits() {
		return debits;
	}

	public void setDebits(float debits) {
		this.debits = debits;
	}

	public float getAmount() {
		return Amount;
	}

	public void setAmount(float amount) {
		Amount = amount;
	}

	@Override
	public String toString() {
		return "Transaction [transId=" + transId + ", date=" + date + ", typeOfTrans=" + typeOfTrans + ", credits="
				+ credits + ", debits=" + debits + ", Amount=" + Amount + "]";
	}

	public Transaction(byte transId, LocalDate date, String typeOfTrans, float credits, float debits, float amount) {
		super();
		this.transId = transId;
		this.date = date;
		this.typeOfTrans = typeOfTrans;
		this.credits = credits;
		this.debits = debits;
		Amount = amount;
	}

}

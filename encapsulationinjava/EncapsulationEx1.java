package encapsulationinjava;

class BankAccount {
	private long acc_no;
	private String name, email;
	private float amount;

	public long getAcc_no() {
		return acc_no;
	}

	public void setAcc_no(long acc_no) {
		this.acc_no = acc_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

}

public class EncapsulationEx1 {

	public static void main(String[] args) {

		BankAccount account = new BankAccount();
		account.setAcc_no(33762210111700L);
		account.setName("Gampala Yugandhar");
		account.setEmail("yugandhargampala33@gmail.com");
		account.setAmount(12500.36f);

		System.out.println("Bank Account Number: " + account.getAcc_no());
		System.out.println("Account Holder Name: " + account.getName());
		System.out.println("Account Holder Email Id: " + account.getEmail());
		System.out.println("Bank Balance: " + account.getAmount());
	}

}

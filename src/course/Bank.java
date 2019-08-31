package course;

public class Bank {
	private int numberAccount;
	private String nameAccount;
	private double dinheiro;
	private String yesNo;
	private double tax = 5.0;
	

	public int getNumberAccount() {
		return numberAccount;
	}

	public void setNumberAccount(int numberAccount) {
		this.numberAccount = numberAccount;
	}

	public String getNameAccount() {
		return nameAccount;
	}

	public void setNameAccount(String nameAccount) {
		this.nameAccount = nameAccount;
	}
	public double getDinheiro() {
		return dinheiro;
	}
	public void setDinheiro (double dinheiro) {
		this.dinheiro = dinheiro;
	}
	public void setYesNo (String yesNo) {
		this.yesNo = yesNo;
	}
	public String getYesNo () {
		return yesNo;
	}
	
	public String getDadosBankBalance () {
		String dados = "Account data" 
		+ "Account: " 
		+ numberAccount
		+ ", Holder: "
		+ nameAccount
		+ ", Balance: $ "
		+ dinheiro;
		return dados;
	}
	public String getDadosBank () {
		String dados = "Account data" 
		+ "Account: " 
		+ numberAccount
		+ ", Holder: "
		+ nameAccount;
		return dados;
	}
	
	public void deposit (double dinheiro) {
		this.dinheiro += dinheiro;
	}
	public void withdraw (double dinheiro) {
		this.dinheiro -= dinheiro + tax;
	}

	
}

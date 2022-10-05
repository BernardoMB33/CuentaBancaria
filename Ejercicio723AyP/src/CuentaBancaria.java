
public class CuentaBancaria {
	// ATRIBUTOS
	private String numCta;
	private String name;
	private double saldo;
	
	// CONSTRUCTORES
	public CuentaBancaria() {	
	}
	public CuentaBancaria(String name1) {
		this.name=name1 ;
	}
	public CuentaBancaria(String name1, double saldo1) {
		this.name=name1;
		this.saldo=saldo1;
	}
	
	public CuentaBancaria (String numCta1, String name1, double saldo1 ) {
		this.numCta=numCta1;
		this.name=name1;
		this.saldo=saldo1;
	}

	// GETS && SETS
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNumCta() {
		return numCta;
	}
	
	//para la activacion
	public void setNumCta(String numCta) {
		this.numCta = numCta;
	}

	public String getName() {
		return name;
	}
	
	// FUN MIN
	public int compare(CuentaBancaria otro) {
		return this.numCta.compareTo(otro.numCta);
	}
	
	public boolean equals(CuentaBancaria otro) {
		return (this.numCta.equals(otro.numCta));
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Numero de Cuenta: "+ numCta);
		sb.append("\nA nombre de: "+ name);
		sb.append("\nSaldo de la Cta: "+saldo);
		return sb.toString();
	}
	
	// FUN CLASE
	public boolean deposito(double monto) {
		if (monto>0) {
		saldo+= monto;}
		
		return (monto>0);
	}
	

	public boolean retiro(double monto) {
		if (monto<=saldo && monto>0) {
			saldo-=monto;
		}
		
		return (monto<=saldo && monto>0);
	}
	
	
	
}

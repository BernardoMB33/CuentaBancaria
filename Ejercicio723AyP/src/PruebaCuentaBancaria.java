
public class PruebaCuentaBancaria {

	public static void main(String[] args) {
		CuentaBancaria c001= new CuentaBancaria("Jose Perez", 3000.00);
		CuentaBancaria c002= new CuentaBancaria("Juana Garcia");
		int rsp;
		String mm, igu;
		
		c001.setNumCta("001");
		c002.setNumCta("002");
		
		c002.deposito(4000.00);
		c001.retiro(10000.00); //en teoria no deberia dar pq es mayor al saldo
		c001.deposito(1000.00);
		
		
		//mm
		switch (c001.compare(c002)) {
		case 0:
			mm= "La cuenta es la misma";
			break;
		case 1: 
			mm= "Cuenta Primera es mayor (Nmo Cta)";
			break;
		default:
			mm="Cuenta Primera es menor (Nmo Cta)";
		}
	
		//igu
		 if (c001.equals(c002)==true) 
			 igu="La cuenta es la misma";
		 else
			 igu="La cuenta no es igual";
			 
		System.out.println(igu);
		System.out.println(mm);
			
		}
	
		
		
		

	}



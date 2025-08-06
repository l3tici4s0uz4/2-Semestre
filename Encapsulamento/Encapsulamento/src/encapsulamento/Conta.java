package encapsulamento;

public class Conta {
		private double saldo;
		
		
		
		public Conta(double saldo) {
			super();
			this.saldo = saldo;
		}

		public double getSaldo() {
			return saldo;
		}

		public void getSaldo(double saldo) {
			this.saldo = saldo;
		}

		public double depositar(double deposito) {
			return saldo = saldo + deposito;
		}
		
		public void sacar(double saque) {
			if (saldo >= saque) {
				saldo = saldo - saque;
            System.out.println("seu saldo atual é: " + saldo);
			}else {
				System.out.println("Saldo insuficiente");
					
				}
			}
		}


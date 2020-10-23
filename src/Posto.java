import javax.swing.JOptionPane;

public class Posto {

	public static void main(String[] args) {

		BombaCombustivel bomba = new BombaCombustivel("Gasolina", 4.2);
		
		int opcao = 0;
		String entrada = "";
		double valor = 0.0;
		
		do {
			entrada = JOptionPane.showInputDialog("1 = Abastecer por Litros | 2 = Abastecer por valor | 3 = Sair do Posto");
			opcao = Integer.parseInt(entrada);
			
			switch (opcao) {
			case 1: //Por Litros

				entrada = JOptionPane.showInputDialog("Quantos litros vc deseja abastecer?");
				valor = Integer.parseInt(entrada);
				
				bomba.abastecerPorLitros(valor);
				JOptionPane.showMessageDialog(null, bomba.exibirRecibo());
								
				break;

			case 2: //Por Valor
				entrada = JOptionPane.showInputDialog("Quanto vc quer pagar?");
				valor = Integer.parseInt(entrada);
				
				bomba.abastecerPorValor(valor);
				JOptionPane.showMessageDialog(null, bomba.exibirRecibo());
				
				break;

			case 3: //Saida
				JOptionPane.showMessageDialog(null, "Obrigado por visitar o Posto");
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Opcao inválida");
				break;
			}
			
			
		}while (opcao != -1);
		
	}

}

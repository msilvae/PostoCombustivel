
public class BombaCombustivel {

	private String nome;
	private double precoLitro;
	private double qtdeLitros;
	private double totalPagar;

	public BombaCombustivel(String nome, double precoLitro) {
		super();
		this.nome = nome;
		this.precoLitro = precoLitro;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPrecoLitro() {
		return precoLitro;
	}
	public void setPrecoLitro(double precoLitro) {
		this.precoLitro = precoLitro;
	}
	public double getQtdeLitros() {
		return qtdeLitros;
	}
	public void setQtdeLitros(double qtdeLitros) {
		this.qtdeLitros = qtdeLitros;
	}
		
	public double getTotalPagar() {
		return totalPagar;
	}
	public void setTotalPager(double totalPagar) {
		this.totalPagar = totalPagar;
	}

	//Métodos
	public void abastecerPorLitros(double litros) {
		this.qtdeLitros = litros;
		this.totalPagar = litros * this.precoLitro;
	}
	
	public void abastecerPorValor(double valor) {
		this.totalPagar = valor;
		this.qtdeLitros = valor / this.precoLitro;
	}
	
	public String exibirRecibo() {
		return  "Custo do abastecimento: " + String.format("%.2f",this.totalPagar) 
				+ "\n" + "Total de Litros: " + String.format("%.3f", this.qtdeLitros);
	}


}

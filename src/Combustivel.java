
public class Combustivel {

	private String nome;
	private Double precoLitro;
	
	public Combustivel(String nome, Double precoLitro) {
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
	public Double getPrecoLitro() {
		return precoLitro;
	}
	public void setPrecoLitro(Double precoLitro) {
		this.precoLitro = precoLitro;
	}
	
}

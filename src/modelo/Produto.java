package modelo;

public class Produto {

	private String name;
	private Integer quant;
	private Float valor;
	private Float valorTotal;
	
	public Produto (String name, int quant, float valor) {
		this.name = name;
		this.quant = quant;
		this.valor = valor;
		this.valorTotal = valor * quant;
	}
	
	public String toString() {
		return "\nNome: " + name + "; \nQuant.: " + quant + "; \nPreço: "
				+ valor + "; \nValor Total: " + valorTotal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getQuant() {
		return quant;
	}
	public void setQuant(int quant) {
		this.quant = quant;
		this.valorTotal = quant*valor;
	}
	public Float getValor() {
		return valor*quant;
	}
	public void setValor(Float valor) {
		this.valor = valor;
		this.valorTotal = quant*valor;
	}
	public Float getvalorTotal() {
		return valorTotal;
	}	
}

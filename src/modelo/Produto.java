package modelo;

public class Produto {

private String name;
private int quant;
private float valor;
private float resultado;

public Produto (String name, int quant, float valor) {
	this.name = name;
	this.quant = quant;
	this.valor = valor;
}


public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getQuant() {
	return quant;
}
public void setQuant(int quant) {
	this.quant = quant;
	this.resultado = quant*valor;
}
public float getValor() {
	return valor*quant;
}
public void setValor(float valor) {
	this.valor = valor;
	this.resultado = quant*valor;
}
public float getResultado() {
	return resultado;
}
public void setResultado(float resultado) {
	this.resultado = resultado;
}




}

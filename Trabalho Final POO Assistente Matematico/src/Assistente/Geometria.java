package Assistente;

public class Geometria extends Calculadora{

	private float catOposto;
	private float catAdjacente;
	
	private String texto;
	private int contador = 1;
	
	public float getCatOposto() {
		return catOposto;
	}
	public void setCatOposto(float catOposto) {
		if(catOposto > 0)
			this.catOposto = catOposto;
	}
	public float getCatAdjacente() {
		return catAdjacente;
	}
	public void setCatAdjacente(float catAdjacente) {
		if(catAdjacente > 0)
			this.catAdjacente = catAdjacente;
	}
	
	public float hipotenusa() {
		//calculo
		float hipotenusa = 0;
		hipotenusa = (potencia(getCatOposto(), 2)) + (potencia(getCatAdjacente(), 2));
		hipotenusa = (float) raizQ(hipotenusa);
		
		//passo a passo
		StringBuilder builder = new StringBuilder();
		builder.append("\nPasso ");
		builder.append(contador);
		builder.append(":");
		builder.append("\nEleva-se o cateto oposto ao quadrado: ");
		builder.append(getCatOposto());
		builder.append("² = ");
		builder.append(potencia(getCatOposto(), 2));
		builder.append("\n");
		contador++;
		builder.append("\nPasso ");
		builder.append(contador);
		builder.append(":");
		builder.append("\nEleva-se o cateto adjacente ao quadrado: ");
		builder.append(getCatAdjacente());
		builder.append("² = ");
		builder.append(potencia(getCatAdjacente(), 2));
		builder.append("\n");
		contador++;
		builder.append("\nPasso ");
		builder.append(contador);
		builder.append(":");
		builder.append("\nSoma-se os dois valores encontrados: ");
		builder.append(potencia(getCatOposto(), 2));
		builder.append(" + ");
		builder.append(potencia(getCatAdjacente(), 2));
		builder.append(" = ");
		builder.append((potencia(getCatOposto(), 2)) + (potencia(getCatAdjacente(), 2)));
		builder.append("\n");
		contador++;
		builder.append("\nPasso ");
		builder.append(contador);
		builder.append(":");
		builder.append("\nTira-se a raiz quadrada do ");
		builder.append((potencia(getCatOposto(), 2)) + (potencia(getCatAdjacente(), 2)));
		builder.append("\nResultando na hipotenusa = ");
		builder.append(hipotenusa);
		contador = 1;
		texto = builder.toString();
		
		return hipotenusa;
	}
	
	public double seno() {
		return divisao(getCatOposto(), hipotenusa());
	}
	
	public double cosseno() {
		return divisao(getCatAdjacente(), hipotenusa());
	}
	
	public double tangente() {
		return divisao(getCatOposto(), getCatAdjacente());
	}
	
	public double cotangente() {
		return divisao(1, (float) tangente());
	}
	
	public double cossecante() {
		return divisao(1, (float) seno());
	}
	
	public double secante() {
		return divisao(1, (float) cosseno());
	}
	
	public String Passo_a_Passo() {
		StringBuilder builder = new StringBuilder();
		builder.append("Passo a passo");
		builder.append(texto);
		return builder.toString();
	}
}

package Assistente;

public class Vetores {

	private String vetorUsuario;
	private int tam;
	
	//setar o tamanho do vetor
	public int getTam() {
		return tam;
	}
	public void setTam(int tam) {
		if(tam > 0)
			this.tam = tam;
	}
	public String getVetorUsuario() {
		return vetorUsuario;
	}
	public void setVetorUsuario(String vetorUsuario) {
		if(vetorUsuario.length() > 0)
			this.vetorUsuario = vetorUsuario;
	}
	
	public float[] preencheVetor() {
		float vetor[] = new float[tam];
		String[] values = vetorUsuario.replace(" ", "").replace("(", "").replace(")", "").split(",");
		for(int k = 0; k < vetor.length; k++) {
			vetor[k] = Float.parseFloat(values[k]);
		}
		return vetor;
	}
}

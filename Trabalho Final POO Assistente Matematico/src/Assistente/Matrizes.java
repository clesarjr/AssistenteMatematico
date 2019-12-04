package Assistente;

public class Matrizes {

	private int linha;
	private int coluna;
	private String linha1Usuario;
	private String linha2Usuario;
	private String linha3Usuario;
	
	//set e get
	public int getLinha() {
		return linha;
	}

	public void setLinha(int linha) {
		this.linha = linha;
	}

	public int getColuna() {
		return coluna;
	}

	public void setColuna(int coluna) {
		this.coluna = coluna;
	}

	public String getLinha1Usuario() {
		return linha1Usuario;
	}

	public void setLinha1Usuario(String linha1Usuario) {
		this.linha1Usuario = linha1Usuario;
	}

	public String getLinha2Usuario() {
		return linha2Usuario;
	}

	public void setLinha2Usuario(String linha2Usuario) {
		this.linha2Usuario = linha2Usuario;
	}

	public String getLinha3Usuario() {
		return linha3Usuario;
	}

	public void setLinha3Usuario(String linha3Usuario) {
		this.linha3Usuario = linha3Usuario;
	}
	
	public float[][] preencheMatriz(){
		float[][] matriz = new float[linha][coluna];
		String[] values1 = linha1Usuario.replace(" ", "").replace("(", "").replace(")", "").split(",");
		String[] values2 = linha2Usuario.replace(" ", "").replace("(", "").replace(")", "").split(",");
		String[] values3 = linha3Usuario.replace(" ", "").replace("(", "").replace(")", "").split(",");
		
		for(int k = 0; k < linha; k++) {
			for(int i = 0; i < coluna; i++) {
				if(k == 0) {
					matriz[k][i] = Float.parseFloat(values1[i]);
				} else if(k == 1) {
					matriz[k][i] = Float.parseFloat(values2[i]);
				} else {
					matriz[k][i] = Float.parseFloat(values3[i]);
				}
			}
		}
		return matriz;
	}
}

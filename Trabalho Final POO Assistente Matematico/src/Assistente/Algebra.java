package Assistente;

import java.util.ArrayList;
import java.util.Random;

public class Algebra extends Calculadora{
	
	Random rand = new Random();
	
	private ArrayList<Vetores> vetores = new ArrayList<Vetores>();
	private ArrayList<Matrizes> matrizes = new ArrayList<Matrizes>();

	private String problema;
	
	private String texto;
	private int contador = 1;
	
	//set e get
	public ArrayList<Vetores> getVetores() {
		return vetores;
	}
	public void setVetores(ArrayList<Vetores> vetores) {
		this.vetores = vetores;
	}
	public ArrayList<Matrizes> getMatrizes() {
		return matrizes;
	}
	public void setMatrizes(ArrayList<Matrizes> matrizes) {
		this.matrizes = matrizes;
	}
	
	//adiciona o vetor a lista de vetores
	public void addVetor(Vetores vetor) {
		vetores.add(vetor);
	}
	
	//adiciona a matriz na lista de matrizes
	public void addMatriz(Matrizes matriz) {
		matrizes.add(matriz);
	}
	
	public float[] geraVetorAleatorio() {
		float vet[] = new float[3];
		
		for(int k = 0; k < vet.length; k++) {
			vet[k] = rand.nextInt(9);
		}
		return vet;
	}
	
	public float[][] geraMatrizAleatoria() {
		float mat[][] = new float[3][3];
		
		for(int k = 0; k < mat.length; k++) {
			for(int i = 0; i < mat.length; i++) {
				mat[k][i] = rand.nextInt(9);
			}
		}
		return mat;
	}
	
	public void geraProblema() {
		int opcao = rand.nextInt(9);
		StringBuilder builder = new StringBuilder();
		
		switch(opcao) {
			case 0: 
				//problema
				int alfa = rand.nextInt(9);
				while(alfa == 0) {
					alfa = rand.nextInt(9);
				}
				builder.append("\nMultiplicação de vetores por escalar");
				builder.append("\nRealize a multiplicação com o vetor: ");
				builder.append("(");
				for(int k = 0; k < 3; k++) {	
					builder.append(geraVetorAleatorio()[k]);
					if(k != 2)
						builder.append(", ");
				}
				builder.append(")");
				builder.append("\nPelo alfa: ");
				builder.append(alfa);
				problema = builder.toString();
				break;
			case 1: 
				builder.append("\nDiferença entre matrizes");
				builder.append("\nRealize a subtração entre as seguintes matrizes: ");
				builder.append("\nMatriz 1");
				builder.append("\n");
				for(int k = 0; k < 3; k++) {
					for(int i = 0; i < 3; i++) {
						builder.append(geraMatrizAleatoria()[k][i]);
						builder.append("  ");
					}
					builder.append("\n");
				}
				builder.append("\nMatriz 2");
				builder.append("\n");
				for(int k = 0; k < 3; k++) {
					for(int i = 0; i < 3; i++) {
						builder.append(geraMatrizAleatoria()[k][i]);
						builder.append("  ");
					}
					builder.append("\n");
				}
				problema = builder.toString();
				break;
			case 2: 
				builder.append("\nProduto misto");
				builder.append("\nCalcule o produto misto dos seguintes vetores: ");
				builder.append("\nVetor 1: ");
				builder.append("(");
				for(int k = 0; k < 3; k++) {
					builder.append(geraVetorAleatorio()[k]);
					if(k != 2)
						builder.append(", ");				
				}
				builder.append(")");
				builder.append("\nVetor 2: ");
				builder.append("(");
				for(int k = 0; k < 3; k++) {
					builder.append(geraVetorAleatorio()[k]);
					if(k != 2)
						builder.append(", ");
				}
				builder.append(")");
				builder.append("\nVetor 3: ");
				builder.append("(");
				for(int k = 0; k < 3; k++) {
					builder.append(geraVetorAleatorio()[k]);
					if(k != 2)
						builder.append(", ");
				}
				builder.append(")");
				problema = builder.toString();
				break;
			case 3: 
				builder.append("\nMultiplicação entre matrizes");
				builder.append("\nRealize a multiplicação entre as seguintes matrizes: ");
				builder.append("\nMatriz 1");
				builder.append("\n");
				for(int k = 0; k < 3; k++) {
					for(int i = 0; i < 3; i++) {
						builder.append(geraMatrizAleatoria()[k][i]);
						builder.append("  ");
					}
					builder.append("\n");
				}
				builder.append("\nMatriz 2");
				builder.append("\n");
				for(int k = 0; k < 3; k++) {
					for(int i = 0; i < 3; i++) {
						builder.append(geraMatrizAleatoria()[k][i]);
						builder.append("  ");
					}
					builder.append("\n");
				}
				problema = builder.toString();
				break;
			case 4: 
				builder.append("\nModulo de um vetor");
				builder.append("\nEncontre o módulo do seguinte vetor: ");
				builder.append("(");
				for(int k = 0; k < 3; k++) {
					builder.append(geraVetorAleatorio()[k]);
					if(k != 2)
						builder.append(", ");
				}
				builder.append(")");
				problema = builder.toString();
				break;
			case 5: 
				builder.append("\nDeterminante de uma matriz");
				builder.append("\nEncontre o determinante da seguinte matriz: ");
				builder.append("\n");
				for(int k = 0; k < 3; k++) {
					for(int i = 0; i < 3; i++) {
						builder.append(geraMatrizAleatoria()[k][i]);
						builder.append("  ");
					}
					builder.append("\n");
				}
				problema = builder.toString();
				break;
			case 6: 
				builder.append("\nProduto escalar");
				builder.append("\nEncontre o produto escalar dos seguintes vetores: ");
				builder.append("\nVetor 1: ");
				builder.append("(");
				for(int k = 0; k < 3; k++) {
					builder.append(geraVetorAleatorio()[k]);
					if(k != 2)
						builder.append(", ");
				}
				builder.append(")");
				builder.append("\nVetor 2: ");
				builder.append("(");
				for(int k = 0; k < 3; k++) {
					builder.append(geraVetorAleatorio()[k]);
					if(k != 2)
						builder.append(", ");
				}
				builder.append(")");
				problema = builder.toString();
				break;
			case 7: 
				Geometria g = new Geometria();
				g.setCatAdjacente(rand.nextInt(9));
				g.setCatOposto(rand.nextInt(9));
				
				builder.append("\nHipotenusa");
				builder.append("\nCalcule a hipotenusa com os seguintes lados: ");
				builder.append("\nLado 1: ");
				builder.append(g.getCatAdjacente());
				builder.append("\nLado 2: ");
				builder.append(g.getCatOposto());
				problema = builder.toString();
				break;
			case 8: 
				builder.append("\nAdição de vetores");
				builder.append("\nRealize a soma dos seguintes vetores: ");
				builder.append("\nVetor 1: ");
				builder.append("(");
				for(int k = 0; k < 3; k++) {
					builder.append(geraVetorAleatorio()[k]);
					if(k != 2)
						builder.append(", ");
				}
				builder.append(")");
				builder.append("\nVetor 2: ");
				builder.append("(");
				for(int k = 0; k < 3; k++) {
					builder.append(geraVetorAleatorio()[k]);
					if(k != 2)
						builder.append(", ");
				}
				builder.append(")");
				problema = builder.toString();
				break;
			case 9: 
				builder.append("\nAdição de matrizes");
				builder.append("\nRealize a soma das seguintes matrizes: ");
				builder.append("\nMatriz 1");
				builder.append("\n");
				for(int k = 0; k < 3; k++) {
					for(int i = 0; i < 3; i++) {
						builder.append(geraMatrizAleatoria()[k][i]);
						builder.append("  ");
					}
					builder.append("\n");
				}
				builder.append("\nMatriz 2");
				builder.append("\n");
				for(int k = 0; k < 3; k++) {
					for(int i = 0; i < 3; i++) {
						builder.append(geraMatrizAleatoria()[k][i]);
						builder.append("  ");
					}
					builder.append("\n");
				}
				problema = builder.toString();
				break;
		}
	}
	
	//OPERAÇÕES COM VETORES
	public float[] adicaoVetores() {
		//calculo
		float soma[] = new float[vetores.get(0).getTam()];
		
		for(int k = 0; k < vetores.get(0).getTam(); k++) {
			soma[k] = (float) adicao(vetores.get(0).preencheVetor()[k], vetores.get(1).preencheVetor()[k]);
		}
		
		//passo a passo
		StringBuilder builder = new StringBuilder();
		for(int k = 0; k < vetores.get(0).getTam(); k++) {
			builder.append("\nPasso ");
			builder.append(contador);
			builder.append(":");
			builder.append("\nSoma-se a posição ");
			builder.append(k+1);
			builder.append(" do primeiro vetor");
			builder.append(" = " );
			builder.append(vetores.get(0).preencheVetor()[k]);
			builder.append(", com a posição ");
			builder.append(k+1);
			builder.append(" do segundo vetor");
			builder.append(" = " );
			builder.append(vetores.get(1).preencheVetor()[k]);
			builder.append("\n");
			builder.append(vetores.get(0).preencheVetor()[k]);
			builder.append(" + ");
			builder.append(vetores.get(1).preencheVetor()[k]);
			builder.append(" = ");
			builder.append(adicao(vetores.get(0).preencheVetor()[k], vetores.get(1).preencheVetor()[k]));
			builder.append("\n");
			contador++;
		}
		builder.append("\n");
		builder.append("Resultando no vetor = ");
		builder.append("(");
		for(int k = 0; k < vetores.get(0).getTam(); k++) {
			builder.append(soma[k]);
			if(k != vetores.get(0).getTam()-1)
				builder.append(", ");
		}
		builder.append(")");
		texto = builder.toString();
		contador = 1;
		return soma;
	}
	
	public float[] diferencaVetores() {
		//calculo
		float subtracao[] = new float[vetores.get(0).getTam()];
		
		for(int k = 0; k < vetores.get(0).getTam(); k++) {
			subtracao[k] = (float) subtracao(vetores.get(0).preencheVetor()[k], vetores.get(1).preencheVetor()[k]);
		}
		
		//passo a passo
		StringBuilder builder = new StringBuilder();
		for(int k = 0; k < vetores.get(0).getTam(); k++) {
			builder.append("\nPasso ");
			builder.append(contador);
			builder.append(":");
			builder.append("\nSubtrai-se a posição ");
			builder.append(k+1);
			builder.append(" do primeiro vetor");
			builder.append(" = " );
			builder.append(vetores.get(0).preencheVetor()[k]);
			builder.append(", com a posição ");
			builder.append(k+1);
			builder.append(" do segundo vetor");
			builder.append(" = " );
			builder.append(vetores.get(1).preencheVetor()[k]);
			builder.append("\n");
			builder.append(vetores.get(0).preencheVetor()[k]);
			builder.append(" - ");
			builder.append(vetores.get(1).preencheVetor()[k]);
			builder.append(" = ");
			builder.append(subtracao(vetores.get(0).preencheVetor()[k], vetores.get(1).preencheVetor()[k]));
			builder.append("\n");
			contador++;
		}
		builder.append("\n");
		builder.append("Resultando no vetor = ");
		builder.append("(");
		for(int k = 0; k < vetores.get(0).getTam(); k++) {
			builder.append(subtracao[k]);
			if(k < vetores.get(0).getTam()-1)
				builder.append(", ");
		}
		builder.append(")");
		texto = builder.toString();
		contador = 1;
				
		return subtracao;
	}
	
	public float[] multiplicacaoPorEscalarVet(float alfa) {
		//calculo
		float escalar[] = new float[vetores.get(0).getTam()];
		
		for(int k = 0; k < vetores.get(0).getTam(); k++) {
			escalar[k] = (float) multiplicacao(alfa, vetores.get(0).preencheVetor()[k]);
		}
		
		//passo a passo
		StringBuilder builder = new StringBuilder();
		for(int k = 0; k < vetores.get(0).getTam(); k++) {
			builder.append("\nPasso ");
			builder.append(contador);
			builder.append(":");
			builder.append("\nMultiplica-se o alfa informado");
			builder.append(" = " );
			builder.append(alfa);
			builder.append(", pela posição ");
			builder.append(k+1);
			builder.append(" do vetor");
			builder.append(" = " );
			builder.append(vetores.get(0).preencheVetor()[k]);
			builder.append("\n");
			builder.append(alfa);
			builder.append(" x ");
			builder.append(vetores.get(0).preencheVetor()[k]);
			builder.append(" = ");
			builder.append(multiplicacao(alfa, vetores.get(0).preencheVetor()[k]));
			builder.append("\n");
			contador++;
		}
		builder.append("\n");
		builder.append("Resultando no vetor = ");
		builder.append("(");
		for(int k = 0; k < vetores.get(0).getTam(); k++) {
			builder.append(escalar[k]);
			if(k != vetores.get(0).getTam()-1)
				builder.append(", ");
		}
		builder.append(")");
		texto = builder.toString();
		contador = 1;
		
		return escalar;
	}
	
	public float produtoEscalar() {
		//calculo
		float produto = 0;
		
		for(int k = 0; k < vetores.get(0).getTam(); k++) {
			produto = ((float) multiplicacao(vetores.get(0).preencheVetor()[k], vetores.get(1).preencheVetor()[k])) + produto;
		}
			
		//passo a passo
		StringBuilder builder = new StringBuilder();
		for(int k = 0; k < vetores.get(0).getTam(); k++) {
			builder.append("\nPasso ");
			builder.append(contador);
			builder.append(":");
			builder.append("\nMultiplica-se a posição ");
			builder.append(k+1);
			builder.append(" do primeiro vetor");
			builder.append(" = " );
			builder.append(vetores.get(0).preencheVetor()[k]);
			builder.append(", com a posição ");
			builder.append(k+1);
			builder.append(" do segundo vetor");
			builder.append(" = " );
			builder.append(vetores.get(1).preencheVetor()[k]);
			builder.append("\n");
			builder.append(vetores.get(0).preencheVetor()[k]);
			builder.append(" x ");
			builder.append(vetores.get(1).preencheVetor()[k]);
			builder.append(" = ");
			builder.append(multiplicacao(vetores.get(0).preencheVetor()[k], vetores.get(1).preencheVetor()[k]));
			builder.append("\n");
			contador++;
		}
		builder.append("\nPasso ");
		builder.append(contador);
		builder.append(":");
		builder.append("\nSoma-se os 3 valores encontrados: ");
		for(int k = 0; k < vetores.get(0).getTam(); k++) {
			builder.append(multiplicacao(vetores.get(0).preencheVetor()[k], vetores.get(1).preencheVetor()[k]));
			if(k != vetores.get(0).getTam()-1)
				builder.append(" + ");
		}
		builder.append("\n\n");
		builder.append("Resultando no produto = ");
		builder.append(produto);
		texto = builder.toString();
		contador = 1;
		
		return produto;
	}
	
	public float produtoMisto() {
		//calculo
		float misto = 0;
		float main = 0;
		float main1 = 0;
		float main2 = 0;
		float totalMain = 0;
		float sec = 0;
		float sec1 = 0;
		float sec2 = 0;
		float totalSec = 0;
		
		if(vetores.size() == 3) {
			//diagonal principal (+)
			//primeira diagonal
			main = ((float) multiplicacao(vetores.get(0).preencheVetor()[0], vetores.get(1).preencheVetor()[1]));
			main = (float) multiplicacao(main, vetores.get(2).preencheVetor()[2]);
			//segunda diagonal
			main1 = ((float) multiplicacao(vetores.get(0).preencheVetor()[1], vetores.get(1).preencheVetor()[2]));
			main1 = (float) multiplicacao(main1, vetores.get(2).preencheVetor()[0]);
			//terceira diagonal
			main2 = ((float) multiplicacao(vetores.get(0).preencheVetor()[2], vetores.get(1).preencheVetor()[0]));
			main2 = (float) multiplicacao(main2, vetores.get(2).preencheVetor()[1]);
			//soma das diagonais principais
			totalMain = (float) adicao(main, main1);
			totalMain = (float) adicao(totalMain, main2);
			
			//diagonal secundaria (-)
			//primeira diagonal
			sec = ((float) multiplicacao(vetores.get(0).preencheVetor()[1], vetores.get(1).preencheVetor()[0]));
			sec = ((float) multiplicacao(sec, vetores.get(2).preencheVetor()[2]));
			//segunda diagonal
			sec1 = ((float) multiplicacao(vetores.get(0).preencheVetor()[0], vetores.get(1).preencheVetor()[2]));
			sec1 = ((float) multiplicacao(sec1, vetores.get(2).preencheVetor()[1]));
			//terceira diagonal
			sec2 = ((float) multiplicacao(vetores.get(0).preencheVetor()[2], vetores.get(1).preencheVetor()[1]));
			sec2 = ((float) multiplicacao(sec2, vetores.get(2).preencheVetor()[0]));
			//soma das diagonais secundárias
			totalSec = (float) adicao(sec, sec1);
			totalSec = (float) adicao(totalSec, sec2);
			
			//produto misto final
			misto = (float) subtracao(totalMain, totalSec);
		}
		
		//passo a passo
		StringBuilder builder = new StringBuilder();
		builder.append("\nPasso ");
		builder.append(contador);
		builder.append(":");
		builder.append("\nOrganiza-se os 3 vetores no formato matricial: ");
		builder.append("\n\n  ");
		for(int k = 0; k < vetores.get(0).getTam(); k++) {
			for(int i = 0; i < vetores.get(0).getTam(); i++) {
				builder.append(vetores.get(k).preencheVetor()[i]);
				if(i != vetores.get(k).getTam()-1)
					builder.append(", ");
			}
			builder.append("\n  ");
		}
		contador++;
		builder.append("\nPasso ");
		builder.append(contador);
		builder.append(":");
		builder.append("\nAplica-se a regra de Sarrus");
		builder.append("\nNela as duas primeiras colunas são reescritas conforme apresentado abaixo:");
		builder.append("\n\n  ");
		for(int k = 0; k < vetores.get(0).getTam(); k++) {
			for(int i = 0; i < vetores.get(0).getTam(); i++) {
				builder.append(vetores.get(k).preencheVetor()[i]);
				if(i != vetores.get(k).getTam()-1) {
					builder.append(", ");
				}
				
				//escreve a primeira coluna depois ao lado da matriz principal
				if(k == 0 && i == 2) {				
					builder.append("| ");
					builder.append(vetores.get(k).preencheVetor()[0]);				
				} else if(k == 1 && i == 2) {		
					builder.append("| ");
					builder.append(vetores.get(k).preencheVetor()[0]);					
				} else if(k == 2 && i == 2) {			
					builder.append("| ");
					builder.append(vetores.get(k).preencheVetor()[0]);		
				}
				
				//escreve a segunda coluna depois ao lado da matriz principal
				if(k == 0 && i == 2) {				
					builder.append(", ");
					builder.append(vetores.get(k).preencheVetor()[1]);					
				} else if(k == 1 && i == 2) {		
					builder.append(", ");
					builder.append(vetores.get(k).preencheVetor()[1]);				
				} else if(k == 2 && i == 2) {			
					builder.append(", ");
					builder.append(vetores.get(k).preencheVetor()[1]);		
				}
			}
			builder.append("\n  ");
		}
		contador++;
		builder.append("\nPasso ");
		builder.append(contador);
		builder.append(":");
		builder.append("\nMultiplica-se as diagonais principais");
		builder.append("\n");
		builder.append("Primeira diagonal: ");
		builder.append(vetores.get(0).preencheVetor()[0]);
		builder.append(" x ");
		builder.append(vetores.get(1).preencheVetor()[1]);
		builder.append(" x ");
		builder.append(vetores.get(2).preencheVetor()[2]);
		builder.append(" = ");
		builder.append(main);
		builder.append("\n");
		builder.append("Segunda diagonal: ");
		builder.append(vetores.get(0).preencheVetor()[1]);
		builder.append(" x ");
		builder.append(vetores.get(1).preencheVetor()[2]);
		builder.append(" x ");
		builder.append(vetores.get(2).preencheVetor()[0]);
		builder.append(" = ");
		builder.append(main1);
		builder.append("\n");
		builder.append("Terceira diagonal: ");
		builder.append(vetores.get(0).preencheVetor()[2]);
		builder.append(" x ");
		builder.append(vetores.get(1).preencheVetor()[0]);
		builder.append(" x ");
		builder.append(vetores.get(2).preencheVetor()[1]);
		builder.append(" = ");
		builder.append(main2);
		contador++;
		builder.append("\n");
		builder.append("\nPasso ");
		builder.append(contador);
		builder.append(":");
		builder.append("\n");
		builder.append("Após encontrar os valores de cada diagonal principal soma-se os mesmos: ");
		builder.append("\n");
		builder.append(main);
		builder.append(" + ");
		builder.append(main1);
		builder.append(" + ");
		builder.append(main2);
		builder.append(" = ");
		builder.append(totalMain);
		contador++;
		builder.append("\n");
		builder.append("\nPasso ");
		builder.append(contador);
		builder.append(":");
		builder.append("\nMultiplica-se as diagonais secundárias");
		builder.append("\n");
		builder.append("Primeira diagonal: ");
		builder.append(vetores.get(0).preencheVetor()[1]);
		builder.append(" x ");
		builder.append(vetores.get(1).preencheVetor()[0]);
		builder.append(" x ");
		builder.append(vetores.get(2).preencheVetor()[2]);
		builder.append(" = ");
		builder.append(sec);
		builder.append("\n");
		builder.append("Segunda diagonal: ");
		builder.append(vetores.get(0).preencheVetor()[0]);
		builder.append(" x ");
		builder.append(vetores.get(1).preencheVetor()[2]);
		builder.append(" x ");
		builder.append(vetores.get(2).preencheVetor()[1]);
		builder.append(" = ");
		builder.append(sec1);
		builder.append("\n");
		builder.append("Terceira diagonal: ");
		builder.append(vetores.get(0).preencheVetor()[2]);
		builder.append(" x ");
		builder.append(vetores.get(1).preencheVetor()[1]);
		builder.append(" x ");
		builder.append(vetores.get(2).preencheVetor()[0]);
		builder.append(" = ");
		builder.append(sec2);
		contador++;
		builder.append("\n");
		builder.append("\nPasso ");
		builder.append(contador);
		builder.append(":");
		builder.append("\n");
		builder.append("Após encontrar os valores de cada diagonal secundária soma-se os mesmos: ");
		builder.append("\n");
		builder.append(sec);
		builder.append(" + ");
		builder.append(sec1);
		builder.append(" + ");
		builder.append(sec2);
		builder.append(" = ");
		builder.append(totalSec);
		contador++;
		builder.append("\n");
		builder.append("\nPasso ");
		builder.append(contador);
		builder.append(":");
		builder.append("\n");
		builder.append("Subtrai-se os valores totais das diagonais: ");
		builder.append(totalMain);
		builder.append(" - ");
		builder.append(totalSec);
		builder.append("\n");
		builder.append("Encontrando o valor do produto misto: ");
		builder.append(misto);
		builder.append("\n");
		builder.append("Produto misto coplanar = ");
		if(misto == 0) {
			builder.append(true);
		}
		builder.append(false);
		texto = builder.toString();
		contador = 1;
				
		return misto;
	}
	
	//caso o produto misto de 0 serão coplanares
	public boolean vetoresCoplanares() {
		//verificação
		if(produtoMisto() == 0) {
			return true;
		}
		return false;
	}
	
	public double moduloVetor() {
		//calculo
		double modulo = 0;
		
		for(int k = 0; k < vetores.get(0).getTam(); k++) {
			modulo = (potencia(vetores.get(0).preencheVetor()[k], 2)) + modulo;
		}
		
		//passo a passo
		StringBuilder builder = new StringBuilder();
		for(int k = 0; k < vetores.get(0).getTam(); k++) {
			builder.append("\nPasso ");
			builder.append(contador);
			builder.append(":");
			builder.append("\nEleva-se o elemento ");
			builder.append(k+1);
			builder.append(" do vetor ao quadrado: ");
			builder.append(vetores.get(0).preencheVetor()[k]);
			builder.append("² = ");
			builder.append(potencia(vetores.get(0).preencheVetor()[k], 2));
			builder.append("\n");
			contador++;
		}
		builder.append("\nPasso ");
		builder.append(contador);
		builder.append(":");
		builder.append("\nSoma-se os resultados encontrados: ");
		builder.append(potencia(vetores.get(0).preencheVetor()[0], 2));
		builder.append(" + ");
		builder.append(potencia(vetores.get(0).preencheVetor()[1], 2));
		builder.append(" + ");
		builder.append(potencia(vetores.get(0).preencheVetor()[2], 2));
		builder.append(" = ");
		builder.append(modulo);
		contador++;
		builder.append("\nPasso ");
		builder.append(contador);
		builder.append(":");
		builder.append("\nTira-se a raiz quadrada do ");
		builder.append(modulo);
		builder.append("\nResultando no módulo do vetor = ");
		builder.append(raizQ(modulo));
		texto = builder.toString();
		contador = 1;
				
		return raizQ(modulo);
	}
	
	//OPERAÇÕES COM MATRIZES
	public float[][] adicaoMatrizes(){
		//calculo
		float soma[][] = new float[matrizes.get(0).getLinha()][matrizes.get(0).getColuna()];
		
		for(int k = 0; k < matrizes.get(0).getLinha(); k++) {
			for(int i = 0; i < matrizes.get(0).getColuna(); i++) {
				soma[k][i] = matrizes.get(0).preencheMatriz()[k][i] + matrizes.get(1).preencheMatriz()[k][i];
			}
		}
		
		//passo a passo
		StringBuilder builder = new StringBuilder();
		for(int k = 0; k < matrizes.get(0).getLinha(); k++) {
			for(int i = 0; i < matrizes.get(0).getColuna(); i++) {
				builder.append("\nPasso ");
				builder.append(contador);
				builder.append(":");
				builder.append("\nSoma-se a posição ");
				builder.append(k+1);
				builder.append(i+1);
				builder.append(" da primeira matriz");
				builder.append(" = " );
				builder.append(matrizes.get(0).preencheMatriz()[k][i]);
				builder.append(", com a posição ");
				builder.append(k+1);
				builder.append(i+1);
				builder.append(" da segunda matriz");
				builder.append(" = " );
				builder.append(matrizes.get(1).preencheMatriz()[k][i]);
				builder.append("\n");
				builder.append(matrizes.get(0).preencheMatriz()[k][i]);
				builder.append(" + ");
				builder.append(matrizes.get(1).preencheMatriz()[k][i]);
				builder.append(" = ");
				builder.append(adicao(matrizes.get(0).preencheMatriz()[k][i], matrizes.get(1).preencheMatriz()[k][i]));
				builder.append("\n");
				contador++;
			}
		}
		builder.append("\nSoma dentro do formato de matriz:");
		builder.append("\n");
		for(int k = 0; k < matrizes.get(0).getLinha(); k++) {
			for(int i = 0; i < matrizes.get(0).getColuna(); i++) {
				builder.append(matrizes.get(0).preencheMatriz()[k][i]);
				builder.append(" + ");
				builder.append(matrizes.get(1).preencheMatriz()[k][i]);
				builder.append("    ");
			}
			builder.append("\n");
		}
		builder.append("\n");
		builder.append("Matriz resultante:");
		builder.append("\n");
		for(int k = 0; k < matrizes.get(0).getLinha(); k++) {
			for(int i = 0; i < matrizes.get(0).getColuna(); i++) {
				builder.append(soma[k][i]);
				builder.append("  ");
			}
			builder.append("\n");
		}
		texto = builder.toString();
		contador = 1;
		
		return soma;
	}
	
	public float[][] diferencaMatrizes(){
		//calculo
		float subtracao[][] = new float[matrizes.get(0).getLinha()][matrizes.get(0).getColuna()];
		
		for(int k = 0; k < matrizes.get(0).getLinha(); k++) {
			for(int i = 0; i < matrizes.get(0).getColuna(); i++) {
				subtracao[k][i] = matrizes.get(0).preencheMatriz()[k][i] - matrizes.get(1).preencheMatriz()[k][i];
			}
		} 
		
		//passo a passo
		StringBuilder builder = new StringBuilder();
		for(int k = 0; k < matrizes.get(0).getLinha(); k++) {
			for(int i = 0; i < matrizes.get(0).getColuna(); i++) {
				builder.append("\nPasso ");
				builder.append(contador);
				builder.append(":");
				builder.append("\nSubtrai-se a posição ");
				builder.append(k+1);
				builder.append(i+1);
				builder.append(" da primeira matriz");
				builder.append(" = " );
				builder.append(matrizes.get(0).preencheMatriz()[k][i]);
				builder.append(", com a posição ");
				builder.append(k+1);
				builder.append(i+1);
				builder.append(" da segunda matriz");
				builder.append(" = " );
				builder.append(matrizes.get(1).preencheMatriz()[k][i]);
				builder.append("\n");
				builder.append(matrizes.get(0).preencheMatriz()[k][i]);
				builder.append(" - ");
				builder.append(matrizes.get(1).preencheMatriz()[k][i]);
				builder.append(" = ");
				builder.append(subtracao(matrizes.get(0).preencheMatriz()[k][i], matrizes.get(1).preencheMatriz()[k][i]));
				builder.append("\n");
				contador++;
			}
		}
		builder.append("\nSubtração dentro do formato de matriz:");
		builder.append("\n");
		for(int k = 0; k < matrizes.get(0).getLinha(); k++) {
			for(int i = 0; i < matrizes.get(0).getColuna(); i++) {
				builder.append(matrizes.get(0).preencheMatriz()[k][i]);
				builder.append(" - ");
				builder.append(matrizes.get(1).preencheMatriz()[k][i]);
				builder.append("    ");
			}
			builder.append("\n");
		}
		builder.append("\n");
		builder.append("Matriz resultante:");
		builder.append("\n");
		for(int k = 0; k < matrizes.get(0).getLinha(); k++) {
			for(int i = 0; i < matrizes.get(0).getColuna(); i++) {
				builder.append(subtracao[k][i]);
				builder.append("  ");
			}
			builder.append("\n");
		}
		texto = builder.toString();
		contador = 1;
		
		return subtracao;
	}
	
	public float[][] multiplicacaoPorEscalarMatriz(float alfa){
		//calculo
		float escalar[][] = new float[matrizes.get(0).getLinha()][matrizes.get(0).getColuna()];
		
		for(int k = 0; k < matrizes.get(0).getLinha(); k++) {
			for(int i = 0; i < matrizes.get(0).getColuna(); i++) {
				escalar[k][i] = (float) multiplicacao(alfa, matrizes.get(0).preencheMatriz()[k][i]);
			}
		}
		
		//passo a passo
		StringBuilder builder = new StringBuilder();
		for(int k = 0; k < matrizes.get(0).getLinha(); k++) {
			for(int i = 0; i < matrizes.get(0).getColuna(); i++) {
				builder.append("\nPasso ");
				builder.append(contador);
				builder.append(":");
				builder.append("\nMultiplica-se o alfa informado");
				builder.append(" = " );
				builder.append(alfa);
				builder.append(", pela posição ");
				builder.append(k+1);
				builder.append(i+1);
				builder.append(" da matriz");
				builder.append(" = " );
				builder.append(matrizes.get(0).preencheMatriz()[k][i]);
				builder.append("\n");
				builder.append(alfa);
				builder.append(" x ");
				builder.append(matrizes.get(0).preencheMatriz()[k][i]);
				builder.append(" = ");
				builder.append(multiplicacao(alfa, matrizes.get(0).preencheMatriz()[k][i]));
				builder.append("\n");
				contador++;
			}
		}
		builder.append("\nMultiplicação dentro do formato de matriz:");
		builder.append("\n");
		for(int k = 0; k < matrizes.get(0).getLinha(); k++) {
			for(int i = 0; i < matrizes.get(0).getColuna(); i++) {
				builder.append(alfa);
				builder.append(" x ");
				builder.append(matrizes.get(0).preencheMatriz()[k][i]);
				builder.append("    ");
			}
			builder.append("\n");
		}
		builder.append("\n");
		builder.append("Matriz resultante: ");
		builder.append("\n");
		for(int k = 0; k < matrizes.get(0).getLinha(); k++) {
			for(int i = 0; i < matrizes.get(0).getColuna(); i++) {
				builder.append(escalar[k][i]);
				builder.append("  ");
			}
			builder.append("\n");
		}
		texto = builder.toString();
		contador = 1;
		
		return escalar;
	}

	public float[][] multiplicacaoEntreMatrizes(){
		//calculo
		float produto[][] = new float[matrizes.get(0).getLinha()][matrizes.get(0).getColuna()];
		
		for(int j = 0; j < matrizes.get(0).getLinha(); j++) {
			for(int k = 0; k < matrizes.get(0).getLinha(); k++) {
				for(int i = 0; i < matrizes.get(0).getColuna(); i++) {
					produto[j][k] = ((float) multiplicacao(matrizes.get(0).preencheMatriz()[j][i], matrizes.get(1).preencheMatriz()[i][k])) + produto[j][k];
				}
			}
		}
		
		//passo a passo
		StringBuilder builder = new StringBuilder();
		builder.append("\nA multiplicação entre matrizes é feita no seguinte formato:");
		builder.append("\nMultiplica-se os elementos de cada linha da matriz 1 pelos elementos de cada coluna da matriz 2");
		builder.append("\n");
		for(int j = 0; j < matrizes.get(0).getLinha(); j++) {
			for(int k = 0; k < matrizes.get(0).getLinha(); k++) {
				for(int i = 0; i < matrizes.get(0).getColuna(); i++) {
					builder.append("\nPasso ");
					builder.append(contador);
					builder.append(":");
					builder.append("\nMultiplica-se a posição ");
					builder.append(j+1);
					builder.append(i+1);
					builder.append(" da primeira matriz");
					builder.append(", com a posição ");
					builder.append(i+1);
					builder.append(k+1);
					builder.append(" da segunda matriz");
					builder.append(" = " );
					builder.append("(");
					builder.append(matrizes.get(0).preencheMatriz()[j][i]);
					builder.append(" x ");
					builder.append(matrizes.get(1).preencheMatriz()[i][k]);
					builder.append(")");
					builder.append(" = " );
					builder.append(multiplicacao(matrizes.get(0).preencheMatriz()[j][i], matrizes.get(1).preencheMatriz()[i][k]));
					builder.append("\n");
					contador++;
				}
				builder.append("\n");
				builder.append("Após a multiplicação de cada elemento da linha da matriz 1 por cada elemento da coluna da matriz 1");
				builder.append(", soma-se os resultados = ");
				builder.append(produto[j][k]);
				builder.append("\n");
			}
		}
		builder.append("\nEsta soma encontrada após a multiplicação é justamento os valores da matriz resultante");
		builder.append(", como pode ser visto abaixo: ");
		builder.append("\n\nMultiplicação dentro do formato de matriz:");
		builder.append("\n");
		for(int j = 0; j < matrizes.get(0).getLinha(); j++) {
			for(int k = 0; k < matrizes.get(0).getLinha(); k++) {
				for(int i = 0; i < matrizes.get(0).getColuna(); i++) {
					builder.append("(");
					builder.append(matrizes.get(0).preencheMatriz()[j][i]);
					builder.append(" x ");
					builder.append(matrizes.get(1).preencheMatriz()[i][k]);
					builder.append(")");
					if(i < matrizes.get(0).getColuna()-1)
						builder.append(" + ");
				}
				builder.append("     ");
			}
			builder.append("\n");
		}
		builder.append("\n");
		builder.append("Matriz resultante: ");
		builder.append("\n");
		for(int k = 0; k < matrizes.get(0).getLinha(); k++) {
			for(int i = 0; i < matrizes.get(0).getColuna(); i++) {
				builder.append(produto[k][i]);
				builder.append("  ");
			}
			builder.append("\n");
		}
		builder.append("\n");
		texto = builder.toString();
		contador = 1;
		
		return produto;
	}
	
	public float determinanteMatriz(){
		//calculo
		float main = 0;
		float main1 = 0;
		float main2 = 0;
		float totalMain = 0;
		float sec = 0;
		float sec1 = 0;
		float sec2 = 0;
		float totalSec = 0;
		
		float determinante = 0;
		
		//diagonal principal (+)
		//primeira diagonal
		main = (float) multiplicacao(matrizes.get(0).preencheMatriz()[0][0], matrizes.get(0).preencheMatriz()[1][1]);
		main = (float) multiplicacao(main, matrizes.get(0).preencheMatriz()[2][2]);
		//segunda diagonal
		main1 = (float) multiplicacao(matrizes.get(0).preencheMatriz()[0][1], matrizes.get(0).preencheMatriz()[1][2]);
		main1 = (float) multiplicacao(main1, matrizes.get(0).preencheMatriz()[2][0]);
		//terceira diagonal
		main2 = (float) multiplicacao(matrizes.get(0).preencheMatriz()[0][2], matrizes.get(0).preencheMatriz()[1][0]);
		main2 = (float) multiplicacao(main2, matrizes.get(0).preencheMatriz()[2][1]);
		//soma das diagonais principais
		totalMain = (float) adicao(main, main1);
		totalMain = (float) adicao(totalMain, main2);
		
		//diagonal secundária (-)
		//primeira diagonal
		sec = (float) multiplicacao(matrizes.get(0).preencheMatriz()[0][1], matrizes.get(0).preencheMatriz()[1][0]);
		sec = (float) multiplicacao(sec, matrizes.get(0).preencheMatriz()[2][2]);
		//segunda diagonal
		sec1 = (float) multiplicacao(matrizes.get(0).preencheMatriz()[0][0], matrizes.get(0).preencheMatriz()[1][2]);
		sec1 = (float) multiplicacao(sec1, matrizes.get(0).preencheMatriz()[2][1]);
		//terceira diagonal
		sec2 = (float) multiplicacao(matrizes.get(0).preencheMatriz()[0][2], matrizes.get(0).preencheMatriz()[1][1]);
		sec2 = (float) multiplicacao(sec2, matrizes.get(0).preencheMatriz()[2][0]);
		//soma das diagonais secundárias
		totalSec = (float) adicao(sec, sec1);
		totalSec = (float) adicao(totalSec, sec2);
		
		//determinante
		determinante = (float) subtracao(totalMain, totalSec);
		
		//passo a passo
		StringBuilder builder = new StringBuilder();
		builder.append("\nPasso ");
		builder.append(contador);
		builder.append(":");
		builder.append("\nAplica-se a regra de Sarrus");
		builder.append("\nNela as duas primeiras colunas são reescritas conforme apresentado abaixo:");
		builder.append("\n\n  ");
		for(int k = 0; k < matrizes.get(0).getLinha(); k++) {
			for(int i = 0; i < matrizes.get(0).getColuna(); i++) {
				
				builder.append(matrizes.get(0).preencheMatriz()[k][i]);
				builder.append("  ");
						
				//escreve a primeira coluna depois ao lado da matriz principal
				if(k == 0 && i == 2) {				
					builder.append("| ");
					builder.append(matrizes.get(0).preencheMatriz()[0][0]);				
				} else if(k == 1 && i == 2) {		
					builder.append("| ");
					builder.append(matrizes.get(0).preencheMatriz()[1][0]);					
				} else if(k == 2 && i == 2) {			
					builder.append("| ");
					builder.append(matrizes.get(0).preencheMatriz()[2][0]);		
				}
			
				//escreve a segunda coluna depois ao lado da matriz principal
				if(k == 0 && i == 2) {				
					builder.append("  ");
					builder.append(matrizes.get(0).preencheMatriz()[0][1]);					
				} else if(k == 1 && i == 2) {		
					builder.append("  ");
					builder.append(matrizes.get(0).preencheMatriz()[1][1]);				
				} else if(k == 2 && i == 2) {			
					builder.append("  ");
					builder.append(matrizes.get(0).preencheMatriz()[2][1]);		
				}
			}
			builder.append("\n  ");
		}
		contador++;
		builder.append("\nPasso ");
		builder.append(contador);
		builder.append(":");
		builder.append("\nMultiplica-se as diagonais principais");
		builder.append("\n");
		builder.append("Primeira diagonal: ");
		builder.append(matrizes.get(0).preencheMatriz()[0][0]);
		builder.append(" x ");
		builder.append(matrizes.get(0).preencheMatriz()[1][1]);
		builder.append(" x ");
		builder.append(matrizes.get(0).preencheMatriz()[2][2]);
		builder.append(" = ");
		builder.append(main);
		builder.append("\n");
		builder.append("Segunda diagonal: ");
		builder.append(matrizes.get(0).preencheMatriz()[0][1]);
		builder.append(" x ");
		builder.append(matrizes.get(0).preencheMatriz()[1][2]);
		builder.append(" x ");
		builder.append(matrizes.get(0).preencheMatriz()[2][0]);
		builder.append(" = ");
		builder.append(main1);
		builder.append("\n");
		builder.append("Terceira diagonal: ");
		builder.append(matrizes.get(0).preencheMatriz()[0][2]);
		builder.append(" x ");
		builder.append(matrizes.get(0).preencheMatriz()[1][0]);
		builder.append(" x ");
		builder.append(matrizes.get(0).preencheMatriz()[2][1]);
		builder.append(" = ");
		builder.append(main2);
		contador++;
		builder.append("\n");
		builder.append("\nPasso ");
		builder.append(contador);
		builder.append(":");
		builder.append("\n");
		builder.append("Após encontrar os valores de cada diagonal principal soma-se os mesmos: ");
		builder.append("\n");
		builder.append(main);
		builder.append(" + ");
		builder.append(main1);
		builder.append(" + ");
		builder.append(main2);
		builder.append(" = ");
		builder.append(totalMain);
		contador++;
		builder.append("\n");
		builder.append("\nPasso ");
		builder.append(contador);
		builder.append(":");
		builder.append("\nMultiplica-se as diagonais secundárias");
		builder.append("\n");
		builder.append("Primeira diagonal: ");
		builder.append(matrizes.get(0).preencheMatriz()[0][1]);
		builder.append(" x ");
		builder.append(matrizes.get(0).preencheMatriz()[1][0]);
		builder.append(" x ");
		builder.append(matrizes.get(0).preencheMatriz()[2][2]);
		builder.append(" = ");
		builder.append(sec);
		builder.append("\n");
		builder.append("Segunda diagonal: ");
		builder.append(matrizes.get(0).preencheMatriz()[0][0]);
		builder.append(" x ");
		builder.append(matrizes.get(0).preencheMatriz()[1][2]);
		builder.append(" x ");
		builder.append(matrizes.get(0).preencheMatriz()[2][1]);
		builder.append(" = ");
		builder.append(sec1);
		builder.append("\n");
		builder.append("Terceira diagonal: ");
		builder.append(matrizes.get(0).preencheMatriz()[0][2]);
		builder.append(" x ");
		builder.append(matrizes.get(0).preencheMatriz()[1][1]);
		builder.append(" x ");
		builder.append(matrizes.get(0).preencheMatriz()[2][0]);
		builder.append(" = ");
		builder.append(sec2);
		contador++;
		builder.append("\n");
		builder.append("\nPasso ");
		builder.append(contador);
		builder.append(":");
		builder.append("\n");
		builder.append("Após encontrar os valores de cada diagonal secundária soma-se os mesmos: ");
		builder.append("\n");
		builder.append(sec);
		builder.append(" + ");
		builder.append(sec1);
		builder.append(" + ");
		builder.append(sec2);
		builder.append(" = ");
		builder.append(totalSec);
		contador++;
		builder.append("\n");
		builder.append("\nPasso ");
		builder.append(contador);
		builder.append(":");
		builder.append("\n");
		builder.append("Subtrai-se os valores totais das diagonais: ");
		builder.append(totalMain);
		builder.append(" - ");
		builder.append(totalSec);
		builder.append("\n");
		builder.append("Encontrando o valor do determinante: ");
		builder.append(determinante);
		builder.append("\n");
		texto = builder.toString();
		contador = 1;
		
		return determinante;
	}
	
	public String Passo_a_Passo() {
		StringBuilder builder = new StringBuilder();
		builder.append("Passo a passo");
		builder.append(texto);
		return builder.toString();
	}	
	
	public String Problemas() {
		StringBuilder builder = new StringBuilder();
		builder.append("Problema gerado");
		builder.append(problema);
		return builder.toString();
	}
}

package Assistente;

import java.util.Scanner;

public class Menu {

	public static void menu() {
		
		Scanner entrada = new Scanner(System.in);
		
		PersistenciaJSON json = new PersistenciaJSON();
		String teste;	
		String[] tes;
		
		Calculadora c = new Calculadora();
		
		Algebra a = new Algebra();
		
		Geometria g = new Geometria();
		int cat1 = 0;
		int cat2 = 0;
		
		Vetores v1 = new Vetores();
		Vetores v2 = new Vetores();
		Vetores v3 = new Vetores();
		String vet1 = "";
		String vet2 = "";
		String vet3 = "";
		int tam1 = 0;
		int tam2 = 0;
		int tam3 = 0;
		
		Matrizes m1 = new Matrizes();
		Matrizes m2 = new Matrizes();
		String l1 = "";
		String l2 = "";
		String l3 = "";
		String li1 = "";
		String li2 = "";
		String li3 = "";
		int linha = 0;
		int coluna = 0;
		
		int op1 = 0;
		int op2 = 0;
		int op3 = 0;
		int op4 = 0;
		int op5 = 0;
		int num1 = 0;
		int num2 = 0;
		do {
			System.out.println("    Menu    ");
			System.out.println("1 - Trabalhar com fórmulas");
			System.out.println("2 - Calculadora básica");
			System.out.println("0 - Sair");
			op1 = Integer.parseInt(entrada.nextLine());
			switch(op1) {
			
				case 1:
					do {
						System.out.println("    Fórmulas    ");
						System.out.println("1 - Álgebra");
						System.out.println("2 - Geometria");
						System.out.println("0 - Sair");
						op3 = Integer.parseInt(entrada.nextLine());
						switch(op3) {
							case 1:
								System.out.println("    Álgebra    ");
								System.out.println("1 - Gerar Problema");;
								System.out.println("2 - Adição Vetores");
								System.out.println("3 - Diferença Vetores");
								System.out.println("4 - Multiplicação de vetor por escalar");
								System.out.println("5 - Produto Escalar");
								System.out.println("6 - Produto Misto");
								System.out.println("7 - Modulo do Vetor");
								System.out.println("8 - Adição Matrizes");
								System.out.println("9 - Diferença Matrizes");
								System.out.println("10 - Multiplicação de matriz por escalar");
								System.out.println("11 - Multiplicação entre matrizes");
								System.out.println("12 - Determinante");
								System.out.println("0 - Sair");
								op4 = Integer.parseInt(entrada.nextLine());
								switch(op4) {
									case 1:
										a.geraProblema();
										System.out.println();
										System.out.println(a.Problemas());
										
										//persistencia
										teste = (String) a.Problemas();	
										
										tes = teste.split("\n");
										json.setNomeArq("passos.json");
										json.gravar(tes);
										break;
									case 2:
										System.out.println("Adição de vetores");
										System.out.println();
										System.out.println("Informe o vetor 1 e o seu tamanho");
										System.out.print("Vetor 1: ");
										vet1 = entrada.nextLine();
										System.out.print("Tamanho: ");
										tam1 = Integer.parseInt(entrada.nextLine());
										v1.setVetorUsuario(vet1);
										v1.setTam(tam1);
										
										System.out.println();
										System.out.print("Informe o vetor 2 e o seu tamanho");
										System.out.print("Vetor 2: ");
										vet2 = entrada.nextLine();
										System.out.print("Tamanho: ");
										tam2 = Integer.parseInt(entrada.nextLine());
										v2.setVetorUsuario(vet2);
										v2.setTam(tam2);
										
										a.addVetor(v1);
										a.addVetor(v2);
										a.adicaoVetores();
										System.out.println();
										System.out.println(a.Passo_a_Passo());
										
										//persistencia
										teste = (String) a.Passo_a_Passo();	
										tes = teste.split("\n");
										json.setNomeArq("passos.json");
										json.gravar(tes);;
										break;
									case 3:
										System.out.println("Subtração de vetores");
										System.out.println();
										System.out.println("Informe o vetor 1 e o seu tamanho");
										System.out.print("Vetor 1: ");
										vet1 = entrada.nextLine();
										System.out.print("Tamanho: ");
										tam1 = Integer.parseInt(entrada.nextLine());
										v1.setVetorUsuario(vet1);
										v1.setTam(tam1);
										
										System.out.println();
										System.out.print("Informe o vetor 2 e o seu tamanho");
										System.out.print("Vetor 2: ");
										vet2 = entrada.nextLine();
										System.out.print("Tamanho: ");
										tam2 = Integer.parseInt(entrada.nextLine());
										v2.setVetorUsuario(vet2);
										v2.setTam(tam2);
										
										a.addVetor(v1);
										a.addVetor(v2);
										a.diferencaVetores();
										System.out.println();
										System.out.println(a.Passo_a_Passo());
										
										//persistencia
										teste = (String) a.Passo_a_Passo();	
										tes = teste.split("\n");
										json.setNomeArq("passos.json");
										json.gravar(tes);
										break;
									case 4:
										System.out.println("Multiplicação de vetor por escalar");
										System.out.println();
										System.out.println("Informe o vetor 1 e o seu tamanho");
										System.out.print("Vetor 1: ");
										vet1 = entrada.nextLine();
										System.out.print("Tamanho: ");
										tam1 = Integer.parseInt(entrada.nextLine());
										v1.setVetorUsuario(vet1);
										v1.setTam(tam1);
										System.out.println("Informe o valor de alfa");
										int alfa = Integer.parseInt(entrada.nextLine());
										
										a.addVetor(v1);
										a.multiplicacaoPorEscalarVet(alfa);
										System.out.println();
										System.out.println(a.Passo_a_Passo());
										
										//persistencia
										teste = (String) a.Passo_a_Passo();	
										tes = teste.split("\n");
										json.setNomeArq("passos.json");
										json.gravar(tes);
										break;
									case 5:
										System.out.println("Produto Escalar");
										System.out.println();
										System.out.println("Informe o vetor 1 e o seu tamanho");
										System.out.print("Vetor 1: ");
										vet1 = entrada.nextLine();
										System.out.print("Tamanho: ");
										tam1 = Integer.parseInt(entrada.nextLine());
										v1.setVetorUsuario(vet1);
										v1.setTam(tam1);
										
										System.out.println();
										System.out.print("Informe o vetor 2 e o seu tamanho");
										System.out.print("Vetor 2: ");
										vet2 = entrada.nextLine();
										System.out.print("Tamanho: ");
										tam2 = Integer.parseInt(entrada.nextLine());
										v2.setVetorUsuario(vet2);
										v2.setTam(tam2);
										
										a.addVetor(v1);
										a.addVetor(v2);
										a.produtoEscalar();
										System.out.println();
										System.out.println(a.Passo_a_Passo());
										
										//persistencia
										teste = (String) a.Passo_a_Passo();	
										tes = teste.split("\n");
										json.setNomeArq("passos.json");
										json.gravar(tes);
										break;
									case 6:
										System.out.println("Produto Misto");
										System.out.println();
										System.out.println("Informe o vetor 1 e o seu tamanho");
										System.out.print("Vetor 1: ");
										vet1 = entrada.nextLine();
										System.out.print("Tamanho: ");
										tam1 = Integer.parseInt(entrada.nextLine());
										v1.setVetorUsuario(vet1);
										v1.setTam(tam1);
										
										System.out.println();
										System.out.print("Informe o vetor 2 e o seu tamanho");
										System.out.print("Vetor 2: ");
										vet2 = entrada.nextLine();
										System.out.print("Tamanho: ");
										tam2 = Integer.parseInt(entrada.nextLine());
										v2.setVetorUsuario(vet2);
										v2.setTam(tam2);
										
										System.out.println();
										System.out.print("Informe o vetor 3 e o seu tamanho");
										System.out.print("Vetor 3: ");
										vet3 = entrada.nextLine();
										System.out.print("Tamanho: ");
										tam3 = Integer.parseInt(entrada.nextLine());
										v3.setVetorUsuario(vet3);
										v3.setTam(tam3);
										
										a.addVetor(v1);
										a.addVetor(v2);
										a.addVetor(v3);
										a.produtoMisto();
										System.out.println();
										System.out.println(a.Passo_a_Passo());
										
										//persistencia
										teste = (String) a.Passo_a_Passo();	
										tes = teste.split("\n");
										json.setNomeArq("passos.json");
										json.gravar(tes);
										break;
									case 7:
										System.out.println("Modulo do vetor");
										System.out.println();
										System.out.println("Informe o vetor 1 e o seu tamanho");
										System.out.print("Vetor 1: ");
										vet1 = entrada.nextLine();
										System.out.print("Tamanho: ");
										tam1 = Integer.parseInt(entrada.nextLine());
										v1.setVetorUsuario(vet1);
										v1.setTam(tam1);
										
										a.addVetor(v1);
										a.moduloVetor();
										System.out.println();
										System.out.println(a.Passo_a_Passo());
										
										//persistencia
										teste = (String) a.Passo_a_Passo();	
										tes = teste.split("\n");
										json.setNomeArq("passos.json");
										json.gravar(tes);
										break;
									case 8:
										System.out.println("Adição de matrizes");
										System.out.println();
										System.out.println("Informe a quantidade de linhas e colunas da matriz 1");
										System.out.print("Linha: ");
										linha = Integer.parseInt(entrada.nextLine());
										System.out.print("Coluna: ");
										coluna = Integer.parseInt(entrada.nextLine());
										System.out.print("Informe a linha 1 da matriz: ");
										l1 = entrada.nextLine();
										System.out.print("Informe a linha 2 da matriz: ");
										l2 = entrada.nextLine();
										System.out.print("Informe a linha 3 da matriz: ");
										l3 = entrada.nextLine();
										m1.setLinha(linha);
										m1.setColuna(coluna);
										m1.setLinha1Usuario(l1);
										m1.setLinha2Usuario(l2);
										m1.setLinha3Usuario(l3);
										
										System.out.println();
										System.out.println("Informe a quantidade de linhas e colunas da matriz 2");
										System.out.print("Linha: ");
										linha = Integer.parseInt(entrada.nextLine());
										System.out.print("Coluna: ");
										coluna = Integer.parseInt(entrada.nextLine());
										System.out.print("Informe a linha 1 da matriz: ");
										li1 = entrada.nextLine();
										System.out.print("Informe a linha 2 da matriz: ");
										li2 = entrada.nextLine();
										System.out.print("Informe a linha 3 da matriz: ");
										li3 = entrada.nextLine();
										m2.setLinha(linha);
										m2.setColuna(coluna);
										m2.setLinha1Usuario(li1);
										m2.setLinha2Usuario(li2);
										m2.setLinha3Usuario(li3);
										
										a.addMatriz(m1);
										a.addMatriz(m2);
										a.adicaoMatrizes();
										System.out.println();
										System.out.println(a.Passo_a_Passo());
										
										//persistencia
										teste = (String) a.Passo_a_Passo();	
										tes = teste.split("\n");
										json.setNomeArq("passos.json");
										json.gravar(tes);
										break;
									case 9:
										System.out.println("Diferença matrizes");
										System.out.println();
										System.out.println("Informe a quantidade de linhas e colunas da matriz 1");
										System.out.print("Linha: ");
										linha = Integer.parseInt(entrada.nextLine());
										System.out.print("Coluna: ");
										coluna = Integer.parseInt(entrada.nextLine());
										System.out.print("Informe a linha 1 da matriz: ");
										l1 = entrada.nextLine();
										System.out.print("Informe a linha 2 da matriz: ");
										l2 = entrada.nextLine();
										System.out.print("Informe a linha 3 da matriz: ");
										l3 = entrada.nextLine();
										m1.setLinha(linha);
										m1.setColuna(coluna);
										m1.setLinha1Usuario(l1);
										m1.setLinha2Usuario(l2);
										m1.setLinha3Usuario(l3);
										
										System.out.println();
										System.out.println("Informe a quantidade de linhas e colunas da matriz 2");
										System.out.print("Linha: ");
										linha = Integer.parseInt(entrada.nextLine());
										System.out.print("Coluna: ");
										coluna = Integer.parseInt(entrada.nextLine());
										System.out.print("Informe a linha 1 da matriz: ");
										li1 = entrada.nextLine();
										System.out.print("Informe a linha 2 da matriz: ");
										li2 = entrada.nextLine();
										System.out.print("Informe a linha 3 da matriz: ");
										li3 = entrada.nextLine();
										m2.setLinha(linha);
										m2.setColuna(coluna);
										m2.setLinha1Usuario(li1);
										m2.setLinha2Usuario(li2);
										m2.setLinha3Usuario(li3);
										
										a.addMatriz(m1);
										a.addMatriz(m2);
										a.diferencaMatrizes();
										System.out.println();
										System.out.println(a.Passo_a_Passo());
										
										//persistencia
										teste = (String) a.Passo_a_Passo();	
										tes = teste.split("\n");
										json.setNomeArq("passos.json");
										json.gravar(tes);
										break;
									case 10:
										System.out.println("Multiplicação de matriz por escalar");
										System.out.println();
										System.out.println("Informe a quantidade de linhas e colunas da matriz 1");
										System.out.print("Linha: ");
										linha = Integer.parseInt(entrada.nextLine());
										System.out.print("Coluna: ");
										coluna = Integer.parseInt(entrada.nextLine());
										System.out.print("Informe a linha 1 da matriz: ");
										l1 = entrada.nextLine();
										System.out.print("Informe a linha 2 da matriz: ");
										l2 = entrada.nextLine();
										System.out.print("Informe a linha 3 da matriz: ");
										l3 = entrada.nextLine();
										m1.setLinha(linha);
										m1.setColuna(coluna);
										m1.setLinha1Usuario(l1);
										m1.setLinha2Usuario(l2);
										m1.setLinha3Usuario(l3);	
										System.out.print("Informe o valor de alfa: ");
										int alfa1 = Integer.parseInt(entrada.nextLine());
										
										a.addMatriz(m1);
										a.multiplicacaoPorEscalarMatriz(alfa1);
										System.out.println();
										System.out.println(a.Passo_a_Passo());
										
										//persistencia
										teste = (String) a.Passo_a_Passo();	
										tes = teste.split("\n");
										json.setNomeArq("passos.json");
										json.gravar(tes);
										break;
									case 11:
										System.out.println("Multiplicação entre matrizes");
										System.out.println();
										System.out.println("Informe a quantidade de linhas e colunas da matriz 1");
										System.out.print("Linha: ");
										linha = Integer.parseInt(entrada.nextLine());
										System.out.print("Coluna: ");
										coluna = Integer.parseInt(entrada.nextLine());
										System.out.print("Informe a linha 1 da matriz: ");
										l1 = entrada.nextLine();
										System.out.print("Informe a linha 2 da matriz: ");
										l2 = entrada.nextLine();
										System.out.print("Informe a linha 3 da matriz: ");
										l3 = entrada.nextLine();
										m1.setLinha(linha);
										m1.setColuna(coluna);
										m1.setLinha1Usuario(l1);
										m1.setLinha2Usuario(l2);
										m1.setLinha3Usuario(l3);
										
										System.out.println();
										System.out.println("Informe a quantidade de linhas e colunas da matriz 2");
										System.out.print("Linha: ");
										linha = Integer.parseInt(entrada.nextLine());
										System.out.print("Coluna: ");
										coluna = Integer.parseInt(entrada.nextLine());
										System.out.print("Informe a linha 1 da matriz: ");
										li1 = entrada.nextLine();
										System.out.print("Informe a linha 2 da matriz: ");
										li2 = entrada.nextLine();
										System.out.print("Informe a linha 3 da matriz: ");
										li3 = entrada.nextLine();
										m2.setLinha(linha);
										m2.setColuna(coluna);
										m2.setLinha1Usuario(li1);
										m2.setLinha2Usuario(li2);
										m2.setLinha3Usuario(li3);
										
										a.addMatriz(m1);
										a.addMatriz(m2);
										a.multiplicacaoEntreMatrizes();
										System.out.println();
										System.out.println(a.Passo_a_Passo());
										
										//persistencia
										teste = (String) a.Passo_a_Passo();	
										tes = teste.split("\n");
										json.setNomeArq("passos.json");
										json.gravar(tes);
										break;
									case 12:
										System.out.println("Determinante");
										System.out.println();
										System.out.println("Informe a quantidade de linhas e colunas da matriz 1");
										System.out.print("Linha: ");
										linha = Integer.parseInt(entrada.nextLine());
										System.out.print("Coluna: ");
										coluna = Integer.parseInt(entrada.nextLine());
										System.out.print("Informe a linha 1 da matriz: ");
										l1 = entrada.nextLine();
										System.out.print("Informe a linha 2 da matriz: ");
										l2 = entrada.nextLine();
										System.out.print("Informe a linha 3 da matriz: ");
										l3 = entrada.nextLine();
										m1.setLinha(linha);
										m1.setColuna(coluna);
										m1.setLinha1Usuario(l1);
										m1.setLinha2Usuario(l2);
										m1.setLinha3Usuario(l3);
										
										a.addMatriz(m1);
										a.determinanteMatriz();
										System.out.println();
										System.out.println(a.Passo_a_Passo());
										
										//persistencia
										teste = (String) a.Passo_a_Passo();	
										tes = teste.split("\n");
										json.setNomeArq("passos.json");
										json.gravar(tes);
										break;
									case 0:
										break;
								}
								break;
							case 2:
								System.out.println("    Geometria    ");
								System.out.println("1 - Hipotenusa");
								System.out.println("2 - Seno");
								System.out.println("3 - Cosseno");
								System.out.println("4 - Tangente");
								System.out.println("5 - Cotangente");
								System.out.println("6 - Cossecante");
								System.out.println("7 - Secante");
								op5 = Integer.parseInt(entrada.nextLine());
								switch(op5) {
									case 1:
										System.out.println("Hipotenusa");
										System.out.println();
										System.out.print("Informe o cateto adjacente: ");
										cat1 = Integer.parseInt(entrada.nextLine());
										System.out.print("Informe o cateto oposto: ");
										cat2 = Integer.parseInt(entrada.nextLine());
										
										g.setCatAdjacente(cat1);
										g.setCatOposto(cat2);
										g.hipotenusa();
										System.out.println();
										System.out.println(g.Passo_a_Passo());
										
										//persistencia
										teste = (String) a.Passo_a_Passo();	
										tes = teste.split("\n");
										json.setNomeArq("passos.json");
										json.gravar(tes);
										break;
									case 2:
										System.out.println("Seno");
										System.out.println();
										System.out.print("Informe o cateto adjacente: ");
										cat1 = Integer.parseInt(entrada.nextLine());
										System.out.print("Informe o cateto oposto: ");
										cat2 = Integer.parseInt(entrada.nextLine());
										
										g.setCatAdjacente(cat1);
										g.setCatOposto(cat2);
										System.out.println(g.seno());
										break;
									case 3:
										System.out.println("Cosseno");
										System.out.println();
										System.out.print("Informe o cateto adjacente: ");
										cat1 = Integer.parseInt(entrada.nextLine());
										System.out.print("Informe o cateto oposto: ");
										cat2 = Integer.parseInt(entrada.nextLine());
										
										g.setCatAdjacente(cat1);
										g.setCatOposto(cat2);
										System.out.println(g.cosseno());
										break;
									case 4:
										System.out.println("Tangente");
										System.out.println();
										System.out.print("Informe o cateto adjacente: ");
										cat1 = Integer.parseInt(entrada.nextLine());
										System.out.print("Informe o cateto oposto: ");
										cat2 = Integer.parseInt(entrada.nextLine());
										
										g.setCatAdjacente(cat1);
										g.setCatOposto(cat2);
										System.out.println(g.tangente());
										break;
									case 5:
										System.out.println("Cotangente");
										System.out.println();
										System.out.print("Informe o cateto adjacente: ");
										cat1 = Integer.parseInt(entrada.nextLine());
										System.out.print("Informe o cateto oposto: ");
										cat2 = Integer.parseInt(entrada.nextLine());
										
										g.setCatAdjacente(cat1);
										g.setCatOposto(cat2);
										System.out.println(g.cotangente());
										break;
									case 6:
										System.out.println("Cossecante");
										System.out.println();
										System.out.print("Informe o cateto adjacente: ");
										cat1 = Integer.parseInt(entrada.nextLine());
										System.out.print("Informe o cateto oposto: ");
										cat2 = Integer.parseInt(entrada.nextLine());
										
										g.setCatAdjacente(cat1);
										g.setCatOposto(cat2);
										System.out.println(g.cossecante());
										break;
									case 7:
										System.out.println("Secante");
										System.out.println();
										System.out.print("Informe o cateto adjacente: ");
										cat1 = Integer.parseInt(entrada.nextLine());
										System.out.print("Informe o cateto oposto: ");
										cat2 = Integer.parseInt(entrada.nextLine());
										
										g.setCatAdjacente(cat1);
										g.setCatOposto(cat2);
										System.out.println(g.secante());
										break;
									case 0:
										break;
								}
								break;
							case 0:
								break;
						}
						
					} while(op3 != 0);
					break;
				case 2:
					do {
						System.out.println("    Calculadora basica    ");
						System.out.println("1 - Adição");
						System.out.println("2 - Subtração");
						System.out.println("3 - Multiplicação");
						System.out.println("4 - Divisão");
						System.out.println("5 - Resto da divisão");
						System.out.println("6 - Potencia");
						System.out.println("7 - Raiz Quadrada");
						System.out.println("0 - Sair");
						op2 = Integer.parseInt(entrada.nextLine());
					
						switch(op2) {
							case 1:
								System.out.println("Insira os valores que deseja somar: ");
								System.out.print("n1: ");
								num1 = Integer.parseInt(entrada.nextLine());
								System.out.print("n2: ");
								num2 = Integer.parseInt(entrada.nextLine());
								System.out.print("Soma = ");
								System.out.print(c.adicao(num1, num2));
								System.out.println();
								break;
							case 2:
								System.out.println("Insira os valores que deseja subtrair: ");
								System.out.print("n1: ");
								num1 = Integer.parseInt(entrada.nextLine());
								System.out.print("n2: ");
								num2 = Integer.parseInt(entrada.nextLine());
								System.out.print("Subtração = ");
								System.out.print(c.subtracao(num1, num2));
								System.out.println();
								break;
							case 3:
								System.out.println("Insira os valores que deseja multiplicar: ");
								System.out.print("n1: ");
								num1 = Integer.parseInt(entrada.nextLine());
								System.out.print("n2: ");
								num2 = Integer.parseInt(entrada.nextLine());
								System.out.print("Multiplicação = ");
								System.out.print(c.multiplicacao(num1, num2));
								System.out.println();
								break;
							case 4:
								System.out.println("Insira os valores que deseja dividir: ");
								System.out.print("n1: ");
								num1 = Integer.parseInt(entrada.nextLine());
								System.out.print("n2: ");
								num2 = Integer.parseInt(entrada.nextLine());
								System.out.print("Divisão = ");
								System.out.print(c.divisao(num1, num2));
								System.out.println();
								break;
							case 5:
								System.out.println("Insira os valores que deseja dividir: ");
								System.out.print("n1: ");
								num1 = Integer.parseInt(entrada.nextLine());
								System.out.print("n2: ");
								num2 = Integer.parseInt(entrada.nextLine());
								System.out.print("Resto = ");
								System.out.print(c.restoDivsao(num1, num2));
								System.out.println();
								break;
							case 6:
								System.out.println("Insira o numero e o expoente: ");
								System.out.print("n1: ");
								num1 = Integer.parseInt(entrada.nextLine());
								System.out.print("expoente: ");
								num2 = Integer.parseInt(entrada.nextLine());
								System.out.println("Resultado = ");
								System.out.println(c.potencia(num1, num2));
								System.out.println();
								break;
							case 7:
								System.out.println("Insira o numero que deseja extrair a raiz: ");
								System.out.print("n1: ");
								num1 = Integer.parseInt(entrada.nextLine());
								System.out.println("raiz² = ");
								System.out.println(c.raizQ(num1));
								System.out.println();
								break;
							case 0:
								break;
						}
					}while(op2 != 0);
					break;
					
				case 0:
					System.out.println("Tenha um bom dia!");
					break;
			}
		}while(op1 != 0);
		
		entrada.close();
	}
}

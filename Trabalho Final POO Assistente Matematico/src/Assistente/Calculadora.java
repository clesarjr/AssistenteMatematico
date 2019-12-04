package Assistente;

public class Calculadora {
	
	//operações básicas
	public double adicao(float num1, float num2) {
		return num1 + num2;
	}
	
	public double subtracao(float num1, float num2) {
		return num1 - num2;
	}
	
	public double multiplicacao(float num1, float num2) {
		return num1 * num2;
	}
	
	public double divisao(float num1, float num2) {
		return num1 / num2;
	}
	
	//outras operações
	public double restoDivsao(float num, float divisor) {
		return num % divisor;
	}
	
	public long potencia(float num, int expoente) {
		long resultado = 1;
		for(int k = 1; k <= expoente; k++) {
			resultado = (long) multiplicacao(resultado, num);
		}
		return resultado;
	}

	//raiz quadrada
	//calculo do valor absoluto (caso o número seja negativo, partindo da ideia de módulo)
	double valorAbsoluto(double d) {
        if(d < 0)
                return(-1*d);
        else
                return(d);
	}
	public double raizQ(double modulo) {
		//valor inicial possivel
		 double r = 1.00;
		 double rp;
		 double resposta = 0;
		 int sair = 0;

		 while(sair == 0) {
			 resposta = r + ((modulo - (r*r)) / (2*r));

		     //checa se a raiz realmente confere
		     rp = resposta * resposta;
		     if( (float)(rp-modulo) == 0 || valorAbsoluto(rp-modulo) < 0.0000000000000001 || r == resposta) {
		    	 sair = 1;
		     } else {
		    	 r = resposta;
		     }
		 }
		 return resposta;
	}
}

package controller;

public class Teste {
	public static void main (String[] args) {
		System.out.println("Inicio do main");
		metodo1();
		System.out.println("Fim do main");
	}
	public static void metodo1(){
		System.out.println("Inicio do m�todo 1");
		metodo2();
		System.out.println("Fim do m�todo 1");
	}
	public static void metodo2() throws ArrayIndexOutOfBoundsException {
		System.out.println("Inicio do m�todo 2");
		int[] vetor = new int[10];
		for (int i = 0 ; i <= 15; i++){
			try {
				vetor[i] = i;
				System.out.println(i);
				if (i == 9) {
					try {
						int vlr = vetor[i] / vetor[0];
						System.out.println(vlr);
					}
					catch(ArithmeticException e) {
						System.out.println("Imposs�vel dividir "+ vetor[i]+ " por "+ vetor[0]);
					}		
				}
			}catch(ArrayIndexOutOfBoundsException a) {
				System.out.println("�ndice n�o existe no vetor:"+ i);
			}
		}
		System.out.println("Fim do m�todo 2");
	}
}
package br.fai.projeto07;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
		
		
	}

	private void start() {
		
			}
	private void operacoes(int num, int num1) {
		num=5;
		num1=5;
		num= num+num1;
		System.out.println("O resultado da operação e: "+num);
	}
    private void operacoes(double num, double num1) {
    	
		num=10.27;
		num1=10.42;
		
		num=num+num1;
		 
		System.out.println("O resultado da operação e: "+num);
			}
	private void operacoes(String num, String texto) {
		num = "44";
		texto = "Meu namorado calça número";
		String result= num.concat(texto);
		
		System.out.println("O resultado da operação e: "+result);
	}
		
	
}

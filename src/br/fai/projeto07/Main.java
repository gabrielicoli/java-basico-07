package br.fai.projeto07;

public class Main {

	public static void main(String[] args) {
		Main app = new Main();
		app.start();
		
		
	}

	private void start() {
		
		operacoes(5, 5);
		operacoes(10.27 , 10.42);
		operacoes("44", "Meu namorado calça número");
			}
	private void operacoes(int num, int num1) {
		
		
		num= num+num1;
		System.out.println("O resultado da operação e: "+num);
	}
    private void operacoes(double num, double num1) {
    	
		
		
		num=num+num1;
		 
		System.out.println("O resultado da operação e: "+num);
			}
	private void operacoes(String num, String texto) {
		
		String result= texto.concat(num);
		
		System.out.println("O resultado da operação e: "+result);
	}
		
	
}

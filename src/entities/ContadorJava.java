package entities;

public class ContadorJava{
	private int parametroUm;
	private int parametroDois;
	
	
	public ContadorJava(int parametroUm, int parametroDois) {
		super();
		if(parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
		}
		this.parametroUm = parametroUm;
		this.parametroDois = parametroDois;
	}
	public int getParametroUm() {
		return parametroUm;
	}
	public void setParametroUm(int parametroUm) {
		this.parametroUm = parametroUm;
	}
	public int getParametroDois() {
		return parametroDois;
	}
	public void setParametroDois(int parametroDois) {
		this.parametroDois = parametroDois;
	}
	
	public static void contar(int parametroUm, int parametroDois ){
		
		int contagem = parametroDois - parametroUm;		
		//realizar o for para imprimir os números com base na variável contagem		
		for(int i = 0; i < contagem;i++) {
			System.out.println("Numero Contagem: " + (i+1));
		}
		
	}
	
	
}

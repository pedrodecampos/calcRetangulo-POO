
public class Aplicacao {

	public static void main(String[] args) {
		Retangulo r,copia,quadrado;
	 // alocando memoria para um novo objeto
	  r = new Retangulo(3.0,4.0);
	 
	 
	 // alocando memoria para um novo objeto
	 quadrado = new Retangulo(5.0);
	 copia = r.clone();
	 copia.imprimir();
	 System.out.println("Perimetro do quadrado: " + quadrado.getPerimetro());
	
	}

}

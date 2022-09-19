
public class Retangulo {
   private double base;
   private double altura;
   
   // Construtores
   Retangulo(){
	   this.base = 0.0;
	   this.altura = 0.0;	   
   }
   
    Retangulo(double lado){
    	this.base = lado;
    	this.altura = lado;
    	
    }
   
   Retangulo(double base, double altura){
	   this.base = base;
	   this.altura = altura;
   }
   
public Retangulo clone() {
	Retangulo copia;
	copia = new Retangulo(this.base, this.altura);
	return copia;
}

public void imprimir () {
	System.out.println("Dados Do Retangulo:");
	System.out.println("Base: "+ this.base);
	System.out.println("Altura: "+ this.altura);
}
public double getArea() {
	return (this.base * this.altura);
}

public double getPerimetro() {
	return (2* (this.base + this.altura));
}

public double getBase() {
	return base;
}
public void setBase(double base) {
	this.base = base;
}
public double getAltura() {
	return altura;
}
public void setAltura(double altura) {
	this.altura = altura;
}
   
}

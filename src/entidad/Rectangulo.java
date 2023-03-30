/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado base y 
un atributo privado altura. La clase incluirá un método para crear el rectángulo con los 
datos del Rectángulo dados por el usuario. También incluirá un método para calcular la 
superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último, 
tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. 
Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.

 */
package entidad;

import java.util.Scanner;


/**
 *
 * @author tinap
 */
public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
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
    
    public void crearRectangulo(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de la base");
        this.base=leer.nextDouble();
        System.out.println("Ingrese el valor de la altura");
        this.altura=leer.nextDouble();
    }
    
    public double calcularSuperficie(){
        return base*altura;
    }
    
    public double calcularPerimetro(){
        return (base+altura)*2;
    }
    
   
    public void dibujarRectangulo(){
        System.out.println("El rectángulo dibujado se ve asi: ");
        System.out.println("");
        for (int i = 1; i <=altura; i++) {
            for (int j = 1; j <= base; j++) {
                if (i==1||i==altura||j==1||j==base){
		System.out.print("* ");	
            }else{
                System.out.print("  ");
	
                }      
            }
            System.out.println("");
        }
    
    }
}


    


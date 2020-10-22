package exercicioLogicaProgramacao4;
import java.util.Scanner;

public class exercicioLogicaProgramacao4 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		Calculos calculos = new Calculos();
		
        calculos.ObterValores();

        calculos.CalculoDelta();
        calculos.CalculoX();
        
        System.out.println("Valor de delta:" +calculos.delta);
        System.out.println("Valor de x1:" +calculos.x1);
        System.out.println("Valor de x2:" +calculos.x2);
	
		
	}

}

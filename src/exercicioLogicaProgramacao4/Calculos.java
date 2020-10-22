package exercicioLogicaProgramacao4;
import java.util.Scanner;

public class Calculos {
	
	public double a;
	public double b;
	public double c;
	public double delta;
	public double x1;
	public double x2;
	public Scanner Leitor = new Scanner(System.in);
	
	public void ObterValores() {
		System.out.println("Digite valor de A:");
        a = Leitor.nextDouble();
        System.out.println("Digite valor de B:");
        b = Leitor.nextDouble();
        System.out.println("Digite valor de C:");
        c = Leitor.nextDouble();
		
	}
	public void CalculoDelta() {
		delta = (b*b)-((4*a)*c);
	}
	public void CalculoX() {
		x1 = ((-b)+ (Math.sqrt(delta)))/2*a;
		x2 = ((-b)- (Math.sqrt(delta)))/2*a;
	}
}

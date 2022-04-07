package entorns;

import java.util.Scanner;

/**
 * Date: 02/04/2022
 * Aplicacion simple para calcular las notas de una asignatura.
 * @author Barrau
 * @version 1.0
 * 
 */

public class notauf{
	//declaramos las variables que nos hacen falta
	/**
	 * valores en double para las notas de las uf
	 */
	double uf1,uf2,uf3;
	/**
	 * valores en double para las avaluaciones continuadas 
	 */
	double acu1,acu2,acu3,def;
	//utilizaremos scaner para poder introducir datos
	Scanner entrada = new Scanner(System.in);
	
	//vamos a crear un metodo para ingresar
	
	/**
	 * Metodo para ingresar las notas.
	 * @see notauf
	 */
	public void IngresaNotas() {
		System.out.println("ingrese las notas del estudiante");
		System.out.print("ingrese nota 1:");
		uf1 = entrada.nextDouble();
		
		System.out.print("ingrese nota 2: ");
		
		uf2 = entrada.nextDouble();
		System.out.print("Ingrese nota3:_");
		
		uf3= entrada.nextDouble();
		
	}
	
	//metodo para comprobar bien introduccion de notas
	
	/**
	 * Metodo para comprobar la introduccion de datos
	 * @deprecated
	 */
	/**
	 * 
	 */
	public void comprobacion() {
		if (uf1>10) {
			System.out.println(" nota mal introducida");
			
		}
		if (uf2>10) {
			System.out.println(" nota mal introducida");
			
		}
		if (uf3>10) {
			System.out.println(" nota mal introducida");
			
		}
	}
	
	//metodo para calcular nota
	
	/**
	 * Metodo para calcular las notas definitivas
	 */
	public void Calcularnotas() {
		acu1 = uf1*0.35;
		acu2 = uf2*0.35;
		acu3 = uf3*0.35;
	
		def = acu1 + acu2 + acu3;
		
		
	}
	/**
	 * Metodo para imprimir las notas por pantalla
	 */
	public void Mostrar() {
		System.out.println("notas introducidas son: ");
		System.out.println(" nota1 = " + uf1);
		System.out.println(" nota2 = " + uf1);
		System.out.println(" nota3 = " + uf1);
		
		System.out.println(" acumulado 1 = " + acu1);
		System.out.println(" acumulado 2 = " + acu1);
		System.out.println(" acumulado 3 = " + acu1);
		
		System.out.println(" nota definitiva es =" + def);
	}
	
	
}

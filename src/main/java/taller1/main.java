// Copyright (C) 2023
// All rights reserved
package taller1;

import java.util.Scanner;
import java.util.InputMismatchException;
import taller1.VacationPackage;

/**
 * @author VivianaVelasco
 */
public class main {
	
	private main() {
		
	}

	// CHECKSTYLE:OFF
	public static final void main(String[] args) {
		// CHECKSTYLE:ON

		try {
			Scanner scanear = new Scanner(System.in);
			int total = 0;
			System.out.println("Escribe tu destino(PARIS O NEW YORK) : ");
			String scan = scanear.nextLine();
			System.out.println("Escribe el numero de personas: ");
			int num = scanear.nextInt();
			System.out.println("Escribe el numero de dias: ");
			int dia = scanear.nextInt();
			System.out.println("Elija el numero de paquete deseado:");
			System.out.println("1. All-Inclusive Package,  2. Adventure Activities Package,  3. Spa and Wellness Package, 4. Ningun paquete");
			int paquete = scanear.nextInt();
			VacationPackage v = new VacationPackage(scan, num, dia, paquete);
			System.out.println(scan + " " + num + " " + dia + " ");
				int validacion = v.validation(scan, num, dia);
			System.out.println(validacion);
			if (validacion >= 0) {
				total += v.popular(scan);
				total += v.travels(num);
				total += v.time(dia, num);
				total += v.personalizado(paquete, num);	
			} else {
				System.out.println("Ocurrio un error de datos");
			}
			System.out.println("Total a pagar:" + total);
		} catch (InputMismatchException mis) {
			System.out.println("Ingrese los datos correctamente");
		}

	}
}

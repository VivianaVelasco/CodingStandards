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

	// CHECKSTYLE:OFF
	public static void main(String[] args) {
		// CHECKSTYLE:ON
		String scan = null;
		int num = 0;
		int dia = 0;
		int total = 0;

		Scanner scanear = new Scanner(System.in);
		try {
			System.out.println("Escribe tu destino: ");
			scan = scanear.nextLine();
			System.out.println("Escribe el numero de personas: ");
			num = scanear.nextInt();
			System.out.println("Escribe el numero de dias: ");
			dia = scanear.nextInt();
			VacationPackage v = new VacationPackage(scan, num, dia);
			System.out.print(scan + " " + num + " " + dia);
			int validacion = v.validation(scan, num, dia);
			System.out.println(validacion);
			if (validacion >= 0) {
				total += v.popular(scan);
				total += v.travels(num);
				total += v.time(dia, num);
			} else {
				System.out.println("Ocurrio un error de datos");
			}
			System.out.println("Total a pagar:" + total);
		} catch (InputMismatchException mis) {
			System.out.println("Ingrese los datos correctamente");
		}

	}
}

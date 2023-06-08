// Copyright (C) 2023
// All rights reserved
package taller1;

public class VacationPackage {
	/**
	 * destination for User
	 */
	private String destination;
	/**
	 * travelers for User
	 */
	private int travelers;
	/**
	 * days for User
	 */
	private int days;
	/**
	 * basepackage for Package is $1000
	 */
	private int basepackage = 1000;
	/**
	 * paquete for each User
	 */
	private int paquete;

	/**
	 * @param destination
	 * @param travelers
	 * @param days
	 */
	public VacationPackage(String destination, int travelers, int days, int paquete) {
		super();
		this.destination = destination;
		this.travelers = travelers;
		this.days = days;
		this.paquete = paquete;

	}

	/**
	 * Constructor
	 */
	public VacationPackage() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getTravelers() {
		return travelers;
	}

	public void setTravelers(int travelers) {
		this.travelers = travelers;
	}

	public int getDays() {
		return days;
	}

	public void setDays(int days) {
		this.days = days;
	}

	public int getBasepackage() {
		return basepackage;
	}

	public void setBasepackage(int basepackage) {
		this.basepackage = basepackage;
	}

	public int getPaquete() {
		return paquete;
	}

	public void setPaquete(int paquete) {
		this.paquete = paquete;
	}

	/**
	 * @param destination
	 * @param travelers
	 * @param days
	 */
	public int validation(String destination, int travelers, int days) {
		if (!("PARIS".equalsIgnoreCase(destination)) && !("NEW YORK".equalsIgnoreCase(destination))) {
			return this.basepackage = -1;
		} else if (travelers > 80) {
			return this.basepackage = -2;
		} else if (travelers <= 0 || days <= 0) {
			return this.basepackage = -3;
		}

		return 0;
	}
	/**
	 * @param destination
	 */
	public int popular(String destination) {
		if ("PARIS".equalsIgnoreCase(destination)) {
			this.basepackage += 500;
		} else if ("NEW YORK".equalsIgnoreCase(destination)) {
			this.basepackage += 600;
		} else {
			this.basepackage = -1;
		}
		System.out.print(this.basepackage);
		return this.basepackage;
	}

	public int travels(int travelers) {
		if (travelers > 4 && travelers < 10) {
			this.basepackage = (int) (this.basepackage * 0.9);
		} else if (travelers >= 10) {
			this.basepackage = (int) (this.basepackage * 0.80);
		} else {
			System.out.println("No existe descuento");
		}
		System.out.print(this.basepackage);
		return this.basepackage;
	}
	/**
	 * @param travelers
	 * @param days
	 */
	public int time(int days, int travelers) {
		if (days < 7) {
			this.basepackage += 200;
		} else if (this.days > 30 || this.travelers == 2) {
			this.basepackage -= 200;
		}
		System.out.print(this.basepackage);
		return this.basepackage;
	}
	
	public int personalizado(int paquete, int travelers) {
		if(paquete == 1) {
			this.basepackage=this.basepackage+(travelers*200);
		}else if(paquete == 2) {
			this.basepackage=this.basepackage+(travelers*150);
		}else if(paquete == 3) {
			this.basepackage=this.basepackage+(travelers*100);
		}else {
			this.basepackage+=0;
			System.out.println("No se ha agregado ningun paquete");
		}
		return this.basepackage;
	}
	
}
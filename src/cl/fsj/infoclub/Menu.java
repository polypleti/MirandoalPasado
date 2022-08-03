package cl.fsj.infoclub;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int opcion;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		do {

			System.out.println("\nMenu\n");
			System.out.println("1. Ejercicio ArrayList Marcas");
			System.out.println("2. Ejercicio Set Invitados");
			System.out.println("3. Ejercicio Map Golosinas");
			System.out.println("4. Ejercicio Queue Juegos");
			System.out.println("5. Salir\n");
			System.out.println("Ingresar una Opcion: ");

			opcion = Integer.parseInt(br.readLine());

			if (opcion > 5 || opcion < 1)
				System.out.println("Ingrese una opcion valida.");

		} while (opcion > 5 || opcion < 1);
		
		switch(opcion) {
		
		case 1:
			
		case 2:
			InvitadosSet invitados = new InvitadosSet();
			invitados.agregarInvitados();
			invitados.posiblesInvitados();
			invitados.mostrarInvitados();
			invitados.adiosJorge();
			invitados.mostrarInvitados();
		}

	}

}

package cole;

import java.util.Scanner;

public class Playtaca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String userInput;
		
		while(true) {
			System.out.println("Bienvenido, ¿a que videojuego deseas jugar?");
			System.out.println("[1] ADIVINAR NUMERO");
			System.out.println("[2] PIEDRA PAPEL O TIJERA");
			System.out.println("[0] TERMINAR JUEGO");
			System.out.println("Seleccione un juego u opcion");
			userInput = sc.nextLine();
			
			switch(userInput) {
			case "1":
				adivinarNumero();
				break;
			case "2":
				piedraPapelTijera();
				break;
			case "k":
				return;
			default:
				System.out.println("Accion invalida");
				
				
			}
		}

	}
	
	static void adivinarNumero() {
		Scanner sc = new Scanner(System.in);
		int digitoAleatorio = (int) (Math.random() * (100 - 1) + 1);
		int contador = 0;
		int numberInput;
		
		while (true) {
			System.out.println("Introduzca un numero");
			numberInput = sc.nextInt();
			sc.nextLine();
			if (numberInput == digitoAleatorio) {
				System.out.printf("Enhorabuena has adivinado el numero despues de %d intentos, vaya crack!", contador);
				System.out.println("Pulse 0 para volver al menu de inicio");
				sc.nextLine();
				return;
				
			}else if(numberInput < digitoAleatorio) {
				System.out.println("Fallaste");
				System.out.println("El digito introducido es menor al digito a descubrir");	
			}
			else{
				System.out.println("Fallaste");
				System.out.println("El digito introducido es mayor al digito a descubrir");	
			}
			contador ++;
				System.out.print("Accion Invalida");
				
		}
	}
	
	static void piedraPapelTijera() {
	    Scanner sc = new Scanner(System.in);
	    String turnoPersona;
	    int contadorPersona = 0;
	    int contadorRobot = 0;

	    while (contadorPersona < 2 && contadorRobot < 2) {
	        System.out.println("Juega Piedra, Papel o Tijera:");
	        turnoPersona = sc.nextLine();

	      
	        if (!turnoPersona.equals("Piedra") && !turnoPersona.equals("Papel") && !turnoPersona.equals("Tijera")) {
	            System.out.println("Palabra o valor erróneo");
	            continue;
	        }

	      
	        int numeroAleatorio = (int) (Math.random() * 3);
	        String turnoRobot = switch (numeroAleatorio) {
	            case 0 -> "Piedra";
	            case 1 -> "Papel";
	            case 2 -> "Tijera";
	            default -> throw new IllegalStateException("Valor inesperado");
	        };

	        System.out.println("El robot juega: " + turnoRobot);

	       
	        if ((turnoPersona.equals("Piedra") && turnoRobot.equals("Tijera")) ||
	            (turnoPersona.equals("Papel") && turnoRobot.equals("Piedra")) ||
	            (turnoPersona.equals("Tijera") && turnoRobot.equals("Papel"))) {
	            System.out.println("¡Ganaste esta ronda!");
	            contadorPersona++;
	        } else if (turnoPersona.equals(turnoRobot)) {
	            System.out.println("¡Empate!");
	        } else {
	            System.out.println("El robot gana esta ronda.");
	            contadorRobot++;
	        }

	        System.out.printf("Puntuación: Tú %d - Robot %d%n", contadorPersona, contadorRobot);
	    }

	   
	    if (contadorPersona == 2) {
	        System.out.println("¡Felicidades has vencido a skynet!");
	    } else {
	        System.out.println("El robot ha ganado, asi empezaba terminator solo digo eh :( ");
	        }
	    
	    	System.out.println("Pulsa 0 para volver al menu principal");
	    	sc.nextLine();
	    	return;
	    }
	}
		
	


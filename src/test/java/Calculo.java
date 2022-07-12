import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {

Operacoes o = new Operacoes();


Scanner scanner = new Scanner(System.in);
System.out.println("Digite o 1° valor: ");
int v1 = scanner.nextInt();
System.out.println("Digite o 2° valor: ");
int v2 = scanner.nextInt();

o.soma(v1,v2);


 scanner = new Scanner(System.in);
System.out.println("Digite o 1° valor: ");
int v3 = scanner.nextInt();
System.out.println("Digite o 2° valor: ");
int v4 = scanner.nextInt();

o.subtrair(v3,v4);


scanner = new Scanner(System.in);
System.out.println("Digite o 1° valor: ");
int v5 = scanner.nextInt();
System.out.println("Digite o 2° valor: ");
int v6 = scanner.nextInt();

o.dividir(v5, v6);

scanner = new Scanner(System.in);
System.out.println("Digite o 1° valor: ");
int v7 = scanner.nextInt();
System.out.println("Digite o 2° valor: ");
int v8 = scanner.nextInt();

o.multiplicar(v7, v8);













	}

}






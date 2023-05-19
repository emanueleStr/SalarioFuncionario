import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int numF, numHoras;
        double valorh, salario;

        System.out.println("Vamos calcular o seu salário!");
        System.out.println("Digite o código de funcionario:"); //codigo ficticio
        numF = sc.nextInt();

        System.out.println("Digite o número de horas trabalhadas:");
        numHoras = sc.nextInt();

        System.out.println("Digite o valor por hora trabalhada:");
        valorh = sc.nextDouble();

        salario = numHoras * valorh;

        System.out.println("Numero Funcionario:" + numF);
        System.out.printf("Salario: %.2f%n", salario);

        sc.close();
    }
}
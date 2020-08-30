import java.util.Locale;
import java.util.Scanner;

public class Main {

    int opcao;

    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Digite suas horas trabalhadas: ");
        int horasTrabalhadas = entrada.nextInt();

        System.out.println("Digite o valor por hora: ");
        float valorPorHora = entrada.nextFloat();

        System.out.println("Você é um Funcionario tercerizado ? ");
        System.out.println("1 - NAO || 2 - SIM");
        int opcao = entrada.nextInt();
        
        Employee Funcionario = new Employee(nome,horasTrabalhadas,valorPorHora);
        OutsourceEmployee Funcionario2 = new OutsourceEmployee(nome,horasTrabalhadas,valorPorHora);

        switch (opcao){
            case 1:
                System.out.println("O valor que você receberá " + Funcionario.getNome() + " é R$ :" + Funcionario.Pagamento());
                break;

            case 2:
                System.out.println("O valor que você receberá" + Funcionario2.getNome() + " e R$ :" + Funcionario2.Pagamento());
                break;

            default:
                System.out.println("Esta opção não existe");
        }
    }
}
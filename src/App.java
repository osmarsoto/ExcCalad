import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        double salarioBrut, salarioLiq, faltas;
        
        System.out.println("Programa de calculo do salário liquido");
        System.out.println("Desenvolvido pela turma de TI");
        System.out.println("Discilpina de fundamentos da programação");
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite o sálrio bruto: ");
        salarioBrut = sc.nextDouble();

        System.out.print("Digite a quantidade de faltas: ");
        faltas = sc.nextDouble();

        salarioLiq = salarioBrut-((salarioBrut)/30*faltas);

        System.out.print("O salário liquido deste mês é: "+salarioLiq);
        


        
        sc.close();

    }
}

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner terminal = new Scanner(System.in);

        System.out.print("Digite o primeiro parametro: ");
        int parametroUm = terminal.nextInt();

        System.out.print("Digite o segundo parametro: ");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

        terminal.close();
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroDois < parametroUm)
            throw new ParametrosInvalidosException();

        int diferenca = parametroDois - parametroUm;

        for(int n = 1; n <= diferenca; n++) {
            System.out.println("Imprimindo o numero " + n);
        }
    }
}

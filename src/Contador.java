import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro parâmetro");
        int primeiroParametro = scanner.nextInt();
        System.out.println("Digite o segundo parâmetro");
        int segundoParametro = scanner.nextInt();

        try {
            contar(primeiroParametro, segundoParametro);
        } catch (ParametrosInvalidosException e) {
            System.err.println(
                    "O segundo parâmetro deve ser maior que o primeiro");
        }

        scanner.close();
    }

    public static void contar(int primeiroParametro, int segundoParametro) throws ParametrosInvalidosException {
        if (primeiroParametro >= segundoParametro)
            throw new ParametrosInvalidosException();
        int quantidadeDeInteracoes = segundoParametro - primeiroParametro;
        for (int i = 1; i <= quantidadeDeInteracoes; i++) {
            System.out.println("Imprimindo o número " + i);
        }
        ;

    }
}

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        Funcoes funcoes = new Funcoes();

        int escolha = 1;
        while (escolha != 0) {
            funcoes.mostraMenu();
            escolha = leitura.nextInt();

            if (escolha == 1) {
                funcoes.realDolar();
            } else if (escolha == 2) {
                funcoes.realEuro();
            } else if (escolha == 3) {
                funcoes.realLibra();
            } else if (escolha == 4) {
                funcoes.realIene();
            } else if (escolha == 5) {
                funcoes.realLiraTurca();
            } else if (escolha == 6) {
                funcoes.dolarEuro();
            } else if (escolha == 7) {
                funcoes.dolarLibra();
            } else if (escolha == 8) {
                funcoes.dolarIene();
            } else if (escolha == 9) {
                funcoes.dolarLiraTurca();
            } else if (escolha == 10) {
                funcoes.euroLibra();
            } else if (escolha == 11) {
                funcoes.euroIene();
            } else if (escolha == 12) {
                funcoes.euroLiraTurca();
            } else if (escolha == 13) {
                funcoes.libraIene();
            } else if (escolha == 14) {
                funcoes.libraLiraTurca();
            } else if (escolha == 15) {
                funcoes.ieneLiraTurca();
            } else if (escolha < 0 || escolha > 15) {
                System.out.println("Opção Inválida. Tente novamente!\n");
            }
        }
    }
}

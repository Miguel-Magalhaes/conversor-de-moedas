import java.io.IOException;
import java.util.Scanner;

public class Funcoes {
    Scanner leitura = new Scanner(System.in);
    ConsultaMoeda consulta = new ConsultaMoeda();

    public void mostraMenu(){
        System.out.println("****************************************");
        System.out.println("Conversor de moedas: \n");
        System.out.println("1. Real brasileiro ⮂ Dólar Americano");
        System.out.println("2. Real brasileiro ⮂ Euro");
        System.out.println("3. Real brasileiro ⮂ Libra Esterlina");
        System.out.println("4. Real brasileiro ⮂ Iene");
        System.out.println("5. Real Brasileiro ⮂ Lira Turca");
        System.out.println("6. Dólar Americano ⮂ Euro");
        System.out.println("7. Dólar Americano ⮂ Libra Esterlina");
        System.out.println("8. Dólar Americano ⮂ Iene");
        System.out.println("9. Dólar Americano ⮂ Lira Turca");
        System.out.println("10. Euro ⮂ Libra Esterlina");
        System.out.println("11. Euro ⮂ Iene");
        System.out.println("12. Euro ⮂ Lira Turca");
        System.out.println("13. Libra Esterlina ⮂ Iene");
        System.out.println("14. Libra Esterlina ⮂ Lira Turca");
        System.out.println("15. Iene ⮂ Lira Turca");
        System.out.println("0. Sair");
        System.out.println("\nDigite uma opção válida: ");
        System.out.println("****************************************");
    }

    public void realDolar() throws IOException, InterruptedException {
        System.out.println("\n\n\n\n\n*********************************************");
        System.out.println("1. Real Brasileiro ➜ Dólar Americano");
        System.out.println("2. Dólar Americano ➜ Real Brasileiro");
        System.out.println("\nDigite uma opção válida: ");
        System.out.println("*********************************************");
        int opc = leitura.nextInt();
        Moedas moedas = consulta.buscaMoeda();
        double taxa = 0;
        switch (opc) {
            case 1:
                System.out.println("\nDigite o valor que deseja converter:");
                double valor = leitura.nextDouble();
                taxa = moedas.getConversionRates().getUSD() / moedas.getConversionRates().getBRL();
                double valorFinal = valor * taxa;
                System.out.println("Valor " + valor + " (BRl) corresponde ao valor final de ⟹ " + valorFinal + " (USD)\n");
                break;

            case 2:
                System.out.println("\nDigite o valor que deseja converter:");
                valor = leitura.nextDouble();
                taxa = moedas.getConversionRates().getBRL() / moedas.getConversionRates().getUSD();
                valorFinal = valor * taxa;
                System.out.println("Valor " + valor + " (USD) corresponde ao valor final de ⟹ " + valorFinal + " (BRL)\n");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    public void realEuro() throws IOException, InterruptedException {
        System.out.println("\n\n\n\n\n*********************************************");
        System.out.println("1. Real Brasileiro ➜ Euro");
        System.out.println("2. Euro ➜ Real Brasileiro");
        System.out.println("\nDigite uma opção válida: ");
        System.out.println("*********************************************");
        int opc = leitura.nextInt();
        Moedas moedas = consulta.buscaMoeda();
        double taxa = 0;
        switch (opc) {
            case 1:
                System.out.println("\nDigite o valor que deseja converter:");
                double valor = leitura.nextDouble();
                taxa = moedas.getConversionRates().getEUR() / moedas.getConversionRates().getBRL();
                double valorFinal = valor * taxa;
                System.out.println("Valor " + valor + " (BRl) corresponde ao valor final de ⟹ " + valorFinal + " (EUR)\n");
                break;

            case 2:
                System.out.println("\nDigite o valor que deseja converter:");
                valor = leitura.nextDouble();
                taxa = moedas.getConversionRates().getBRL() / moedas.getConversionRates().getEUR();
                valorFinal = valor * taxa;
                System.out.println("Valor " + valor + " (EUR) corresponde ao valor final de ⟹ " + valorFinal + " (BRL)\n");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    public void realLibra() throws IOException, InterruptedException {
        System.out.println("\n\n\n\n\n*********************************************");
        System.out.println("1. Real Brasileiro ➜ Libra Esterlina");
        System.out.println("2. Libra Esterlina ➜ Real Brasileiro");
        System.out.println("\nDigite uma opção válida: ");
        System.out.println("*********************************************");
        int opc = leitura.nextInt();
        Moedas moedas = consulta.buscaMoeda();
        double taxa = 0;
        switch (opc) {
            case 1:
                System.out.println("\nDigite o valor que deseja converter:");
                double valor = leitura.nextDouble();
                taxa = moedas.getConversionRates().getGBP() / moedas.getConversionRates().getBRL();
                double valorFinal = valor * taxa;
                System.out.println("Valor " + valor + " (BRl) corresponde ao valor final de ⟹ " + valorFinal + " (GBP)\n");
                break;

            case 2:
                System.out.println("\nDigite o valor que deseja converter:");
                valor = leitura.nextDouble();
                taxa = moedas.getConversionRates().getBRL() / moedas.getConversionRates().getGBP();
                valorFinal = valor * taxa;
                System.out.println("Valor " + valor + " (GBP) corresponde ao valor final de ⟹ " + valorFinal + " (BRL)\n");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    public void realIene() throws IOException, InterruptedException {
        System.out.println("\n\n\n\n\n*********************************************");
        System.out.println("1. Real Brasileiro ➜ Iene");
        System.out.println("2. Iene ➜ Real Brasileiro");
        System.out.println("\nDigite uma opção válida: ");
        System.out.println("*********************************************");
        int opc = leitura.nextInt();
        Moedas moedas = consulta.buscaMoeda();
        double taxa = 0;
        switch (opc) {
            case 1:
                System.out.println("\nDigite o valor que deseja converter:");
                double valor = leitura.nextDouble();
                taxa = moedas.getConversionRates().getJPY() / moedas.getConversionRates().getBRL();
                double valorFinal = valor * taxa;
                System.out.println("Valor " + valor + " (BRl) corresponde ao valor final de ⟹ " + valorFinal + " (JPY)\n");
                break;

            case 2:
                System.out.println("\nDigite o valor que deseja converter:");
                valor = leitura.nextDouble();
                taxa = moedas.getConversionRates().getBRL() / moedas.getConversionRates().getJPY();
                valorFinal = valor * taxa;
                System.out.println("Valor " + valor + " (JPY) corresponde ao valor final de ⟹ " + valorFinal + " (BRL)\n");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    public void realLiraTurca() throws IOException, InterruptedException {
        System.out.println("\n\n\n\n\n*********************************************");
        System.out.println("1. Real Brasileiro ➜ Lira Turca");
        System.out.println("2. Lira Turca ➜ Real Brasileiro");
        System.out.println("\nDigite uma opção válida: ");
        System.out.println("*********************************************");
        int opc = leitura.nextInt();
        Moedas moedas = consulta.buscaMoeda();
        double taxa = 0;
        switch (opc) {
            case 1:
                System.out.println("\nDigite o valor que deseja converter:");
                double valor = leitura.nextDouble();
                taxa = moedas.getConversionRates().getTRY() / moedas.getConversionRates().getBRL();
                double valorFinal = valor * taxa;
                System.out.println("Valor " + valor + " (BRl) corresponde ao valor final de ⟹ " + valorFinal + " (TRY)\n");
                break;

            case 2:
                System.out.println("\nDigite o valor que deseja converter:");
                valor = leitura.nextDouble();
                taxa = moedas.getConversionRates().getBRL() / moedas.getConversionRates().getTRY();
                valorFinal = valor * taxa;
                System.out.println("Valor " + valor + " (TRY) corresponde ao valor final de ⟹ " + valorFinal + " (BRL)\n");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    public void dolarEuro() throws IOException, InterruptedException {
        System.out.println("\n\n\n\n\n*********************************************");
        System.out.println("1. Dólar Americano ➜ Euro");
        System.out.println("2. Euro ➜ Dólar Americano");
        System.out.println("\nDigite uma opção válida: ");
        System.out.println("*********************************************");
        int opc = leitura.nextInt();
        Moedas moedas = consulta.buscaMoeda();
        double taxa = 0;
        switch (opc) {
            case 1:
                System.out.println("\nDigite o valor que deseja converter:");
                double valor = leitura.nextDouble();
                taxa = moedas.getConversionRates().getEUR() / moedas.getConversionRates().getUSD();
                double valorFinal = valor * taxa;
                System.out.println("Valor " + valor + " (USD) corresponde ao valor final de ⟹ " + valorFinal + " (EUR)\n");
                break;

            case 2:
                System.out.println("\nDigite o valor que deseja converter:");
                valor = leitura.nextDouble();
                taxa = moedas.getConversionRates().getUSD() / moedas.getConversionRates().getEUR();
                valorFinal = valor * taxa;
                System.out.println("Valor " + valor + " (EUR) corresponde ao valor final de ⟹ " + valorFinal + " (USD)\n");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    public void dolarLibra() throws IOException, InterruptedException {
        System.out.println("\n\n\n\n\n*********************************************");
        System.out.println("1. Dólar Americano ➜ Libra Esterlina");
        System.out.println("2. Libra Esterlina ➜ Dólar Americano");
        System.out.println("\nDigite uma opção válida: ");
        System.out.println("*********************************************");
        int opc = leitura.nextInt();
        Moedas moedas = consulta.buscaMoeda();
        double taxa = 0;
        switch (opc) {
            case 1:
                System.out.println("\nDigite o valor que deseja converter:");
                double valor = leitura.nextDouble();
                taxa = moedas.getConversionRates().getGBP() / moedas.getConversionRates().getUSD();
                double valorFinal = valor * taxa;
                System.out.println("Valor " + valor + " (USD) corresponde ao valor final de ⟹ " + valorFinal + " (GBP)\n");
                break;

            case 2:
                System.out.println("\nDigite o valor que deseja converter:");
                valor = leitura.nextDouble();
                taxa = moedas.getConversionRates().getUSD() / moedas.getConversionRates().getGBP();
                valorFinal = valor * taxa;
                System.out.println("Valor " + valor + " (GBP) corresponde ao valor final de ⟹ " + valorFinal + " (USD)\n");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    public void dolarIene() throws IOException, InterruptedException {
        System.out.println("\n\n\n\n\n*********************************************");
        System.out.println("1. Dólar Americano ➜ Iene");
        System.out.println("2. Iene ➜ Dólar Americano");
        System.out.println("\nDigite uma opção válida: ");
        System.out.println("*********************************************");
        int opc = leitura.nextInt();
        Moedas moedas = consulta.buscaMoeda();
        double taxa = 0;
        switch (opc) {
            case 1:
                System.out.println("\nDigite o valor que deseja converter:");
                double valor = leitura.nextDouble();
                taxa = moedas.getConversionRates().getJPY() / moedas.getConversionRates().getUSD();
                double valorFinal = valor * taxa;
                System.out.println("Valor " + valor + " (USD) corresponde ao valor final de ⟹ " + valorFinal + " (JPY)\n");
                break;

            case 2:
                System.out.println("\nDigite o valor que deseja converter:");
                valor = leitura.nextDouble();
                taxa = moedas.getConversionRates().getUSD() / moedas.getConversionRates().getJPY();
                valorFinal = valor * taxa;
                System.out.println("Valor " + valor + " (JPY) corresponde ao valor final de ⟹ " + valorFinal + " (USD)\n");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    public void dolarLiraTurca() throws IOException, InterruptedException {
        System.out.println("\n\n\n\n\n*********************************************");
        System.out.println("1. Dólar Americano ➜ Lira Turca");
        System.out.println("2. Lira Turca ➜ Dólar Americano");
        System.out.println("\nDigite uma opção válida: ");
        System.out.println("*********************************************");
        int opc = leitura.nextInt();
        Moedas moedas = consulta.buscaMoeda();
        double taxa = 0;
        switch (opc) {
            case 1:
                System.out.println("\nDigite o valor que deseja converter:");
                double valor = leitura.nextDouble();
                taxa = moedas.getConversionRates().getTRY() / moedas.getConversionRates().getUSD();
                double valorFinal = valor * taxa;
                System.out.println("Valor " + valor + " (USD) corresponde ao valor final de ⟹ " + valorFinal + " (TRY)\n");
                break;

            case 2:
                System.out.println("\nDigite o valor que deseja converter:");
                valor = leitura.nextDouble();
                taxa = moedas.getConversionRates().getUSD() / moedas.getConversionRates().getTRY();
                valorFinal = valor * taxa;
                System.out.println("Valor " + valor + " (TRY) corresponde ao valor final de ⟹ " + valorFinal + " (USD)\n");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    public void euroLibra() throws IOException, InterruptedException {
        System.out.println("\n\n\n\n\n*********************************************");
        System.out.println("1. Euro ➜ Libra Esterlina");
        System.out.println("2. Libra Esterlina ➜ Euro");
        System.out.println("\nDigite uma opção válida: ");
        System.out.println("*********************************************");
        int opc = leitura.nextInt();
        Moedas moedas = consulta.buscaMoeda();
        double taxa = 0;
        switch (opc) {
            case 1:
                System.out.println("\nDigite o valor que deseja converter:");
                double valor = leitura.nextDouble();
                taxa = moedas.getConversionRates().getGBP() / moedas.getConversionRates().getEUR();
                double valorFinal = valor * taxa;
                System.out.println("Valor " + valor + " (EUR) corresponde ao valor final de ⟹ " + valorFinal + " (GBP)\n");
                break;

            case 2:
                System.out.println("\nDigite o valor que deseja converter:");
                valor = leitura.nextDouble();
                taxa = moedas.getConversionRates().getEUR() / moedas.getConversionRates().getGBP();
                valorFinal = valor * taxa;
                System.out.println("Valor " + valor + " (GBP) corresponde ao valor final de ⟹ " + valorFinal + " (EUR)\n");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    public void euroIene() throws IOException, InterruptedException {
        System.out.println("\n\n\n\n\n*********************************************");
        System.out.println("1. Euro ➜ Iene");
        System.out.println("2. Iene ➜ Euro");
        System.out.println("\nDigite uma opção válida: ");
        System.out.println("*********************************************");
        int opc = leitura.nextInt();
        Moedas moedas = consulta.buscaMoeda();
        double taxa = 0;
        switch (opc) {
            case 1:
                System.out.println("\nDigite o valor que deseja converter:");
                double valor = leitura.nextDouble();
                taxa = moedas.getConversionRates().getJPY() / moedas.getConversionRates().getEUR();
                double valorFinal = valor * taxa;
                System.out.println("Valor " + valor + " (EUR) corresponde ao valor final de ⟹ " + valorFinal + " (JPY)\n");
                break;

            case 2:
                System.out.println("\nDigite o valor que deseja converter:");
                valor = leitura.nextDouble();
                taxa = moedas.getConversionRates().getEUR() / moedas.getConversionRates().getJPY();
                valorFinal = valor * taxa;
                System.out.println("Valor " + valor + " (JPY) corresponde ao valor final de ⟹ " + valorFinal + " (EUR)\n");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    public void euroLiraTurca() throws IOException, InterruptedException {
        System.out.println("\n\n\n\n\n*********************************************");
        System.out.println("1. Euro ➜ Lira Turca");
        System.out.println("2. Lira Turca ➜ Euro");
        System.out.println("\nDigite uma opção válida: ");
        System.out.println("*********************************************");
        int opc = leitura.nextInt();
        Moedas moedas = consulta.buscaMoeda();
        double taxa = 0;
        switch (opc) {
            case 1:
                System.out.println("\nDigite o valor que deseja converter:");
                double valor = leitura.nextDouble();
                taxa = moedas.getConversionRates().getTRY() / moedas.getConversionRates().getEUR();
                double valorFinal = valor * taxa;
                System.out.println("Valor " + valor + " (EUR) corresponde ao valor final de ⟹ " + valorFinal + " (TRY)\n");
                break;

            case 2:
                System.out.println("\nDigite o valor que deseja converter:");
                valor = leitura.nextDouble();
                taxa = moedas.getConversionRates().getEUR() / moedas.getConversionRates().getTRY();
                valorFinal = valor * taxa;
                System.out.println("Valor " + valor + " (TRY) corresponde ao valor final de ⟹ " + valorFinal + " (EUR)\n");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    public void libraIene() throws IOException, InterruptedException {
        System.out.println("\n\n\n\n\n*********************************************");
        System.out.println("1. Libra Esterlina ➜ Iene");
        System.out.println("2. Iene ➜ Libra Esterlina");
        System.out.println("\nDigite uma opção válida: ");
        System.out.println("*********************************************");
        int opc = leitura.nextInt();
        Moedas moedas = consulta.buscaMoeda();
        double taxa = 0;
        switch (opc) {
            case 1:
                System.out.println("\nDigite o valor que deseja converter:");
                double valor = leitura.nextDouble();
                taxa = moedas.getConversionRates().getJPY() / moedas.getConversionRates().getGBP();
                double valorFinal = valor * taxa;
                System.out.println("Valor " + valor + " (GBP) corresponde ao valor final de ⟹ " + valorFinal + " (JPY)\n");
                break;

            case 2:
                System.out.println("\nDigite o valor que deseja converter:");
                valor = leitura.nextDouble();
                taxa = moedas.getConversionRates().getGBP() / moedas.getConversionRates().getJPY();
                valorFinal = valor * taxa;
                System.out.println("Valor " + valor + " (JPY) corresponde ao valor final de ⟹ " + valorFinal + " (GBP)\n");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    public void libraLiraTurca() throws IOException, InterruptedException {
        System.out.println("\n\n\n\n\n*********************************************");
        System.out.println("1. Libra Esterlina ➜ Lira Turca");
        System.out.println("2. Lira Turca ➜ Libra Esterlina");
        System.out.println("\nDigite uma opção válida: ");
        System.out.println("*********************************************");
        int opc = leitura.nextInt();
        Moedas moedas = consulta.buscaMoeda();
        double taxa = 0;
        switch (opc) {
            case 1:
                System.out.println("\nDigite o valor que deseja converter:");
                double valor = leitura.nextDouble();
                taxa = moedas.getConversionRates().getTRY() / moedas.getConversionRates().getGBP();
                double valorFinal = valor * taxa;
                System.out.println("Valor " + valor + " (GBP) corresponde ao valor final de ⟹ " + valorFinal + " (TRY)\n");
                break;

            case 2:
                System.out.println("\nDigite o valor que deseja converter:");
                valor = leitura.nextDouble();
                taxa = moedas.getConversionRates().getGBP() / moedas.getConversionRates().getTRY();
                valorFinal = valor * taxa;
                System.out.println("Valor " + valor + " (TRY) corresponde ao valor final de ⟹ " + valorFinal + " (GBP)\n");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

    public void ieneLiraTurca() throws IOException, InterruptedException {
        System.out.println("\n\n\n\n\n*********************************************");
        System.out.println("1. Iene ➜ Lira Turca");
        System.out.println("2. Lira Turca ➜ Iene");
        System.out.println("\nDigite uma opção válida: ");
        System.out.println("*********************************************");
        int opc = leitura.nextInt();
        Moedas moedas = consulta.buscaMoeda();
        double taxa = 0;
        switch (opc) {
            case 1:
                System.out.println("\nDigite o valor que deseja converter:");
                double valor = leitura.nextDouble();
                taxa = moedas.getConversionRates().getTRY() / moedas.getConversionRates().getJPY();
                double valorFinal = valor * taxa;
                System.out.println("Valor " + valor + " (JPY) corresponde ao valor final de ⟹ " + valorFinal + " (TRY)\n");
                break;

            case 2:
                System.out.println("\nDigite o valor que deseja converter:");
                valor = leitura.nextDouble();
                taxa = moedas.getConversionRates().getJPY() / moedas.getConversionRates().getTRY();
                valorFinal = valor * taxa;
                System.out.println("Valor " + valor + " (TRY) corresponde ao valor final de ⟹ " + valorFinal + " (JPY)\n");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}

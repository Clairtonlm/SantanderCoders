package clairtonlima.provafinal;


public class Questao1 {

	public static void main(String[] a) {
        double valorEmprestimo = 30000.00; 
        double taxaJuros = 1.5 / 100; 
        int meses = 12; 

        double amortizacaoValor = valorEmprestimo / meses;
        double saldoDevedor = valorEmprestimo;

        System.out.println("Valor fixo da amortização: R$ " + String.format("%.2f", amortizacaoValor));

        double totalPago = 0;
        double totalDeJuros = 0;
        double totalAmortizado = 0;

        for (int i = 1; i <= meses; i++) {
            double juros = saldoDevedor * taxaJuros;
            double prestacao = juros + amortizacaoValor;
            saldoDevedor = saldoDevedor -  amortizacaoValor;

            totalPago =  totalPago + prestacao;
            totalDeJuros =totalDeJuros + juros;
            totalAmortizado = totalAmortizado + amortizacaoValor;

            System.out.println("Parcela " + i + " | Juros: R$ " + String.format("%.2f", juros) +
                    " | Prestação: R$ " + String.format("%.2f", prestacao) +
                    " | Saldo devedor: R$ " + String.format("%.2f", saldoDevedor));
        }

        System.out.println("Total: Prestação R$ " + String.format("%.2f", totalPago) +
                ", Juros R$ " + String.format("%.2f", totalDeJuros) +
                ", Amortização R$ " + String.format("%.2f", totalAmortizado));
    }
}


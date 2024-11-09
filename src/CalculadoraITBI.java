import javax.swing.JOptionPane;

class CalculadoraITBI {
    public static void main(String[] args) {
        // Recebe o valor de transação do imóvel
        String valorTransacaoStr = JOptionPane.showInputDialog("Digite o Valor de Transação do Imóvel?");
        double valorTrans = Double.parseDouble(valorTransacaoStr);

        // Recebe o valor venal do imóvel
        String valorVenalStr = JOptionPane.showInputDialog("Digite o Valor Venal do Imóvel?");
        double valorVenal = Double.parseDouble(valorVenalStr);

        // Recebe a porcentagem do imposto ITBI
        String porcentagemITBIStr = JOptionPane.showInputDialog("Digite a Porcentagem do Imposto ITBI?");
        double porcentagemITBI = Double.parseDouble(porcentagemITBIStr);

        // Calcula o maior valor entre o valor de transação e o valor venal
        double maiorVal = Math.max(valorTrans, valorVenal);

        // Calcula o valor do imposto ITBI
        double valorImposto = (maiorVal * porcentagemITBI) / 100;

        // Exibe o valor do imposto ITBI
        JOptionPane.showMessageDialog(null, "O VALOR DO IMPOSTO ITBI É: R$ " + valorImposto);
    }
}

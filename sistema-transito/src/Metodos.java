import javax.swing.JOptionPane;

public class Metodos {

    // Função que cadastra as estatísticas das cidades e retorna o vetor do tipo estatística
    public Estatistica[] CadastroEstatistica(Estatistica[] estatistica)
    {
        // Percorre o vetor e cadastra a estatistica
        for(int i=0; i<10; i++)
        {
            estatistica[i].IDCidade = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da cidade: "));
            estatistica[i].NomeCidade = JOptionPane.showInputDialog("Digite o nome da cidade: ");
            estatistica[i].QtdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes da cidade: "));
        }

        return estatistica;
    } // Fim Função CadastroEstatistica

    // Procedimento que consulta a quant. de acidentes por cidade
    public void ConsultaQtdAcidentes(Estatistica[] estatistica)
    {
        // Percorre vetor e mostrar as cidades por quant. de acidentes
        for(int i=0; i<10; i++)
        {
            // Vai exibir apenas as estatisticas dentro da condição
            if (estatistica[i].QtdAcidentes > 100 && estatistica[i].QtdAcidentes <500)
            {
                JOptionPane.showMessageDialog(null, "Código da Cidade: " +estatistica[i].IDCidade+
                                                "\nNome da Cidade: " +estatistica[i].NomeCidade+
                                                "\nQuantidade de Acidentes: " +estatistica[i].QtdAcidentes);
            } // Fim Verificação
        } // Fim Loop
    } // Fim Procedimento ConsultaQtdAcidentes

    // Procedimento que consulta maior e menor número de acidentes
    public void ConsultaEstatisticaAcidentes(Estatistica[] estatistica)
    {
        int maior=0, menor=0;

        // Valores para comparação
        maior = estatistica[0].QtdAcidentes;
        menor = estatistica[0].QtdAcidentes;


        // Percorre o vetor do tipo estatistica
        for(int i=0; i<10; i++)
        {
            // Comparando o maior valor
            if(estatistica[i].QtdAcidentes > maior)
            {
                maior = estatistica[i].QtdAcidentes;
            }
            // Comparando o menor valor
            if (estatistica[i].QtdAcidentes < menor)
            {
                menor = estatistica[i].QtdAcidentes;
            }
        } // Fim Loop

        JOptionPane.showMessageDialog(null, "Maior número de acidentes: "+ maior+
                                                                    "\nMenor número de acidentes: "+ menor);

    } // Fim Procedimento ConsultaEstatisticaAcidentes

    // Procedimento que calcula média das 10 cidades e exibe as estatisticas que estão acima da média
    public void CidadesMedia(Estatistica[] estatistica)
    {
        double soma=0.0, media=0.0;

        // Percorre o vetor e soma as estatisticas
        for(int i=0; i<10; i++)
        {
            soma += estatistica[i].QtdAcidentes;
        } // Fim Loop

        media = soma/10;

        for(int i=0; i<10; i++)
        {
            // Condição das estatísticas acima da média
            if (estatistica[i].QtdAcidentes > media)
            {
                JOptionPane.showMessageDialog(null, "Cidade com acidentes acima da média: "+ estatistica[i].NomeCidade+
                                                                            "\nQuantidade de acidentes: "+ estatistica[i].QtdAcidentes+
                                                                            "\nMédia de todas as estatísticas = "+media);
            } // Fim Verificação
        } // Fim Loop
    } // Fim Procedimento CidadesMedia

} // Fim Classe Métodos

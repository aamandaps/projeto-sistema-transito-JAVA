/* Classe que vai exibir o seguinte menu:

---------------------------------------------------------------
| MENU ESTATÍSTICA                                             |
| Estatísticas de acidentes em 2025                            |
| 1 - Cadastro Estatística                                     |
| 2 - Consulta por quantidade de acidentes                     |
| 3 - Consulta por estatísticas de acidentes                   |
| 4 - Acidentes acima da média das 10 cidades                  |
| 9 - Finaliza                                                 |
----------------------------------------------------------------
*/

import javax.swing.*;

public class Main {

    public static void main (String[] args) {

        // Instância da classe Estatística com 10 registros tipo vetor
        Estatistica[] estatistica = new Estatistica[10];

        // Instância da classe Metodos
        Metodos m = new Metodos();

        // Execução do metodo construtor da classe
        for(int i=0; i<10; i++)
        {
            estatistica[i] = new Estatistica();
        }

        int opc=0;
        while (opc!=9)
        {
            // Menu
            opc = Integer.parseInt(JOptionPane.showInputDialog("""
                    Estatísticas de acidentes em 2025:
                    1- Cadastro Estatística;
                    2- Consulta por quant. de acidentes;
                    3- Consulta por maior e menor número de acidentes;
                    4- Cidades com quant. de acidentes acima da média das 10 cidades;
                    9- Clique aqui para finalizar a execução"""));

            switch (opc)
            {
                case 1:
                    estatistica = m.CadastroEstatistica(estatistica); // Função
                break;

                case 2:
                    m.ConsultaQtdAcidentes(estatistica); // Procedimento
                break;

                case 3:
                    m.ConsultaEstatisticaAcidentes(estatistica); // Procedimento
                break;

                case 4:
                    m.CidadesMedia(estatistica); // Procedimento
                break;

                case 9:
                    JOptionPane.showMessageDialog(null, "FIM");
                System.exit(0);

                default: JOptionPane.showMessageDialog(null, "Opção Inválida.");
            } // Fim Switch-Case
        } // Fim Loop-Switch

    } // Fim Metodo Main

} // Fim Classe Main

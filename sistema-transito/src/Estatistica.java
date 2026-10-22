public class Estatistica { // Classe Abstrata
    int IDCidade;
    String NomeCidade;
    int QtdAcidentes;

    // Metodo Construtor
    Estatistica()
    {
        this(0,"",0); // Como cada atributo vai ser inicializado a cada chamada do metodo
    }

    // Metodo Procedimento
    Estatistica (int IDCidade, String NomeCidade, int QtdAcidentes)
    {
        this.IDCidade = IDCidade;
        this.NomeCidade = NomeCidade;
        this.QtdAcidentes = QtdAcidentes;
    }

} // Fim Classe Estatistica

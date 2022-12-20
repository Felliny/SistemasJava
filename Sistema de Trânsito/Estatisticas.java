package Transito;

public class Estatisticas {
    int codigo;
    String nome;
    int qtdacidentes;
    Estatisticas(){
        this (0,"",0);
    }

    Estatisticas(int codigocidade, String nomecidade, int qtdacidentescidade){
        codigo= codigocidade;
        nome= nomecidade;
        qtdacidentes= qtdacidentescidade;
    }
}

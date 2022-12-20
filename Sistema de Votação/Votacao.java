package Votacao;

class Votacao {
    int secao;
    int candidato;


    Votacao(){
        this(0,0);
    }

    Votacao(int numerosecao, int numerocandidato){
        secao= numerosecao;
        candidato= numerocandidato;
    }
}

package Votacao;

import javax.swing.JOptionPane;
public class ClasseInd {
    static int vtsoma[]= new int[11];
    static int vtsoma2[]= new int[301];
    static int candidatos[]= new int[301];
    public void Fqtdeleitores(Votacao[] votacao){

        for (int i=0; i<200; i++){
            for (int j=0; j<11; j++){
                if (votacao[i].secao == j){
                    vtsoma[j]++;
                }
            }
        }
        for (int i=0; i<11; i++){
            System.out.println("Seção "+ i +" Possui "+ vtsoma[i] +" de eleitores");
        }
    }

    public void Fmaioremenor(Votacao[] votacao){
        int ma= 0,me= 0;
        int auxma= 0, auxme= 0;
        for (int i=0; i<10; i++){
            if (i == 0){
                ma= vtsoma[i];
                me= vtsoma[i];
            }
            else if (vtsoma[i] > ma){
                ma= vtsoma[i];
                auxma= i;
            }
            else if (vtsoma[i] < me){
                me= vtsoma[i];
                auxme= i;
            }
        }
        System.out.println("Seção com maior numero de eleitores: \n Seção: " +auxma+ "\n Total de eleitores: " +vtsoma[auxma]);
        System.out.println("Seção com menor numero de eleitores: \n Seção: " +auxme+ "\n Total de eleitores: " +vtsoma[auxme]);
    }

    public void Fqtdcandidato(Votacao[] votacao){

        for (int i=0; i<200; i++){
            for (int j=0; j<301; j++){
                if (votacao[i].candidato == j){
                    vtsoma2[j]++;
                    candidatos[j]= votacao[i].candidato;
                }
            }
        }
        for (int j=0; j<301; j++){
            System.out.println("O candidato  " +j+ " tem " +vtsoma2[j]);
        }
    }

    public void Fcolocados(Votacao[] votacao){
        int aux= 0;
        int aux2= 0;

        for (int i=0; i<300; i++){
            for (int j=0; j<300 - 1; j++){
                if (vtsoma2[j] < vtsoma2[j + 1]){
                    aux= vtsoma2[j + 1];
                    aux2= candidatos[j + 1];
                    vtsoma2[j + 1]= vtsoma2[j];
                    candidatos[j + 1]= candidatos[j];
                    vtsoma2[j]= aux;
                    candidatos[j]= aux2;
                }
            }
        }
        System.out.println("10 primeiros colocados: ");
        for (int i=0; i<10; i++){
            System.out.println((i+1)+ "º Candidato: " +candidatos[i]+  " quantidade de votações: " +vtsoma2[i]);
        }
    }
}

package Votacao;

import javax.swing.JOptionPane;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
public class ClasseMeto {
    public Votacao[] Fcarrega(Votacao[] votacao){
        Random gerador= new Random();
        for (int i=0; i<200; i++){
            votacao[i].secao= gerador.nextInt(11);
            votacao[i].candidato= gerador.nextInt(301);
        }
        return votacao;
    }

    public Votacao[] Fclassifica(Votacao[] votacao){
        int aux= 0;
        int aux2= 0;
        for (int i=0; i<200; i++){
            for (int j=0; j<200 - 1; j++){
                if (votacao[j].secao <= votacao[j + 1].secao){
                    aux= votacao[j + 1].secao;
                    aux2= votacao[j + 1].candidato;
                    votacao[j + 1].secao= votacao[j].secao;
                    votacao[j + 1].candidato= votacao[j].candidato;
                    votacao[j].secao= aux;
                    votacao[j].candidato= aux2;
                }
            }
        }
        System.out.println("Dados classificados");
        return votacao;
    }

    public Votacao[] Fgravar(Votacao[] votacao)throws IOException{
        String fileName= "Votação2021.txt";
        BufferedWriter gravar= new BufferedWriter(new FileWriter(fileName));
        for (int i=0; i<200; i++){
            gravar.write(Integer.toString(votacao[i].secao));
            gravar.write(" ");
            gravar.write(Integer.toString(votacao[i].candidato));
            gravar.newLine();
        }
        JOptionPane.showMessageDialog(null,"ARQUIVO GERADO");
        gravar.close();
        return votacao;
    }
}

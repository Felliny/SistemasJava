/*
Objetivo:
1 - Registrar a seção e o número votado pelo eleitor usando o metodo Random, sendo que possui no maximo 10 seções e 300 candidatos.
2 - Colocar em ordem crescente pelo número da seção.
3 - Gravar em um arquivo os registros.
4 - Mostrar quantidade de Eleitores por seção.
5 - Mostrar seção com maior e menor número de Eleitores.
6 - Mostrar a quantidade de votos de cada candidato.
7 - Mostrar os 10 candidatos mais votados.
 */


package Votacao;

import java.io.IOException;
import javax.swing.JOptionPane;
public class ClasseMenu {
    public static void main(String[] args)throws IOException {
        Votacao[] votacao= new Votacao[200];
        ClasseMeto meto= new ClasseMeto();
        ClasseInd ind= new ClasseInd();
        for (int i=0; i<200; i++){
            votacao[i]= new Votacao();
        }

        int opc= 0, opc2= 0;
        while (opc != 9){
            opc= Integer.parseInt(JOptionPane.showInputDialog("SISTEMA DE VOTAÇÃO \n 1 - Carregar Seção/Número Eleitor \n 2 - Classificar por Seçâo \n 3 - Gravar Registros \n 4 - Mostrar Indicadores \n 9 - Finalizar"));
            switch (opc){
                case 1: votacao= meto.Fcarrega(votacao);
                    break;
                case 2: meto.Fclassifica(votacao);
                    break;
                case 3: meto.Fgravar(votacao);
                    break;
                case 4:
                    opc2= 0;
                    while (opc2 != 9){
                        opc2= Integer.parseInt(JOptionPane.showInputDialog("MOSTRAR INDICADORES \n Estatísticas de Votação em 2021 \n 1 - Quantidade de Eleitores por seção \n 2 - Seção com Maior e Menor número de Eleitores \n 3 - Quantidade de votos por candidato \n 4 - 10 primeiros colocados \n 9 - Finalizar Consulta"));
                        switch (opc2){
                            case 1: ind.Fqtdeleitores(votacao);
                                break;
                            case 2: ind.Fmaioremenor(votacao);
                                break;
                            case 3: ind.Fqtdcandidato(votacao);
                                break;
                            case 4: ind.Fcolocados(votacao);
                                break;
                            case 9: JOptionPane.showMessageDialog(null,"Consulta Finalizada");
                                break;
                            default: JOptionPane.showMessageDialog(null, "Opção Inválida");
                        }
                    }
                    break;
                case 9: JOptionPane.showMessageDialog(null, "Programa finalizado");
                    break;
                default: JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
        }
    }
}

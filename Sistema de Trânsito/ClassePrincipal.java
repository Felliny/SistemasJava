/*
Objetivo:
1 - Registrar 10 cidades com um codigo, nome  e número de acidentes que ocorreram.
2 - Mostrar as cidades com acidentes acima de 100 e abaixo de 500 acidentes.
3 - mostrar as cidades com maior acidentes e menor acidentes.
4 - mostrar as cidade com acidentes acima da media.
5 - Quando você cadastrar as cidades elas ficaram salvas em um arquivo gerado pelo programa, e esse arquivo pode ser lido.
 */



package Transito;

import java.io.IOException;
import javax.swing.JOptionPane;
public class ClassePrincipal {
    public static void main(String[] args)throws IOException {
        Estatisticas[] estatisticas= new Estatisticas[10];
        ClasseMetodos m= new ClasseMetodos();
        for (int i= 0; i<10; i++){
            estatisticas[i]= new Estatisticas();
        }

        int opc= 0;
        while (opc != 9){
            opc= Integer.parseInt(JOptionPane.showInputDialog("MENU ESTATISTICAS \n Estatísticas de acidentes em 2020 \n 1 - Cadastro Estatísticas \n 2 - Consulta por quantidade de acidentes \n 3 - Consulta por estatísticas de acidentes \n 4 - Acidentes acima da média das 10 cidades \n 5 - Ler arquivo \n 9 - Finaliza"));
            switch (opc) {
                case 1 -> estatisticas = m.Fcadastraestatistica(estatisticas);
                case 2 -> m.Porqtdacidentes(estatisticas);
                case 3 -> m.Pmaiormenor(estatisticas);
                case 4 -> m.Pacima(estatisticas);
                case 5 -> m.Lerarquivo(estatisticas);
                case 9 -> JOptionPane.showMessageDialog(null, "Programa Finalizado");
                default -> JOptionPane.showMessageDialog(null, "Opção Inválida");
            }
        }
    }
}

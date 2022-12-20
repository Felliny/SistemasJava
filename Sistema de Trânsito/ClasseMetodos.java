package Transito;

import java.io.*;
import javax.swing.JOptionPane;
public class ClasseMetodos {
    public Estatisticas[]Fcadastraestatistica(Estatisticas[] estatisticas)throws IOException{
        String fileName= "ArquivoEstatistica.txt";
        BufferedWriter gravar= new BufferedWriter(new FileWriter(fileName));


        for (int i=0; i<10; i++){
            estatisticas[i].codigo= Integer.parseInt(JOptionPane.showInputDialog("Entre o codigo da cidade"));
            gravar.write(Integer.toString(estatisticas[i].codigo));
            gravar.newLine();
            estatisticas[i].nome= JOptionPane.showInputDialog("Entre o nome da cidade");
            gravar.write(estatisticas[i].nome);
            gravar.newLine();
            estatisticas[i].qtdacidentes= Integer.parseInt(JOptionPane.showInputDialog("Entre a quantidades de acidentes"));
            gravar.write(Integer.toString(estatisticas[i].qtdacidentes));
            gravar.newLine();
        }
        System.out.println(("GRAVAÇÃO FEITA COM SUCESSO"));
        gravar.close();
        return estatisticas;
    }

    public void Porqtdacidentes(Estatisticas[] estatisticas){


        for (int i=0; i<10; i++){
            if (estatisticas[i].qtdacidentes > 100 && estatisticas[i].qtdacidentes < 500){
                System.out.println("Consulta: " + estatisticas[i].codigo + " " + estatisticas[i].nome + " " + estatisticas[i].qtdacidentes);

            }
        }

    }

    public void Pmaiormenor(Estatisticas[] estatisticas){

        int ma= 0, me= 0;
        int auxma= 0, auxme= 0;

        for (int i=0; i<10; i++){
            if (i == 0){
                ma= estatisticas[i].qtdacidentes;
                me= estatisticas[i].qtdacidentes;
            }
            if (estatisticas[i].qtdacidentes > ma){
                ma= estatisticas[i].qtdacidentes;
                auxma= i;
            }
            else if (estatisticas[i].qtdacidentes < me){
                me= estatisticas[i].qtdacidentes;
                auxme= i;
            }
        }
        System.out.println("Cidade com maiores acidentes em 2020: \n" + estatisticas[auxma].codigo + " " + estatisticas[auxma].nome + " " + estatisticas[auxma].qtdacidentes);
        System.out.println("Cidade com menores acidentes em 2020: \n" + estatisticas[auxme].codigo + " " + estatisticas[auxme].nome + " " + estatisticas[auxme].qtdacidentes);

    }

    public void Pacima(Estatisticas[] estatisticas){

        float media, soma= 0;

        for (int i=0; i<10; i++){
            soma+= estatisticas[i].qtdacidentes;
        }
        media= soma / 10;
        System.out.println("Cidades com acidentes acima da media: ");

        for (int i=0; i<10; i++){
            if (estatisticas[i].qtdacidentes > media){
                System.out.println(estatisticas[i].codigo + " " + estatisticas[i].nome + " " + estatisticas[i].qtdacidentes);

            }
        }

    }

    public void Lerarquivo(Estatisticas[]estatisticas)throws IOException{
        String fileName="ArquivoEstatistica.txt";
        BufferedReader ler= new BufferedReader(new FileReader(fileName));

        for (int i=0; i<10; i++){
            estatisticas[i].codigo= Integer.parseInt(ler.readLine());
            estatisticas[i].nome= ler.readLine();
            estatisticas[i].qtdacidentes= Integer.parseInt(ler.readLine());

        }
        for (int i=0; i<10; i++){
            System.out.println("Codigo: " + estatisticas[i].codigo + " Nome: " + estatisticas[i].nome + " Quantidade de Acidentes: " + estatisticas[i].qtdacidentes);
        }
        ler.close();
    }

}

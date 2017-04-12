/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhocg1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ewerton
 */
public class Arquivo {

    //private List<Trajeto> listT;
    private List<Elemento> lElem=new ArrayList<>();;
    int pxm = 0;
    char iElem = 1;
    
    public Arquivo(String s) throws FileNotFoundException{
        if(!s.isEmpty())lElem = leArquivo(s);
        //else lElem = new ArrayList<>();
    }

    public List<Elemento> leArquivo(String arq) throws FileNotFoundException {
        //cria scanner para ler o código
        Scanner scanner = new Scanner(new FileReader(arq));
        String n ="";
        String line;
        String cab;
        int x,y,t;
        int maxX,maxY,minX,minY;
        Ponto p = null;
        List<Ponto> listP = new ArrayList<Ponto>();

        //Lê o indica o número de pixels que equivale a um metro, quando da conversão de coordenadas de imagens para mundo.(pxm)
        cab = scanner.next();
        Scanner str = new Scanner(cab).useDelimiter("\\D+");
        pxm = str.nextInt();

        int i = 0;

        while (scanner.hasNext()) {
            //Lê o identificador da pessoa(n)
            n = scanner.next().trim();
            System.out.println(n);
            line = scanner.nextLine().trim();
            //Lê os pontos que a pessoa percorreu e armazena em uma lista
            str = new Scanner(line).useDelimiter("\\D+");

            /*maxX = 0;
            maxY = 0;
            minX = 10000;
            minY = 10000;*/

            while (str.hasNext()) {
                x = str.nextInt();
                y = str.nextInt();
                t = str.nextInt();
                

                p = new Ponto(x, y, t);
               // System.out.println(p.toString());
                listP.add(p);
               // Elemento el = new Elemento(n, (ArrayList<Ponto>) listP);
               // System.out.println(el.toString());
                //lElem.add(el);
                //System.out.println(lElem.get(0).toString());
            }
             
             Elemento el = new Elemento(Integer.toString(iElem), (ArrayList<Ponto>) listP);
             iElem++;
               // System.out.println(el.toString());
                lElem.add(el);
            //Adiciona o rótulo e a lista de pontos a um trajeto e cria uma lista de trajetos
            System.out.println();
            
            listP = new ArrayList<Ponto>();

            i++;
        }

        System.out.println();
        System.out.println("Pixels que equivalem a um metro: "+pxm);
        System.out.println("Identificador da pessoa: "+n);
        return lElem;
    }
    public int getPxm(){
        return pxm;
    }
    public List<Elemento> getArquivo(){
        return lElem;
    }
    
    
    //public void aproximacao(String rot,int dist);
    
    
}

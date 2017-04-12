/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhocg1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author Ewerton1
 */
public class Evento {
    
    ArrayList<Elemento> lElem;
    int pxm;
    /**
     *
     * @param el
     * @param pxm
     */
    public Evento(ArrayList<Elemento> el,int pxm){
        lElem = el;
        if(pxm>0)this.pxm = pxm;
        else this.pxm =1;
    }
    public List<Elemento> raioPontosLive(int x, int y, int t, int dl) {
        dl = pxm * dl;
        boolean nElem;
        ArrayList<Elemento> lElemAux = new ArrayList<Elemento>();
        
         for (int i = 0; i < lElem.size(); i++) {
            nElem = false; 
            Elemento elAux = null;
            
                for (int j = 0; j < lElem.get(i).getPontos().size() ; j++) {
                    //busca pontos que estão detro do raio de busca(X+,Y) em determinado tempo
                    //se 
                    if ((lElem.get(i).getPontos().get(j).getT() == t)
                            //verifica se está dentro do raio a direita ou a esquerda(X)
                            && ((lElem.get(i).getPontos().get(j).getX() - (x - dl) >= 0) && (lElem.get(i).getPontos().get(j).getX() - (x + dl) <= 0))
                            //verifica se está dentro do raio a acima ou a baixo(Y)
                            && ((lElem.get(i).getPontos().get(j).getY() - (y - dl) >= 0) && (lElem.get(i).getPontos().get(j).getY() - (y + dl) <= 0))) {
                        //lNova.add(listT.get(i).getP().get(j));
                        //System.out.println(lElem.get(i).getPontos().get(j).toString());
                        if(nElem == false){
                            elAux = new Elemento(lElem.get(i).getRotulo(),new ArrayList<>());
                            nElem =true;
                        }
                        elAux.addPonto(lElem.get(i).getPontos().get(j));
                    }
                   
                } if(elAux !=null)lElemAux.add(elAux);
            }
        
        return lElemAux;
    }
    
    public List<Elemento> raioPontosLive(int x, int y, int dl) {
        dl = pxm * dl;
        boolean nElem;
        ArrayList<Elemento> lElemAux = new ArrayList<Elemento>();
        
         for (int i = 0; i < lElem.size(); i++) {
            nElem = false; 
            Elemento elAux = null;
            
                for (int j = 0; j < lElem.get(i).getPontos().size() ; j++) {
                    //busca pontos que estão detro do raio de busca(X+,Y) em determinado tempo
                    //se 
                    if (((lElem.get(i).getPontos().get(j).getX() - (x - dl) >= 0) && (lElem.get(i).getPontos().get(j).getX() - (x + dl) <= 0))
                            //verifica se está dentro do raio a acima ou a baixo(Y)
                            && ((lElem.get(i).getPontos().get(j).getY() - (y - dl) >= 0) && (lElem.get(i).getPontos().get(j).getY() - (y + dl) <= 0))) {
                        //lNova.add(listT.get(i).getP().get(j));
                        //System.out.println(lElem.get(i).getPontos().get(j).toString());
                        if(nElem == false){
                            elAux = new Elemento(lElem.get(i).getRotulo(),new ArrayList<>());
                            nElem =true;
                        }
                        elAux.addPonto(lElem.get(i).getPontos().get(j));
                    }
                   
                } if(elAux !=null)lElemAux.add(elAux);
            }
        
        return lElemAux;
    }
    public List<Elemento> raioPontosAfast(int x, int y, int t,int dl) {
        dl = pxm * dl;
        boolean nElem;
        ArrayList<Elemento> lElemAux = new ArrayList<Elemento>();
        
         for (int i = 0; i < lElem.size(); i++) {
            nElem = false; 
            Elemento elAux = null;
            
                for (int j = 0; j < lElem.get(i).getPontos().size() ; j++) {
                    //busca pontos que estão detro do raio de busca(X+,Y) em determinado tempo
                    //se 
                    if ((lElem.get(i).getPontos().get(j).getT() == t)
                            //verifica se está dentro do raio a direita ou a esquerda(X)
                            && ((lElem.get(i).getPontos().get(j).getX() - (x - dl) < 0) || (lElem.get(i).getPontos().get(j).getX() - (x + dl) > 0))
                            //verifica se está dentro do raio a acima ou a baixo(Y)
                            && ((lElem.get(i).getPontos().get(j).getY() - (y - dl) < 0) || (lElem.get(i).getPontos().get(j).getY() - (y + dl) > 0))) {
                        //lNova.add(listT.get(i).getP().get(j));
                        //System.out.println(lElem.get(i).getPontos().get(j).toString());
                        if(nElem == false){
                            elAux = new Elemento(lElem.get(i).getRotulo(),new ArrayList<>());
                            nElem =true;
                        }
                        elAux.addPonto(lElem.get(i).getPontos().get(j));
                    }
                   
                } if(elAux !=null)lElemAux.add(elAux);
            }
        
        return lElemAux;
    }
    
    
    public void mostraTrajeto() {
        String ret;
        for (int i = 0; i < lElem.size(); i++) {
            for (int j = 0; j < lElem.get(i).getPontos().size(); j++) {
                System.out.print(lElem.get(i).getPontos().get(j).toString());
            }
        }
    }
    public List<Elemento> raioElemento(Elemento el,int d){
        ArrayList <Elemento> lElemAux = new ArrayList<>();
        for(Ponto p: el.getPontos()){
            lElemAux.addAll(raioPontosLive(p.getX(),p.getY(),d));
        }
        HashSet<Elemento> hashSet = new HashSet<Elemento>(lElemAux);
		lElemAux.clear();
		lElemAux.addAll(hashSet);
        return lElemAux;
    }
        
    
}

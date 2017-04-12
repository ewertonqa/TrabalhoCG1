/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhocg1;

import java.util.ArrayList;


/**
 *
 * @author Ewerton1
 */
public class Elemento {
    
    ArrayList<Ponto> listP;
    String rot = "";
    
    public Elemento(String r, ArrayList<Ponto> lp){
        rot = r;
        listP= lp;
    }
    public void addPonto(Ponto p){
        if(p != null)listP.add(p);
    }
    public String getRotulo(){
        return rot;
    }
    public ArrayList<Ponto> getPontos(){
        return listP;
    }
    public double calcDistPerc(){
        double dist=0;
        if(listP.isEmpty())return dist;
        else
        for(int i=0;i<listP.size()-1;i++){
            dist += Math.sqrt(Math.pow((listP.get(i+1).getX()-listP.get(i).getX()),2)+ Math.pow((listP.get(i+1).getY()-listP.get(i).getY()),2));
        }
        return dist;
    }
    public String toString(){
        String s = "Elemento: "+ rot+" \n";
        for(int i=0;i<listP.size();i++){
            if(i<listP.size()-1)s += listP.get(i).toString()+",";
            else s += listP.get(i).toString()+"\n";
        } 
        return s;
    }
    
    
    
}

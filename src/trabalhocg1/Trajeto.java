/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhocg1;

import java.util.List;

/**
 * Classe para ligar uma pessoa(rot) a um trajeto(lista de pontos), também armazena os X, Y máximos e mínimos para otimizar busca
 *
 * @author Ewerton
 */
public class Trajeto {

    String rot;
    List<Ponto> p;
    int maxX, maxY, minX, minY;

    public Trajeto(String rot, List<Ponto> po, int maX, int maY, int miX, int miY) {
        this.rot = rot;
        maxX = maX;
        maxY = maY;
        minX = miX;
        minY = miY;
        p = po;
    }

    public String getRot() {
        return rot;
    }

    public void setRot(String rot) {
        this.rot = rot;
    }

    public List<Ponto> getP() {
        return p;
    }

    public void setP(List p) {
        this.p = p;
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMaxY() {
        return maxY;
    }

    public int getMinX() {
        return minX;
    }

    public int getMinY() {
        return minY;
    }

}

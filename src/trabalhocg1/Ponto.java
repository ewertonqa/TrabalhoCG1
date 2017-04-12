/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhocg1;

/**
 * classe para criar um ponto formato(x,y,tempo)
 *
 * @author Ewerton
 */
public class Ponto {

    public int x, y, t;

    public Ponto(int x, int y, int t) {
        this.x = x;
        this.y = y;
        this.t = t;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    @Override
    public String toString() {
        return "Ponto(" + x + "," + y + "," + t + ')';
    }

}

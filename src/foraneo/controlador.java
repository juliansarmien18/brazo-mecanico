/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foraneo;

/**
 *
 * @author ASUS
 */
public class controlador {
    private brazo modelo;
    private BrazoView vista;
    
     public void controlador(brazo modelo, BrazoView vista){
         this.modelo=modelo;
         this.vista=vista;    
     }


public void setL(double l) {
        this.modelo.setL(l);
    }
  
    
    public double getL(){
        return modelo.getL();
    }
    
    public double getX() {
        return modelo.getX();
    }

    public void setX(double x) {
        this.modelo.setX(x);
    }

    public double getY() {
        return modelo.getY();
    }

    public void setY(double y) {
        this.modelo.setY(y);
    }

    public double getZ() {
        return modelo.getZ();
    }

    public void setZ(double z) {
        this.modelo.setZ(z);
    }

    public double getAngulor() {
        return modelo.getAngulor();
    }

    public void setAngulor(double angulor) {
        this.modelo.setAngulor(angulor);
    }

    public double getPosicionb() {
        return modelo.getPosicionb();
    }

    public void setPosicionb(double posicionb) {
        this.modelo.setPosicionb(posicionb);
    }
    
    public double getAnguloar1(){
        return modelo.getAnguloar1();
    }
    public void setAnguloar1(double anguloar1){
        this.modelo.setAnguloar1(anguloar1);
    }

    public double getX2() {
        return modelo.getX2();
    }

    public void setX2(double x2) {
        this.modelo.setX2(x2);
    }

    public double getX3() {
        return modelo.getX3();
    }

    public void setX3(double x3) {
        this.modelo.setX3(x3);
    }

    public double getX4() {
        return modelo.getX4();
    }

    public void setX4(double x4) {
        this.modelo.setX4(x4);
    }

    public double getY2() {
        return modelo.getY2();
    }

    public void setY2(double y2) {
        this.modelo.setY2(y2);
    }

    public double getY3() {
        return modelo.getY3();
    }

    public void setY3(double y3) {
        this.modelo.setY3(y3);
    }

    public double getY4() {
        return modelo.getY4();
    }

    public void setY4(double y4) {
        this.modelo.setY4(y4);
    }

    public double getZ2() {
        return modelo.getZ2();
    }

    public void setZ2(double z2) {
        this.modelo.setZ2(z2);
    }

    public double getZ3() {
        return modelo.getZ3();
    }

    public void setZ3(double z3) {
        this.modelo.setZ3(z3);
    }

    public double getZ4() {
        return modelo.getZ4();
    }

    public void setZ4(double z4) {
        this.modelo.setZ4(z4);
    }

    public double getAnguloar2() {
        return modelo.getAnguloar2();
    }

    public void setAnguloar2(double anguloar2) {
        this.modelo.setAnguloar2(anguloar2);
    }

    public double getAnguloar3() {
        return modelo.getAnguloar2();
    }

    public void setAnguloar3(double anguloar3) {
        this.modelo.setAnguloar3(anguloar3);
    }

    public double getAnguloar4() {
        return modelo.getAnguloar2();
    }

    public void setAnguloar4(double anguloar4) {
        this.modelo.setAnguloar4(anguloar4);
    }         
}


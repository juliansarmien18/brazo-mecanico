package foraneo;

import javax.swing.JOptionPane;
import foraneo.BrazoView;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class brazo {
    double l = 153;
    double x, x2, x3, x4;
    double y =150;
    double y2, y3, y4;       
    double z, z2, z3, z4;
    double angulor=0;
    double posicionb=0;
    double anguloar1= 5;
    double anguloar2= 5;
    double anguloar3= 5;
    double anguloar4= 5;
            
           
    public void coordenadasb1(){
     this.posicionb = posicionb;
     x = (l*Math.sin(angulor*2.0*Math.PI/360.0)* Math.cos(anguloar1*2.0*Math.PI/360.0));  
     x = x + posicionb; 
     x = (Math.round(x * 100d) / 100d);
     
     y = (l*Math.cos(angulor*2.0*Math.PI/360.0)* Math.cos(anguloar1*2.0*Math.PI/360.0));
     y = (Math.round(y * 100d) / 100d);
     
     z = Math.sin(anguloar1*2.0*Math.PI/360.0);  
     z = l*z;
     z = z + 3;
     z = (Math.round(z * 100d) / 100d);
 }
 
  public void coordenadasb2(){
      x2 = x +(l*Math.sin(angulor*2.0*Math.PI/360.0)* Math.cos((anguloar2-90)*2.0*Math.PI/360.0));
      x2 = (Math.round(x2 * 100d) / 100d);
      
      y2 = y +(l*Math.cos(angulor*2.0*Math.PI/360.0)* Math.cos((anguloar2-90)*2.0*Math.PI/360.0));
      y2 = (Math.round(y2 * 100d) / 100d);
      
      z2 = z +(l*(Math.sin((anguloar2-90)*2.0*Math.PI/360.0)));  
      z2 = (Math.round(z2 * 100d) / 100d);
 }
  public void coordenadasb3(){
      x3 = x2 +(l*Math.sin(angulor*2.0*Math.PI/360.0)* Math.cos((anguloar3-90)*2.0*Math.PI/360.0));
      x3 = (Math.round(x3 * 100d) / 100d);
     
      y3 = y2 +(l*Math.cos(angulor*2.0*Math.PI/360.0)* Math.cos((anguloar3-90)*2.0*Math.PI/360.0));
      y3 = (Math.round(y3 * 100d) / 100d);
      
      z3 = z2 +(l*(Math.sin((anguloar3-90)*2.0*Math.PI/360.0)));  
      z3 = (Math.round(z3 * 100d) / 100d);
 }
  public void coordenadasb4(){
      x4 = x3 +(23*Math.sin(angulor*2.0*Math.PI/360.0)* Math.cos((anguloar4-90)*2.0*Math.PI/360.0));
      x4 = (Math.round(x4 * 100d) / 100d);
          
      y4 = y3 +(23*Math.cos(angulor*2.0*Math.PI/360.0)* Math.cos((anguloar4-90)*2.0*Math.PI/360.0));
      y4 = (Math.round(y4 * 100d) / 100d);
      
      z4 = z3 +(23*(Math.sin((anguloar4-90)*2.0*Math.PI/360.0)));  
      z4 = (Math.round(z4 * 100d) / 100d);
 }
  public void restricciones (){
      if(z<0 || z2<0 || z3<0 || z4 <0  ){
          Icon gatollanto = new ImageIcon(getClass().getResource("/imagenes/gatollanto.png"));
          JOptionPane.showMessageDialog(null,"ERROR, POSICION INVALIDA","ERROR",JOptionPane.ERROR_MESSAGE, gatollanto );
      }else if(x<-400 || x>400 || x2<-400 || x2>400 || x3<-400 || x3>400 || x4<-400 || x4>400 ){
          Icon gatosangre = new ImageIcon(getClass().getResource("/imagenes/gatosangre.png"));
          JOptionPane.showMessageDialog(null,"ERROR, LIMITE EXCEDIDO" , "ERROR",JOptionPane.ERROR_MESSAGE,gatosangre );
      }else if(y<-400 || y>400 || y2<-400 || y2>400 || y3<-400 || y3>400 || y4<-400 || y4>400 ){
          Icon gatosangre = new ImageIcon(getClass().getResource("/imagenes/gatosangre.png"));
          JOptionPane.showMessageDialog(null,"ERROR, LIMITE EXCEDIDO" , "F en el chat",JOptionPane.ERROR_MESSAGE,gatosangre );
      } else{
          Icon gatofinal = new ImageIcon(getClass().getResource("/imagenes/gatofinal.jpg"));
          JOptionPane.showMessageDialog(null,"LAS POSICIONES DEL BRAZO SON CORRECTAS" ,"POSICIONES CORRECTAS",JOptionPane.QUESTION_MESSAGE,gatofinal);
      }
  }
  

    public void setL(double l) {
        this.l = l;
    }
  
    
    public double getL(){
        return l;
    }
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getAngulor() {
        return angulor;
    }

    public void setAngulor(double angulor) {
        this.angulor = angulor;
    }

    public double getPosicionb() {
        return posicionb;
    }

    public void setPosicionb(double posicionb) {
        this.posicionb = posicionb;
    }
    
    public double getAnguloar1(){
        return anguloar1;
    }
    public void setAnguloar1(double anguloar1){
        this.anguloar1 = anguloar1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getX3() {
        return x3;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public double getX4() {
        return x4;
    }

    public void setX4(double x4) {
        this.x4 = x4;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public double getY3() {
        return y3;
    }

    public void setY3(double y3) {
        this.y3 = y3;
    }

    public double getY4() {
        return y4;
    }

    public void setY4(double y4) {
        this.y4 = y4;
    }

    public double getZ2() {
        return z2;
    }

    public void setZ2(double z2) {
        this.z2 = z2;
    }

    public double getZ3() {
        return z3;
    }

    public void setZ3(double z3) {
        this.z3 = z3;
    }

    public double getZ4() {
        return z4;
    }

    public void setZ4(double z4) {
        this.z4 = z4;
    }

    public double getAnguloar2() {
        return anguloar2;
    }

    public void setAnguloar2(double anguloar2) {
        this.anguloar2 = anguloar2;
    }

    public double getAnguloar3() {
        return anguloar3;
    }

    public void setAnguloar3(double anguloar3) {
        this.anguloar3 = anguloar3;
    }

    public double getAnguloar4() {
        return anguloar4;
    }

    public void setAnguloar4(double anguloar4) {
        this.anguloar4 = anguloar4;
    }
    
    

 
}
 
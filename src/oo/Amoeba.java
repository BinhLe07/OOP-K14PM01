package oo;

public class Amoeba {
    
    //attribue
    String soundFile;
    //toa do
    double xPoint,yPoint;


    //method
    public Amoeba(String soundFile){
        this.soundFile=soundFile;
    }
    public Amoeba(String soundFile, double xPoint, double yPoint){
        this.soundFile=soundFile;
        this.xPoint=xPoint;
        this.yPoint=yPoint;
    }


    void rotate(){
        System.out.println("Xoay xoay xoay at xPoint: "+this.xPoint + "yPoint: "+this.yPoint+this.soundFile);
        this.playSound();
    }
    void playSound(){
        System.out.println("Play "+this.soundFile);
    }
}

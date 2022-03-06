package shapeapp;

public class Circle {
    
    //attribute
    String soundFile;
    //method
    public Circle(String soundFile){
        this.soundFile=soundFile;
    }
    void rotate(){
        System.out.println("Xoay xoay xoay");
        this.playSound();
    }
    void playSound(){
        System.out.println("Play"+this.soundFile);
    }
}

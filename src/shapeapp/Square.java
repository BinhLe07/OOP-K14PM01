package shapeapp;

public class Square {
    //attribute
    String soundFile;
    //method
    public Square(String soundFile){
        this.soundFile=soundFile;
    }
    void rotate(){
        System.out.println("Xoay vong vong ");
        this.playSound();
    }
    void playSound(){
        System.out.println("Play" +this.soundFile);

    }
}

package Dog;

public class dog {

    //attribute
    int size;
    String name;
    String breed;
    //method
    public dog(String name, int size ,String breed){
        this.name=name;
        this.size=size;
        this.breed=breed;
    }
    void bark(){
        if(size > 10){
            System.out.println("Ang ang ang");
        }
        else{
            System.out.println("Gau gau gau");
        }
    }
    void run(){
        System.out.println("Runningggggggggg!!!!!!!!!");
    }
    void setBigger(){
        size = +20;
    }
    void show(){
        System.out.println("Dog name: "+name);
        System.out.println("Size: "+size);
        System.out.println("Giong: "+breed);
    }
}

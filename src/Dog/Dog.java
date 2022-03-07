package Dog;

public class dog {

    //attribute
    private int size;
    String name;
    String breed;
    //method
    public void setSize(int size){
        if(size > 0 ){
            this.size = size;
        }
        else{
            System.out.println("Kich thuoc khong hop le");
        }
    }
    public int getSize(){
        return this.size;
    }
}

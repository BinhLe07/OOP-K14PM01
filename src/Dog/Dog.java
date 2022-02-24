package Dog;

public class Dog {
    int size;
    String breed;
    String name;
    Dog()
    {

    }  
    
    Dog( int size, String breed, String name)
    {
        this.size = size;
        this.breed = breed;
        this.name = name;
    }
    
    void bark()
    {
        if(size > 14)
        {
            System.out.println("Gau Gau");
        }
        else
        {
            System.out.println("Ang Ang");
        }
    }

    void setBigger()
    {
        size += 5;
    }

    void run()
    {
        System.out.println("Running!!!");
        this.bark();// this có thể gọi method vào method
    }
}
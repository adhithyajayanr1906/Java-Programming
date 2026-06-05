class Mobile{
    String Model;
    String Brand;
    float Price;
    Mobile(String m, String b, float p){
        this.Model = m;
        this.Brand = b;
        this.Price = p;
    }
    void display(){
        System.out.println("Model: " + this.Model);
        System.out.println("Brand: " + this.Brand);
        System.out.println("Price: " + this.Price);
    }
}
public class ConstructorD {
    public static void main(String[] args){
        Mobile m1 = new Mobile("iPhone 12", "Apple", 79999.99f);
        m1.display();
    }
    
}


class Base{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and setting x now : " +x);
        this.x = x;
    }

   /*  public void printMe(){
        System.out.println("I am a constructor");
    } */
}

class Derived extends Base{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("I am in derived and setting y now : " +y);
        this.y = y;
    }
}

public class cwh_45_inheritance {
    public static void main(String[] args) {
        // Creating an Object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());
        //System.out.println(b.printMe());

        // Creating an object of derived class

        Derived d = new Derived();
        d.setY(43);
        System.out.println(d.getY());
        d.setX(50);
        System.out.println(d.getX());

        // System.out.println(d.printMe()); // This will not work as printMe is commented out in Base class

        
    }
}
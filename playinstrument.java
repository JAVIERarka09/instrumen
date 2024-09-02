//buat object class dari driver class

public class playinstrument {
    public static void main(String[] args) {
        instrument a = new instrument("guitar",101.5);
        instrument b = new instrument("piano",200.0);
        instrument c = new instrument("violin",150.9);

        //Getter
        //Setter
        //Method


        a.type = "guitar";
        a.price = 101.5;
        a.print();
        b.print();
        c.print();
    }
    
}

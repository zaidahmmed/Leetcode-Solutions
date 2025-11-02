package reader;

public class Main {
    public static void main(String[] args) {
        Solution reader = new Solution("abcdefgsfkqehkhdsyr32yrkfh32o8764yr7p8weygr87tgwha3876rg63yg0176ygi8374dow7qgiw98k");
        int n=3;
        char[] buf = new char[n];

        System.out.println("First call:");
        System.out.println(new String(buf, 0, reader.read(buf, n))); // prints "g"

        n=2;
        System.out.println("Second call:");
        buf=new char[n];
        System.out.println(new String(buf, 0, reader.read(buf, n))); // prints "g"

        n=6;
        System.out.println("Third call:");
        buf=new char[n];
        System.out.println(new String(buf, 0, reader.read(buf, n))); // prints "g"
        
        n=6;        
        System.out.println("Fourth call:");
        buf=new char[n];
        System.out.println(new String(buf, 0, reader.read(buf, n))); // prints "g"
    }
}
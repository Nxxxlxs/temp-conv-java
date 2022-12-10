import conversor.Tempconv;

public class Main {
    public static void main(String[] args) {
    
        System.out.println("Que frio! " + Tempconv.absoluteZeroC());
        System.out.println("Fervendo! " + Tempconv.CToF(Tempconv.getBoilingC()));
    }
}


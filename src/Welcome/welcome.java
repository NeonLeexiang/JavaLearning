package Welcome;

public class welcome {
    public static void main(String[] args) {
        String[] greeting = new String[3];
        greeting[0] = "welcome to InelliJ IDEA";
        greeting[1] = "I do not know how to use it";
        greeting[2] = "so I need to try";
        for (String g : greeting)
            System.out.println(g);
    }
}

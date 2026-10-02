class Main {
    public static void main(String[] args) {
        String a = new String("Wow");
        String b = "Wow";
        String c = a;
        String d = c;

        
        b = a;
        boolean b1 = a == b;
        //System.out.println("b1: " + b1);

        d = b + "!";
        boolean b2 = d.equals(b+"!");
        //System.out.println("b2: " + b2);

        c = d;
        boolean b3 = !c.equals(a);
        //System.out.println("b3: " + b3);

        if(b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }
}
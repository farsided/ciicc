package test;



public class task7 {


    int add(int left, int right){
        return left + right;
    }

    int subtract(int left, int right){
        return left - right;
    }

    int multiply(int left, int right){
        return left * right;
    }

    int divide(int left, int right){
        return left / right;
    }


    public static void main(String[] args) {
        task7 t = new task7();
        int n1 = 8, n2 = 4;

        System.out.println(t.add(n1,n2));

        System.out.println(t.subtract(n1,n2));

        System.out.println(t.multiply(n1,n2));

        System.out.println(t.divide(n1,n2));
    }
}

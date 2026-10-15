package test;

public class task8 {
    static int getTotal(int... nums){
        int total = 0;
        for(int n : nums){
            total += n;
        }
        return total;
    }
    public static void main(String[] args) {
        System.out.println(getTotal(1,2,3));
    }
}

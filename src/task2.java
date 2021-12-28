public class task2 {

    public static void main(String[] args) {

        int a = result(2,5);

        System.out.println(a);
    }


    public static int result(int prej, int deri) {
        int result = 1;
        for (int i = prej; i <= deri; i++) {
            if (i == prej) {
                result *= i * (i + 1);
            } else if (i != prej) {
                result *= result * (i + 1);
            }


        }
        return result;
    }
}


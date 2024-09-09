public class Reduce {

    public static void reduce(int i) {
        int counter = 0;

        while (i > 0) {
            if (i % 2 == 0) { // is even
                i = i / 2;
            }   else    {
                i--;
            }
            counter++;
        }

        System.out.println(counter);
    }

    public static void main(String[] args) {
        reduce(100);
    }
}

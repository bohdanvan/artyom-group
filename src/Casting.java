/**
 * @author bvanchuhov
 */
public class Casting {

    public static void main(String[] args) {
        int x = 10; // 4B
        long y = 3_000_000_000L; // 8B
        int z = (int)y; // BAD PRACTICE

        System.out.println(z);
    }
}

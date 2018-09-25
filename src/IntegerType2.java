/**
 * @author bvanchuhov
 */
public class IntegerType2 {

    public static void main(String[] args) {
        int age = 25;

        age = age + 10; // 35
        age += 10; // 45

        age = age + 1; // 46
        age += 1; // 47
        age++; // increment, 48
        ++age; // increment, 49

        age--; // decrement, 48
        --age; // 47

        System.out.println(age);
    }
}

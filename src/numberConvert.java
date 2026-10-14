import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class numberConvert {
    public static void main(String[] args) {
        int num = 23;
        List<Integer> list = new ArrayList<>();
        while (num > 0) {
            list.add(num % 2);
            num /= 2;
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        List<String> list1 = new ArrayList(list);
        String a = (String)list1.get(0);

    }
}

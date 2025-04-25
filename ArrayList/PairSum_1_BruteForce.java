package ArrayList;
import java.util.ArrayList;
import java.util.List;

public class PairSum_1_BruteForce {
    public static List<Integer> pairSum(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    List<Integer> result = new ArrayList<>();
                    result.add(i);
                    result.add(j);
                    return result;
                }
            }
        }
        return new ArrayList<>();
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        int target = 5;

        List<Integer> result = pairSum(list, target);
        if (!result.isEmpty()) {
            System.out.println("Pair found at indices: " + result);
        } else {
            System.out.println("No pair found.");
        }
    }
}

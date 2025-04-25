package ArrayList;
import java.util.ArrayList;
public class Maximum {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(9);
        list.add(7);
        list.add(8);
        list.add(6);
        list.add(1);

        int max = Integer.MIN_VALUE;
        for(int i = 0;i<list.size();i++){
            while(max<list.get(i)){
                max = list.get(i);
            }
        }
        System.out.println("Maximum element : " + max);
    }
}

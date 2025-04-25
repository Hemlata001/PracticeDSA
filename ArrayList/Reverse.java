package ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Size");
        System.out.println(list.size());
        System.out.println("Actual");
        for(int i = 0;i<list.size();i++){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("Reverse");
        for(int i = list.size()-1;i>=0;i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}

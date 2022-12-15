import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Even_numbers {
     /**
     * Пусть дан произвольный список целых чисел, удалить из него четные числа
     * */
    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            Random random = new Random();
            int num = random.nextInt(100);
            array.add(num);
        }
        
        System.out.println("\nПроизвольный список целых чисел: \n" + array);

        for (int i = 0; i < array.size();) {
            if(array.get(i) % 2 == 0)
            {
                array.remove(i);
            } else {
                i++;
            }
        }
        System.out.println("Без четных чисел:\n" + array);

    }
}

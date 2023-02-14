
import java.util.ArrayList;

public class Sort
{
    // Part A.  Which Sort is Which?
    public static void selectionSort(int[] elements)
    {
        int count = 0;
        for (int j = 0; j < elements.length - 1; j++)
        {
            int minIndex = j;
            for (int k = j + 1; k < elements.length; k++)
            {
                if (elements[k] < elements[minIndex])
                {
                    minIndex = k;
                }
                count++;
            }
            int temp = elements[j];
            elements[j] = elements[minIndex];
            elements[minIndex] = temp;
        }
        System.out.println("Count: " + count);
    }

    public static void insertionSort(int[] elements)
    {
        int count = 0;
        for (int j = 1; j < elements.length; j++)
        {
            int temp = elements[j];
            int possibleIndex = j;
            while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
            {
                count++;
                elements[possibleIndex] = elements[possibleIndex - 1];
                possibleIndex--;
            }
            elements[possibleIndex] = temp;
        }
        System.out.println("Count: " + count);
    }

    // Part C.  Sorting a 1000-word list!
    public static void selectionSortWordList(ArrayList<String> words)
    {
        for (int i = 0; i < words.size() -1; i ++){
            String min = words.get(i);
            int index = i;
            for (int j = i + 1; j < words.size(); j++){
                if (words.get(j).compareTo(min) < 0){
                    min = words.get(j);
                    index = j;
                }
            }
            words.set(index, words.set(i, min));
        }
    }

    public static void insertionSortWordList(ArrayList<String> words)
    {
        for (int i = 1; i < words.size(); i ++){
            String temp = words.get(i);
            int currentIndex = i;
            while (currentIndex -1 >= 0 && (temp.compareTo(words.get(currentIndex - 1)) < 0)){
                words.set(currentIndex, words.set(currentIndex -1, temp));
                currentIndex --;
            }
        }
    }
}


/**
 * Write a description of class Sort here.
 * 
 * @author Timothy Vaipan
 * @version 1-23-17
 */
import java.util.ArrayList;
import java.util.List;
public class Sort{
    ArrayList<Double> doubles;
    public Sort(){
        doubles = new ArrayList<Double>();
        doubles.addAll(RandomArray(10000));//This adds 10,000 random numbers to your list
    }

    public void sortNumsLTG(){
        int runs = 0;
        while (runs < doubles.size()){
            for (int i = 0; i < doubles.size(); i++){
                double firstDouble = 0.0;
                double secondDouble = 0.0;
                if (i+1 < doubles.size()){
                    firstDouble = doubles.get(i);
                    secondDouble = doubles.get(i+1);
                    
                    if (firstDouble > secondDouble){
                        doubles.set(i, secondDouble);
                        doubles.set(i+1, firstDouble);
                    }
                }
            }
            runs++;
        }
    }
    
    public void sortNumsGTL(){
        int runs = 0;
        while (runs < doubles.size()){
            for (int i = 0; i < doubles.size(); i++){
                double firstDouble = 0.0;
                double secondDouble = 0.0;
                if (i+1 < doubles.size()){
                    firstDouble = doubles.get(i);
                    secondDouble = doubles.get(i+1);
                    
                    if (firstDouble < secondDouble){
                        doubles.set(i, secondDouble);
                        doubles.set(i+1, firstDouble);
                    }
                }
            }
            runs++;
        }
    }

    public void printList(){
        int n = 1;
        for (int i = 0; i < doubles.size(); i++){
            System.out.println(n + ": " + doubles.get(i));
            n++;
        }
    }

    private static ArrayList<Double> RandomArray(int n){
        /**This method creates n random numbers between 0 (inclusive) and 100 (exclusive).
         * 
         */
        ArrayList<Double> arrayRandom = new ArrayList<Double>(n);
        for (int i=0; i<n; i++)
        {
            arrayRandom.add(Math.random()*100);
        }
        return arrayRandom;
    }
}

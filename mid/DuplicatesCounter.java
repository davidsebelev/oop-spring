import java.util.ArrayList;

public class DuplicatesCounter extends Pair {

    public Vector<Integer,Integer> calculateDuplicates(int[] array){


        for(int i = 0 ; i < array.size();i++){
            if(equals(array[i])){
                getCount();
            }

            array.add(array[i],getCount());
        }


        
    }

    public DuplicatesCounter(){

    }

    public Vector<Pair> calculateDuplicates(int[] array){
        ArrayList<Integer> = new ArrayList<>();

        for(int i = 0 ; i < array.size();i++){

        }
    }
    
}

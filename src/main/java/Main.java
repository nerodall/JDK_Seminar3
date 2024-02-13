import java.util.ArrayList;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {

        System.out.println(Calculate.sum(1,2.2));
        System.out.println(Calculate.multiply(2.1,3));
        System.out.println(Calculate.divide(3,2.56));
        System.out.println(Calculate.substruct(7,2.9));

        Double[] doub = {1.2,2.3};
        Integer [] inte = {1,2};
        System.out.println(compareArrays(doub,inte));

        Pair <Integer,Double> pair = new Pair<>(1,3.3);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);
    }




    public static <T1,T2 extends Number> boolean compareArrays (T1[] arr1, T2[]arr2){
        if (arr1.length == arr2.length){
            for (int i = 0; i <arr1.length ; i++) {
                if (!arr1[i].getClass().getName().equals(arr2[i].getClass().getName())){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}

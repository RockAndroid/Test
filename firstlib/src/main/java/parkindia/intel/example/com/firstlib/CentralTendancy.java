package parkindia.intel.example.com.firstlib;

import java.util.Collection;
import java.util.Iterator;

/**
 * Created by PC2 on 3/30/2017.
 */

public class CentralTendancy {

    public static Number arithmeticMean(Collection<? extends Number> numbers) {
        //check type of values
        Iterator<? extends Number> iterator = numbers.iterator();
        Number firstNumberInCollection = iterator.next();

        if (firstNumberInCollection instanceof Integer) {

            return computeMeanInt(numbers);

        } else if (firstNumberInCollection instanceof Long) {

            return computeMeanLong(numbers);
        }

        return computeMeanDouble(numbers);
    }

    private static Number computeMeanInt(Collection<? extends Number> numbers) {
        double result = 0;
        Iterator<? extends  Number> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            result += iterator.next().intValue();
        }
        return result/numbers.size();
    }

    private static Number computeMeanLong(Collection<? extends Number> numbers) {
        double result = 0;
        Iterator<? extends  Number> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            result += iterator.next().intValue();
        }
        return result/numbers.size();
    }
    private static Number computeMeanDouble(Collection<? extends Number> numbers) {
        double result = 0;
        Iterator<? extends  Number> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            result += iterator.next().intValue();
        }
        return result/numbers.size();
    }
}
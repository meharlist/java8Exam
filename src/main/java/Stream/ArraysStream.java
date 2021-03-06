package Stream;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Arrays;

import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by mkoduri on 6/29/2018.
 */
public class ArraysStream {

    public static void main(String[] args) {

        System.out.println("==============Concating Arrays that hold strings by using Stream ================");
        String[] s1 = new String[]{"a", "b", "c"};
        String[] s2 = new String[]{"d", "e", "f"};
        String[] s3 = new String[]{"g", "h", "i"};

        //join object type array
        String[] result = Stream.of(s1, s2, s3).flatMap(Stream::of).toArray(String[]::new);
        System.out.println(Arrays.toString(result));

        System.out.println("=============Concating Arrays that hold int's by using IntStream ===============");
        int [] int1 = new int[]{1,2,3};
        int[] int2 = new int[]{4,5,6};
        int[] int3 = new int[]{7,8,9};

        //join 2 primitive type array
        int[] result2 = IntStream
                                .concat(Arrays.stream(int1), Arrays.stream(int2))
                                .toArray();


        int[] result3 = IntStream
                                .concat(Arrays.stream(int1), IntStream.concat(Arrays.stream(int2), Arrays.stream(int3)))
                                .toArray();

        System.out.println(Arrays.toString(result2));

        System.out.println(Arrays.toString(result3));

        System.out.print("=====================================================================");

        System.out.println("Sum : "+IntStream.range(1, 3).sum());
        System.out.println("Average : "+ IntStream.range(1, 101).average().getAsDouble());
        IntStream.rangeClosed(1, 3).forEach(System.out::println);
        System.out.println("=========rangeClosed vs range against IntStream method ==========");
        IntStream.range(1, 3).forEach(System.out::println);

        IntStream.range(1, 101).filter(i -> i % 2 == 0).count();

        System.out.print("=====================================================================");


        System.out.println("========line 58");
        IntStream is1 = IntStream.of(1, 2,4, 5);
        OptionalDouble x = is1.filter(i->i%2 == 0).average();
        System.out.println("prints as OptionalDouble : "+x);
        System.out.println(" ======== " + x.getAsDouble());

        System.out.println("========line 65");

        int[] cgpa =  { 2, 3, 2, 4, 3, 2 };
        OptionalDouble od = Arrays.stream(cgpa, 2, 3).average();
        System.out.println(od.orElse(0.0));


        OptionalDouble od1 = Arrays.stream(cgpa, 0, 6).filter( x1 -> x1>=2 && x1<3).average();
        System.out.println(od1.orElse(0.0));


        List<Integer> list = Arrays.asList(10, 11, 30, 30, 25, 68);
        Integer i[] = {3,32};
        list.toArray(i);
        System.out.println(list);

    }
}

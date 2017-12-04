
import animal.Puppy;
import static utils.ArrayUtils.reverse;
import static utils.ArrayUtils.stringifyArray;
import static utils.math.factorial;
import static utils.math.factorialLoop;

public class Driver {
    public static void main(String [] args){
        Puppy Joey= new Puppy("Joey");
        Puppy Chandler=new Puppy("Chandler");
        Puppy Ross=new Puppy("Ross");
        System.out.println(Joey.getName());
        System.out.println(Chandler.getName());
        System.out.println(Ross.getName());

        int arr[]={9, 20, 3, 44, 88, 300};
        System.out.println(stringifyArray(arr));
        System.out.println(reverse(arr));

        Double d = 15.4;
        int i = d.intValue();
        System.out.println(factorial(i));
    }
}

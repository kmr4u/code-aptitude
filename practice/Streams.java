package practice.org;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.math.BigInteger.ONE;
public class Streams {

	public static void main(String[] args)
	{
		List<Integer> list = new ArrayList<>();
		
		IntStream.range(1, 10).forEach(n -> list.add(n)); //adds each element one by one to the list
		IntStream.range(1, 10).skip(5).forEach(System.out::print); //skips the first 5 elements in the stream
		System.out.println();
		System.out.println(IntStream.range(1, 5).sum()); // prints sum of first 4 Integers
		System.out.println();
		Stream.of( 'B', 'C', 'D', 'A').sorted().findFirst().ifPresent(System.out::print);;
		System.out.println();
		
		String[] names = {"joN", "Dany", "Jamie", "Tyrion", "Cersei", "Sansa", "Sam", "Jorah", "Brienne", "Bran", "Arya", "Pod", "Grey"};
		Arrays.stream(names).filter(x -> x.contains("o")).sorted().forEach(System.out::print); //Creates a stream from the string array, filters elements that contains 'o', sorts them and prints it
		
		System.out.println();
		Arrays.stream(new int[] {1, 2, 3, 4, 5, 6}).map(x -> x*x).average().ifPresent(System.out::print); //Calculates the average of the int array and prints it
		
		System.out.println();
		List<String> sortedNames = Arrays.asList(names).stream().map(String::toUpperCase).filter(x -> x.contains("A")).sorted().collect(Collectors.toList()); //doesnt modify the original source
		
		System.out.println(sortedNames);
		
		sortedNames.replaceAll(String::toLowerCase);
		
		System.out.println("After replaceAll: "+sortedNames);
		
		System.out.println(Arrays.asList(names)); 
		
		int count = (int)Stream.of(names).map(x -> x.toCharArray()).filter(x -> x.length>5).count(); //returns the no of names that are more than 5 chars
		System.out.println(count);
		
		Arrays.stream(names).map(x -> x.length());// x.length() is provided as implementation of R appy(T t) method of Function interface. - No op without terminal operation
		
		Arrays.stream(names).map(String::toLowerCase);
		
		Stream.iterate(ONE, BigInteger::nextProbablePrime);
	
	}
}

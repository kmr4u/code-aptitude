package practice.org;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaces {

	public static <R, T> void main(String[] args)
	{
		String[] names  = {"joN", "Dany", "Jamie", "Tyrion", "Cersei", "Sansa", "Sam", "Jorah", "Brienne", "Bran", "Arya", "Pod", "Grey"};
		
		MyFunction<T, R> myfunction = new MyFunction<>();
		Arrays.stream(names).map(x-> myfunction.apply((T) x)).forEach(System.out::println);	
		
		List<String> nameList = new ArrayList<>();
		nameList.add("A");
		nameList.add("B");
		
		MyPredicate<T> myPredicate = new MyPredicate<>();
		nameList.removeIf(x->myPredicate.test((T) x));
		
		System.out.println(nameList);
	}
	
}

class MyFunction<T, R> implements Function<T, R>{

	@Override
	public R apply(T t) {
		
		return (R) "MyFunction Applied";
	}
	
}

class MyPredicate<T> implements Predicate<T>{

	@Override
	public boolean test(T t) {
		// TODO Auto-generated method stub
		return t != null;
	}
	
}

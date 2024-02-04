package introduction;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;

public class Streamsdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//count the number of names starting with alphabet A in list
		/*
		ArrayList<String> names = new ArrayList();
		names.add("Abhijith");
		names.add("Don");
		names.add("Alekya");
		names.add("Adam");
		names.add("Ram");
		int count = 0;
		for(int i =0;i<names.size();i++) {
			String actual = names.get(i);
			if(actual.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);
		
		
		//Achieving the same by streams and lambda expression
		ArrayList<String> names = new ArrayList();
		names.add("Abhijith");
		names.add("Don");
		names.add("Alekya");
		names.add("Adam");
		names.add("Ram");
		//there is no life for intermediate operator if there is no terminal operator
		//terminal operation will execute only if intermediate operator(filter) returns true
		//we can stream 
		//how to use filter in streams API
		Long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		Stream.of("Abhijith","Don","Alekya","Adam","Ram").filter(s->{
			s.startsWith("A");
			return true;//if we return false it will not work
		}).count();
		//printing the char greater than 4
		names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
		
		//printing the names which have last letter as 'a' with uppercase
		
		Stream.of("Abhijith","Don","Alekya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
				
		//print names which have first letter as a with uppercase and sorted
		 
		List<String> names = Arrays.asList("Azbhijith","Don","Alekya","Adam","Rama");
		names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		ArrayList<String> names1 = new ArrayList();
		names1.add("man");
		names1.add("Don");
		names1.add("Women");
		
		//merging the lists
		Stream<String> newsream = Stream.concat(names.stream(), names1.stream());
		//newsream.forEach(s->System.out.println(s));
		
		boolean flag = newsream.anyMatch(s->s.equalsIgnoreCase("Adam"));
		System.out.println(flag);
		Assert.assertTrue(flag);
		
		*/
		
		//collect method
		List<String> ls = Stream.of("Abhijith","Don","Alekya","Adam","Ram").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.collect(Collectors.toList());
		System.out.println(ls.get(0));
		
		List<Integer> num = Arrays.asList(3,2,2,7,5,1,9,7);
		//print unique numbers and sort the array 
		num.stream().distinct().sorted().forEach(s->System.out.println(s));
	}

}

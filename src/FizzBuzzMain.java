
public class FizzBuzzMain {
	public static void main(String[] args){
		
		String[] strings = new String[2];
		strings[0]="Fizz";
		strings[1]= "Buzz";
		int[] ints = new int[2];
		ints[0]=3;
		ints[1]=5;
		FizzBuzz fizzbuzz = new FizzBuzz(strings, ints, 100);
		fizzbuzz.run();
	}
}

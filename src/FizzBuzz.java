import java.util.ArrayList;


public class FizzBuzz implements Runnable {
	private boolean[][] checks;
	private String[] strings;
	private int[] steps;
	private int length;
	private ArrayList<Checker> checkers;
	private Stringer stringer;
	private Writer writer;
	private Counter count;
	
	public FizzBuzz(String[] strings, int[] steps, int length){
		this.strings = strings;
		this.steps = steps;
		this.length = length;
		this.checks = new boolean[length][strings.length];
		this.count = new Counter(strings.length, length);
		for(int i=0;i<this.strings.length;i++){
			checkers.add(new Checker(this.checks, i,this.steps[i], this.length,this.count));
		}
		this.stringer = new Stringer(this.checks, this.strings,this.count);
		this.writer = new Writer(this.stringer.getQueue());
	}

	@Override
	public void run() {

		for(Checker C:checkers){
			C.run();
		}
		stringer.run();
		writer.run();

	}

}

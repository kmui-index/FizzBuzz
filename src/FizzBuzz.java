import java.util.ArrayList;
import java.util.PriorityQueue;

public class FizzBuzz implements Runnable {
	/*
	 * Fizzbuzz class is the parent class that takes the relevant inputs and then creates
	 * the necessary objects to do the job.  The run method obviously is a thread that performs the run command on each of the other
	 * necessary threads.  Perhaps making run() its own thread in this case is not the most efficient way to go.
	 */
	private PriorityQueue<Integer>[] checks;
	private String[] strings;
	private int[] steps;
	private int length;
	private ArrayList<Checker> checkers;
	private Stringer stringer;
	private Writer writer;
	private Counter count;
	
	@SuppressWarnings("unchecked")
	public FizzBuzz(String[] strings, int[] steps, int length){
		this.strings = strings;
		this.steps = steps;
		this.length = length;
		this.checks = new PriorityQueue[length];
		for(int i=0;i<length;i++){
			checks[i]=new PriorityQueue<Integer>();
		}
		this.count = new Counter(strings.length, length);
		checkers = new ArrayList<Checker>();
		for(int i=0;i<this.strings.length;i++){
			checkers.add(new Checker(this.checks, i,this.steps[i], this.length,this.count));
		}
		this.stringer = new Stringer(this.checks, this.strings,this.count, this.length);
		this.writer = new Writer(this.stringer.getQueue(), count);
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

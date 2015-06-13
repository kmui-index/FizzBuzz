import java.util.PriorityQueue;


public class Checker implements Runnable{
	private PriorityQueue<Integer>[] checks;
	private int slot;
	private int length;
	private Counter count;
	private int step;
	public Checker(PriorityQueue<Integer>[] checks2,int slot,int step, int length, Counter count){
		this.step = step;
		this.checks = checks2;
		this.slot = slot;
		this.count = count;
		this.length = length;
	}
	@Override
	public void run() {
		int i;
		for(i=0;i<length;i=i+step){
			this.checks[i].add(slot);
			this.count.setCounter(slot,i);
		}
		this.count.setCounter(slot,i+step);
	}

}

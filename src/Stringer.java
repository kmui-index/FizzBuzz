import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class Stringer implements Runnable{
	
	private PriorityQueue<Integer>[] checks;
	private String[] strings;
	private Queue<String> builtStrings;
	private Counter count;
	private int length;
	public Stringer(PriorityQueue[] checks2, String[] strings,Counter count, int length){
		this.checks = checks2;
		this.strings = strings;
		this.count = count;
		this.length = length;
		this.builtStrings = new LinkedList<String>();
	}
	@Override
	
	public void run() {
		int i = 0;
		boolean marked = false;
		while(!count.checked()||(i<length)){
			for(;i<count.getMin()&&i<length;i++){

				marked = false;
				String push= "";
				for(Integer integ:checks[i]){
					marked = true;
					push = push + strings[integ.intValue()];
				}
				if(!marked){
					push = Integer.toString(i);
				}
				push = push + "\n";
				builtStrings.add(push);
			}
		}
		count.end();
	}
	
	public Queue<String> getQueue() {
		return builtStrings;
	}

}

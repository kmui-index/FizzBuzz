import java.util.LinkedList;
import java.util.PriorityQueue;


public class Outputs {
	private PriorityQueue outs;
	
	public Outputs(){
		outs = new PriorityQueue<Integer>();
	}
	public void push(Integer i){
		outs.add(i);
	}
}

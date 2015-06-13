import java.util.Queue;


public class Stringer implements Runnable{
	
	private boolean[][] checks;
	private String[] strings;
	private Queue builtStrings;
	private Counter count;
	public Stringer(boolean[][] checks, String[] strings,Counter count){
		this.checks = checks;
		this.strings = strings;
		this.count = count;
	}
	@Override
	
	public void run() {
		while(!count.checked()){
			
		}
	}
	
	public Queue getQueue() {
		return builtStrings;
	}

}

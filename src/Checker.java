
public class Checker implements Runnable{
	private boolean[][] checks;
	private int slot;
	private int length;
	private Counter count;
	private int pos;
	private int step;
	public Checker(boolean[][] checks,int slot,int step, int length, Counter count){
		this.step = step;
		this.checks = checks;
		this.slot = slot;
		this.count = count;
	}
	@Override
	public void run() {
		for(int i=0;i<length;i=i+step){
			checks[i][slot]=true;
		}
	}

}

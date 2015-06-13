public class Counter {
	private int[] counts;
	private int min;
	private int len;
	private boolean done;
	public Counter(int num, int length){
		this.counts = new int[num];
		this.len = length;
	}

	public boolean checked(){
		return len<this.getMin();
	}
	
	public void setCounter(int i, int count, int len){
		this.counts[i]=count;
		if(counts[i]<counts[min]){
			min = i;
		}
	}
	
	public int getCount(int i){
		return counts[i];
	}
	
	public int getMin(){
		return counts[min];
	}
	
	public boolean done(){
		return done;
	}
}

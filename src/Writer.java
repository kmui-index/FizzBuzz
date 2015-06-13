import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Queue;

public class Writer implements Runnable{
	/*
	 * Writer simply takes the strings input and writes them to the console using
	 * a bufferedWriter.
	 */
	private Queue<String> strings;
	private Counter count;
	public Writer(Queue<String> strings,Counter count){
		this.strings = strings;
		this.count = count;
	}
	@Override
	public void run() {
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		while(!this.count.done()){
			while(strings.peek()!=null){
				String pop = strings.remove();
				try {
					out.write(pop,0,pop.length());
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			try {
				out.flush();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		while(strings.peek()!=null){
			
			String pop = strings.remove();
			try {
				out.write(pop,0,pop.length());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			out.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

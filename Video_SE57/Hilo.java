package Video_SE57;

public class Hilo extends Thread {
	
	@Override
	public void run(){
		for(int i= 0; i<=1000; i++){
			System.out.println(i);
		}
	}

}

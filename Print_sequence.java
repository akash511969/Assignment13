package assignment4;
public class Print_sequence extends Thread{
	public synchronized void run() {
	  for(int i=1;i<=500;i++) 
		 System.out.println(i);
	  try {
		  Thread.sleep(100);
	  }catch(Exception e) {}
	}
	public static void main(String[] args) throws Exception {
		Print_sequence print=new Print_sequence();
      Thread p1=new Thread(print);
	   p1.start();
	   Print_sequence2 print2=new Print_sequence2();
	   Thread p2=new Thread(print2);
       p1.join();
	   p2.start();
	   p2.join();
	}
}
class Print_sequence2 implements Runnable{
	public synchronized void run() {
		for(int i=501;i<=1000;i++) 
			System.out.println(i);
		try {
			Thread.sleep(100);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}




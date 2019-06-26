package practice.org;

public class SynchronizeTest {

	public static void main(String[] args)
	{
		TestThread obj = new TestThread();
		Thread t1 = new Thread(() ->  {
			//TestThread obj = new TestThread(); No synchronization will happen if each thread is creating its own object unless the accessed method is static
			for(int i=0; i<10; i++)
				obj.test();
		});
		Thread t2 = new Thread(() -> {
			//TestThread obj = new TestThread();
			for(int i=0; i<10; i++)
				obj.test();
		});
		
		t1.start();
		t2.start();
		
		try {
			t1.join(10000);
			t2.join(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

class TestThread{
	
	public synchronized void test() {
		System.out.println("This is test by: "+Thread.currentThread()+" at: "+System.currentTimeMillis());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

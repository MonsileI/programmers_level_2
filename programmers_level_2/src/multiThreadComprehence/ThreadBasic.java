package multiThreadComprehence;

//방법 1
class Hamburger extends Thread {

	    @Override
	    public void run() {
	        super.run();
	        System.out.println("Hamburger 나왔습니다.");
	        System.out.println("HamburgerHamburger");
	        System.out.println("번갈아가면서");
	        System.out.println("start가 위에있다고");
	    }
	}
//방법 2
class Ham implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Ham 나왔습니다.");
		System.out.println("HamHam");
		System.out.println("실행된다");
		System.out.println("먼저되지 않는구나아~");
	}
	
	
	
	
}

public class ThreadBasic {
	
	public static void main(String[] args) {
		Hamburger hamburger = new Hamburger();
		hamburger.start();
		Ham ham = new Ham();
		ham.run();
	}

}



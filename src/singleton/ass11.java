package singleton;
class Singleton {

	// create private static instance for current class
	private static Singleton st = new Singleton();

	// make constructor as private
	private Singleton() {

	}

	// method which will return instance of singleton class
	public static Singleton getSingleton() {
		return st;
	}
}



public class ass11 {
	public static boolean checksingleton(Singleton st1, Singleton st2) {
		if (st1.hashCode() == st2.hashCode()) {
			return true;
		} else
			return false;
	}
}

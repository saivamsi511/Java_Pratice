package annotations;

public class override {
	public static void main(String[] args) {
		parent p = new child();
		p.method();
	}
}
class parent {
	public void method() {
		System.out.println("this is override method.");
	}

}
class child extends parent {
	@Override
	public void method() {
		System.out.println("this is override method in child.");
	}
}
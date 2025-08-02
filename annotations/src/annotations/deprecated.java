package annotations;

public class deprecated {
public static void main(String[] args) {
	method m =new method();
	m.add(10, 20);
}
}
class method {
	@Deprecated
	public int add(int a , int b) {
		return a + b;
	}
	public int addNumber(int a , int b) {
		return a + b;
	}
}
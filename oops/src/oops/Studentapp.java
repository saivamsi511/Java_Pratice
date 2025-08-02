package oops;

public class Studentapp {
	public static void main(String[] args) {
		new Student().study();
		PrintStudent(new Student());
		Student res = sendAddress();
		System.out.println(res);
		
	}
	public static void PrintStudent(Student ref) {
		System.out.println(ref);
		System.out.println(ref.id+ref.name+ref.marks);
	}
	public static Student sendAddress() {
		return new Student();
	}
}

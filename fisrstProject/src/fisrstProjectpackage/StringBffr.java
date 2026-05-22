package fisrstProjectpackage;

public class StringBffr {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("Hello");
		s.reverse();
		System.out.println(s);
		StringBuffer s1=new StringBuffer("Hello");
		s1.append("world");
		System.out.println(s1);
		StringBuffer s2=new StringBuffer("Hell0");
		s2.insert(2, "world");
		System.out.println(s2);
		StringBuffer s3=new StringBuffer("Hello");
		s3.delete(1,3);
		System.out.println(s3);
		StringBuffer s4=new StringBuffer("Hello");
		s4.replace(1, 3,"world");
		System.out.println(s4);
	}

}

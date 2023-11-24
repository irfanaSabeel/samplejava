package javastring;

public class Details {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

			
		String name="IRFANA";
		String s1="Welcome";
		String s2=new String("welcome");


		StringBuffer s=new StringBuffer("Hello");
		s.append("java");
		System.out.println(s);
		System.out.println(s.reverse());
		System.out.println(s.insert(5,"world"));
		System.out.println(s.delete(1,2));

	}

}

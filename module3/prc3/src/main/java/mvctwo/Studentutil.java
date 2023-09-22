package mvctwo;
import java.util.*;
public class Studentutil {
	public static List<Student> getStudents(){
		List<Student> st= new ArrayList<>();
		st.add(new Student("Luffy","Captin"));
		st.add(new Student("Zoro","Swrods Man"));
		st.add(new Student("Sanji","Cook"));
		st.add(new Student("Nami","Navigator"));
		return st;
	}
}

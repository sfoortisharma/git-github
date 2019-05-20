import java.util.ArrayList;
import java.util.List;


public class string1 {

	public static void main(String[] args) {
		
		List<String> namelist= new ArrayList<String>();
		
		//add element
		namelist.add("Ajeet");
		namelist.add("Harry");
		namelist.add("Chaitanya");
		namelist.add("Steve");
		namelist.add("Anuj");
		
		//displaying name
		System.out.println("original ArrayList");
		for(String str:namelist){
			System.out.println(str);
		}
		
		

	}

}

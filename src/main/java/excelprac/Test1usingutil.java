package excelprac;
/**
 * @author jagadeeshwar
 *
 */
import org.testng.annotations.Test;

public class Test1usingutil {
	
	@Test
	public void testing(){
	Excelutil obj= new Excelutil("C:\\Users\\welcome\\Desktop\\Testdata.xlsx");
	
System.out.println(obj.readingdata(0, 5, 2));	
	}
	

}

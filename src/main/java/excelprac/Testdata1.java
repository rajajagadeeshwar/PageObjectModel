package excelprac;
/**
 * @author jagadeeshwar
 *
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Testdata1 {

	@Test
	public void normal() throws Exception {

		String data;
		String data1;
		try {
			File src = new File("C:\\Users\\welcome\\Desktop\\Testdata.xlsx");

			FileInputStream fis = new FileInputStream(src);

			XSSFWorkbook wb = new XSSFWorkbook(fis);

			XSSFSheet sh1 = wb.getSheetAt(0);

		/*	data = sh1.getRow(0).getCell(1).getStringCellValue();
			System.out.println(data);*/
			
			
			int rowsize=sh1.getLastRowNum();
            int colsize=sh1.getRow(0).getLastCellNum();	
            for(int i=0; i< rowsize; i++){
			for(int j=0; j< colsize; j++)
			{
				
				data1 = sh1.getRow(i).getCell(j).getStringCellValue();
				
				
				System.out.println(data1);
			}
            }
		} 
		catch (FileNotFoundException e) 
		{
			System.out.println(e.getMessage());
		}

	}

}

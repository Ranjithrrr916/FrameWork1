package GenericLibraries;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
/**
 * This class contains reusable methods to perform operation on Excel workbook
 * @author DELL
 *
 */
public class ExcelUtility
{
	private Workbook wb;
	/**
	 * This method initializes excel workbook
	 * @param path
	 */

	public void excelInitialization(String excelpath) {
		FileInputStream fis = null;
		try 
		{
			fis = new FileInputStream(excelpath);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		try
		{
			wb = WorkbookFactory.create(fis);
		}
		catch (EncryptedDocumentException | IOException e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * This method is used to fetch single data from excel
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 */
	public String fetchdataFromExcel(String sheetName,int rowNum, int cellNum)
	{
		return wb.getSheet(sheetName).getRow(rowNum).getCell(cellNum).getStringCellValue();
	}
	
	/**
	 * This method is used to fetch multiple data from excel
	 * @param sheetName
	 * @param rowNum
	 * @param cellNum
	 * @return
	 */
	public List<String> fetchDatafromExcel(String sheetName)
	{
	  List<String>dataList=new ArrayList<>();
	  Sheet sheet =wb .getSheet(sheetName);
	  for (int i = 0; i <4;  i++)
	  {
		String data=sheet.getRow(i).getCell(1).getStringCellValue();
		dataList.add(data);
	}
	  return dataList;
	}
	
	/**
	 * This method is used to close excel workbook 
	 */
	public void closeExcel()
	{
		try
		{
			wb.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
	  
		
	
}

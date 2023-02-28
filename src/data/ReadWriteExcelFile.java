package data;

public class ReadWriteExcelFile {

	public static void main(String[] args) {
		Xls_Reader reader = new Xls_Reader("C:\\\\QA\\\\Testing\\\\wetransfer_build-xml_2022-12-03_2020\\\\NikulTest.xlsx");
		System.out.println(reader.getColumnCount("Data1"));

	}

}

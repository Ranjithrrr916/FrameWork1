package GenericLibraries;
                                         //we are using interface because the path will not be corrupted ,data members are by default static and Final
public interface IconstantPath 
{
    String PROPERTIES_FILE_PATH="./src/test/resources/Commondata.Properties";   //Variable name give as capital letter because in interface members are final/constant so we give as capital letter
    String EXCEL_FILE_PATH="./src/test/resources/SkillraryTestdata.xlsx";
}

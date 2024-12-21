import FileHandlingPackage.WorkingWithPackages;

public class FileHandling {
    public static void main(String[] args) {
        WorkingWithPackages filePackage = new WorkingWithPackages();

        String fileName = "Test-File-01";
        String fileContent = "This is the content of the file.";
        filePackage.CreateFile(fileName);
        filePackage.WriteFile(fileContent);
        filePackage.ReadFile();
        System.out.println("does this \"" + filePackage.file.getName() +  "\" file Exists ? : " + filePackage.FileExists());
    }
}

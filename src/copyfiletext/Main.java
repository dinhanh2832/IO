package copyfiletext;
public class Main {

    public static void main(String[] args) {
        ReadAndWrite readAndWriteFile = new ReadAndWrite();
        readAndWriteFile.readFile("sourcefile");
        readAndWriteFile.writeFile("result.txt");


    }
}
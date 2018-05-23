package HomeWork08_01;

public class HW08_01 {
    public static void main(String[] args) {
        // files
        System.out.println("1) Read and write text file:");
        FileTextRead ftr = new FileTextRead();

        ftr.setPathToFile("D:\\test\\java\\WelcomeToMyWorld\\src\\HomeWork08_01");
        ftr.setFileName("test_for_read.txt");

        System.out.println("1) Read text file = " + ftr.getFullFileName());

        String[] myRF = ftr.ReadFile("D:\\test\\java\\WelcomeToMyWorld\\src\\HomeWork08_01", "test_for_read.txt");

        for (int i = 0; i < myRF.length; i++) {
            System.out.println(myRF[i]);
        }

        if ( ftr.WriteFile("D:\\test\\java\\WelcomeToMyWorld\\src\\HomeWork08_01", "test_for_write.txt", myRF, 25) == 0 )
        {
            System.out.println("Die Datei test_for_write.txt wurde erfolgreich aufgezeichnet!");
        }

    }
}

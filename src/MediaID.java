import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


/**
 *  Hver mediefil hos TV2 skal have et unikt ID, og denne klasse hjælper med at genrere unikke ID'er
 */
public class MediaID {

    /*Initializing a private static data field integer latestId with value 100
     *This data field is made static so that a constructor is not necessary to
     *access this private data field
     */
    private static int latestId = 100;

    //Creating a public static method called generate that returns an integer
    public static int generate() {

        //Creating a new File with path "media_id.txt"
        File file = new File("media_id.txt");

        // Låser filen op før adgang
        // file.setWritable(true);


        //exception handling//
        try {
            //If File file object got created
            if (file.exists()) {
                //Constructing a new FileReader object giving it value of file as argument (not getting used at this moment)
                FileReader fileReader = new FileReader(file);
                // Constructing a new Scanner object takes file as parameter
                Scanner scanner = new Scanner(file);
                //Assigning integer value returned by scanners next int method to variable latestId
                latestId = (int) scanner.nextInt();
            }

            //Increment latestId
            latestId++;

            //Constructing a new FileWriter object giving it a file as argument
            FileWriter fileWriter = new FileWriter(file);
            //Using fileWriters write-method to write value of latestId to media_id.txt
            fileWriter.write(Integer.toString(latestId));
            //Using fileWriters close-method to close "connection" between file and filewriter
            fileWriter.close();


            //Exception handling//
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Låser filen ned for at den ikke redigeres ved en fejl
        // file.setReadOnly();

        //Returns interger latestId
        return latestId;
    }

}
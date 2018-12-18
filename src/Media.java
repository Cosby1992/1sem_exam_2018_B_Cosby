import java.io.File;
import java.time.Instant;
import java.util.Date;


//Class name
public class Media {

    //Private data fields. Declaring (int assetId, String name, String filename)
    //Initializing Date created with value of new date();
    private int assetId;
    private String name;
    private Date created = new Date();
    private String fileName;

    //No-arg constructor
    public Media() {
        //Using generate method from MediaID class to generate new immutable assetId
        assetId = MediaID.generate();
        //Assigning Date.from(Instant.now()) to Date variable "created"
        created = Date.from(Instant.now());
    }

    //Getters and setters for all private data fields in class
    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(int assetId) {
        this.assetId = assetId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }



    //The toString method is already defined, therefore it's necessary to override this method
    //The toString method returns a String containing the values from the private data fields
    //This method has no parameters and therefore takes no arguments
    @Override
    public String toString() {
        return "Media{" +
                "assetId=" + assetId +
                ", name='" + name + '\'' +
                ", created=" + created +
                ", fileName='" + fileName + '\'' +
                '}';
    }
}
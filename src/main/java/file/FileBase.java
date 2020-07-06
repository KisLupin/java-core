package file;

import java.io.*;

public class FileBase {
    public void createAFile(){
        try {
            File myObj = new File("/Users/kislupin/Desktop/filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void readFile(){
        File file = new File("/Users/kislupin/Desktop/filename.txt");
        BufferedInputStream bis = null;
        FileInputStream fis= null;
        try
        {
            //FileInputStream to read the file
            fis = new FileInputStream(file);
            /*Passed the FileInputStream to BufferedInputStream
             *For Fast read using the buffer array.*/
            bis = new BufferedInputStream(fis);
            /*available() method of BufferedInputStream
             * returns 0 when there are no more bytes
             * present in the file to be read*/
            while( bis.available() > 0 ){
                System.out.print((char)bis.read());
            }
        }catch(FileNotFoundException fnfe)
        {
            System.out.println("The specified file not found" + fnfe);
        }
        catch(IOException ioe)
        {
            System.out.println("I/O Exception: " + ioe);
        }
        finally
        {
            try{
                if(bis != null && fis!=null)
                {
                    fis.close();
                    bis.close();
                }
            }catch(IOException ioe)
            {
                System.out.println("Error in InputStream close(): " + ioe);
            }
        }
    }

    public void writeFile(String s){
        FileOutputStream fos = null;
        File file = new File("/Users/kislupin/Desktop/filename.txt");
        try {
            //Specify the file path here
            fos = new FileOutputStream(file);
            /* This logic will check whether the file
             * exists or not. If the file is not found
             * at the specified location it would create
             * a new file*/
            if (!file.exists()) {
                file.createNewFile();
            }
            /*String content cannot be directly written into
             * a file. It needs to be converted into bytes
             */
            byte[] bytesArray = s.getBytes();

            fos.write(bytesArray);
            fos.flush();
            System.out.println("File Written Successfully");
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
        finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException ioe) {
                System.out.println("Error in closing the Stream");
            }
        }
    }

    public void writeFileWriter(String s){
        try{
            File file = new File("/Users/kislupin/Desktop/filename.txt");
            /* This logic is to create the file if the
             * file is not already present
             */
            if(!file.exists()){
                file.createNewFile();
            }
            //Here true is to append the content to file
            FileWriter fw = new FileWriter(file,true);
            //BufferedWriter writer give better performance
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(s);
            //Closing BufferedWriter Stream
            bw.close();
            System.out.println("Data successfully appended at the end of file");
        }catch(IOException ioe){
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }
    }

    public void writeFilePrinter(){
        try{
            File file = new File("/Users/kislupin/Desktop/filename.txt");
            if(!file.exists()){
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            //This will add a new line to the file content
            pw.println("");
            /* Below three statements would add three
             * mentioned Strings to the file in new lines.
             */
            pw.println("This is first line");
            pw.println("This is the second line");
            pw.println("This is third line");
            pw.close();
            System.out.println("Data successfully appended at the end of file");
        }catch(IOException ioe){
            System.out.println("Exception occurred:");
            ioe.printStackTrace();
        }
    }

    public void deleteFile(){
        try{
            //Specify the file name and path
            File file = new File("/Users/kislupin/Desktop/filename.txt");
            /*the delete() method returns true if the file is
             * deleted successfully else it returns false
             */
            if(file.delete()){
                System.out.println(file.getName() + " is deleted!");
            }else{
                System.out.println("Delete failed: File didn't delete");
            }
        }catch(Exception e){
            System.out.println("Exception occurred");
            e.printStackTrace();
        }
    }
}

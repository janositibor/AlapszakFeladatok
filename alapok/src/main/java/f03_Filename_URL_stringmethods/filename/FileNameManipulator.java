package f03_Filename_URL_stringmethods.filename;

import java.util.Scanner;

public class FileNameManipulator {
    public char findLastCharacter(String str){
        return str.charAt(str.length()-1);
    }
    public String findFileExtension(String fileName){
        String reversed=new StringBuilder(fileName).reverse().toString();
        int placeOfDot=reversed.indexOf(".");
        return fileName.substring(fileName.length()-placeOfDot);
    }
    public boolean identifyFilesByExtension(String ext,String fileName){
        return ext.equalsIgnoreCase(findFileExtension(fileName));
    }
    public boolean compareFilesByName(String searchedFileName, String actualFileName){
        return searchedFileName.equalsIgnoreCase(actualFileName);
    }
    public String changeExtensionToLowerCase(String fileName){
        String ext=findFileExtension(fileName);
        String newExt=ext.toLowerCase();
        //return fileName.replace("."+ext,"."+newExt);
        return replaceStringPart(fileName,"."+newExt,"."+ext);
    }
    public String replaceStringPart(String fileName, String present, String target){
        return fileName.replace(target,present);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileNameManipulator fileNameManipulator=new FileNameManipulator();
        System.out.println("Type in a filename:");
        String fileName=scanner.nextLine();
        System.out.println("The last character is: "+fileNameManipulator.findLastCharacter(fileName));
        System.out.println("The extension is: "+fileNameManipulator.findFileExtension(fileName));

        System.out.println();
        System.out.println("Type in an extension:");
        String ext=scanner.nextLine();
        String valasz=fileNameManipulator.identifyFilesByExtension(ext, fileName)?fileName+" is an "+ext+" file.":fileName+" is NOT an "+ext+" file.";
        System.out.println(valasz);

        System.out.println();
        System.out.println("Type in another filename:");
        String anotherFileName=scanner.nextLine();
        valasz=fileNameManipulator.compareFilesByName(anotherFileName, fileName)?fileName+" and "+anotherFileName+" are equal.":fileName+" and "+anotherFileName+" are NOT equal.";
        System.out.println(valasz);

        System.out.println();
        System.out.println("Filename with lowercase extension: "+fileNameManipulator.changeExtensionToLowerCase(fileName));

    }
}

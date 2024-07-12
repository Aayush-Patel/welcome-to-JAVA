package Chapter9;
import java.util.Scanner;





import java.io.File;

public class path { public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Get the user's home directory
    String userHome = System.getProperty("user.home");
    // Specify the path to the desktop
    String desktopPath = userHome + File.separator + "Desktop";

    System.out.print("Enter the name of the folder to be displayed: ");
    String folderName = scanner.nextLine();

    File folder = new File(desktopPath, folderName);

    if (folder.exists() && folder.isDirectory()) {
        File[] entries = folder.listFiles();
        int numEntries = entries != null ? entries.length : 0;

        System.out.println("Folder found on the desktop:");
        System.out.println("Folder Path: " + folder.getAbsolutePath());
        System.out.println("Total number of entries in the folder: " + numEntries);
    } else {
        System.out.println("The specified folder does not exist on the desktop.");
    }

    scanner.close();
}
}

	
package pl.michalm.io.file;

import pl.michalm.data.Library;

public interface FileManager {
    Library importData();
    void exportData(Library library);
}
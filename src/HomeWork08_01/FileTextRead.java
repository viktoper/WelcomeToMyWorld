package HomeWork08_01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileTextRead {
    private String pathToFile;
    private String FileName;

    public void setPathToFile(String pf) {
        this.pathToFile = pf;
    }

    public void setFileName(String fn) {
        this.FileName = fn;
    }

    public String getFullFileName() {
        return this.pathToFile + "\\" + this.FileName;
    }

    public String[] ReadFile(String p, String f) {

        List<String> data = new ArrayList<String>();
        String fn = p + "\\" + f;
        String sLine;

        try {
            FileReader fr = new FileReader(fn);
            try {
                BufferedReader br = new BufferedReader(fr);
                while ((sLine = br.readLine()) != null) {
                    data.add(sLine);
                }
            } finally {
                fr.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        String[] sFile = data.toArray(new String[]{});
        return sFile;
    }

    public int WriteFile(String p, String f, String[] sBuff, int ln) {
        String fn = p + "\\" + f;
        String sLine;

        try {
            FileWriter fw = new FileWriter(fn);
            try {
                BufferedWriter bw = new BufferedWriter(fw);
                int iLine = 0;
                while (iLine < sBuff.length) {
                    if (sBuff[iLine].length() <= ln) {
                        bw.write(sBuff[iLine]);
                        bw.newLine();
                    }
                    iLine++;
                }
                bw.flush();
            } finally {
                fw.close();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
            return 1;
        }

        return 0;
    }

}

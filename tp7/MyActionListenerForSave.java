import java.awt.event.*;
import java.awt.*;
import java.io.*;

public class MyActionListenerForSave implements ActionListener{
    MyFrameAWT f;
    public MyActionListenerForSave(MyFrameAWT f)
    {
        this.f=f;
    }
    public void actionPerformed(ActionEvent e){
        FileDialog fd = new FileDialog(f,"Save",FileDialog.SAVE);
        fd.setVisible(true);
        String nomFichier = fd.getFile();
     String repFichier = fd.getDirectory();
     String nomComplet = repFichier + nomFichier;
     
     File file = new File(nomComplet);
     int size;
     size = (int) file.length();
     try
      {
        FileOutputStream os = new FileOutputStream(file);
        byte data[] = new byte[size];
        String s1=f.ta.getText();
        data=s1.getBytes();
        os.write(data);
        os.close();

      } 
      catch(FileNotFoundException e2){System.out.println(e2);}
      catch(IOException e3){System.out.println(e3);}
  
    }
    
}

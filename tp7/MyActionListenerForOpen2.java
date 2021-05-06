import java.awt.event.*;
import java.awt.*;
import java.io.*;

public class MyActionListenerForOpen2 implements ActionListener
{
  MyFrameAWT f;
  public MyActionListenerForOpen2(MyFrameAWT f)
  {
    this.f=f;
  }
  public void actionPerformed(ActionEvent e)
  {
    System.out.println("Bouton Open actionné");
     FileDialog fd = new FileDialog(f);
     fd.setVisible(true);
     String nomFichier = fd.getFile();
     if(!(nomFichier.endsWith(".ser"))){
        f.ta.setText("le fihier doit etre un objet!!!!");
     }
     else{
     String repFichier = fd.getDirectory();
     String nomComplet = repFichier + nomFichier;
     System.out.println("Nom Fichier : " + nomFichier);
     System.out.println("Répertoire Fichier : " + repFichier);
     System.out.println("Nom complet du Fichier : " +nomComplet);
     File file = new File(nomComplet);
     int size;
     size = (int) file.length();
     System.out.println("Taille du Fichier : " + size);
     try
      {

        FileInputStream in = new FileInputStream(file);
        ObjectInputStream ois =new ObjectInputStream (in);
        Compte compte = (Compte) ois.readObject();
        
        f.ta.setText("Root:");
        f.ta.append(compte.getroot());
        f.ta.append("Username:");
        f.ta.append(compte.getusername());
        f.ta.append("Login:");
        f.ta.append(compte.getlogin());
      } 
      catch(FileNotFoundException e2){System.out.println(e2);}
      catch(IOException e3){System.out.println(e3);} catch (ClassNotFoundException e1) {
        // TODO Auto-generated catch block
        e1.printStackTrace();
      }
  }
}
}
      
   
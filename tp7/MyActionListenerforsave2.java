import java.awt.event.*;
import java.awt.*;
import java.io.*;
import java.util.*; 

public class MyActionListenerforsave2 implements ActionListener {
    MyFrameAWT f;
    ArrayList<Compte > a ;
    public MyActionListenerforsave2(MyFrameAWT f,ArrayList<Compte > a )
    {
        this.f=f;
        this.a=a;
    }
    public void actionPerformed(ActionEvent e){
     try
      {
        String txt=f.ta.getText();
        String line[]=txt.split("\\n");
        Compte c1=new Compte(line[0],line[1],line[2]);
        a.add(c1);
        int i=0;
        FileOutputStream os = new FileOutputStream("Compte.ser");
        ObjectOutputStream oos=new ObjectOutputStream(os);
         oos.writeObject(a.get(i));
         os.close();
         i++;
         f.ta.setText("object saved!!!");
      } 
      catch(FileNotFoundException e2){System.out.println(e2);}
      catch(IOException e3){System.out.println(e3);}
    }
}

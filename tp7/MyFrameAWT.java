
import java.awt.*;
import java.util.*;
public class MyFrameAWT extends Frame{
   Panel pEast = new Panel();
   Button bNew = new Button("New");
   Button bOpen = new Button("Open text");
   Button bSave = new Button("Save txt");
   Button bQuit = new Button("Exit");
   Button bOpen2= new Button("Open objet");
   Button bSave2 = new Button("Saveobject");
   Panel pWest = new Panel();
   TextArea ta = new TextArea(20,35);
   //********** */
   ArrayList<Compte > a = new ArrayList<Compte >();
   MyWindowListener x1 = new MyWindowListener();
   MyActionListenerForOpen x2 = new MyActionListenerForOpen (this);
   MyActionListenerForNew x3 = new MyActionListenerForNew (this);
   MyActionListenerForSave x4 = new MyActionListenerForSave (this);
   MyActionListenerForExit x5 = new MyActionListenerForExit ();
   MyActionListenerforsave2 x6 = new MyActionListenerforsave2 (this,a);
   MyActionListenerForOpen2 x7 = new MyActionListenerForOpen2 (this);
   
 MyFrameAWT () {
    pEast.setLayout(new GridLayout(6,1));
    pEast.add(bNew);
    pEast.add(bOpen);
    pEast.add(bOpen2);
    pEast.add(bSave);
    pEast.add(bSave2);
    pEast.add(bQuit);
    pWest.setBackground(Color.blue);
    pWest.add(ta);
    this.setLayout(new GridLayout(1,2));
    this.add(pEast);
    this.add(pWest);
    this.setBounds(10,10,600,400);
    this.setVisible(true);
    this.addWindowListener(x1);
    bOpen.addActionListener(x2);
    bNew.addActionListener(x3);
    bSave.addActionListener(x4);
    bQuit.addActionListener(x5);
    bSave2.addActionListener(x6);
    bOpen2.addActionListener(x7);
    }
} 

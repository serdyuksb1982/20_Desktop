import javax.swing.*;

public class MyGUI {


    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater ( new Runnable () {
            @Override
            public void run() {
                JFrame jFrame = new JFrame ();
                jFrame.setSize ( 600, 500 );

                jFrame.add ( new MyGUIForm ().getMyGUIForm() );

                jFrame.setDefaultCloseOperation ( WindowConstants.EXIT_ON_CLOSE );
                jFrame.setLocationRelativeTo(null);
                jFrame.setVisible(true);
            }
        } );

    }

}

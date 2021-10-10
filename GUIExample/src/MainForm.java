import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeListener;

public class MainForm
{
    private JPanel mainPanel;
    private JTextArea textArea;
    private JButton countButton;
    private JButton clearButton;
    private JPanel a;

    public MainForm() {
        clearButton.addActionListener ( new Action () {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                textArea.setText ( "" );
            }
        } );
        countButton.addActionListener ( new Action () {
            @Override
            public Object getValue(String key) {
                return null;
            }

            @Override
            public void putValue(String key, Object value) {

            }

            @Override
            public void setEnabled(boolean b) {

            }

            @Override
            public boolean isEnabled() {
                return false;
            }

            @Override
            public void addPropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void removePropertyChangeListener(PropertyChangeListener listener) {

            }

            @Override
            public void actionPerformed(ActionEvent e) {
                String text = textArea.getText ();
                int length = text.length ();
                int preLastDigit = length % 100 / 10;

                if (preLastDigit == 1) {
                    JOptionPane.showMessageDialog (
                            mainPanel,
                            length + " символов",
                            "Длина текста",
                            JOptionPane.PLAIN_MESSAGE
                    );

                } else {
                    switch (length % 10) {
                        case 1 -> JOptionPane.showMessageDialog (
                                mainPanel,
                                length + " символ",
                                "Длина текста",
                                JOptionPane.PLAIN_MESSAGE
                        );
                        case 2, 3, 4 -> JOptionPane.showMessageDialog (
                                mainPanel,
                                length + " символа",
                                "Длина текста",
                                JOptionPane.PLAIN_MESSAGE
                        );

                        default -> JOptionPane.showMessageDialog (
                                mainPanel,
                                length + " символов",
                                "Длина текста",
                                JOptionPane.PLAIN_MESSAGE
                        );

                    }
                }

            }
        } );
        textArea.addMouseListener ( new MouseListener () {
            @Override
            public void mouseClicked(MouseEvent e) {
                textArea.setBackground ( Color.GREEN );
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                textArea.setBackground ( Color.WHITE );
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        } );
        textArea.addKeyListener ( new KeyListener () {
            @Override
            public void keyTyped(KeyEvent e) {
                if(e.getKeyChar () == '6') {
                    textArea.setText (  " лошади "  + textArea.getText ());
                }
            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        } );
    }
    public JPanel getMainPanel() {
        return mainPanel;
    }


}

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JLabel;
import javax.swing.JButton;

class BtnNumHandler implements MouseListener {

    private JButton passedBtn;
    private JLabel resultLabel;

    public BtnNumHandler(JButton passedBtn, JLabel resultLabel) {
        this.passedBtn = passedBtn;
        this.resultLabel = resultLabel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Create a custom buttom pressed effect

        String lbl = resultLabel.getText();
        if (passedBtn.getText().equals("=")) {

        } else if (passedBtn.getText().equals("+")) {
            if (lbl.length() != 0) {
                if (lbl.charAt(lbl.length()-1) != '+') {
                    putCharacter(lbl);
                }
            }
        } else if (passedBtn.getText().equals("-")) {
            if (lbl.length() != 0) {
                if (lbl.charAt(lbl.length()-1) != '-') {
                    putCharacter(lbl);
                }
            }
        } else if (passedBtn.getText().equals("*")) {
            if (lbl.length() != 0) {
                if (lbl.charAt(lbl.length()-1) != '*') {
                    putCharacter(lbl);
                }
            }
        } else if (passedBtn.getText().equals("/")) {
            if (lbl.length() != 0) {
                if (lbl.charAt(lbl.length()-1) != '/') {
                    putCharacter(lbl);
                }
            }
        } else {
            putCharacter(lbl);
        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Set button back to original color
        this.passedBtn.setBackground(Color.DARK_GRAY);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    public void putCharacter(String lbl) {
        if (passedBtn.getText().equals(".")) {
            boolean dot = false;
            for (int x = 0; x < lbl.length(); x++) {
                if (lbl.charAt(x) == '.') {
                    dot = true;
                }

                if (dot) {
                    break;
                }
            }

            if (!dot) {
                lbl += this.passedBtn.getText();
                this.resultLabel.setText(lbl);
            }

        } else {
            lbl += this.passedBtn.getText();

            this.resultLabel.setText(lbl);
        }
    }

}

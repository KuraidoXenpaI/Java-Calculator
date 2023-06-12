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
            evaluateResult(lbl);
        } else if (passedBtn.getText().equals("+")) {
            if (!checkSymbols(lbl)) {
                putCharacter(lbl);
            }
        } else if (passedBtn.getText().equals("-")) {
            if (!checkSymbols(lbl)) {
                putCharacter(lbl);
            }
        } else if (passedBtn.getText().equals("*")) {
            if (!checkSymbols(lbl)) {
                putCharacter(lbl);
            }
        } else if (passedBtn.getText().equals("/")) {
            if (!checkSymbols(lbl)) {
                putCharacter(lbl);
            }
        } else {
            putCharacter(lbl);
        }

    }

    private void evaluateResult(String lbl) {
        
        boolean symbolCheck = false;
        for (int i = 0; i < lbl.length(); i++) {
            if (lbl.charAt(i) == '+' || lbl.charAt(i) == '-' || lbl.charAt(i) == '*' || lbl.charAt(i) == '/') {
                symbolCheck = true;
                break;
            }
        }

        if (symbolCheck) {
            String s1 = "";
            String s2 = "";
            char sym = ' ';
            int stop = 1;

            for (int i = 0; i < lbl.length(); i++) {
                char c = lbl.charAt(i);
                if (c == '+' || c == '-' || c == '*' || c == '/') {
                    stop += i;
                    sym = c;
                    break;
                    
                } else {
                    s1 += c;
                }
            }

            for (; stop < lbl.length(); stop++) {
                s2 += lbl.charAt(stop);
            }


            if (sym == '+') {
                resultLabel.setText(Double.toString(Double.parseDouble(s1) + Double.parseDouble(s2)));
            } else if (sym == '-') {
                resultLabel.setText(Double.toString(Double.parseDouble(s1) - Double.parseDouble(s2)));
            } else if (sym == '*') {
                resultLabel.setText(Double.toString(Double.parseDouble(s1) * Double.parseDouble(s2)));
            } else if (sym == '/') {
                resultLabel.setText(Double.toString(Double.parseDouble(s1) / Double.parseDouble(s2)));
            }
        } else {
            resultLabel.setText("");
        }

    }

    private boolean checkSymbols(String lbl) {
        boolean symbol = false; 
        for (int x = 0; x < lbl.length(); x++) {
            if (lbl.charAt(x) == '+' || lbl.charAt(x) == '-' || lbl.charAt(x) == '/' || lbl.charAt(x) == '*') {
                symbol = true;
                
            }
        }

        return symbol;
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
            int point = 0;
            for (int i = 0; i < lbl.length(); i++) {

                if (lbl.charAt(i) == '.') {
                    point++;
                }

                if (lbl.charAt(i) == '+' || lbl.charAt(i) == '-' || lbl.charAt(i) == '*' || lbl.charAt(i) == '/') {
                    point--;
                    
                }
            }

            if (point != 1) {
                lbl += this.passedBtn.getText();
                this.resultLabel.setText(lbl);
            }

        } else {
            lbl += this.passedBtn.getText();
            this.resultLabel.setText(lbl);
        }
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.ImageIcon;
import model.HangMan;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;

/**
 *
 * @author Alejandro Martínez Domínguez
 */
public class MainWindow extends javax.swing.JFrame {

    private HangMan hangMan;

    private JLabel hangManLabels[];

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        hangManLabels = new JLabel[hangMan.MAX_FAILS];

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        defaultPanel = new javax.swing.JPanel();
        newGameButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        wordTitle = new javax.swing.JLabel();
        failedText = new javax.swing.JLabel();
        letterText = new javax.swing.JLabel();
        introducedLetter = new javax.swing.JTextField();
        hangmanImage = new javax.swing.JLabel();
        tryLetterButton = new javax.swing.JButton();
        wordField = new javax.swing.JLabel();
        failedLetters = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("O aforcado");

        newGameButton.setText("Nova partida");
        newGameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Saír");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        title.setText("O xogo do aforcado");

        wordTitle.setText("Palabra a adiviñar:");

        failedText.setText("Letras falladas:");

        letterText.setText("Introduce unha letra:");

        introducedLetter.setEnabled(false);
        introducedLetter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                introducedLetterKeyPressed(evt);
            }
        });

        hangmanImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Hangman-0.png"))); // NOI18N

        tryLetterButton.setText("Probar");
        tryLetterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tryLetterButtonMouseClicked(evt);
            }
        });

        wordField.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N

        failedLetters.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N

        javax.swing.GroupLayout defaultPanelLayout = new javax.swing.GroupLayout(defaultPanel);
        defaultPanel.setLayout(defaultPanelLayout);
        defaultPanelLayout.setHorizontalGroup(
            defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(defaultPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(letterText)
                    .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(failedText)
                        .addComponent(wordTitle)))
                .addGap(1, 1, 1)
                .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(defaultPanelLayout.createSequentialGroup()
                        .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(defaultPanelLayout.createSequentialGroup()
                                .addComponent(introducedLetter, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tryLetterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(defaultPanelLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(failedLetters, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(wordField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(hangmanImage))
                    .addComponent(title)
                    .addGroup(defaultPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(newGameButton)
                        .addGap(30, 30, 30)
                        .addComponent(exitButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        defaultPanelLayout.setVerticalGroup(
            defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, defaultPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(defaultPanelLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(wordTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(wordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(failedText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(failedLetters, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(letterText)
                            .addComponent(introducedLetter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tryLetterButton)))
                    .addGroup(defaultPanelLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(hangmanImage, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(defaultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newGameButton)
                    .addComponent(exitButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(defaultPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(defaultPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_exitButtonActionPerformed

    private void newGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameButtonActionPerformed

        startNewGame(); // Comeza o xogo

        introducedLetter.enable(); // Habilita o cadro para introducir letras

    }//GEN-LAST:event_newGameButtonActionPerformed

    private void introducedLetterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_introducedLetterKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tryChar();
        }
    }//GEN-LAST:event_introducedLetterKeyPressed

    private void tryLetterButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tryLetterButtonMouseClicked
        tryChar();
    }//GEN-LAST:event_tryLetterButtonMouseClicked

    /**
     * Comeza unha nova partida, escollendo un modo de xogo e mostrando o estado
     * inicial.
     */
    private void startNewGame() {

        String[] options = {"Un xogador, xerando a palabra ao azar", "Dous xogadores, escribindo unha palabra personalizada"};

        Object game = JOptionPane.showInputDialog(this, "Selecciona un modo de xogo:", "Elegir", JOptionPane.QUESTION_MESSAGE, null, options, null);

        String word = "";

        try {
            if (options[0].equals(game)) {

                ArrayWordGenerator randomWord = new ArrayWordGenerator();

                word = randomWord.generateWord();

            } else if (options[1].equals(game)) {

                GUIKeyboardWordGenerator keyboardWord = new GUIKeyboardWordGenerator();

                word = keyboardWord.generateWord();
            }
            
            hangmanImage.setIcon(new ImageIcon("src/img/Hangman-0.png"));

            hangMan = new HangMan(word);

            wordField.setText(hangMan.showHiddenWord());

        } catch (GenerateWordException e) {
            System.out.println("ERROR");
        }

    }

    /**
     * Mostra o estado da partida co estado da palabra oculta, letras falladas e
     * estado do aforcado
     */
    private void showGameStatus() {

        failedLetters.setText(hangMan.getStringFails());

        wordField.setText(hangMan.showHiddenWord());

        introducedLetter.setText("");

        switch (hangMan.getFails().size()) {
            case 1:
                hangmanImage.setIcon(new ImageIcon("src/img/Hangman-1.png"));
                break;
            case 2:
                hangmanImage.setIcon(new ImageIcon("src/img/Hangman-2.png"));
                break;
            case 3:
                hangmanImage.setIcon(new ImageIcon("src/img/Hangman-3.png"));
                break;
            case 4:
                hangmanImage.setIcon(new ImageIcon("src/img/Hangman-4.png"));
                break;
            case 5:
                hangmanImage.setIcon(new ImageIcon("src/img/Hangman-5.png"));
                break;
            case 6:
                hangmanImage.setIcon(new ImageIcon("src/img/Hangman-6.png"));
                break;
        }

        if (hangMan.isGameOver()) {
            hangmanImage.setIcon(new ImageIcon("src/img/Hangman-6.png"));
            JOptionPane.showMessageDialog(rootPane, "Fin do xogo. Quedaches aforcado!! A palabra oculta era " + hangMan.showFullWord(), "Game Over", HEIGHT);
            wordField.setText("");
            failedLetters.setText("");
        }

    }

    /**
     * Proba se o caracter introducido na caixa de texto está na palabra oculta
     * e mostra o novo estado do xogo
     */
    private void tryChar() {

        if (!hangMan.isGameOver()) {

            char letter[] = introducedLetter.getText().toCharArray();

            char firstLetter = Character.toLowerCase(letter[0]);

            if((firstLetter>='a' && firstLetter<='z')){
                hangMan.tryChar(firstLetter);
                showGameStatus();
            }else{
                JOptionPane.showMessageDialog(rootPane, "El caracter debe ser del abecedario (a-z).", "Error", HEIGHT);
                System.out.println("LO ISISTE MAL IJO");
            }

            System.out.println("DEBUG!!! LETRA INTRODUCIDA: " + firstLetter);

        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel defaultPanel;
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel failedLetters;
    private javax.swing.JLabel failedText;
    private javax.swing.JLabel hangmanImage;
    private javax.swing.JTextField introducedLetter;
    private javax.swing.JLabel letterText;
    private javax.swing.JButton newGameButton;
    private javax.swing.JLabel title;
    private javax.swing.JButton tryLetterButton;
    private javax.swing.JLabel wordField;
    private javax.swing.JLabel wordTitle;
    // End of variables declaration//GEN-END:variables
}

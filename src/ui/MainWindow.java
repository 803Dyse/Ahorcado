/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ui;

import javax.swing.ImageIcon;
import model.HangMan;
import javax.swing.JOptionPane;
import java.awt.event.KeyEvent;

/**
 * Clase JFrame que actua como interfaz do xogo do aforcado
 *
 * @author Alejandro Martínez Domínguez, Bilo Alejandro Martins González y Raúl
 * Parada de la Fuente
 */
public class MainWindow extends javax.swing.JFrame {

    private HangMan hangMan;

    /**
     * Constructor da clase
     *
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        picturePanel = new javax.swing.JPanel();
        hangmanImage = new javax.swing.JLabel();
        titlePanel = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        gamePanel = new javax.swing.JPanel();
        tryLetterButton = new javax.swing.JButton();
        wordField = new javax.swing.JLabel();
        failedLetters = new javax.swing.JLabel();
        wordTitle = new javax.swing.JLabel();
        failedText = new javax.swing.JLabel();
        letterText = new javax.swing.JLabel();
        introducedLetter = new javax.swing.JTextField();
        playPanel = new javax.swing.JPanel();
        newGameButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("O aforcado");

        hangmanImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Hangman-0.png"))); // NOI18N

        javax.swing.GroupLayout picturePanelLayout = new javax.swing.GroupLayout(picturePanel);
        picturePanel.setLayout(picturePanelLayout);
        picturePanelLayout.setHorizontalGroup(
            picturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, picturePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(hangmanImage, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addContainerGap())
        );
        picturePanelLayout.setVerticalGroup(
            picturePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, picturePanelLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(hangmanImage, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        title.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        title.setText("O xogo do aforcado");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title)
                .addContainerGap())
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(title)
                .addContainerGap())
        );

        tryLetterButton.setText("Probar");
        tryLetterButton.setEnabled(false);
        tryLetterButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tryLetterButtonMouseClicked(evt);
            }
        });

        wordField.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N

        failedLetters.setFont(new java.awt.Font("Dialog", 1, 11)); // NOI18N

        wordTitle.setText("Palabra a adiviñar:");

        failedText.setText("Letras falladas:");

        letterText.setText("Introduce unha letra:");

        introducedLetter.setEnabled(false);
        introducedLetter.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                introducedLetterKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout gamePanelLayout = new javax.swing.GroupLayout(gamePanel);
        gamePanel.setLayout(gamePanelLayout);
        gamePanelLayout.setHorizontalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(gamePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(wordTitle)
                    .addComponent(failedText))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wordField, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(failedLetters, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(gamePanelLayout.createSequentialGroup()
                        .addComponent(introducedLetter, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tryLetterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 80, Short.MAX_VALUE))
            .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(gamePanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(letterText)
                    .addContainerGap(215, Short.MAX_VALUE)))
        );
        gamePanelLayout.setVerticalGroup(
            gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, gamePanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(wordField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(wordTitle, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(10, 10, 10)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(failedText)
                    .addComponent(failedLetters, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(introducedLetter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tryLetterButton))
                .addGap(28, 28, 28))
            .addGroup(gamePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(gamePanelLayout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(letterText)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

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

        javax.swing.GroupLayout playPanelLayout = new javax.swing.GroupLayout(playPanel);
        playPanel.setLayout(playPanelLayout);
        playPanelLayout.setHorizontalGroup(
            playPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(playPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newGameButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addContainerGap())
        );
        playPanelLayout.setVerticalGroup(
            playPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, playPanelLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(playPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newGameButton)
                    .addComponent(exitButton))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(gamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(picturePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(playPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(gamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(picturePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(playPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tryLetterButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tryLetterButtonMouseClicked
        // TryCatch vacío porque al pulsar el botón de try mientras está deshabilitado
        // salta un error
        try {
            tryChar(); // Chama a tryChar ao facer click sobre "Probar"
        } catch (NullPointerException e) {
        }
    }//GEN-LAST:event_tryLetterButtonMouseClicked

    private void introducedLetterKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_introducedLetterKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) { // Pulsando enter chama a tryChar
            tryChar();
        }
    }//GEN-LAST:event_introducedLetterKeyPressed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        this.dispose(); // Cerra a ventá
    }//GEN-LAST:event_exitButtonActionPerformed

    private void newGameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameButtonActionPerformed
        startNewGame(); // Comeza o xogo
    }//GEN-LAST:event_newGameButtonActionPerformed

    /**
     * Comeza unha nova partida, escollendo un modo de xogo e mostrando o estado
     * inicial.
     */
    private void startNewGame() {

        String[] options = {"Un xogador, xerando a palabra ao azar", "Dous xogadores, escribindo unha palabra personalizada"};

        Object game = JOptionPane.showInputDialog(this, "Selecciona un modo de xogo:", "Elegir", JOptionPane.QUESTION_MESSAGE, null, options, null);

        String word;

        try {
            WordGenerator wordGen;

            if (options[0].equals(game)) { // Se se escolle a primeira opción...

                wordGen = new ArrayWordGenerator();

            } else { // Se se escolle a segunda opción...

                wordGen = new GUIKeyboardWordGenerator();
            }

            word = wordGen.generateWord();

            introducedLetter.setEnabled(true); // Habilita o cadro para introducir letras

            tryLetterButton.setEnabled(true); // Habilita o botón de probar letra

            // A ruta comeza en / é necesario
            hangmanImage.setIcon(new ImageIcon(getClass().getResource("/img/Hangman-0.png"))); // Se setea a primera foto de hangMan por defecto

            hangMan = new HangMan(word);

            wordField.setText(hangMan.showHiddenWord());

        } catch (GenerateWordException e) {
            e.setVisible(true);
        }

    }

    /**
     * Mostra o estado da partida co estado da palabra oculta, letras falladas e
     * estado do aforcado
     */
    private void showGameStatus() {

        wordField.setText(hangMan.showHiddenWord());

        introducedLetter.setText("");

        String savedLetters = "";

        for (int i = 0; i < hangMan.getFails().size(); i++) {
            
            savedLetters += hangMan.getFails().get(i).toString();

            failedLetters.setText(savedLetters += " ");

            // A ruta comeza en / é necesario
            hangmanImage.setIcon(new ImageIcon(getClass().getResource("/img/Hangman-" + i + ".png")));

            if (hangMan.isGameOver()) {

                // A ruta comeza en / é necesario
                hangmanImage.setIcon(new ImageIcon(getClass().getResource("/img/Hangman-6.png")));

                JOptionPane.showMessageDialog(rootPane, "Fin do xogo. Quedaches aforcado!! A palabra oculta era " + hangMan.showFullWord(), "Game Over", JOptionPane.WARNING_MESSAGE);

                wordField.setText("");

                failedLetters.setText("");

                introducedLetter.setEnabled(false); // Deshabilita o cadro para introducir letras

                tryLetterButton.setEnabled(false); // Deshabilita o botón de probar letra

            }

        }
    }

    /**
     * Proba se o caracter introducido na caixa de texto está na palabra oculta
     * e mostra o novo estado do xogo
     */
    private void tryChar() {

        if (!hangMan.isGameOver()) {

            char letter[] = introducedLetter.getText().toCharArray();

            // Comproba se hai algún valor no cadro de texto de introducedLetter
            // Se non hai algún valor indica que está en branco
            if (!introducedLetter.getText().equals("")) {

                char firstLetter = Character.toLowerCase(letter[0]);

                if ((firstLetter >= 'a' && firstLetter <= 'z')) {
                    hangMan.tryChar(firstLetter);
                    showGameStatus();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "El caracter debe ser do abecedario (a-z)", "Error", JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Non hai ningun caracter no cadro do texto", "Error", JOptionPane.WARNING_MESSAGE);
            }
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
    private javax.swing.JButton exitButton;
    private javax.swing.JLabel failedLetters;
    private javax.swing.JLabel failedText;
    private javax.swing.JPanel gamePanel;
    private javax.swing.JLabel hangmanImage;
    private javax.swing.JTextField introducedLetter;
    private javax.swing.JLabel letterText;
    private javax.swing.JButton newGameButton;
    private javax.swing.JPanel picturePanel;
    private javax.swing.JPanel playPanel;
    private javax.swing.JLabel title;
    private javax.swing.JPanel titlePanel;
    private javax.swing.JButton tryLetterButton;
    private javax.swing.JLabel wordField;
    private javax.swing.JLabel wordTitle;
    // End of variables declaration//GEN-END:variables
}

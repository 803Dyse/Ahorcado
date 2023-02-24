//package ui;
//
//import model.HangMan;
//import java.util.Scanner;
//
///**
// *
// * Esta clase encárgase de mostrar os menús coas distintas opcións do xogo, e
// * recoller o que introduza o usuario
// *
// * @author Alejandro Martínez Domínguez, Bilo Alejandro Martins González y Raúl
// * Parada de la Fuente
// */
//public class MenuGenerator {
//
//    /**
//     * Obxecto da clase HangMan que xestiona o funcionamento da partida actual
//     */
//    HangMan hangMan;
//
//    /**
//     * Este método mostra por pantalla o menú principal e chama ao método
//     * generateWord da súa respectiva clase para xerar unha palabra "aleatoria",
//     * ou definila manualmente
//     */
//    private String showInitMenu() throws GenerateWordException {
//        System.out.println("Selecciona o modo de xogo:");
//        System.out.println("1. Palabra aleatoria. \t 2. Palabra personalizada.");
//        Scanner scan = new Scanner(System.in);
//        int select = scan.nextInt();
//        switch (select) {
//            case 1:
//                ArrayWordGenerator randomWord = new ArrayWordGenerator();
//                return randomWord.generateWord();
//            case 2:
//                KeyboardWordGenerator keyboardWord = new KeyboardWordGenerator();
//                return keyboardWord.generateWord();
//        }
//        return null;
//    }
//
//    /**
//     * Este método implementa o status do xogo, os fallos, acertos e tamén
//     * permite unha cantidade limitada de fallos mentras pide as letras
//     */
//    private void showGameMenu() {
//        System.out.println("Bienvenido ao xogo do ahorcado");
//        Scanner scan = new Scanner(System.in);
//        while (!hangMan.isGameOver()) {
//            System.out.println("Tes 6 intentos para adivinar a palabra");
//            System.out.println("Introduce unha letra e intenta adivinar a palabra:");
//            char letter = scan.nextLine().toLowerCase().charAt(0);
//            hangMan.tryChar(letter);
//            System.out.println("Estos son os fallos: " + hangMan.getStringFails());
//            System.out.println(hangMan.showHiddenWord());
//        }
//        System.out.println("A solucion e: " + hangMan.showFullWord());
//    }
//
//    /**
//     * Este método pregunta ao usuario se quere seguir xogando o non
//     */
//    private boolean showExitMenu() {
//        System.out.println("Queres seguir xogando?");
//        System.out.println("s -> CONTINUAR ");
//        System.out.println("n -> SALIR");
//        Scanner sc = new Scanner(System.in);
//        char userOption = sc.nextLine().toLowerCase().charAt(0);
//        if (userOption != 's') {
//            System.out.println("Moitas grazas por xogar ao ahorcado :)");
//            return true;
//        }
//        return false;
//    }
//
//    /**
//     * Este é o metodo main
//     *
//     * @param args the command line arguments
//     * @throws ui.GenerateWordException Cando a palabra non se pode obter
//     */
//    public static void main(String[] args) throws GenerateWordException {
//
//        try {
//            MenuGenerator menuGenerator = new MenuGenerator();
//            do {
//
//                menuGenerator.hangMan = new HangMan(menuGenerator.showInitMenu());
//                menuGenerator.showGameMenu();
//            } while (!menuGenerator.showExitMenu());
//        } catch (GenerateWordException e) {
//            if (e.isVisible()) {
//                System.out.println("Error");
//            }
//        }
//
//    }
//
//}

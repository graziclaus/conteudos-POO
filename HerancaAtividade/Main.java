package Atividades.HerancaAtividade;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final String RESET = "\u001B[0m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARELO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String VERMELHO = "\u001B[31m";
    public static final String CIANO = "\u001B[36m";
    public static final String BRANCO = "\u001B[37m";


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int opcao = 0;

        System.out.println(CIANO + "🌍 Bem-vindo(a) ao Minecraft Simplificado! 🌍" + RESET);
        System.out.println(AMARELO + "Escolha o modo de jogo:" + RESET);
        System.out.println("1 - Sobrevivência");
        System.out.println("2 - Criativo");
        int modoEscolhido = scanner.nextInt();
        String modo;

        if (modoEscolhido == 2) {

            modo = "criativo";

        } else {

            modo = "survival";

        }

        Jogador jogador = new Jogador("Steve", 20, 2, 1, 0, modo);

        System.out.println("\nDeseja equipar armadura de ferro e uma ferramenta básica? (s/n)");
        String escolhaEquipar = scanner.next();

        if (escolhaEquipar.equalsIgnoreCase("s")) {

            jogador.equiparArmadura(new Armadura("Armadura de ferro", 1, 15,250));

            jogador.equiparFerramenta(new Ferramenta("Espada de Ferro", 1, 6, 60));

            System.out.println("\nVocê está pronto para começar!");

        } else {

            System.out.println("\nVocê não equipou nada. Boa sorte!");

        }

        System.out.println(VERDE + "Você escolheu o modo: " + modo + RESET);

        while (opcao != 7) {

            System.out.println("\n" + AZUL + "===============================" + RESET);
            System.out.println(AZUL + "🌿 Menu do Jogador - " + jogador.getNome() + RESET);
            System.out.println(AZUL + "===============================" + RESET);

            System.out.println(VERDE + "1 - Farmar ⛏️" + RESET);
            System.out.println(AMARELO + "2 - Plantar 🌱" + RESET);
            System.out.println(VERDE + "3 - Construir uma casa 🏠" + RESET);
            System.out.println(VERMELHO + "4 - Explorar/Derrotar mobs ⚔️" + RESET);
            System.out.println(CIANO + "5 - Dormir 😴" + RESET);
            System.out.println(BRANCO + "6 - Abrir inventário 🎒" + RESET);
            System.out.println(BRANCO + "7 - Sair ❌" + RESET);

            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch(opcao) {

                case 1:

                    jogador.farmar();
                    break;

                case 2:

                    jogador.plantar();
                    break;

                case 3:

                    jogador.construirCasa();
                    break;

                case 4:

                    jogador.explorar();
                    break;

                case 5:

                    jogador.dormir();
                    break;

                case 6:

                    jogador.mostrarInventario();
                    break;

                case 7:

                    System.out.println("⢸⣿⣿⣿⣿⣿⣿⣿⣿⠿⠟⠿⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠄⡀⠆⡐⢐⢂⡒⠤");
                    System.out.println("⠸⣿⣿⣿⣿⣿⡿⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⢀⠀⡀⠄⠀⠄⡐⠠⡑⢌⡰⠌⡜ ");
                    System.out.println("⠰⠱⢊⠖⠉⠀⠀⠀⢀⠀⡀⠄⠂⠀⠂⠀⡀⠀⠀⠄⠀⠠⠀⠅⠂⠐⠀⠀⠀⢀⣀⣤⣤⣤⣀⣀⢀⠀⠀⠐⠀⠀⠀⠀⠀⠠⠀⠐⠀⠁⠠⠐⠠⠐⡰⢈⠒⡌⠴⣡⠜⣦⠸⡜⣜");
                    System.out.println("⠀⠐⠀⢠⠀⠐⠀⡌⠀⠐⠀⠂⠀⠁⠀⠀⠀⠐⠀⢠⠀⠁⠀⠈⠀⠀⢠⣴⡞⠋⠁⠀⠀⠙⣿⡟⢻⣿⣶⡄⢠⠀⠀⠀⠀⠀⢠⠀⠁⠀⡄⠈⡄⢣⡄⢣⠘⣤⠓⡜⢸⡆⢻⡜⣮");
                    System.out.println("⠀⢂⠁⡀⠀⠀⠀⠠⢀⠁⡐⠀⠄⡀⠀⠀⢀⠀⠄⢀⠂⠄⠂⠀⣠⡶⠛⠁⠀⠀⣠⣴⣦⣤⣴⣤⣄⡠⠻⣿⣦⣄⠀⠀⠀⠡⠀⠀⠌⡀⠄⠱⣈⢂⠰⣈⠧⣜⢢⡕⣣⢞⣣⢓⡮");
                    System.out.println("⠀⠂⡔⠠⢈⠐⡀⠂⢌⠰⠀⠌⠠⠀⠀⠐⠀⠀⠠⠀⠄⠂⣴⠟⠋⠀⠀⠀⢀⣼⣿⣿⣿⣿⣿⣿⣿⣯⠳⠘⣿⣿⣷⣤⠀⠐⠈⠄⢂⠰⣈⠰⢀⠃⠖⡡⢞⡰⢣⢞⡱⡞⣬⢛⡼");
                    System.out.println("⢈⠰⢠⠁⢆⠂⡑⡈⠌⢠⢁⠎⡐⠀⡁⢀⠂⠐⠠⡉⠂⡼⠁⠀⠀⠀⠀⡠⠾⠿⠿⢿⣟⣿⢿⣿⣿⠿⠧⡧⠨⡻⣿⣿⡇⠈⠔⡈⢆⠳⡄⢋⠤⢉⠦⡑⢎⡱⣋⡜⢧⡝⡶⢫⣜");
                    System.out.println("⠰⣈⠆⡑⢂⠢⠑⡌⡜⢆⢮⢯⡵⢢⠐⠠⠂⠡⠁⡐⡼⡽⠀⠀⠀⠀⠴⡰⠒⠒⠤⠀⢈⣼⠁⠁⠠⠴⢤⡘⡄⠈⠻⣿⣧⠀⠌⠀⡌⠒⠈⠀⢧⡈⢒⠭⣎⠵⣣⢞⡳⣚⡽⣓⢾");
                    System.out.println("⢰⣶⣔⢠⡂⠄⡑⢌⡝⣊⠷⣫⢖⡡⢂⡅⠁⠀⣠⢯⣃⡴⠃⠀⠀⢠⢳⣷⣾⣷⠶⢚⡽⣿⣖⠢⣐⣂⠤⣥⡇⠀⢸⣾⣿⣷⡄⠁⠒⠂⣌⠱⣀⠱⢨⢞⣬⢳⢣⡞⣵⢏⣾⣙⢾");
                    System.out.println("⠸⣩⠙⠿⣇⢚⡃⣶⢤⡙⢳⣌⢣⣶⡙⠜⣎⣠⣿⣝⣡⠀⠀⠀⠀⣴⠩⢰⠇⠂⠐⠀⠀⠁⠀⡄⠛⣿⠻⣿⡇⠀⠘⣿⣿⣿⣭⠀⠀⠡⠹⢠⡌⠰⣏⠾⣬⠳⣋⢾⣽⣞⡷⣿⣾");
                    System.out.println("⢰⣁⢛⠒⡒⠲⡑⠄⡆⠻⣧⢩⢣⢮⣍⠷⣍⣚⣋⢊⡋⠀⢠⣶⡿⢓⠀⠁⠀⠀⠀⠀⡀⡀⠀⠃⠀⠙⠂⠦⡱⣄⡀⠈⢻⣿⣿⣆⠀⠀⢠⢀⢻⡄⡚⢧⣏⣷⣭⠶⣹⢎⣳⢧⣿");
                    System.out.println("⢘⣿⡾⢆⡑⠢⢡⢐⠡⠂⣿⡎⠸⡈⡝⠶⠭⣝⢻⡜⢁⡀⠺⣻⣕⡚⡀⠐⢀⢤⡤⠤⠥⢁⣀⠀⠐⢦⡀⣴⣳⡿⣷⡀⢺⣿⣿⣟⠀⠀⠈⠌⣈⣧⢳⣌⣟⣻⣿⣶⣟⣾⣻⣾⣿");
                    System.out.println("⢸⣍⡙⢢⠑⡡⢊⠞⡂⣶⢹⡷⢆⡱⠛⠛⠛⠛⢃⢜⠐⠀⠸⣿⣏⡴⠆⠀⢺⠗⡰⣚⠄⣧⠀⣷⠀⠘⣶⢠⣷⣽⣧⠓⣹⣿⣷⠽⠄⠠⠁⠜⠤⢺⠻⣎⠷⣹⢏⣿⣿⣿⣿⣿⣿");
                    System.out.println("⠸⠿⣀⣣⢌⠰⣀⢆⡀⢛⠠⢚⠉⡛⣉⠋⡉⠉⣌⢰⠀⢠⠀⢼⡋⠀⠀⡀⠀⢰⡕⡱⠃⠆⠈⠀⠀⠀⠐⣿⣿⢿⡷⠀⣾⣿⣿⡑⠀⡄⡉⢎⠒⣡⢚⡽⠾⢧⠫⣜⣻⣿⣿⣧⣿");
                    System.out.println("⠈⢴⠁⣛⣛⣛⣛⣋⣃⣉⣂⣁⠎⠱⠀⠆⡑⢃⠐⠓⣦⠀⠀⠀⠀⠀⠀⢁⣠⣾⣤⢱⢪⢁⠁⠀⠀⠀⠀⢈⣛⢿⠃⢠⣿⣿⣿⣿⣶⣦⣭⣤⣍⣂⢣⢆⡹⢦⠁⢆⠀⠄⠉⠉⠉");
                    System.out.println("⢸⣾⣿⣟⢿⣿⡿⣿⣻⣿⣿⣼⢯⣶⢅⡂⢍⠂⢆⣐⠺⠀⠀⠀⠀⠀⠀⠡⡶⣿⠏⡜⠶⢈⠑⠀⠀⠀⠀⢀⠀⠌⢀⢼⣿⣤⠈⠉⠉⠠⠀⡖⠰⠀⣮⣙⣯⣳⠀⠠⠂⠌⡐⠀⡄");
                    System.out.println("⢈⣙⡭⣩⠭⣍⠥⣩⢍⡭⢥⡴⣳⠶⠒⣘⣒⣮⣝⠲⣎⢥⢲⠐⠤⠈⠠⠀⠈⠀⠐⠀⠀⠀⠀⠀⠀⠀⠀⠀⡈⢂⠌⢢⢈⡛⠷⣶⣬⣄⡡⢈⠁⠀⢏⡽⢣⢟⡈⠤⠁⠀⠄⠈⠀");
                    System.out.println("⢨⠷⣹⢥⡻⣬⣓⠷⣎⠽⣣⠚⢅⣴⣾⢻⣙⠶⣎⠯⣜⢪⡌⣇⠘⣀⠁⠠⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⡐⠀⢎⠘⢤⢋⡝⡎⣄⠻⣳⡹⢳⣤⡈⢂⠌⠣⢌⠀⠀⠂⠄⠀⠀⠀");
                    System.out.println("⢘⡿⢣⢟⡸⢣⢟⡼⣘⢧⠃⣼⣿⢿⡸⢧⣛⠿⣘⢤⣃⢇⡤⢃⡜⠠⡀⠃⠄⠃⢀⠀⠀⠀⢀⠀⠘⠀⢀⠀⠛⡀⠼⡘⢤⡘⢧⡘⢧⠤⢧⡼⣃⢿⣄⠘⠠⠄⠀⠀⡀⠀⠀⡀⠀");
                    System.out.println("⠸⣜⡹⢊⠵⡩⢞⡼⣙⡎⢰⢫⡞⢧⢏⡧⢏⡳⡜⡲⡜⡬⢒⡍⢆⠱⡀⢑⠨⡐⢀⠂⠌⡐⠠⢈⠀⠂⢄⡈⠆⡑⢢⡙⢦⡙⢦⡙⡎⡝⣎⢲⠩⡖⣜⠻⣦⢈⠂⠀⠀⠐⠀⠀⠁");
                    System.out.println("⠐⢦⠱⣉⠦⣑⢋⠴⡡⢰⣋⢧⢻⡜⣮⢵⢫⡵⣩⠕⣎⡱⡍⢦⢉⡆⣑⠂⡑⢌⠢⡑⠌⠤⡑⠠⠌⡌⠰⡐⢌⠰⢃⡜⢢⠝⣢⠣⡕⣩⠲⣡⢓⠸⢄⠣⠜⣆⠀⠈⠀⠀⠂⠁⠀");
                    System.out.println("⠈⢆⠱⣀⠒⠤⢊⡒⢡⣗⠺⣌⠷⡞⡽⢎⡷⣱⢣⡛⡴⡱⢚⡔⠢⠜⡤⠓⡌⢂⠇⣍⠚⡰⢈⡱⢌⠒⡱⡘⡌⢎⡱⢌⢣⠚⡔⢣⡑⢆⠳⠰⣈⠱⡈⢆⠓⣹⡄⠁⢂⠀⠁⠀⠀");

                    System.out.println("⠀⠀⡰⠉⠉⣷⡄⣀⣎⠉⢹⡎⠉⢉⡞⠉⠉⣧⡎⠉⠉⡞⠉⠉⠉⠉⠉⣿⠉⠉⠉⠉⠉⢹⡏⠋⠉⠉⠉⠙⡏⠉⣉⠉⣉⠉⢿⠉⠉⠉⢉⠉⢱⡏⠉⠉⠉⢉⠉⡄\n" +
                                        "⠀⢀⠃⠀⠀⠘⠛⠁⠀⠀⣼⠀⠀⣸⠃⠀⠀⠘⠃⠀⢰⡇⠀⠀⠛⠛⠛⣿⠀⠀⢸⣿⣿⣿⡇⠀⠈⠃⠀⣠⣿⠀⠉⣶⣍⠀⢸⡆⠀⠘⠛⠛⠛⣿⣿⡆⠀⠈⡟⠁\n" +
                                        "⠀⡜⣀⢀⣶⣀⣰⠆⠀⢀⡏⠀⠀⣿⠀⠀⣸⣄⠤⠄⢸⠃⠀⢰⣶⣶⣶⣿⠀⠀⢸⣉⣉⣉⡇⡀⠀⣶⠀⠀⢹⠀⠀⢀⡀⢀⠀⣇⠀⠀⢶⣶⣶⢾⣿⣿⡀⠀⢱⠀\n" +
                                        "⢰⠀⠀⢸⣿⣦⠈⠀⠀⢼⠁⠀⢰⡇⠀⠀⣿⣿⠀⠀⢼⠀⡄⠀⠀⠀⠀⣿⠀⠀⠀⠀⠀⢸⡇⠂⠀⣿⠀⠀⢸⡆⠀⢘⡧⠀⠀⣿⠀⠀⢸⠛⠃⠘⣿⣿⡇⠀⠀⡆\n" +
                                        "⠀⠑⢤⣀⣙⡿⠉⠱⣄⣠⣷⣄⣀⣹⣄⣀⣘⡏⢆⣀⣘⣧⣀⣀⣀⣀⣀⣿⣀⣀⣀⣀⣀⣸⣇⣀⣰⣏⣀⣠⣿⣀⣀⣾⣁⣀⣴⣋⣀⡠⠃⠀⠀⠀⢿⣋⣀⡤⠋⠀");

                    System.out.println("Obrigada por testar o mini joguinho incompleto de Minecraft!");

                    break;

                default:

                    System.out.println("Opção inválida!");

            }
        }
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Tarefa 3 - Teste para checar se estava compilando e executando.
        System.out.println("Programa Vida Pet iniciado com sucesso.");
        System.out.println("Testando Java 21.");
        */

        Scanner input = new Scanner(System.in);
        int opcao;
        do{
            System.out.println("\n===============================================");
            System.out.println("             Sistema de Agendamento             ");
            System.out.println("           Clínica Veterinária VidaPet          ");
            System.out.println("===============================================");

            System.out.println("============= MENU PRINCIPAL ==================");
            System.out.println("| 1- Cadastro de Animais                      |");
            System.out.println("| 2- Cadastro de Veterinários                 |");
            System.out.println("| 3- Agendamento de consultas                 |");
            System.out.println("| 4- Cancelamento de consultas                |");
            System.out.println("| 5- Visualização da agenda diária            |");
            System.out.println("| ...                                         |");
            System.out.println("| 0- Sair                                     |");
            System.out.println("================================================\n");

            System.out.print("Escolha uma opção: ");    //Tratamento de erro de tipo será feito nas próximas etapas
            opcao = input.nextInt();
            input.nextLine(); //consome a quebra de linha

            switch (opcao){
                //Programa standalone inicial - Simulador de cadastro de animais
                case 1: {
                    //Cadastro de animais

                    boolean especieValida = false;
                    boolean idadeValida = false;

                    //1- Solicita o nome do animal, espécie, idade, nome e telefone do tutor .
                    String nomeAnimal;
                    do{
                        System.out.print("Nome do animal: ");
                        nomeAnimal = input.nextLine().trim();

                        if (nomeAnimal.isBlank()){
                            System.out.println("\u001B[31mCampo obrigatório!\u001B[0m");
                        }
                    }while (nomeAnimal.isBlank());


                    String especie;
                    do{
                        System.out.print("Espécie do animal(cão ou gato): ");
                        especie = input.nextLine().trim();

                        //2- Valida se a espécie é (cão ou gato).
                        if (especie.equalsIgnoreCase("cão") || especie.equalsIgnoreCase("cao") || especie.equalsIgnoreCase("gato")){
                            System.out.println("Espécie válida!");
                            especieValida = true;

                        }else{
                            System.out.println("\u001B[31mEspécie inválida!\u001B[0m");
                        }
                    }while (!especieValida);

                    int idadeAnimal;
                    do{
                        System.out.print("Idade do animal: ");  //Tratamento de erro de tipo será feito nas próximas etapas
                        idadeAnimal = input.nextInt();
                        input.nextLine(); //consome a quebra de linha

                        //3- Verifica se a idade é válida.
                        if (idadeAnimal >= 0){
                            System.out.println("Idade válida!");
                            idadeValida = true;
                        }else{
                            System.out.println("\u001B[31mIdade inválida!\u001B[0m");
                        }
                    }while(!idadeValida);

                    String nomeTutor;
                    do{
                        System.out.print("Nome do tutor: ");
                        nomeTutor = input.nextLine().trim();

                        if (nomeTutor.isBlank()){
                            System.out.println("\u001B[31mCampo obrigatório!\u001B[0m");
                        }
                    }while (nomeTutor.isBlank());

                    String telefoneTutor;
                    do{
                        System.out.print("Telefone do tutor: ");
                        telefoneTutor = input.nextLine().trim();

                        if (telefoneTutor.isBlank()){
                            System.out.println("\u001B[31mCampo obrigatório!\u001B[0m");
                        }
                    }while (telefoneTutor.isBlank());

                    //4- Verifica se os campos obrigatórios foram preenchidos e exibe o cadastro .

                    System.out.println("Cadastro concluído!");
                    System.out.println("\n=========== Cadastro do Animal ===========");
                    System.out.println("Nome do animal: "+ nomeAnimal);
                    System.out.println("Espécie: "+ especie);
                    System.out.println("Idade do animal: "+ idadeAnimal+ " anos.");
                    System.out.println("Nome do tutor: "+ nomeTutor);
                    System.out.println("Telefone do tutor: "+ telefoneTutor);
                    System.out.println("============================================\n");
                    break;
                }

                //Os próximos cases serão elaborados na proxima versão do programa VidaPet
                case 2:
                    //Cadastro dos veterinários
                    System.out.println("Cadastro de veterinários ainda não disponível.");
                    break;
                case 3:
                    //Agendamento de consultas
                    System.out.println("Agendamento de consultas ainda não disponível.");
                    break;
                case 4:
                    //Cancelamento de consultas
                    System.out.println("Cancelamento de consultas ainda não disponível.");
                    break;
                case 5:
                    //Visualização da agenda
                    System.out.println("Visualização da agenda ainda não disponível.");
                    break;
                case 0:
                    System.out.println("Encerrando o sistema VidaPet.");
                    break;
                default:
                    System.out.println("\u001B[31mOpção inválida!\u001B[0m");
            }
        }while(opcao != 0);

        input.close();
    }
}
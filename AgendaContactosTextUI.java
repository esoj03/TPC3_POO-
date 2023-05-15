package tratarerros.adressbookv1;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

/**
 *
 * Fornecer uma ‘interface’ de utilizador via linha de comando para uma
 * AgendaContactos.
 * Diferentes comandos fornecem acesso aos dados de endereços na agenda:
 * <p>
 *      Um para pesquisar o agenda de contactos
 * <p>
 *      Um para permitir que um conjunto de detalhes de contato seja inserido.
 * <p>
 *      Um para mostrar todas as entradas da agenda
 *
 * @author Paulo .
 * @version 2023.05.12
 */
public class AgendaContactosTextUI
{
    // a agenda de contactos a ser visualizado e manipulado.
    private final AgendaContactos agenda;
    // Um analisador para lidar com os comandos do utilizador.
    private final Parser parser;
    
    /**
     * Construtor para objetos da classe AgendaContactosTextUI
     * @param book A agenda de contactos a ser manipulado.
     */
    public AgendaContactosTextUI(AgendaContactos book)
    {
        this.agenda = book;
        parser = new Parser();
    }
    
    /**
     * Leia uma série de comandos do utilizador para interagir
     * com o livro de endereços. Pare quando o utilizador digitar 'sair'.
     */
    public void run()
    {
        System.out.println("Agenda de contactos.");
        System.out.println("Digite 'help' para obter uma lista de comandos.");
        
        String command;
        do{
            command = parser.getCommand();
            switch (command) {
                case "adi" -> add();
                case "listar" -> listar();
                case "procurar" -> encontrar();
                case "buscar" -> buscar();
                case "remover" -> remover();
                case "alterar" -> alter();
                case "help" -> help();
                default -> {
                }
                // Do nothing.
            }
        } while(!(command.equals("sair")));

        System.out.println("Tchau.");
    }

    private void remover() {
        System.out.print("Digite chave de contacto que quer remover ");
        String key = parser.readLine();
        agenda.removeDetails(key);
    }

    private void buscar() {
        System.out.print("Digite chave de contacto procura: ");
        String key = parser.readLine();
        System.out.println(agenda.obterDetalhes(key).toString());
        try{
            System.out.println(agenda.obterDetalhes(key).toString()  );
        }catch (NullPointerException e){
            System.out.println("chave invalida");
        }
    }

    /**
     * Adicionar uma nova entrada.
     */
    private void add()
    {
        System.out.print("Nome: ");
        String name = parser.readLine();
        System.out.print("Telefone: ");
        String phone = parser.readLine();
        System.out.print("Endereço: ");
        String address = parser.readLine();
        agenda.addDetails(new DetalhesContacto(name, phone, address));
    }
    
    /**
     * Encontre entradas correspondentes a um prefixo de chave.
     */
    private void encontrar()
    {
        System.out.println("Digite um prefixo da chave a ser encontrada.");
        String prefix = parser.readLine();
        DetalhesContacto[] results = agenda.search(prefix);
        for (DetalhesContacto result : results) {
            System.out.println(result);
            System.out.println("=====");
        }
    }
    private void alter() {
        // Ask for the name or telephone number (key) of the contact you want to change
        println("Qual o nome ou número de telefone do contacto que pretende alterar? ");
        String chave = parser.readLine();

        // Ask for the new data of the contact that you want to change
        String name, telephone;
        println("Introduz nome que quer atualizar: ");
        name = parser.readLine();
        println("Introduz o numero telephone que quer atualizar: ");
        telephone = parser.readLine();

        // Call the `alterDetalhes` method to make the change
        AgendaContactos.alter(chave, name, telephone);
        println("Contact changed ok");
        try {
            AgendaContactos.alter(chave, name, telephone);
            println("contato alterado ok");
        } catch (NullPointerException e) {
            println(String.valueOf(e));
            println("Nao foi possivel alterar contato");
        }
    }


    /**
     * Liste os comandos disponíveis.
     */
    private void help()
    {
        parser.showCommands();
    }
    
    /**
     * Liste o conteúdo do agenda de contactos
     */
    private void listar()
    {
        System.out.println(agenda.listaDetalhes());
    }
}

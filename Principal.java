/**
 * Classe principal do sistema FiapDelivery.
 *
 * <p>Demonstra o uso correto do sistema refatorado, instanciando
 * diferentes tipos de veículo e mostrando o polimorfismo em ação:
 * a mesma classe {@link Rota} funciona com {@link Caminhao} e {@link Moto}
 * sem qualquer alteração no seu código.</p>
 *
 * @author Tech Lead - FiapDelivery
 * @version 2.0
 */
public class Principal {

    public static void main(String[] args) {

        // -----------------------------------------------------------------
        // Cenário 1: Entrega pesada via Caminhão
        // Antes: c.cap = -500.0; — dado inválido sem nenhuma validação!
        // Agora: o construtor valida e lança exceção se os dados forem ruins.
        // -----------------------------------------------------------------
        Caminhao caminhao = new Caminhao("ABC-1234", 5000.0, 4);
        Pacote pacotePesado = new Pacote("BR999", 10.5);

        Rota rotaCaminhao = new Rota(pacotePesado, caminhao);
        rotaCaminhao.iniciarEntrega();

        System.out.println();

        // -----------------------------------------------------------------
        // Cenário 2: Entrega expressa via Moto
        // Antes: impossível — Rota só aceitava caminhao.
        // Agora: Rota aceita qualquer Veiculo graças ao polimorfismo.
        // -----------------------------------------------------------------
        Moto moto = new Moto("XYZ-5678", 30.0, true);
        Pacote pacoteExpresso = new Pacote("SP001", 2.0);

        Rota rotaMoto = new Rota(pacoteExpresso, moto);
        rotaMoto.iniciarEntrega();

        System.out.println();

        // -----------------------------------------------------------------
        // Demonstração: tentativa de criar veículo com dados inválidos
        // O sistema agora protege a integridade dos dados.
        // -----------------------------------------------------------------
        System.out.println("=== Testando Validação de Dados ===");
        try {
            Caminhao caminhaoInvalido = new Caminhao("DEF-0000", -500.0, 4);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro capturado corretamente: " + e.getMessage());
        }
    }
}

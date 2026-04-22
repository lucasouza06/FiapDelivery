/**
 * Representa uma rota de entrega no sistema FiapDelivery.
 *
 * <p>Esta classe resolve o problema de acoplamento rígido da versão legada,
 * onde {@code Rota} aceitava apenas {@code caminhao}. Ao usar a superclasse
 * abstrata {@link Veiculo}, qualquer tipo de veículo (Caminhão, Moto, etc.)
 * pode ser associado a uma rota — isso é <strong>Polimorfismo</strong> em ação.</p>
 *
 * <p>A {@code Rota} possui uma associação com {@link Pacote} (o que será entregue)
 * e com {@link Veiculo} (quem vai entregar), ambos injetados via construtor.</p>
 *
 * @author Tech Lead - FiapDelivery
 * @version 2.0
 */
public class Rota {

    /** O pacote que será transportado nesta rota. */
    private Pacote pacote;

    /**
     * O veículo responsável pela entrega.
     * Ao referenciar o tipo abstrato {@link Veiculo}, a Rota aceita
     * qualquer subclasse: Caminhao, Moto ou qualquer futura implementação.
     */
    private Veiculo veiculo;

    /**
     * Construtor que cria uma rota com um pacote e um veículo definidos.
     * Garante que uma rota nunca exista sem seus dados essenciais.
     *
     * @param pacote  O pacote a ser entregue (não pode ser nulo).
     * @param veiculo O veículo que realizará a entrega (não pode ser nulo).
     * @throws IllegalArgumentException se pacote ou veículo forem nulos.
     */
    public Rota(Pacote pacote, Veiculo veiculo) {
        if (pacote == null) {
            throw new IllegalArgumentException("O pacote da rota não pode ser nulo.");
        }
        if (veiculo == null) {
            throw new IllegalArgumentException("O veículo da rota não pode ser nulo.");
        }
        this.pacote = pacote;
        this.veiculo = veiculo;
    }

    // -------------------------------------------------------------------------
    // Método de negócio
    // -------------------------------------------------------------------------

    /**
     * Inicia o processo de entrega, atualizando o status do pacote
     * e exibindo as informações da rota no console.
     *
     * <p>O polimorfismo permite que este método funcione com qualquer tipo
     * de veículo sem que a {@code Rota} precise saber se é um Caminhao ou Moto.</p>
     */
    public void iniciarEntrega() {
        pacote.atualizarStatus("Em Trânsito");
        System.out.println("=== Iniciando Entrega ===");
        System.out.printf("Pacote  : %s%n", pacote);
        System.out.printf("Veículo : %s%n", veiculo);
        System.out.println("Status  : Entrega em andamento!");
        System.out.println("========================");
    }

    // -------------------------------------------------------------------------
    // Getters e Setters
    // -------------------------------------------------------------------------

    /**
     * Retorna o pacote associado a esta rota.
     *
     * @return o pacote.
     */
    public Pacote getPacote() {
        return pacote;
    }

    /**
     * Retorna o veículo associado a esta rota.
     *
     * @return o veículo.
     */
    public Veiculo getVeiculo() {
        return veiculo;
    }
}

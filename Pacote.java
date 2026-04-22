/**
 * Representa um pacote a ser entregue no sistema FiapDelivery.
 * Encapsula as informações de rastreamento e controle de status da entrega.
 *
 * @author Tech Lead - FiapDelivery
 * @version 2.0
 */
public class Pacote {

    /** Código único de rastreamento do pacote. */
    private String codigo;

    /** Peso do pacote em quilogramas. */
    private double peso;

    /** Status atual do pacote no fluxo de entrega (ex: "Pendente", "Em Trânsito", "Entregue"). */
    private String status;

    /**
     * Construtor que inicializa o pacote com os dados essenciais.
     * Todo pacote começa com status "Pendente" por padrão.
     *
     * @param codigo Código único de rastreamento (não pode ser nulo ou vazio).
     * @param peso   Peso do pacote em kg (deve ser maior que zero).
     * @throws IllegalArgumentException se o código for inválido ou o peso for <= 0.
     */
    public Pacote(String codigo, double peso) {
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("O código do pacote não pode ser vazio.");
        }
        if (peso <= 0) {
            throw new IllegalArgumentException("O peso do pacote deve ser maior que zero.");
        }
        this.codigo = codigo;
        this.peso = peso;
        this.status = "Pendente";
    }

    // -------------------------------------------------------------------------
    // Método de negócio
    // -------------------------------------------------------------------------

    /**
     * Atualiza o status de rastreamento do pacote.
     * Centraliza a lógica de mudança de estado, garantindo que o status
     * nunca seja definido como nulo ou vazio.
     *
     * @param novoStatus O novo status do pacote (ex: "Em Trânsito", "Entregue").
     * @throws IllegalArgumentException se o novo status for inválido.
     */
    public void atualizarStatus(String novoStatus) {
        if (novoStatus == null || novoStatus.isBlank()) {
            throw new IllegalArgumentException("O status do pacote não pode ser vazio.");
        }
        this.status = novoStatus;
    }

    // -------------------------------------------------------------------------
    // Getters e Setters
    // -------------------------------------------------------------------------

    /**
     * Retorna o código de rastreamento do pacote.
     *
     * @return código do pacote.
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Retorna o peso do pacote em kg.
     *
     * @return peso do pacote.
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Retorna o status atual do pacote.
     *
     * @return status do pacote.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Representação textual do pacote.
     *
     * @return String com os dados do pacote.
     */
    @Override
    public String toString() {
        return String.format("Pacote [codigo=%s, peso=%.2f kg, status=%s]", codigo, peso, status);
    }
}

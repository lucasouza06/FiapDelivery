/**
 * Classe abstrata que representa um veículo genérico do sistema FiapDelivery.
 * Centraliza os atributos e comportamentos comuns a todos os tipos de veículo,
 * eliminando a duplicação de código que existia entre Caminhao e Moto.
 *
 * @author Tech Lead - FiapDelivery
 * @version 2.0
 */
public abstract class Veiculo {

    /** Placa de identificação do veículo. */
    private String placa;

    /** Capacidade de carga do veículo em quilogramas. */
    private double capacidade;

    /**
     * Construtor que garante a criação de um veículo com dados obrigatórios,
     * impedindo a existência de objetos em estado inválido.
     *
     * @param placa      Placa de identificação do veículo (não pode ser nula ou vazia).
     * @param capacidade Capacidade de carga em kg (deve ser maior que zero).
     * @throws IllegalArgumentException se a placa for inválida ou capacidade <= 0.
     */
    public Veiculo(String placa, double capacidade) {
        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("A placa do veículo não pode ser vazia.");
        }
        if (capacidade <= 0) {
            throw new IllegalArgumentException("A capacidade deve ser maior que zero. Valor recebido: " + capacidade);
        }
        this.placa = placa;
        this.capacidade = capacidade;
    }

    // -------------------------------------------------------------------------
    // Getters e Setters
    // -------------------------------------------------------------------------

    /**
     * Retorna a placa do veículo.
     *
     * @return placa do veículo.
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Atualiza a placa do veículo.
     *
     * @param placa nova placa (não pode ser nula ou vazia).
     */
    public void setPlaca(String placa) {
        if (placa == null || placa.isBlank()) {
            throw new IllegalArgumentException("A placa do veículo não pode ser vazia.");
        }
        this.placa = placa;
    }

    /**
     * Retorna a capacidade de carga do veículo em kg.
     *
     * @return capacidade em kg.
     */
    public double getCapacidade() {
        return capacidade;
    }

    /**
     * Atualiza a capacidade de carga do veículo.
     *
     * @param capacidade nova capacidade em kg (deve ser maior que zero).
     */
    public void setCapacidade(double capacidade) {
        if (capacidade <= 0) {
            throw new IllegalArgumentException("A capacidade deve ser maior que zero.");
        }
        this.capacidade = capacidade;
    }

    /**
     * Representação textual do veículo. Útil para logs e depuração.
     *
     * @return String com os dados do veículo.
     */
    @Override
    public String toString() {
        return String.format("Veiculo [placa=%s, capacidade=%.2f kg]", placa, capacidade);
    }
}

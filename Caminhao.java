/**
 * Representa um caminhão no sistema FiapDelivery.
 * Herda os atributos comuns (placa, capacidade) da classe {@link Veiculo}
 * e adiciona o atributo específico {@code quantidadeEixos}.
 *
 * @author Tech Lead - FiapDelivery
 * @version 2.0
 */
public class Caminhao extends Veiculo {

    /** Número de eixos do caminhão. Determina a categoria e limitações do veículo. */
    private int quantidadeEixos;

    /**
     * Construtor completo do Caminhao.
     * Delega os atributos comuns ao construtor da superclasse {@link Veiculo}.
     *
     * @param placa           Placa de identificação do caminhão.
     * @param capacidade      Capacidade de carga em kg.
     * @param quantidadeEixos Número de eixos do caminhão (deve ser maior que zero).
     * @throws IllegalArgumentException se a quantidade de eixos for inválida.
     */
    public Caminhao(String placa, double capacidade, int quantidadeEixos) {
        super(placa, capacidade);
        if (quantidadeEixos <= 0) {
            throw new IllegalArgumentException("Quantidade de eixos deve ser maior que zero.");
        }
        this.quantidadeEixos = quantidadeEixos;
    }

    // -------------------------------------------------------------------------
    // Getters e Setters específicos
    // -------------------------------------------------------------------------

    /**
     * Retorna a quantidade de eixos do caminhão.
     *
     * @return quantidade de eixos.
     */
    public int getQuantidadeEixos() {
        return quantidadeEixos;
    }

    /**
     * Atualiza a quantidade de eixos do caminhão.
     *
     * @param quantidadeEixos novo valor (deve ser maior que zero).
     */
    public void setQuantidadeEixos(int quantidadeEixos) {
        if (quantidadeEixos <= 0) {
            throw new IllegalArgumentException("Quantidade de eixos deve ser maior que zero.");
        }
        this.quantidadeEixos = quantidadeEixos;
    }

    /**
     * Representação textual do caminhão.
     *
     * @return String com os dados do caminhão.
     */
    @Override
    public String toString() {
        return String.format("Caminhao [placa=%s, capacidade=%.2f kg, eixos=%d]",
                getPlaca(), getCapacidade(), quantidadeEixos);
    }
}

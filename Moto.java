/**
 * Representa uma moto no sistema FiapDelivery.
 * Herda os atributos comuns (placa, capacidade) da classe {@link Veiculo}
 * e adiciona o atributo específico {@code temBau}, que indica se a moto
 * possui baú para transporte de cargas.
 *
 * @author Tech Lead - FiapDelivery
 * @version 2.0
 */
public class Moto extends Veiculo {

    /** Indica se a moto está equipada com baú para transporte de entregas. */
    private boolean temBau;

    /**
     * Construtor completo da Moto.
     * Delega os atributos comuns ao construtor da superclasse {@link Veiculo}.
     *
     * @param placa      Placa de identificação da moto.
     * @param capacidade Capacidade de carga em kg.
     * @param temBau     {@code true} se a moto possui baú; {@code false} caso contrário.
     */
    public Moto(String placa, double capacidade, boolean temBau) {
        super(placa, capacidade);
        this.temBau = temBau;
    }

    // -------------------------------------------------------------------------
    // Getters e Setters específicos
    // -------------------------------------------------------------------------

    /**
     * Verifica se a moto possui baú.
     *
     * @return {@code true} se possui baú; {@code false} caso contrário.
     */
    public boolean isTemBau() {
        return temBau;
    }

    /**
     * Define se a moto possui baú.
     *
     * @param temBau {@code true} para indicar que possui baú.
     */
    public void setTemBau(boolean temBau) {
        this.temBau = temBau;
    }

    /**
     * Representação textual da moto.
     *
     * @return String com os dados da moto.
     */
    @Override
    public String toString() {
        return String.format("Moto [placa=%s, capacidade=%.2f kg, temBau=%s]",
                getPlaca(), getCapacidade(), temBau ? "Sim" : "Não");
    }
}

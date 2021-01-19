public class Nombre extends Expression{

    public int valeur;

    public Nombre (int valeur) {
        this.valeur = valeur;
    }

    @Override
    public double calculerValeur() {
        return valeur;
    }
}

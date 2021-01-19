public class NoeudInterne extends Expression{

    public char operateurBinaire;

    private Expression premierOperande;
    private Expression deuxiemeOperande;

    public NoeudInterne (char operateurBinaire, Expression premierOperande, Expression deuxiemeOperande) {
        this.premierOperande = premierOperande;
        this.deuxiemeOperande = deuxiemeOperande;
        this.operateurBinaire = operateurBinaire;
    }

    @Override
    public double calculerValeur() {
        double result;
        switch (operateurBinaire) {
            case '*':
                result = premierOperande.calculerValeur() * deuxiemeOperande.calculerValeur();
                break;
            case '/':
                result = premierOperande.calculerValeur() / deuxiemeOperande.calculerValeur();
                break;
            case '-':
                result = premierOperande.calculerValeur() - deuxiemeOperande.calculerValeur();
                break;
            default:
                result = premierOperande.calculerValeur() + deuxiemeOperande.calculerValeur();
                break;
        }
        return result;
    }
}

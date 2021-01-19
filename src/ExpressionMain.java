public class ExpressionMain {

    public static void main ( String args[] ) {
        Expression expression = new NoeudInterne('+', new Nombre(1), new Nombre(2));

        System.out.println(expression.calculerValeur());

        Expression suite = new NoeudInterne('-', expression, new Nombre(2));

        System.out.println(suite.calculerValeur());
    }
}

import java.util.*;

public class Client extends Expression{

    private List<Expression> ChildNodes;

    public Client () {
        ChildNodes = new ArrayList<Expression>();
    }

    public Client (ArrayList<Expression> ChildNodes) {
        super();
        this.ChildNodes = ChildNodes;
    }

    public double calculerValeur() {
        for (Expression childNode : ChildNodes) {
            childNode.calculerValeur();
        }
        return 0;
    }

    public void addNode(Expression Node) {
        ChildNodes.add(Node);
    }

    public void delNode(Expression Node) {
        ChildNodes.remove(Node);
    }
}

package is.hi.hbv202g.ass9.composite;


import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression {
    private List<MathExpression> children = new ArrayList<MathExpression>();

    public void add(MathExpression child) {
        children.add(child);
    }

    public void remove(MathExpression child) {
        children.remove(child);
    }

    public List<MathExpression> getChildren() {
        return children;
    }

    public int getResult() {
        int result = 0;
        for (MathExpression child : children) {
            result += child.getResult();
        }
        return result;
    }
}

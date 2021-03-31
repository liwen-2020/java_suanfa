import java.util.Stack;

public class Evaluate {
    private Stack<String> ops = null;
    private Stack<Double> vals = null;

    public Evaluate(){
       initEvaluate();
    }

    public Evaluate(String expression){
        initEvaluate();
    }

    private void initEvaluate(){
        ops = new Stack<String>();
        vals = new Stack<Double>();
    }

    public void analysisOps(String expression){

    }

    public void analysisVals(String expression){

    }

    public Double execute(){
        return 0.0;
    }

}

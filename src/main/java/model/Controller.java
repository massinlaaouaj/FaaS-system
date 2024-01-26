package model;

import algorithm.Algorithm;
import function.Function;

import java.util.List;

public class Controller {
    private Algorithm algorithm;
    private List<Invoker> invokers;

    public Controller(Algorithm algorithm, int numberOfInvokers, int memoryOfInvoker) {
        this.algorithm = algorithm;

        for (int i = 1; i <= numberOfInvokers; i++) {
            Invoker invoker = new Invoker(i, memoryOfInvoker);
            this.invokers.add(invoker);
        }
    }

    public void assignFunctionToInvoker(Function function) throws Exception {
        Invoker selectedInvoker = this.algorithm.selectInvoker(this.invokers);
        selectedInvoker.executeFunction(function);
    }
}

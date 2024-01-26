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

    public void assignFunctionToInvoker(Function function, int memoryNeeded) throws Exception {
        Invoker selectedInvoker = this.algorithm.selectInvoker(this.invokers);
        selectedInvoker.executeFunction(function, memoryNeeded);
    }

    public Algorithm getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(Algorithm algorithm) {
        this.algorithm = algorithm;
    }

    public List<Invoker> getInvokers() {
        return invokers;
    }

    public void setInvokers(List<Invoker> invokers) {
        this.invokers = invokers;
    }
}

package algorithm;

import model.Invoker;

import java.util.List;

public interface Algorithm {
    Invoker selectInvoker(List<Invoker> invokers);
}

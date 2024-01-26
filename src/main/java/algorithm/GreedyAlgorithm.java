package algorithm;

import model.Invoker;

import java.util.List;

public class GreedyAlgorithm implements Algorithm {

        @Override public Invoker selectInvoker(List<Invoker> invokers) {
            // Seleccionar el invocador con la menor carga actual
            Invoker selectedInvoker = invokers.get(0); // Inicializar con el primer invocador

            for (Invoker invoker : invokers) {
                if (invoker.getTotalMemoryAvailable() < selectedInvoker.getTotalMemoryAvailable()) {
                    selectedInvoker = invoker;
                }
            }

            return selectedInvoker;
        }
    }


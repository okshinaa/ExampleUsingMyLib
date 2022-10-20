package org.example;

import ru.vsu.cs.okshina_v_a.Graph;
import ru.vsu.cs.okshina_v_a.GraphTraversal;
import ru.vsu.cs.okshina_v_a.RandomGraph;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Представление библиотеки для работы с графами!");
        workWithLibOfGraphs();
        printRandomGraph();
    }

    private static void workWithLibOfGraphs() {
        Graph gr = new Graph();
        GraphTraversal graphTraversal = new GraphTraversal();

        gr.addVertex("cat");
        gr.addVertex("dog");
        gr.addVertex("fox");
        gr.addVertex("fish");

        gr.addEdge("cat", "fish");

        System.out.println(gr.printGraph());

        System.out.println("Проход графа в ширину");
        gr.addVertex("1");
        gr.addVertex("2");
        gr.addVertex("3");
        gr.addVertex("4");
        gr.addVertex("5");

        System.out.println(graphTraversal.breadthFirstTraversal(gr, "4"));

        System.out.println("Проход графа в глубину");
        gr.addVertex("1");
        gr.addVertex("2");
        gr.addVertex("3");
        gr.addVertex("4");
        gr.addVertex("5");

        System.out.println(graphTraversal.depthFirstTraversal(gr, "cat"));
    }

    private static void printRandomGraph() {
        RandomGraph randomGraph = new RandomGraph();

        System.out.println("Генерация рандомного графа:");

        for(int i = 0; i < randomGraph.adjacencyList.size(); i++) {
            System.out.print(i + "-> {");

            List<Integer> list = randomGraph.adjacencyList.get(i);

            if(list.isEmpty())
                System.out.print("нет смежных вершин");
            else {
                int size = list.size();
                for(int j = 0; j < size; j++) {
                    System.out.print(list.get(j));
                    if(j < size - 1)
                        System.out.print(" , ");
                }
            }
            System.out.println("}");
        }
    }
}

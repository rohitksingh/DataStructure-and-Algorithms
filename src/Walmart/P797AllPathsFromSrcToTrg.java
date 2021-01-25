package Walmart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class P797AllPathsFromSrcToTrg {

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        List<List<Integer>> paths = new ArrayList();
        Queue<List> tempPath = new LinkedList();
        tempPath.add(Arrays.asList(0));
        int dest = graph.length-1;

        while(!tempPath.isEmpty()){

            List<Integer> path = tempPath.poll();
            int lastNode = path.get(path.size()-1);
            if(lastNode!=dest){

                int[] choices = graph[lastNode];
                for(int choice: choices){
                    List<Integer> newPath = new ArrayList(path);
                    newPath.add(choice);
                    tempPath.add(newPath);
                }
            }else{
                paths.add(path);
            }


        }

        return paths;


    }
}

package Walmart;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;
import java.util.Queue;


public class P797AllPathsFromSrcToTrg {


    /**
     *
     *   1) Adding source as a List shortcut:
     *      queue.add(Arrays.asList(0)
     *      List<Integer> numList = Arrays.asList(0,2,3,4,5);
     *
     *   2) Queue.poll methods removes element from start of the queue
     *          queue.poll ~~ stack.pop
     *
     *   3) List<Integer> updatedPath = new ArrayList(path);
     *              updatedpath.add(choice)
     *              stack.push(updatedPath)
     */


    public List<List<String>> getAllList(String[] strs){
        return new ArrayList(Arrays.asList(strs));
    }


    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {


        String a = "Rohit";
        Arrays.sort(a);

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

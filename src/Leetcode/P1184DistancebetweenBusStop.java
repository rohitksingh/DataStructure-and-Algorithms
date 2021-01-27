package Leetcode;

public class P1184DistancebetweenBusStop {

    public int distanceBetweenBusStops(int[] distance, int start, int destination) {

        int circle_distance = 0;
        for(int dis:distance){
            circle_distance = circle_distance+dis;
        }

        if(start>destination){
            int temp = start;
            start = destination;
            destination = temp;
        }

        int clock_distance = 0;

        for(int i=start;i<destination;i++){
            clock_distance = clock_distance+distance[i];
        }

        return (clock_distance<circle_distance-clock_distance) ? clock_distance: circle_distance-clock_distance;

    }
}

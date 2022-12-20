import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KeysAndRooms_841 {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        int[] visited = new int[rooms.size()];

        visitedNode(visited, 0, rooms);
        System.out.println(Arrays.toString(visited));

        for (int i = 1; i < visited.length; i++) {
            if(visited[i] == 0){
                return false;
            }
        }
        return true;
    }

    private void visitedNode(int[] visited, int roomNumber, List<List<Integer>> rooms){
        visited[roomNumber] = 1;
        for (int i = 0; i < rooms.get(roomNumber).size(); i++) {
            if(visited[rooms.get(roomNumber).get(i)] != 1){
                visitedNode(visited,rooms.get(roomNumber).get(i), rooms);
            }
        }
    }

}

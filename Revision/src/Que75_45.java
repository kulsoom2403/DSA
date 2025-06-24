import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Que75_45 {

        public void dfs(List<List<Integer>> rooms, int source, boolean[] visited) {
            visited[source] = true;
            for (int node : rooms.get(source)) {
                if (!visited[node]) {
                    dfs(rooms, node, visited);
                }
            }
        }

        public boolean canVisitAllRooms(List<List<Integer>> rooms) {
            int n = rooms.size();
            boolean[] visited = new boolean[n]; // default is false
            dfs(rooms, 0, visited);

            for (boolean x : visited) {
                if (!x) return false;
            }
            return true;
        }

    public static void main(String[] args) {


        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(Arrays.asList(1, 3)); // Room 0 keys
        rooms.add(Arrays.asList(3, 0, 1)); // Room 1 keys
        rooms.add(Arrays.asList(2)); // Room 2 keys
        rooms.add(Arrays.asList(0)); // Room 3 keys
        Que75_45 obj = new Que75_45();
        boolean result = obj.canVisitAllRooms(rooms);
        System.out.println("Can visit all rooms? " + result);
    }

}

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        dfs(rooms, 0, visited);
        for (int i = 0; i < rooms.size(); i++) {
            if (!visited[i]) return false;
        }
        return true;
    }
    public void dfs(List<List<Integer>> rooms, int room, boolean[] visited) {
        visited[room] = true;
        for (int key : rooms.get(room)) {
            if (!visited[key]) dfs(rooms, key, visited);
        }
    }
}
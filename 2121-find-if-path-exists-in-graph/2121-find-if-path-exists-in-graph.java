class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int[] e: edges){
            map.computeIfAbsent(e[0], k -> new ArrayList<>()).add(e[1]);
            map.computeIfAbsent(e[1], k -> new ArrayList<>()).add(e[0]);
        }

        Set<Integer> set = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        while(!queue.isEmpty()){
            int node = queue.poll();
            if(node == destination){
                return true;
            }
            if(set.contains(node)){
                continue;
            }
            set.add(node);
            for(int i: map.get(node)){
                queue.add(i);
            }
        }
        return false;

    }
}
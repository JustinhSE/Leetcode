
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        // Create adjacency list representation of the graph
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int[] time : times) {
            graph.computeIfAbsent(time[0], key -> new ArrayList<>()).add(new int[] { time[1], time[2] });
        }
        //node, node weight
        // (node, weight)

        // Priority queue to store (weight, node) pairs
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[1] - b[1]); 
        heap.add(new int[] { k,0 }); //node weight 

        Set<Integer> seen = new HashSet<>();
        int time = 0;

        while (!heap.isEmpty()) {
            int[] current = heap.poll();
            int node = current[0], weight = current[1];

            if (seen.contains(node)) {
                continue;
            }

            seen.add(node);
            time = weight;

            if (!graph.containsKey(node)) {
                continue;
            }

            for (int[] neighbor : graph.get(node)) {
                heap.add(new int[] {  neighbor[0], weight + neighbor[1] });
            }
        }

        return seen.size() == n ? time : -1;
    }
}
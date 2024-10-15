
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        // Create adjacency list representation of the graph
        Map<Integer, List<int[]>> graph = new HashMap<>();
        for (int[] time : times) {
            graph.computeIfAbsent(time[0], key -> new ArrayList<>()).add(new int[] { time[1], time[2] });
        }

        // Priority queue to store (weight, node) pairs
        PriorityQueue<int[]> heap = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        heap.offer(new int[] { 0, k });

        Set<Integer> seen = new HashSet<>();
        int time = 0;

        while (!heap.isEmpty()) {
            int[] current = heap.poll();
            int weight = current[0], node = current[1];

            if (seen.contains(node)) {
                continue;
            }

            seen.add(node);
            time = weight;

            if (!graph.containsKey(node)) {
                continue;
            }

            for (int[] neighbor : graph.get(node)) {
                heap.offer(new int[] { weight + neighbor[1], neighbor[0] });
            }
        }
        System.gc();
        if (seen.size() == n) {
            return time;
        }

        return -1;
    }
}
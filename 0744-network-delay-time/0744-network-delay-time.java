class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> map = new HashMap<>();
        for(int[] t: times){
            map.computeIfAbsent(t[0], key -> new ArrayList<>()).add(new int[] {t[1], t[2]}); //node, weight
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        pq.add(new int[] {k,0});
        Set<Integer> set = new HashSet<>();
        int time = 0;
        while(!pq.isEmpty()){
            int[] curr = pq.poll();
            int node = curr[0];
            int weight = curr[1];
            if(set.contains(node)){continue; }
            set.add(node);
            time = weight; 
            if(!map.containsKey(node)){continue; }
            for(int[] adjacents: map.get(node)){
                pq.add(new int[] {adjacents[0], weight + adjacents[1] });
            }
        }

        return set.size() == n ? time : -1;

    }
}
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        HashMap<Integer,List<int[]>> adj=new HashMap<>();
        int[] dist=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        for(int i=0;i<=n;i++){
            adj.put(i,new ArrayList<>());
        }
        for(int[] edge : times){
            adj.get(edge[0]).add(new int[]{edge[1],edge[2]});

        }

        PriorityQueue<int[]> pq = new PriorityQueue<>(
				(a,b) -> a[1]-b[1]
				);
        pq.offer(new int[] {k , 0}); 
        dist[k]=0;
        while(!pq.isEmpty()){
            int[] cur=pq.poll();
            if(dist[cur[0]]<cur[1]) continue;

            for(int[] nei:adj.get(cur[0])){
                if(cur[1]+nei[1]<dist[nei[0]]){
                    dist[nei[0]]=cur[1]+nei[1];
                    pq.offer(new int[]{nei[0],cur[1]+nei[1]});
                }
            }
        }
        int as=0;
        for(int i=1;i<n+1;i++){
            if(dist[i]==Integer.MAX_VALUE) return -1;

            as=Math.max(as,dist[i]);
        }
        return as;

    }
}
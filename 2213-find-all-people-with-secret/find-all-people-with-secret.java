class Solution {
   public List<Integer> findAllPeople(int n, int[][] meetings, int firstPerson) {
        int[] times = new int[n];
        Arrays.fill(times, Integer.MAX_VALUE);
        Map<Integer, Set<int[]>> map = new HashMap<>();
        Set<Integer> notified = new HashSet<>();
        for (int[] meeting : meetings) {
        	map.computeIfAbsent(meeting[0], x -> new HashSet<int[]>()).add(new int[] {meeting[1], meeting[2]});
        	map.computeIfAbsent(meeting[1], x -> new HashSet<int[]>()).add(new int[] {meeting[0], meeting[2]});
        }
        Deque<Integer> q = new ArrayDeque<>();
        q.offer(0);
        q.offer(firstPerson);
        times[0] = times[firstPerson] = 0;
        while (!q.isEmpty()) {
        	int person = q.poll();
        	notified.add(person);
        	for (int[] p : map.getOrDefault(person, new HashSet<int[]>())) {
        		if (times[person] > p[1] || times[p[0]] <= p[1])
        			continue;
    			times[p[0]] = p[1];
    			q.offer(p[0]);
        	}
        }
        return new ArrayList<Integer>(notified);
	}
}
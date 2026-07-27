class Solution {
    public int[] topKFrequent(int[] nums, int k) {

            // Step 1: Count frequency
                    HashMap<Integer, Integer> map = new HashMap<>();

                            for (int n : nums) {
                                        map.put(n, map.getOrDefault(n, 0) + 1);
                                                }

                                                        // Step 2: Min Heap based on frequency
                                                                PriorityQueue<Integer> heap = new PriorityQueue<>(
                                                                            (a, b) -> map.get(a) - map.get(b)
                                                                                    );

                                                                                            for (int key : map.keySet()) {
                                                                                                        heap.add(key);

                                                                                                                    // Keep only k elements in heap
                                                                                                                                if (heap.size() > k) {
                                                                                                                                                heap.poll();
                                                                                                                                                            }
                                                                                                                                                                    }

                                                                                                                                                                            // Step 3: Store result
                                                                                                                                                                                    int[] result = new int[k];

                                                                                                                                                                                            for (int i = 0; i < k; i++) {
                                                                                                                                                                                                        result[i] = heap.poll();
                                                                                                                                                                                                                }

                                                                                                                                                                                                                        return result;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            }
// We have a collection of stones, each stone has a positive integer weight.
//
// Each turn, we choose the two heaviest stones and smash them together.
//
// Suppose the stones have weights x and y with x <= y.  The result of this smash is:
//
// If x == y, both stones are totally destroyed;
// If x < y, the stone of weight x is totally destroyed, and the stone of weight y has new weight y-x.
//
// At the end, there is at most 1 stone left.  Return the weight of this stone (or 0 if there are no stones left.)
//
// *Explanation*
// Put all elements into a priority queue.
// Pop out the two biggest, push back the difference,
// until there are no more two elements left.
//
//
// *Complexity*
// Time O(NlogN)
// Space O(N)

import java.util.*;

class LastStoneWeight {

  public static void main(String[] args) {
    LastStoneWeight myInstance = new LastStoneWeight();
    int[] stonelist = {2,7,4,1,8,1};
    myInstance.lastStoneWeight(stonelist);

  }

  public int lastStoneWeight(int[] A) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int a : A)
            pq.offer(a);
        while (pq.size() > 1)
            pq.offer(pq.poll() - pq.poll());
        return pq.poll();
    }
}

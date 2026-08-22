class DinnerPlates {
    ArrayList<Stack<Integer>> tab;
    PriorityQueue<Integer> avail;
    int mxcap;

    public DinnerPlates(int capacity) {
        mxcap = capacity;
        tab = new ArrayList<>();
        avail = new PriorityQueue<>();
    }

    public void push(int val) {
        int ind;

        while (!avail.isEmpty() && avail.peek() >= tab.size()) {
            avail.poll();
        }

        if (avail.isEmpty()) {
            tab.add(new Stack<>());
            ind = tab.size() - 1;
        } else {
            ind = avail.poll();
        }

        tab.get(ind).push(val);

        if (tab.get(ind).size() < mxcap) {
            avail.offer(ind);
        }
    }

    public int pop() {
        while (!tab.isEmpty() && tab.get(tab.size() - 1).isEmpty()) {
            tab.remove(tab.size() - 1);
        }

        if (tab.isEmpty()) {
            return -1;
        }

        int ind = tab.size() - 1;
        int rem = tab.get(ind).pop();

        if (tab.get(ind).size() < mxcap) {
            avail.offer(ind);
        }

        while (!tab.isEmpty() && tab.get(tab.size() - 1).isEmpty()) {
            tab.remove(tab.size() - 1);
        }

        return rem;
    }

    public int popAtStack(int index) {
        if (index < 0 || index >= tab.size() || tab.get(index).isEmpty()) {
            return -1;
        }

        if (tab.get(index).size() == mxcap) {
            avail.offer(index);
        }

        return tab.get(index).pop();
    }
}
class TimeMap {
    class Pair {
        String value;
        int timestamp;

        Pair(String value, int timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }
        @Override
        public String toString() {
            return "(" + value + ", " + timestamp + ")";
        }
    }

    HashMap<String, List<Pair>> timeStampHm;

    public TimeMap() {
        timeStampHm = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (timeStampHm.containsKey(key)) {
            List<Pair> list = timeStampHm.get(key);
            list.add(new Pair(value, timestamp));
        } else {
            List<Pair> list = new ArrayList<>();
            Pair np = new Pair(value, timestamp);
            list.add(np);
            timeStampHm.put(key, list);
        }

        //System.out.println(timeStampHm);
    }

    public String get(String key, int timestamp) {
        if (!timeStampHm.containsKey(key)) {
            return "";
        }

        List<Pair> list = timeStampHm.get(key);

        int l = 0;
        int r = list.size() - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            Pair mp = list.get(mid);

            if (timestamp == mp.timestamp) {
                return mp.value;
            } else if (timestamp < mp.timestamp) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        if(l-1 < 0){
            return "";
        }
        return list.get(l-1).timestamp <= timestamp ? list.get(l-1).value : "" ;
    }
}

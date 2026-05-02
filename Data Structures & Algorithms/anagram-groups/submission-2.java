class Solution {

     class Pair implements Comparable<Pair>{
        String orgString;
        String lexicoString;

        public Pair(String orgString,String lexicoString){
            this.orgString = orgString;
            this.lexicoString = lexicoString;
        }

        @Override
        public int compareTo(Pair o){
            return this.lexicoString.compareTo(o.lexicoString);
        }
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs.length == 1){
            List<List<String>> ls = new ArrayList<>();
            List<String> lsc = new ArrayList<>();
            lsc.add(strs[0]);
            ls.add(lsc);
            return ls;
        }

        ArrayList<Pair> list = new ArrayList<>();

        for(int i=0; i<strs.length; i++){
            char[] ch = strs[i].toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            list.add(new Pair(strs[i],sorted));
        }

        Collections.sort(list);

        // for (Pair p : list) {
        //     System.out.println(p.orgString + " -> " + p.lexicoString);
        // }

        List<List<String>> components = new ArrayList<>();
        List<String> component = new ArrayList<>();
        component.add(list.get(0).orgString);

        for(int i=0; i<list.size()-1; i++){
            Pair p1 = list.get(i);
            Pair p2 = list.get(i + 1);
            if(p1.lexicoString.equals(p2.lexicoString)){
                component.add(p2.orgString);
            }

            else{
                if (!component.isEmpty()) {
                    components.add(component);
                }
                component = new ArrayList<>();
                component.add(p2.orgString);
            }
        }
        if(component.size()>0){
            components.add(component);
        }
        return components;
     }
}

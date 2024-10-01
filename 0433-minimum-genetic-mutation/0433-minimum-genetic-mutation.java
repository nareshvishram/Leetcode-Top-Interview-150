class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        Queue<String> q = new LinkedList<>();
        Set<String> vis = new HashSet<>();
        Set<String> bankSet = new HashSet<>();
        for (String s : bank)
            bankSet.add(s);
        if (!bankSet.contains(endGene))
            return -1;
        q.add(startGene);
        vis.add(startGene);
        int level = 0;
        char[] opt = new char[] { 'A', 'C', 'G', 'T' };
        while (!q.isEmpty()) {
            int size = q.size();

            while (size-- > 0) {
                String parent = q.poll();
                // System.out.println(parent);

                char[] parentc = parent.toCharArray();
                if (parent.equals(endGene))
                    return level;
                // System.out.println("ffff:" + parent);
                boolean flag=false;
                for (int j = 0; j < 4; j++) {
                    char tmp[] = parentc;
                    for (int i = 0; i < parentc.length; i++) {
                        char copy = parentc[i];
                        parentc[i] = opt[j];
                        String newStr = new String(parentc);
                        // System.out.println("new:" + newStr);
                        if (bankSet.contains(newStr) && !vis.contains(newStr)) {
                            q.add(newStr);
                            vis.add(newStr);
                            flag=true;
                            // System.out.println("added:" + newStr);
                        }
                        parentc[i] = copy;
                    }
                }
                // if(!flag)
                //     return -1;
            }
            level++;
        }
        return -1;
    }
}
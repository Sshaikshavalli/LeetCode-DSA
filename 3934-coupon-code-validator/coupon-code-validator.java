import java.util.*;

class Solution {
    public List<String> validateCoupons(
            String[] code, String[] businessLine, boolean[] isActive) {

        Set<String> validBusiness = new HashSet<>(
                Arrays.asList("restaurant", "grocery", "pharmacy", "electronics")
        );

        List<Integer> validIndexes = new ArrayList<>();

       
        for (int i = 0; i < code.length; i++) {

            if (!isActive[i]) continue;
            if (code[i] == null || code[i].isEmpty()) continue;
            if (!code[i].matches("[A-Za-z0-9_]+")) continue;
            if (!validBusiness.contains(businessLine[i])) continue;

            validIndexes.add(i);
        }


        validIndexes.sort((i, j) -> {
            int cmp = businessLine[i].compareTo(businessLine[j]);
            if (cmp != 0) return cmp;
            return code[i].compareTo(code[j]);
        });

       
        List<String> result = new ArrayList<>();
        for (int i : validIndexes) {
            result.add(code[i]);
        }

        return result;
    }
}



class Solution {
    public String encode(List<String> strs) {
        StringBuilder s = new StringBuilder();

        for (String st : strs) {
            s.append(st).append("#&9");
        }

        return s.toString();
    }

    public List<String> decode(String str) {
        if (str.isEmpty()) {
            return new ArrayList<>();
        }

        String[] parts = str.split("#&9", -1);

        // Remove the final empty part caused by the trailing delimiter
        return new ArrayList<>(
            Arrays.asList(Arrays.copyOf(parts, parts.length - 1))
        );
    }
}

class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> startCities = new HashSet<>();
        // Collect all starting cities
        for (List<String> path : paths) {
            startCities.add(path.get(0));
        }
        // The destination city is the one not in starting set
        for (List<String> path : paths) {
            String dest = path.get(1);
            if (!startCities.contains(dest)) {
                return dest;
            }
        }
        return ""; // shouldn't happen based on problem constraints
    }
}

class UndergroundSystem {
Map<Integer , Pair<String,Integer>> CheckInmap;
// store route data
    Map<String, Pair<Integer, Integer>> routeMap;
    public UndergroundSystem() {
        CheckInmap = new HashMap<>();
        routeMap = new HashMap<>();
    }
    
    public void checkIn(int id, String stationName, int t) {
        CheckInmap.put(id , new Pair<>(stationName , t));
    }
    
    public void checkOut(int id, String stationName, int t) {
        Pair<String , Integer> checkindata = CheckInmap.get(id);

        int startTime = checkindata.getValue();
     String startStation = checkindata.getKey();
     int travelTime = t - startTime;

        String route = startStation + "-" + stationName;

        Pair<Integer, Integer> routeData = routeMap.getOrDefault(route, new Pair<>(0, 0));

        int totalTime = routeData.getKey() + travelTime;
        int count = routeData.getValue() + 1;

        routeMap.put(route, new Pair<>(totalTime, count));
    }
    
    public double getAverageTime(String startStation, String endStation) {
        String route = startStation + "-" + endStation;

        Pair<Integer, Integer> data = routeMap.get(route);

        return (double) data.getKey() / data.getValue();
    }
}

/**
 * Your UndergroundSystem object will be instantiated and called as such:
 * UndergroundSystem obj = new UndergroundSystem();
 * obj.checkIn(id,stationName,t);
 * obj.checkOut(id,stationName,t);
 * double param_3 = obj.getAverageTime(startStation,endStation);
 */
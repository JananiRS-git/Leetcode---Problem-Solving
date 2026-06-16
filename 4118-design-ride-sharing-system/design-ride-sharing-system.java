class RideSharingSystem {
    Queue<Integer> rider;
    Queue<Integer> driver;
    Set<Integer> cancel;
    public RideSharingSystem() {
        rider= new LinkedList<>();
        driver = new LinkedList<>();
        cancel= new HashSet<>();
    }
    
    public void addRider(int riderId) {
        rider.offer(riderId);
        cancel.remove(riderId);
    }
    
    public void addDriver(int driverId) {
        driver.offer(driverId);
    }
    
    public int[] matchDriverWithRider() {
        while(!rider.isEmpty() && cancel.contains(rider.peek())){
            rider.poll();
        }
        if(rider.isEmpty() || driver.isEmpty()){
            return new int[] {-1,-1};
        }
        int d=driver.poll();
        int r=rider.poll();
        return new int[] {d,r};
        
    }
    
    public void cancelRider(int riderId) {
        cancel.add(riderId);
    }
}

/**
 * Your RideSharingSystem object will be instantiated and called as such:
 * RideSharingSystem obj = new RideSharingSystem();
 * obj.addRider(riderId);
 * obj.addDriver(driverId);
 * int[] param_3 = obj.matchDriverWithRider();
 * obj.cancelRider(riderId);
 */
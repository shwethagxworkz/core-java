class BusStand {
    private int busStandId;
    private String busStandName;
    private String busStandAddress;
    private String locationCode;
    private String managerName;
    private int numberOfEmployees;

    // Setter and Getter methods for numberOfEmployees
    public void setBusStandId(int busStandId) {
        this.busStandId = busStandId;
    }

    public int getBusStandId() {
        return busStandId;
    }

    
    public void setBusStandName(String busStandName) {
        this.busStandName = busStandName;
    }

    public String getBusStandName() {
        return busStandName;
    }

    
    public void setBusStandAddress(String busStandAddress) {
        this.busStandAddress = busStandAddress;
    }

    public String getBusStandAddress() {
        return busStandAddress;
    }

    
    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    public String getLocationCode() {
        return locationCode;
    }

    
    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerName() {
        return managerName;
    }

    
    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }
}
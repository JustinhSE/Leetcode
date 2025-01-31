class ParkingSystem {
    private int[] parking;
    public ParkingSystem(int big, int medium, int small) {
        parking = new int[3];
        parking[0] = big; 
        parking[1] = medium; 
        parking[2] = small;
    }
    
    public boolean addCar(int carType) {
        if(parking == null){return false;}
        else if(carType == 1){
            if(parking[0] > 0){
                parking[0]--;
                return true;
            }
            return false;

        }
        else if(carType == 2){
            if(parking[1] > 0){
                parking[1]--;
                return true;
            }
            return false;
        }
        else{
           if(parking[2] > 0){
                parking[2]--;
                return true;
            }
            return false;
        }
        
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
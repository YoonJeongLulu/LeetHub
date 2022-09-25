class ParkingSystem {

    int big_room, medium_room, small_room;

    public ParkingSystem(int big, int medium, int small) {
        this.big_room = big;
        this.medium_room = medium;
        this.small_room = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1){
            this.big_room--;
            if (this.big_room < 0){
                return false;
            }
            else return true;
        }
        if (carType == 2){
            this.medium_room--;
            if (this.medium_room < 0){
                return false;
            }
            else return true;
        }
        if (carType == 3){
            this.small_room--;
            if (this.small_room < 0){
                return false;
            }
            else return true;
        }
        return true;
    }
}
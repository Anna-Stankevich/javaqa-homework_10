public class Radio {
    private int station;
    private int NumberOfStations;
    private int volume = 30;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(){
        this.NumberOfStations = 10;
    }
    public Radio(int NumberOfStations){
        this.NumberOfStations = NumberOfStations;
    }

    public int getNumberOfStations() {
        return NumberOfStations;
    }
    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getStation() {
        return station;
    }

    public int getVolume() {
        return volume;
    }

    public void setStation(int newStation) {
        if (newStation >= 0 && newStation < NumberOfStations) {
            station = newStation;
        }

    }

    public void setVolume(int currentVolume) {
        if (currentVolume >= 0 && currentVolume <= 100) {
            volume = currentVolume;
        }
    }

    public void nextStation() {
        if (station < NumberOfStations - 1) {
            station = station + 1;
        } else {
            station = 0;
        }
    }

    public void prevStation() {
        if (station > 0) {
            station = station - 1;
        } else {
            station = NumberOfStations - 1;
        }
    }

    public void increaseVolume() {
        if (volume < 100) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}

public class Radio {
    private int station;
    private int volume;

    public int getStation() {
        return station;
    }

    public int getVolume() {
        return volume;
    }

    public void setStation(int newStation) {
        if (newStation >= 0 && newStation <= 9) {
            station = newStation;
        }

    }

    public void setVolume(int currentVolume) {
        if (currentVolume >= 0 && currentVolume <= 10) {
            volume = currentVolume;
        }
    }

    public void nextStation() {
        if (station < 9) {
            station = station + 1;
        } else {
            station = 0;
        }
    }

    public void prevStation() {
        if (station > 0) {
            station = station - 1;
        } else {
            station = 9;
        }
    }

    public void increaseVolume() {
        if (volume < 10) {
            volume = volume + 1;
        }
    }

    public void decreaseVolume() {
        if (volume > 0) {
            volume = volume - 1;
        }
    }
}

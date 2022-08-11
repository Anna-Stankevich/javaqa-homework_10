public class Main {
    public static void main(String[] args) {
        Radio radio = new Radio();
        radio.setStation(5);
        radio.nextStation();
        System.out.println(radio.getStation());

        Radio radio1 = new Radio();
        radio1.setStation(5);
        radio1.prevStation();
        System.out.println(radio1.getStation());

        Radio radio2 = new Radio();
        radio2.setVolume(5);
        radio2.increaseVolume();
        System.out.println(radio2.getVolume());

        Radio radio3 = new Radio();
        radio3.setVolume(5);
        radio3.decreaseVolume();
        System.out.println(radio3.getVolume());
    }

}

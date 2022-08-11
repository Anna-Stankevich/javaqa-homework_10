import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RadioTest {

    @Test
    void shouldInitFieldsVolume(){
        Radio service = new Radio();
        Assertions.assertEquals(0, service.getMinVolume());
        Assertions.assertEquals(100, service.getMaxVolume());
        Assertions.assertEquals(30, service.getVolume());

    }
    @Test
    void shouldInitFieldsStationWithoutParameters(){
        Radio service = new Radio();
        Assertions.assertEquals(10,service.getNumberOfStations());

    }
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/shouldInitFieldsStation.csv")
    void shouldInitFieldsStation(int stations, int expected) {
        Radio service = new Radio(stations);
        Assertions.assertEquals(expected, service.getNumberOfStations());

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/limitValuesForSetStation.csv")
    void limitValuesForSetStation(int station, int expected) {
        Radio service = new Radio();

        service.setStation(station);

        int actual = service.getStation();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/limitValuesForSetVolume.csv")
    void limitValuesForSetVolume(int volume, int expected) {
        Radio service = new Radio();

        service.setVolume(volume);

        int actual = service.getVolume();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/checkSwitchingToNextStation.csv")
    void checkSwitchingToNextStation(int station, int expected) {
        Radio switchToNext = new Radio();

        switchToNext.setStation(station);
        switchToNext.nextStation();

        int actual = switchToNext.getStation();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/checkSwitchingToPrevStation.csv")
    void checkSwitchingToPrevStation(int station, int expected) {
        Radio switchToPrev = new Radio();

        switchToPrev.setStation(station);
        switchToPrev.prevStation();

        int actual = switchToPrev.getStation();

        Assertions.assertEquals(expected, actual);

    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/checkSwitchingToIncreaseVolume.csv")
    void checkSwitchingToIncreaseVolume(int volume, int expected) {
        Radio switchToIncrease = new Radio();

        switchToIncrease.setVolume(volume);
        switchToIncrease.increaseVolume();

        int actual = switchToIncrease.getVolume();

        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/checkSwitchingToDecreaseVolume.csv")
    void checkSwitchingToDecreaseVolume(int volume, int expected) {
        Radio switchToDecrease = new Radio();

        switchToDecrease.setVolume(volume);
        switchToDecrease.decreaseVolume();

        int actual = switchToDecrease.getVolume();

        Assertions.assertEquals(expected, actual);
    }

}
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void NextCurrentChannelTest() {
        Radio Radio = new Radio();
        Radio.setCurrentChannel(9);
        Radio.nextChannel();
        int expected = 0;
        int actual = Radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void SetNewChannelTestWrong() {
        Radio Radio = new Radio();
        Radio.setCurrentChannel(11);
        int expected = 0;
        int actual = Radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void PrevChannelTest() {
        Radio Radio = new Radio();
        Radio.setCurrentChannel(9);
        Radio.prevChannel();
        int expected = 8;
        int actual = Radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);


    }
    @Test
    public void PrevAfterMinChannelTest() {
        Radio Radio = new Radio();
        Radio.setCurrentChannel(0);
        Radio.prevChannel();
        int expected = 9;
        int actual = Radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);


    }
    @Test
    public void PrevChannelNullTest() {
        Radio Radio = new Radio();
        Radio.setCurrentChannel(9);
        Radio.prevChannel();
        int expected = 8;
        int actual = Radio.getCurrentChannel();
        Assertions.assertEquals(expected, actual);


    }
    @Test
    public void PrevVolumeTest() {
        Radio Radio = new Radio();
        Radio.setVolume(100);
        Radio.setDecreaseVolume();
        int expected = 99;
        int actual = Radio.getVolume();
        Assertions.assertEquals(expected, actual);


    }
    @Test

    public void IncreaseVolumeTest() {
        Radio Radio = new Radio();
        Radio.setVolume(33);
        Radio.setIncreaseVolume();
        int expected = 34;
        int actual = Radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void IncreaseOverMaxVolumeTest() {
        Radio Radio = new Radio();
        Radio.setVolume(100);
        Radio.setIncreaseVolume();
        int expected = 100;
        int actual = Radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }
    @Test

    public void DecreaseVolumeTest() {
        Radio Radio = new Radio();
        Radio.setVolume(5);
        Radio.setDecreaseVolume();
        int expected = 4;
        int actual = Radio.getVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void LowAfterMinVolumeTest() {
        Radio Radio = new Radio();
        Radio.setVolume(1);
        Radio.setDecreaseVolume();
        int expected = 0;
        int actual = Radio.getVolume();
        Assertions.assertEquals(expected, actual);
    }



}

public class Radio {
    private int CurrentChannel;
    private int Volume;

    public int getCurrentChannel() {
        return CurrentChannel;

    }

    public int getVolume() {
        return Volume;
    }

    public void setCurrentChannel(int newCurrentChannel) {
        if (newCurrentChannel > 9) {
            return;
        }
        if (newCurrentChannel < 0) {
            return;
        }
        CurrentChannel = newCurrentChannel;
    }

    public void nextChannel() {
        if (CurrentChannel == 9) {
            setCurrentChannel(0);
        } else {
            CurrentChannel++;

        }

    }

    public void prevChannel() {

        if (CurrentChannel == 0) {
            setCurrentChannel(9);

        } else {
            CurrentChannel--;

        }
    }

    public void setVolume(int newVolume) {
        if (newVolume > 100) {
            return;
        }
        if (newVolume < 0) {
            return;
        }
        Volume = newVolume;

    }

    public void setIncreaseVolume() {
        int target = Volume + 1;
        setVolume(target);
    }


    public void setDecreaseVolume() {
        int target = Volume - 1;
        setVolume(target);
    }
}

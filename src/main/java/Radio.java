public class Radio {
    private int currentChannel;
    private int volume;
    private final int maxCurrentChannel = 9;
    private final int minCurrentChannel = 0;
    private final int maxVolume = 100;
    private final int minVolume = 0;


    public int getCurrentChannel() {
        return currentChannel;

    }

    public int getVolume() {
        return volume;
    }

    public void setCurrentChannel(int newCurrentChannel) {
        if (newCurrentChannel < minCurrentChannel) {
            return;
        }
        if (newCurrentChannel > maxCurrentChannel) {
            return;
        }
        currentChannel = newCurrentChannel;
    }

    public void nextChannel() {
        if (currentChannel != maxCurrentChannel) {
            currentChannel ++;
            return;
        }
        currentChannel = 0;

        }

    public void prevChannel() {

        if (currentChannel == minCurrentChannel) {
            setCurrentChannel(maxCurrentChannel);

        } else {
            currentChannel--;

        }
    }

    public void setVolume(int newVolume) {
        if (newVolume > maxVolume) {
            return;
        }
        if (newVolume < minVolume) {
            return;
        }
        volume = newVolume;

    }

    public void setIncreaseVolume() {
        int target = volume + 1;
        setVolume(target);
    }


    public void setDecreaseVolume() {
        int target = volume - 1;
        setVolume(target);
    }
}

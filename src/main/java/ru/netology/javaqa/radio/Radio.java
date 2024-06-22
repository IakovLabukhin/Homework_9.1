package ru.netology.javaqa.radio;

public class Radio {

    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    private int currentRadioStation = minRadioStation;
    private int maxVolume = 100;
    private int minVolume = 0;
    private int currentVolume = minVolume;

    public Radio() {
        this.maxRadioStation = maxRadioStation;
    }

    public Radio(int amountRadioStation) {
        this.maxRadioStation = amountRadioStation - 1;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < minRadioStation) {
            return;
        }
        if (newCurrentRadioStation > maxRadioStation) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToMaxRadioStation() {
        currentRadioStation = maxRadioStation;
    }

    public void setToMinRadioStation() {
        currentRadioStation = minRadioStation;
    }

    public void setVolumeToMaximum() {
        currentVolume = maxVolume;
    }

    public void setVolumeToMinimum() {
        currentVolume = minVolume;
    }

    public void switchToNextStation() {
        if (currentRadioStation < maxRadioStation) {
            setCurrentRadioStation(currentRadioStation + 1);
        } else {
            setToMinRadioStation();
        }
    }

    public void switchToPreviousStation() {
        if (currentRadioStation > minRadioStation) {
            setCurrentRadioStation(currentRadioStation - 1);
        } else {
            setToMaxRadioStation();
        }
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            setCurrentVolume(currentVolume + 1);
        } else {
            setVolumeToMaximum();
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            setCurrentVolume(currentVolume - 1);
        } else {
            setVolumeToMinimum();
        }
    }
}
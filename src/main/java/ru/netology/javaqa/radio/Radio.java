package ru.netology.javaqa.radio;

public class Radio {

    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void resetToFirstStation() {
        currentRadioStation = 0;
    }

    public void jumpToLastStation() {
        currentRadioStation = 9;
    }

    public void setVolumeToMaximum() {
        currentVolume = 100;
    }

    public void setVolumeToMinimum() {
        currentVolume = 0;
    }

    public void switchToNextStation() {
        if (currentRadioStation < 9) {
            setCurrentRadioStation(currentRadioStation + 1);
        } else {
            resetToFirstStation();
        }
    }

    public void switchToPreviousStation() {
        if (currentRadioStation > 0) {
            setCurrentRadioStation(currentRadioStation - 1);
        } else {
            jumpToLastStation();
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            setCurrentVolume(currentVolume + 1);
        } else {
            setVolumeToMaximum();
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            setCurrentVolume(currentVolume - 1);
        } else {
            setVolumeToMinimum();
        }
    }
}
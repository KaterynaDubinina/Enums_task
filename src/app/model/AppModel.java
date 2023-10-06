package app.model;

import app.utils.AppTimer;

public class AppModel {

    public String getResult(String[] data) {
        if (!contains(data[2])) {
            return "Invalid input";
        }

        String adminName = data[0];
        String emergencyNumber = data[1];
        Mode mode = Mode.valueOf(data[2]);
        AppTimer timer = new AppTimer();
        String message = switch (mode) {
            case RED -> "\uD83D\uDD34 Red - stop driving!";
            case YELLOW -> "\uD83D\uDFE1 Yellow - get ready to move.";
            case GREEN -> "\uD83D\uDFE2 Green - move!";
        };

        try {
            return timer.main() + message + "\nYou are served by operator, " + adminName +
                    ". In case of emergency, please call: " + emergencyNumber + ".";
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private boolean contains(String str) {
        for (Mode mode : Mode.values()) {
            if (mode.name().equals(str)) {
                return true;
            }
        }
        return false;
    }
    enum Mode {
        RED, YELLOW, GREEN
    }
}



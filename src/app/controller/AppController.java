package app.controller;

import app.model.AppModel;
import app.utils.AppTimer;
import app.view.AppView;

public class AppController {

    public void runApp() {
        AppView view = new AppView();
        AppModel model = new AppModel();
        view.getOutput(model.getResult(view.getData()));
    }
}

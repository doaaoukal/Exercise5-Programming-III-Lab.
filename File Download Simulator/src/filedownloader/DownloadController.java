/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filedownloader;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class DownloadController {

    @FXML private ProgressBar progressBar1, progressBar2, progressBar3;
    @FXML private Label status1, status2, status3;
    @FXML private Button startButton;

    @FXML
    private void startDownloads() {
        startButton.setDisable(true);
        startButton.setText("Downloading...");

        ProgressBar[] bars = {progressBar1, progressBar2, progressBar3};
        Label[] statuses = {status1, status2, status3};

        // إنشاء Thread مستقل لكل ملف 
        for (int i = 0; i < bars.length; i++) {
            new Thread(new DownloadTask(bars[i], statuses[i])).start();
        }
    }
}
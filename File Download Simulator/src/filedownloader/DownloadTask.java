/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filedownloader;

import javafx.application.Platform;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class DownloadTask implements Runnable {
    private final ProgressBar progressBar;
    private final Label statusLabel;

    public DownloadTask(ProgressBar progressBar, Label statusLabel) {
        this.progressBar = progressBar;
        this.statusLabel = statusLabel;
    }

    @Override
    public void run() {
        updateUI(0, "Downloading...");

        for (int i = 0; i <= 100; i += 10) {
            try {
                Thread.sleep(300); // محاكاة سرعة التحميل 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            double progress = i / 100.0;
            updateUI(progress, i + "%");
        }
        updateUI(1.0, "Done!");
    }

    private void updateUI(double progress, String status) {
        // تحديث الواجهة بأمان من داخل الخيط 
        Platform.runLater(() -> {
            progressBar.setProgress(progress);
            statusLabel.setText(status);
        });
    }
}
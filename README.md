File Download Simulator 📥
A JavaFX application that simulates concurrent file downloads to demonstrate multi-threading concepts in Java.

Overview
This project is a requirement for the Programming III Lab. The main objective is to simulate downloading 3 files simultaneously. Each download runs on its own individual thread to ensure the UI remains responsive throughout the process.

Features
Concurrent Downloading: Simulates downloading 3 files at the same time without blocking the UI.

Multi-threading: Uses a dedicated Thread for each download task (no thread pool).

Progress Tracking: Real-time updates for each file's progress bar.

UI Responsiveness: Utilizes Platform.runLater to ensure thread-safe UI updates.

Requirements
Java JDK 11 or higher.

JavaFX SDK.

Scene Builder (for UI editing).

How to Run
Clone this repository to your local machine.

Open the project in your IDE (e.g., NetBeans, IntelliJ).

Ensure the JavaFX libraries are correctly configured in your project settings.

Run Main.java to start the application.

Click "Start Downloads" to begin the simulation.

Technical Details
Pattern: MVC (Model-View-Controller).

Concurrency: Each file download is implemented as a Runnable task executed in a separate Thread.

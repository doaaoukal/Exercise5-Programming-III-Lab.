# File Download Simulator 📥

A JavaFX application that simulates concurrent file downloads to demonstrate multi-threading concepts in Java.

---

## 📋 Overview
This project is a requirement for the **Programming III Lab**. The main objective is to simulate downloading **3 files** simultaneously. Each download runs on its own individual thread to ensure the UI remains responsive throughout the process, without using a thread pool.

## ✨ Features
* **Concurrent Downloading:** Simulates downloading 3 files at the same time.
* **Multi-threading:** Uses a dedicated `Thread` for each download task.
* **Progress Tracking:** Real-time visual updates for each file's progress bar.
* **UI Responsiveness:** Utilizes `Platform.runLater` to ensure thread-safe UI updates.

## 🛠 Requirements
* Java JDK 11 or higher.
* JavaFX SDK.
* Scene Builder (for UI editing).

## 🚀 How to Run
1. Clone this repository to your local machine.
2. Open the project in your IDE (e.g., NetBeans, IntelliJ).
3. Ensure the JavaFX libraries are correctly configured in your project settings.
4. Run `Main.java` to start the application.
5. Click **"Start Downloads"** to begin the simulation.

## 🏷 Tags
#Java #JavaFX #Multithreading #Concurrency #ProgrammingLab #FileDownloader

---
*Created for Programming III Lab (CSCI 2108)*

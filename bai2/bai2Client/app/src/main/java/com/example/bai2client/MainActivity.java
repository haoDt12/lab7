package com.example.bai2client;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewResult = findViewById(R.id.responseTextView);

        // Set the IP and port of the server
        String serverIP = "10.2.0.15";
        int serverPort = 8080;

        // Create an object of the Client class
        Client client = new Client(serverIP, serverPort, textViewResult);

        // Execute the AsyncTask to connect to the server
        client.execute();
    }
}
package com.faceopen.socket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.net.URISyntaxException;

import io.socket.client.IO;
import io.socket.client.Socket;

public class MainActivity extends AppCompatActivity {


    private Socket socket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IO.Options options = new IO.Options();
        options.query = "username=faceopen&password=faceopen";

        try {
            socket = IO.socket("http://:5900", options);

        } catch (URISyntaxException e) {
            e.printStackTrace();
        }


    }
}

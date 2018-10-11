package org.computermentors.interactivestorythur.UI;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.computermentors.interactivestorythur.R;

public class MainActivity extends AppCompatActivity {

    private EditText nameEditText;
    private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameEditText = findViewById(R.id.nameEditText);
        startButton = findViewById(R.id.startButton);

        startButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameEditText.getText().toString().trim();
//                Toast.makeText(MainActivity.this, name, Toast.LENGTH_LONG).show();
                startStory(name);
            }
        });
    }

    private void startStory(String name) {
        Intent intent = new Intent(MainActivity.this, StoryActivity.class);
        Resources resources = getResources();
        String key = resources.getString(R.string.key_name);
        intent.putExtra(key, name);
        startActivity(intent);
    }
}















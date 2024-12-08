package com.tweak.customtoolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu m) {
        getMenuInflater().inflate(R.menu.toolbar_menu,m);
        return true;
    } //menu inflated, i.e, menu is shown (we can work on the backend code for the menu here)

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.new_group:
                Toast.makeText(this,"New Group",Toast.LENGTH_SHORT).show();
                break;

            case R.id.new_broadcast:
                Toast.makeText(this, "New broadcast", Toast.LENGTH_SHORT).show();
                break;

            case R.id.linked_devices:
                Toast.makeText(this, "Linked devices", Toast.LENGTH_SHORT).show();
                break;

            case R.id.starred_messages:
                Toast.makeText(this, "Starred messages", Toast.LENGTH_SHORT).show();
                break;

            case R.id.payments:
                Toast.makeText(this, "Payments", Toast.LENGTH_SHORT).show();
                break;

            case R.id.settings:
                Toast.makeText(this, "Settings", Toast.LENGTH_SHORT).show();
                break;

            default:
                break;
        }

        return true;
    }
}
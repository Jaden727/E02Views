package net.skhu;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.widget.AdapterView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.action_signup) {
            Intent intent = new Intent(this, SignupActivity.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.action_Memo) {
            Intent intent = new Intent(this, MemoActivity.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.action_buttons) {
            Intent intent = new Intent(this, ButtonsActivity.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.action_checkboxes) {
            Intent intent = new Intent(this, CheckboxesActivity.class);
            startActivity(intent);
            return true;
        }
        else if (id == R.id.action_spinners) {
            Intent intent = new Intent(this, SpinnersActivity.class);
            startActivity(intent);
            return true;
        }
        else if (id == R.id.action_alerts) {
            Intent intent = new Intent(this, AlertsActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
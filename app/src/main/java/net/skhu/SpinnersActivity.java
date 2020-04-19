package net.skhu;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.AdapterView;

public class SpinnersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinners);

        String[] stringArray_phone = { "집전화", "사무실전화", "휴대폰", "기타" };
        ArrayAdapter<String> adapter_phone =
                new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, stringArray_phone);
        adapter_phone.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner spinner_phone = (Spinner) findViewById(R.id.spinner_phoneType);
        spinner_phone.setAdapter(adapter_phone);


        String[] stringArray_address = { "집주소", "직장주소", "기타" };
        ArrayAdapter<String> adapter_address =
                new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, stringArray_address);
        adapter_address.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        final Spinner spinner_address = (Spinner) findViewById(R.id.spinner_addressType);
        spinner_address.setAdapter(adapter_address);

        View.OnClickListener listener1 = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Spinner spinner_phone = (Spinner) findViewById(R.id.spinner_phoneType);
                int index1 = spinner_phone.getSelectedItemPosition();
                String text1 = spinner_phone.getSelectedItem().toString();

                Spinner spinner_address = (Spinner) findViewById(R.id.spinner_addressType);
                int index2 = spinner_address.getSelectedItemPosition();
                String text2 = spinner_address.getSelectedItem().toString();

                String s = String.format("전화:%s(%d)   주소:%s(%d)", text1, index1, text2, index2);
                Toast.makeText(SpinnersActivity.this, s, Toast.LENGTH_SHORT).show();
            }
        };
        spinner_phone.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SpinnersActivity.this, "Spinner Phone 선택 : " + spinner_phone.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

        spinner_address.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(SpinnersActivity.this, "Spinner Address 선택 : " + spinner_address.getItemAtPosition(position), Toast.LENGTH_SHORT).show();
            }
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });




        Button button = (Button) findViewById(R.id.btnSave);
        button.setOnClickListener(listener1);

    }

}
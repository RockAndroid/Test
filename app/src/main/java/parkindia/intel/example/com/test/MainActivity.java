package parkindia.intel.example.com.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;

import parkindia.intel.example.com.firstlib.CentralTendancy;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.text);

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <=10; i++) {
            numbers.add(i);
        }
        double mean = CentralTendancy.arithmeticMean(numbers).doubleValue();
        textView.setText(String.valueOf(mean));

    }
}

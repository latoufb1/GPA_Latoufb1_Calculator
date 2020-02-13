package com.example.gpa_latoufb1_calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        Button b;
        EditText r1,r2,r3,r4,r5;
        TextView t;
        int count=0;
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            b=(Button)findViewById(R.id.button);
            r1=(EditText)findViewById(R.id.p1);
            r2=(EditText)findViewById(R.id.p2);
            r3=(EditText)findViewById(R.id.p3);
            r4=(EditText)findViewById(R.id.p4);
            r5=(EditText)findViewById(R.id.p5);
            t=(TextView)findViewById(R.id.txt);
            t.setBackgroundColor(Color.WHITE);
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    float g1, g2, g3, g4, g5;
                    if (count % 2 == 0) {
                        if (r1.getText().toString().equals("") || r2.getText().toString().equals("") || r3.getText().toString().equals("") || r4.getText().toString().equals("") || r5.getText().toString().equals("")) {
                            t.setText("Enter Grades In  Fields");
                        }
                        else {
                            g1 = Float.parseFloat(r1.getText().toString());
                            g2 = Float.parseFloat(r2.getText().toString());
                            g3 = Float.parseFloat(r3.getText().toString());
                            g4 = Float.parseFloat(r4.getText().toString());
                            g5 = Float.parseFloat(r5.getText().toString());
                            float avg = g1 + g2 + g3 + g4 + g5;
                            avg = avg / 5;
                            if (avg < 60) {
                                t.setText(Float.toString(avg));
                                t.setBackgroundColor(Color.RED);
                            } else if (avg > 60 && avg < 80) {
                                t.setText(Float.toString(avg));
                                t.setBackgroundColor(Color.YELLOW);
                            } else if (avg >= 80 && avg <= 100) {
                                t.setText(Float.toString(avg));
                                t.setBackgroundColor(Color.GREEN);
                            }
                            count++;
                            b.setText("Clear");
                        }

                    }
                    else
                    {
                        r1.setText("");
                        r2.setText("");
                        r3.setText("");
                        r4.setText("");
                        r5.setText("");
                        t.setText("");
                        b.setText("Compute GPA");
                        t.setBackgroundColor(Color.WHITE);
                        count++;
                    }
                }
            });
        }
    }

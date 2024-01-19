package com.example.assignment_20bci7071;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.appcompat.app.AppCompatActivity;
import org.w3c.dom.Text;
public class MainActivity extends AppCompatActivity {
 Button b1,b2;
 EditText e1,e2;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
 super.onCreate(savedInstanceState);
 setContentView(R.layout.activity_main);
 b1=findViewById(R.id.ctf);
 b2=findViewById(R.id.ftc);
 e1=findViewById(R.id.value);
 e2=findViewById(R.id.ans);
 b1.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 String s=e1.getText().toString();
 if(s.isEmpty()){
 e2.setText("");
 }
 else {
 int val = Integer.parseInt(s);
 double answer = (val * 1.8) + 32;
 e2.setText(String.valueOf(Math.round(answer)));
 }
 }
 });
 b2.setOnClickListener(new View.OnClickListener() {
 @Override
 public void onClick(View view) {
 String s=e1.getText().toString();
 if(s.isEmpty()){
 e2.setText("");
 }
 else {
 int val = Integer.parseInt(s);
 double answer = ((val - 32) * 5) / 9;
 e2.setText(String.valueOf(Math.round(answer)));
 }
 }
 });
 }
}

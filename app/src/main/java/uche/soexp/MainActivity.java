package uche.soexp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText name,phonenum;

    private Button saver,nextPage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        name = findViewById(R.id.name);
        phonenum = findViewById(R.id.phone_no);

        saver = findViewById(R.id.save_button);
        nextPage = findViewById(R.id.view_page);








//       contact c = new contact(name1, phoneno);
//       c.save();

       saver.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

                String name1 = name.getText().toString();
                String phoneno = phonenum.getText().toString();
               contact c = new contact(name1, phoneno);
               c.save();


               Log.e("Contact","Saved!");

               Toast.makeText(MainActivity.this,"Contact Saved",Toast.LENGTH_SHORT).show();

//               finish();
           }
       });


       nextPage.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               nextpager();
           }
       });



    }





    private void nextpager(){


        Intent i =  new Intent(this,listcontact.class);
        startActivity(i);


    }






}

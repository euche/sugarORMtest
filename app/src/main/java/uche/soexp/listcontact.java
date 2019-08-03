package uche.soexp;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class listcontact extends AppCompatActivity {


    RecyclerView s;
    SwipeRefreshLayout s1;

    List<contact> data = new ArrayList<>();

    contactaAdapter adapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listcontact);

        s1 = findViewById(R.id.update_contact);

        s = findViewById(R.id.contact_list);


        data = contact.listAll(contact.class);
        Log.e("Contact","no of items"+data.size());

         s.setLayoutManager(new LinearLayoutManager(this));
        s.setHasFixedSize(true);

        data = contact.listAll(contact.class);

        long count =  contact.count(contact.class);

        Log.e("Contact","no of items"+count);


         adapter = new contactaAdapter(this,data);
        s.setAdapter(adapter);


//
//        contactaAdapter adapter = new contactaAdapter(listcontact.this,data);
//        s.setAdapter(adapter);

         s1.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
             @Override
             public void onRefresh() {

                 s1.setRefreshing(false);


                getData();


//                 after getting the data


             }
         });







    }





    private void getData(){



        data = contact.listAll(contact.class);


        Log.e("Contact","no of items"+data.size());


        contactaAdapter adapter = new contactaAdapter(this,data);
        s.setAdapter(adapter);






    }








}

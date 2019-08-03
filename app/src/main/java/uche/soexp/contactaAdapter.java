package uche.soexp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class contactaAdapter extends RecyclerView.Adapter<contactaAdapter.contactviewHolder> {

    Context c;

    List<contact> cData;


    public contactaAdapter(Context c, List<contact> cData) {
        this.c = c;
        this.cData = cData;
    }


    public static class contactviewHolder extends RecyclerView.ViewHolder{

        private TextView contname;

        private TextView contphoneno;


        contactviewHolder(View v){

            super(v);

            contname = v.findViewById(R.id.contact_name);

            contphoneno = v.findViewById(R.id.contact_phone);

        }






    }



    @Override
    public contactviewHolder onCreateViewHolder( ViewGroup viewGroup, int i) {

        View  view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.dcontact,viewGroup,false);

        return new contactviewHolder(view);
    }

    @Override
    public void onBindViewHolder( contactviewHolder contactviewHolder, int i) {

        contact c = cData.get(i);

        contactviewHolder.contname.setText(c.getName());
        contactviewHolder.contphoneno.setText(c.getPhonno());



    }

    @Override
    public int getItemCount() {
        return cData.size();
    }
}

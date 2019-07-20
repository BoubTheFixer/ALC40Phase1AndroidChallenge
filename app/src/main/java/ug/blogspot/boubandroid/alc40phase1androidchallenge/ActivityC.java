package ug.blogspot.boubandroid.alc40phase1androidchallenge;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;
import android.widget.ImageView;

public class ActivityC extends AppCompatActivity {
    ImageView call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        call=findViewById(R.id.imageView4);

        /*
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent caller = new Intent(Intent.ACTION_CALL);
                caller.setData(Uri.parse("tel:0786845180"));
                startActivity(caller);
            }
        });
        */

        getIntent();
    }

    public void call(View view){
        Intent caller = new Intent(Intent.ACTION_CALL);
        caller.setData(Uri.parse("tel:0786845180"));
        startActivity(caller);
    }

    public void goToSlack(View view) {
        Intent slack = new Intent(Intent.ACTION_VIEW);
        slack.setData(Uri.parse("https://alc4-android.slack.com/team/UKLUFE40N"));
        startActivity(slack);
    }

    public void goToEmail(View view) {
        Intent mail = new Intent(Intent.ACTION_SENDTO);
        mail.setData(Uri.parse("mailto: boubit2002@gmail.com"));
        mail.putExtra(Intent.EXTRA_SUBJECT,
                "Andela ALC4.0 Phase Challenge");
        mail.putExtra(Intent.EXTRA_TEXT, "Salutations Boub, I have liked your App. " +
                "Regards!");
        startActivity(mail);
    }
/*
    public void call(View view) {
        String number = "+256776707264";
        Intent callIntent = new Intent(Intent.ACTION_CALL);
        callIntent.setData(Uri.parse("tel:"+number));
        startActivity(callIntent);
    }
    */
}

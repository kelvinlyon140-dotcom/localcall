package com.locallcall.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.Gravity;
import android.widget.*;

public class MainActivity extends Activity {
    int dp(float v) { return (int)(v * getResources().getDisplayMetrics().density + .5f); }

    @Override public void onCreate(Bundle b) {
        super.onCreate(b);
        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setPadding(dp(20), dp(28), dp(20), dp(16));
        root.setBackgroundColor(Color.rgb(10,12,20));

        TextView logo = new TextView(this);
        logo.setText("◉  LocalCall");
        logo.setTextColor(Color.WHITE);
        logo.setTextSize(30);
        logo.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
        root.addView(logo, new LinearLayout.LayoutParams(-1, dp(55)));

        TextView welcome = new TextView(this);
        welcome.setText("Connect nearby. Call, text and share.");
        welcome.setTextColor(Color.LTGRAY);
        welcome.setTextSize(17);
        root.addView(welcome, new LinearLayout.LayoutParams(-1, dp(45)));

        TextView status = new TextView(this);
        status.setText("●  Looking for nearby LocalCall devices…");
        status.setTextColor(Color.rgb(80,220,150));
        status.setTextSize(15);
        status.setPadding(0, dp(8), 0, dp(14));
        root.addView(status);

        LinearLayout card = new LinearLayout(this);
        card.setOrientation(LinearLayout.VERTICAL);
        card.setPadding(dp(18), dp(18), dp(18), dp(18));
        card.setBackgroundColor(Color.rgb(25,29,42));

        TextView nearby = new TextView(this);
        nearby.setText("Nearby devices\n\nNo devices connected yet.\nConnect another phone to the same Wi‑Fi or hotspot to get started.");
        nearby.setTextColor(Color.WHITE);
        nearby.setTextSize(16);
        card.addView(nearby);
        root.addView(card, new LinearLayout.LayoutParams(-1, dp(180)));

        LinearLayout buttons = new LinearLayout(this);
        buttons.setOrientation(LinearLayout.VERTICAL);
        buttons.setPadding(0, dp(18), 0, 0);

        String[] labels = {"📞  Call", "💬  Text", "📁  Share files", "🧪  Run connection test"};
        for (String s : labels) {
            Button x = new Button(this);
            x.setText(s);
            x.setTextSize(16);
            x.setAllCaps(false);
            buttons.addView(x, new LinearLayout.LayoutParams(-1, dp(54)));
        }
        root.addView(buttons, new LinearLayout.LayoutParams(-1, 0, 1));

        TextView about = new TextView(this);
        about.setText("LocalCall 1.0  •  Owner: KelvinLyon");
        about.setTextColor(Color.GRAY);
        about.setGravity(Gravity.CENTER);
        root.addView(about, new LinearLayout.LayoutParams(-1, dp(40)));

        setContentView(root);
    }
}

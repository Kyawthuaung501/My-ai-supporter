package com.github.Kyawthuaung501.myaisupporter;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ChatActivity extends AppCompatActivity {

    private LinearLayout chatContainer;
    private EditText inputMessage;
    private ScrollView scrollView;
    private Button btnSend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        // Bind views
        chatContainer = findViewById(R.id.chatContainer);
        inputMessage = findViewById(R.id.inputMessage);
        btnSend = findViewById(R.id.btnSend);

        // Parent ScrollView (to auto scroll)
        scrollView = (ScrollView) chatContainer.getParent();

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = inputMessage.getText().toString().trim();

                if (TextUtils.isEmpty(message)) {
                    return;
                }

                addUserMessage(message);
                inputMessage.setText("");
            }
        });
    }

    /**
     * Show user message in chat
     */
    private void addUserMessage(String message) {
        TextView textView = new TextView(this);
        textView.setText(message);
        textView.setTextSize(16f);
        textView.setPadding(24, 16, 24, 16);
        textView.setBackgroundResource(android.R.drawable.dialog_holo_light_frame);

        LinearLayout.LayoutParams params =
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT
                );
        params.gravity = Gravity.END;
        params.setMargins(32, 16, 32, 16);

        textView.setLayoutParams(params);
        chatContainer.addView(textView);

        // Auto scroll to bottom
        scrollView.post(new Runnable() {
            @Override
            public void run() {
                scrollView.fullScroll(View.FOCUS_DOWN);
            }
        });
    }
}
package com.github.Kyawthuaung501.myaisupporter;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ChatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    
        // Attach chat layout
        setContentView(R.layout.activity_chat);
    }
}

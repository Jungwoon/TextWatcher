package com.byjw.textwatcher;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = (TextView)findViewById(R.id.textView); // 결과를 보여줄 TextView
        editText = (EditText)findViewById(R.id.editText); // 값을 입력할 EditText

        editText.addTextChangedListener(textWatcher); // TextWatcher 리스너 등록
    }

    // EidtText가 눌릴때마다 감지하는 부분
    TextWatcher textWatcher = new TextWatcher() {
        @Override
        public void afterTextChanged(Editable edit) {
            // Text가 바뀌고 동작할 코드
        }

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            // Text가 바뀌기 전 동작할 코드
        }

        //
        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            // 입력받은 값에 100을 곱한다
            int changeValue = Integer.parseInt(editText.getText().toString()) * 100;
            textView.setText(changeValue+""); // 위에서 얻은 변경된값을 textView에 표시한다
        }
    };
}

package com.example.firstprjct_071121;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String nametxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

                String covid = " у Вас все характерные симптомы COVID-19. Необходимо вызвать врача!Не занимайтесь самолечением!";
                String covidhard =" у Вас ярко выраженая симптоматика COVID-19.Не паникуйте! Вызывайте немедленно врача или скорую, чем быстрее вы это сделаете тем меньше поражение легких у Вас будет!";
                String orwi = " возможно у Вас ОРЗ, ОРВИ, необходимо следить за температурой, пить больше ждкости, при появления других признаков или повышении вызвать врача!";
                String dontworry = " нет повода для беспокойства!Будьте Здоровы!";
        Button button = findViewById(R.id.analize);
        Button button911 = findViewById(R.id.button911);
        TextView diag = findViewById(R.id.diagnoz);
        TextView zakl = findViewById(R.id.zakluchenie);
        EditText nametxt = findViewById(R.id.nametext);
        Switch temper = findViewById(R.id.temperature);
        Switch obonanie = findViewById(R.id.obonanie2);
        Switch lomota = findViewById(R.id.lomota3);
        Switch brain =findViewById(R.id.brainstorm4);
        CheckBox first = findViewById(R.id.menshe38);
        CheckBox last = findViewById(R.id.bolshe38);


                button.setOnClickListener(new View.OnClickListener() {
                    @SuppressLint("SetTextI18n")
                    @Override

                    public void onClick(View v) {

                        if (nametxt.getEditableText().toString().trim().length() == 0) {
                        nametxt.setText("Введите сюда Ваше имя!!!");
                        } else {
                            if (temper.isChecked() && obonanie.isChecked() && last.isChecked() && lomota.isChecked() && brain.isChecked()) {

                                zakl.setVisibility(View.VISIBLE);
                                button911.setVisibility(View.VISIBLE);
                                temper.setClickable(false);
                                obonanie.setClickable(false);
                                lomota.setClickable(false);
                                brain.setClickable(false);
                                first.setClickable(false);
                                last.setClickable(false);
                                diag.setText(nametxt.getEditableText() + covidhard);

                            }
                            if (temper.isChecked() && obonanie.isChecked() && first.isChecked() && lomota.isChecked() && brain.isChecked()) {
                                zakl.setVisibility(View.VISIBLE);
                                button911.setVisibility(View.VISIBLE);
                                temper.setClickable(false);
                                obonanie.setClickable(false);
                                lomota.setClickable(false);
                                brain.setClickable(false);
                                first.setClickable(false);
                                last.setClickable(false);
                                diag.setText(nametxt.getEditableText() + covid);

                            }
                            if (temper.isChecked() && obonanie.isChecked() && last.isChecked() && lomota.isChecked()==false && brain.isChecked()==false) {
                                zakl.setVisibility(View.VISIBLE);
                                button911.setVisibility(View.VISIBLE);
                                temper.setClickable(false);
                                obonanie.setClickable(false);
                                lomota.setClickable(false);
                                brain.setClickable(false);
                                first.setClickable(false);
                                last.setClickable(false);
                                diag.setText(nametxt.getEditableText() + covidhard);

                            }
                            if (temper.isChecked() && obonanie.isChecked() && last.isChecked() && lomota.isChecked() && brain.isChecked()==false) {
                                zakl.setVisibility(View.VISIBLE);
                                button911.setVisibility(View.VISIBLE);
                                temper.setClickable(false);
                                obonanie.setClickable(false);
                                lomota.setClickable(false);
                                brain.setClickable(false);
                                first.setClickable(false);
                                last.setClickable(false);
                                diag.setText(nametxt.getEditableText() + covidhard);

                            }
                            if (temper.isChecked() && lomota.isChecked() && last.isChecked() && obonanie.isChecked() == false && brain.isChecked() == false) {
                                zakl.setVisibility(View.VISIBLE);
                                button911.setVisibility(View.VISIBLE);
                                temper.setClickable(false);
                                obonanie.setClickable(false);
                                lomota.setClickable(false);
                                brain.setClickable(false);
                                first.setClickable(false);
                                last.setClickable(false);
                                diag.setText(nametxt.getEditableText() + covidhard);
                            }
                            if (temper.isChecked() && lomota.isChecked()==false && last.isChecked() && obonanie.isChecked() == false && brain.isChecked()) {
                                zakl.setVisibility(View.VISIBLE);
                                button911.setVisibility(View.VISIBLE);
                                temper.setClickable(false);
                                obonanie.setClickable(false);
                                lomota.setClickable(false);
                                brain.setClickable(false);
                                first.setClickable(false);
                                last.setClickable(false);
                                diag.setText(nametxt.getEditableText() + covidhard);
                            }
                            if (temper.isChecked() && first.isChecked() && lomota.isChecked() == false && obonanie.isChecked() == false && brain.isChecked() == false) {
                                zakl.setVisibility(View.VISIBLE);
                                button911.setVisibility(View.VISIBLE);
                                temper.setClickable(false);
                                obonanie.setClickable(false);
                                lomota.setClickable(false);
                                brain.setClickable(false);
                                first.setClickable(false);
                                last.setClickable(false);
                                diag.setText(nametxt.getEditableText() + orwi);
                            }
                            if (temper.isChecked() && last.isChecked() && lomota.isChecked() == false && obonanie.isChecked() == false && brain.isChecked() == false) {
                                zakl.setVisibility(View.VISIBLE);
                                button911.setVisibility(View.VISIBLE);
                                temper.setClickable(false);
                                obonanie.setClickable(false);
                                lomota.setClickable(false);
                                brain.setClickable(false);
                                first.setClickable(false);
                                last.setClickable(false);
                                diag.setText(nametxt.getEditableText() + covidhard);
                            }
                            if (temper.isChecked() && first.isChecked() && lomota.isChecked() == false && obonanie.isChecked() && brain.isChecked() == false) {
                                zakl.setVisibility(View.VISIBLE);
                                button911.setVisibility(View.VISIBLE);
                                temper.setClickable(false);
                                obonanie.setClickable(false);
                                lomota.setClickable(false);
                                brain.setClickable(false);
                                first.setClickable(false);
                                last.setClickable(false);
                                diag.setText(nametxt.getEditableText() + covid);
                            }
                            if (temper.isChecked() && first.isChecked() && lomota.isChecked()  && obonanie.isChecked() && brain.isChecked() == false) {
                                zakl.setVisibility(View.VISIBLE);
                                button911.setVisibility(View.VISIBLE);
                                temper.setClickable(false);
                                obonanie.setClickable(false);
                                lomota.setClickable(false);
                                brain.setClickable(false);
                                first.setClickable(false);
                                last.setClickable(false);
                                diag.setText(nametxt.getEditableText() + covid);
                            }
                            if (temper.isChecked() && first.isChecked() && lomota.isChecked() == false && obonanie.isChecked() == false && brain.isChecked()) {
                                zakl.setVisibility(View.VISIBLE);
                                button911.setVisibility(View.VISIBLE);
                                temper.setClickable(false);
                                obonanie.setClickable(false);
                                lomota.setClickable(false);
                                brain.setClickable(false);
                                first.setClickable(false);
                                last.setClickable(false);
                                diag.setText(nametxt.getEditableText() + covid);
                            }
                            if (temper.isChecked() == false && lomota.isChecked() && obonanie.isChecked() == false && brain.isChecked() == false) {
                                zakl.setVisibility(View.VISIBLE);
                                button911.setVisibility(View.VISIBLE);
                                temper.setClickable(false);
                                obonanie.setClickable(false);
                                lomota.setClickable(false);
                                brain.setClickable(false);
                                first.setClickable(false);
                                last.setClickable(false);
                                diag.setText(nametxt.getEditableText() + orwi);
                            }
                            if (temper.isChecked() == false && lomota.isChecked() == false && obonanie.isChecked() && brain.isChecked() == false) {
                                zakl.setVisibility(View.VISIBLE);
                                button911.setVisibility(View.VISIBLE);
                                temper.setClickable(false);
                                obonanie.setClickable(false);
                                lomota.setClickable(false);
                                brain.setClickable(false);
                                first.setClickable(false);
                                last.setClickable(false);
                                diag.setText(nametxt.getEditableText() + covid);
                            }
                            if (temper.isChecked() == false && lomota.isChecked() == false && obonanie.isChecked() == false && brain.isChecked()) {
                                zakl.setVisibility(View.VISIBLE);
                                button911.setVisibility(View.VISIBLE);
                                temper.setClickable(false);
                                obonanie.setClickable(false);
                                lomota.setClickable(false);
                                brain.setClickable(false);
                                first.setClickable(false);
                                last.setClickable(false);
                                diag.setText(nametxt.getEditableText() + covid);

                            }

                            if (temper.isChecked() == false && lomota.isChecked() == false && obonanie.isChecked() == false && brain.isChecked() == false) {
                                zakl.setVisibility(View.VISIBLE);
                                button911.setVisibility(View.VISIBLE);
                                temper.setClickable(false);
                                obonanie.setClickable(false);
                                lomota.setClickable(false);
                                brain.setClickable(false);
                                first.setClickable(false);
                                last.setClickable(false);
                                diag.setText(nametxt.getEditableText() + dontworry);
                            }


                        }
                    }
                });
                temper.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                        if (isChecked) {
                            first.setVisibility(View.VISIBLE);
                            last.setVisibility(View.VISIBLE);


                        } else {
                            first.setVisibility(View.INVISIBLE);
                            last.setVisibility(View.INVISIBLE);
                        }

                    }


                });

                first.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked) {

                            last.setClickable(false);
                        } else {
                            last.setClickable(true);
                        }
                    }
                });
                last.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                        if (isChecked) {

                            first.setClickable(false);
                        } else {
                            first.setClickable(true);
                        }
                    }
                });




    }
}
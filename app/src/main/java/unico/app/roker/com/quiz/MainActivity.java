package unico.app.roker.com.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private QuestionLibrary nQuestionLibrary = new QuestionLibrary();

    private TextView nScoreView;
    private TextView nQuestionView;
    private Button nButtonChoice1;
    private Button nButtonChoice2;
    private Button nButtonChoice3;
    private Button nButtonChoice4;

    private String nAnswer;
    private int nScore = 0;
    private int nQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nScoreView = (TextView)findViewById(R.id.score);
        nQuestionView = (TextView)findViewById(R.id.question);
        nButtonChoice1 = (Button)findViewById(R.id.choice1);
        nButtonChoice2 = (Button)findViewById(R.id.choice2);
        nButtonChoice3 = (Button)findViewById(R.id.choice3);
        nButtonChoice4 = (Button)findViewById(R.id.choice4);

        updateQuestion();

        //Start of Btton Listener for Button 1
        nButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                    //logica del boton va aqui
                if (nButtonChoice1.getText() == nAnswer){
                    nScore = nScore + 1;
                    updateScore(nScore);
                    updateQuestion();
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "uncorrect", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        // End of listener for button 1

        //Start of Btton Listener for Button 2
        nButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (nButtonChoice2.getText() == nAnswer){
                    nScore = nScore + 1;
                    updateScore(nScore);
                    updateQuestion();
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "uncorrect", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        // End of listener for button 2

        //Start of Btton Listener for Button 3
        nButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (nButtonChoice3.getText() == nAnswer){
                    nScore = nScore + 1;
                    updateScore(nScore);
                    updateQuestion();
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "uncorrect", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        // End of listener for button 3

        //Start of Btton Listener for Button 4
        nButtonChoice4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (nButtonChoice1.getText() == nAnswer){
                    nScore = nScore + 1;
                    updateScore(nScore);
                    updateQuestion();
                    Toast.makeText(MainActivity.this, "correct", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "uncorrect", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });
        // End of listener for button 4

    }

    private void updateScore(int point){
        nScoreView.setText("" + nScore);
    }

    private void updateQuestion(){
        nQuestionView.setText(nQuestionLibrary.getQuestion(nQuestionNumber));
        nButtonChoice1.setText(nQuestionLibrary.getChoice1(nQuestionNumber));
        nButtonChoice2.setText(nQuestionLibrary.getChoice2(nQuestionNumber));
        nButtonChoice3.setText(nQuestionLibrary.getChoice3(nQuestionNumber));
        nButtonChoice4.setText(nQuestionLibrary.getChoice4(nQuestionNumber));

        nAnswer = nQuestionLibrary.getCorretAnswer(nQuestionNumber);
        nQuestionNumber++;

    }
}

package unico.app.roker.com.quiz;

public class QuestionLibrary {

    private String nQuestions[] = {
            "Preginta 1, qué cardiopatía presenta el paciente 1",
            "Pregunta 2 , dado ciesta información bla bla bla",
            "Pregunta 3, si el paciente tuvo un infarto bla bla bla",
            "Pregunta 4, esta es la pregunta 4 bla bla bla bla bla bla"
    };

    private String nChoices[][] = {
            {"opcion1","opcion2","opcion3","opcion4"},
            {"opcion1","opcion2","opcion3","opcion4"},
            {"opcion1","opcion2","opcion3","opcion4"},
            {"opcion1","opcion2","opcion3","opcion4"}
    };

    private String mCorrectAnswers[] = {"opcion1","opcion2","opcion3","opcion4"};

    public String getQuestion(int a){
        String question = nQuestions[a];
        return question;
    }

    public String getChoice1 (int a){
        String choice0 = nChoices[a][0];
        return choice0;
    }

    public String getChoice2 (int a){
        String choice1 = nChoices[a][1];
        return choice1;
    }

    public String getChoice3 (int a){
        String choice2 = nChoices[a][2];
        return choice2;
    }

    public String getChoice4 (int a){
        String choice3 = nChoices[a][3];
        return choice3;
    }

    public String getCorretAnswer (int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}

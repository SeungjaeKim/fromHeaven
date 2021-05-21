package kr.co.fromheaven.domain;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MathAnswerSheet {

    private String question;        //문제
    
    private int answer;             //사용자 답
    
    private int remainder;          //나누기 나머지

    private int correct;            //정답

    private int wrongAnswer;        //틀린 답
    
}

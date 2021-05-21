package kr.co.fromheaven.controller;

import kr.co.fromheaven.domain.MathMain;
import kr.co.fromheaven.domain.MathQuestion;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/math")
public class MathController {

    @GetMapping("/addition")
    public String Addition(MathMain dto){

        int value = 0;

        if (dto == null) {
            dto = new MathMain();
        }

        if (dto.getLevel() == null) {
            dto.setLevel(1);
        }

        value = (int) (Math.pow(10, dto.getLevel()) - 1);
        Random random = new Random();
        List<MathQuestion> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            MathQuestion mathQuestion = new MathQuestion();
            mathQuestion.setX(random.nextInt(value));
            mathQuestion.setY(random.nextInt(value));
            mathQuestion.setOperator("plus");
            list.add(mathQuestion);
        }
        System.out.println(list.toString());
        return "/addition/additionPaper";
    }


}

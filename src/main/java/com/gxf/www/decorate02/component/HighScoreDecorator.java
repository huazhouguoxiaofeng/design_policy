package com.gxf.www.decorate02.component;

import com.gxf.www.decorate02.Decorator;
import com.gxf.www.decorate02.SchoolReport;

/**
 * 我要把我学校的最高成绩告诉老爸
 */
public class HighScoreDecorator extends Decorator {
    //构造函数
    public HighScoreDecorator(SchoolReport sr){
        super(sr);
    }

    //我要汇报最高成绩
    private void reportHighScore(){
        System.out.println("这次考试语文最高是75，数学是78，自然是80");
    }

    //最高成绩我要做老爸看成绩单前告诉他，否则等他一看，就抡起笤帚有揍我，我那还有机会说呀
    @Override
    public void report(){
        this.reportHighScore();
        super.report();
    }
}

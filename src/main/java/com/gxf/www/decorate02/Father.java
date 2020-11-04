package com.gxf.www.decorate02;

import com.gxf.www.decorate02.component.FourthGradeSchoolReport;
import com.gxf.www.decorate02.component.HighScoreDecorator;
import com.gxf.www.decorate02.component.SortDecorator;

/**
 * 老爸看成绩单了，一样，往里面加点糖，加点奶酪，然后计算加起来算价格
 */
public class Father {

    public static void main(String[] args) {
        //成绩单拿过来
        SchoolReport sr;
        sr = new FourthGradeSchoolReport(); //原装的成绩单

        //加 了最高分说明的成绩单
        sr = new HighScoreDecorator(sr);

        //又加了成绩排名的说明
        sr = new SortDecorator(sr);

        //看成绩单
        sr.report();

        //然后老爸，一看，很开心，就签名了
        sr.sign("老三"); //我叫小三，老爸当然叫老三
    }
}

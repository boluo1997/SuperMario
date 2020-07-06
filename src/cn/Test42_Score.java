package cn;

import java.util.*;

/**
 * 现在程序中有一组学生成绩数据 (getScoreList()返回结果)，
 * 每条数据为某个学生的某科成绩，学生成绩可能不是4科都有，可能有缺科
 *
 * 要求对这组数据进行数据转化和计算处理，转换成学生记录列表，
 * 每条记录里面有4科成绩和总成绩，并在此基础上计算全班的平均成绩
 *
 * 要求列表按总成绩从高到低排序。计算平均成绩时，考虑缺课的情况。
 *
 * 结果按以下格式在控制台输出
 *
 *   姓名       数学  语文  英语   物理  总成绩
 *   王五       77    82    90     65     434
 *   张三       65    84    89            316
 *   李四       89    76           76     313
 *   ...
 * 平均成绩     83.5  70.5   78    82.5    314.5
 */
public class Test42_Score {
    public static void main(String[] args) {
        new Test42_Score().Test();
    }


    public void Test(){

    }



    public List<ScoreVo> getScoreList() {
        List<ScoreVo> scoreList = new ArrayList<ScoreVo>();
        scoreList.add(new ScoreVo("张三", "语文", 80));
        scoreList.add(new ScoreVo("张三", "物理", 76));
        scoreList.add(new ScoreVo("李四", "语文", 78));
        scoreList.add(new ScoreVo("茅十八", "英语", 65));
        scoreList.add(new ScoreVo("李四", "数学", 88));
        scoreList.add(new ScoreVo("李四", "物理", 87));
        scoreList.add(new ScoreVo("王五", "语文", 67));
        scoreList.add(new ScoreVo("张三", "数学", 76));
        scoreList.add(new ScoreVo("李四", "英语", 89));
        scoreList.add(new ScoreVo("王五", "数学", 65));
        scoreList.add(new ScoreVo("赵六", "物理", 95));
        scoreList.add(new ScoreVo("王五", "英语", 78));
        scoreList.add(new ScoreVo("王五", "物理", 65));
        scoreList.add(new ScoreVo("赵六", "语文", 89));
        scoreList.add(new ScoreVo("赵六", "英语", 87));
        scoreList.add(new ScoreVo("黄七", "语文", 78));
        scoreList.add(new ScoreVo("黄七", "数学", 65));
        scoreList.add(new ScoreVo("刘八", "英语", 87));
        scoreList.add(new ScoreVo("张三", "英语", 56));
        scoreList.add(new ScoreVo("黄七", "物理", 76));
        scoreList.add(new ScoreVo("刘八", "数学", 89));
        scoreList.add(new ScoreVo("黄七", "英语", 98));
        scoreList.add(new ScoreVo("刘八", "语文", 56));
        scoreList.add(new ScoreVo("刘八", "物理", 76));
        scoreList.add(new ScoreVo("钱九", "语文", 88));
        scoreList.add(new ScoreVo("钱九", "数学", 67));
        scoreList.add(new ScoreVo("茅十八", "数学", 43));
        scoreList.add(new ScoreVo("钱九", "英语", 75));
        scoreList.add(new ScoreVo("茅十八", "语文", 45));
        scoreList.add(new ScoreVo("茅十八", "物理", 56));

        return scoreList;
    }
    class ScoreVo {
        public String studentName;
        public String courseName;
        public double score;

        public ScoreVo(String studentName, String courseName, double score){
            this.studentName = studentName;
            this.courseName = courseName;
            this.score = score;
        }

        public String toString(){
            return this.studentName + "\t" + this.courseName + "\t" + this.score;
        }
    }

    class StudentVo{
        private String name;
        private double chineseScore;
        private double mathScore;
        private double englishScore;
        private double physicalScore;
        private double totalScore;

        public StudentVo(){

        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public double getChineseScore() {
            return chineseScore;
        }
        public void setChineseScore(double chineseScore) {
            this.chineseScore = chineseScore;
        }
        public double getMathScore() {
            return mathScore;
        }
        public void setMathScore(double mathScore) {
            this.mathScore = mathScore;
        }
        public double getEnglishScore() {
            return englishScore;
        }
        public void setEnglishScore(double englishScore) {
            this.englishScore = englishScore;
        }
        public double getPhysicalScore() {
            return physicalScore;
        }
        public void setPhysicalScore(double physicalScore) {
            this.physicalScore = physicalScore;
        }
        public double getTotalScore() {
            return totalScore;
        }
        public void setTotalScore(double totalScore) {
            this.totalScore = totalScore;
        }

        @Override
        public String toString() {
            return "StudentVo{" +
                    "name='" + name + '\'' +
                    ", chineseScore=" + chineseScore +
                    ", mathScore=" + mathScore +
                    ", englishScore=" + englishScore +
                    ", physicalScore=" + physicalScore +
                    ", totalScore=" + totalScore +
                    '}';
        }

    }
}


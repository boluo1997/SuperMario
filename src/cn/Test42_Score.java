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

        //先把list集合中的数据存入map中
        Map<String, Double> map = new HashMap();
        for (ScoreVo sv : getScoreList()) {
            String key = sv.studentName + "_" + sv.courseName;
            map.put(key, sv.score);
        }

        //把list集合中的name存入set中，可以去重，这样就知道总共有几个学生
        Set<String> set = new TreeSet<>();
        for (ScoreVo sv : getScoreList()) {
            String key = sv.studentName;
            set.add(key);
        }

        // 获取对象
        List<StuInfo> list = new ArrayList();
        for (String name:set){        //这次遍历从set中遍历，就防止了多创建对象，而是有多少学生创建多少对象
            list.add(new StuInfo(map, name));       //name代表所有的学生，而map中又有所有学生的成绩，在构造方法中把学生对应的成绩赋值给学生
        }

        list.sort(new Comparator<StuInfo>() {
            @Override
            public int compare(StuInfo o1, StuInfo o2) {
                return (int)(o2.sumd - o1.sumd);
            }
        });

        Double math_score = 0.0;
        Double chinese_score = 0.0;
        Double english_score = 0.0;
        Double pthistic_score = 0.0;

        int cnt = list.size();
        for (StuInfo si : list){
            math_score = math_score + si.getMath();
            chinese_score = chinese_score + si.getChinese();
            english_score = english_score + si.getEnglish();
            pthistic_score = pthistic_score + si.getPthystic();
            System.out.println(si.toString());
        }

        String str = "平均成绩" + "\t" + math_score/cnt + "\t"+ chinese_score/cnt
                + "\t" + english_score/cnt+ "\t" + pthistic_score/cnt + "\t" +(math_score+chinese_score+english_score+pthistic_score)/cnt;
        System.out.println(str);
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


    public class StuInfo{
        String name;
        Double math = 0.0;
        Double chinese = 0.0;
        Double english = 0.0;
        Double pthystic = 0.0;
        Double sumd;

        public StuInfo(Map<String, Double> map, String name){
            this.name = name;
            Set<String> sets = map.keySet();
            if (sets.contains(name + "_数学")){
                this.math = map.get(name + "_数学" );
            }
            if (sets.contains(name + "_语文")){
                this.chinese = map.get(name + "_语文");
            }
            if (sets.contains(name + "_英语" )){
                this.english = map.get(name + "_英语" );
            }
            if (sets.contains(name + "_物理")){
                this.pthystic = map.get(name + "_物理");
            }

            this.sumd = this.math+this.chinese+this.english+this.pthystic;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Double getMath() {
            return math;
        }

        public void setMath(Double math) {
            this.math = math;
        }

        public Double getChinese() {
            return chinese;
        }

        public void setChinese(Double chinese) {
            this.chinese = chinese;
        }

        public Double getEnglish() {
            return english;
        }

        public void setEnglish(Double english) {
            this.english = english;
        }

        public Double getPthystic() {
            return pthystic;
        }

        public void setPthystic(Double pthystic) {
            this.pthystic = pthystic;
        }

        public Double getSumd() {
            return sumd;
        }

        public void setSumd(Double sumd) {
            this.sumd = sumd;
        }

        @Override
        public String toString() {
            return name + '\t' + (math.equals(0.0)?"    ":math) + '\t' +  (chinese.equals(0.0)?"    ":chinese) + '\t' + (english.equals(0.0)?"    ":english) + '\t' + (pthystic.equals(0.0)?"    ":pthystic) + '\t' + sumd  ;
        }
    }

}


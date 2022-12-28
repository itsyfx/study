//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
//public class LeetCode {
//
//    public List<String> ambiguousCoordinates(String s) {
//
//        //数值校验
//        if(s == null || "".equals(s)){
//            return Collections.emptyList();
//        }
//
//        List<String> results = new ArrayList<>();
//        //去除括号
//        String pureS = s.replace("(","").replace(")","");
//        for(int i = 0;i < pureS.length();i++){
//            String result = getResult(pureS.substring(0,i),pureS.substring(i + 1));
//            if(result != null) {
//                results.add(result);
//            }
//        }
//
//        return results;
//
//    }
//
//    /**
//     *  拼接坐标
//     * @param front 前
//     * @param end 后
//     * @return 坐标
//     */
//    private String getResult(String front, String end) {
//        return null;
//    }
//
//
//}
//
//
//

package LeetcodeArrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ValidCoupanCode {

    public static void main(String[] args) {

        String[] code = new String[] { "SAVE20", "", "PHARMA5", "SAVE@20" };
        String[] businessLine = new String[] { "restaurant", "grocery", "pharmacy", "restaurant" };
        boolean[] isActive = new boolean[] { true, true, true, true };

        List<String> res = new ArrayList();

        List<String> e = new ArrayList();
        List<String> g = new ArrayList();
        List<String> p = new ArrayList();
        List<String> r = new ArrayList();

        for (int i = 0; i < isActive.length; i++) {
            if (isActive[i]) {
                if (isValidBusiness(businessLine[i])) {
                    if (code[i].length() == 0){
                        continue;
                    }

                    if (isValid(code[i])) {
                        if (businessLine[i].startsWith("e"))
                            e.add(code[i]);
                        if (businessLine[i].startsWith("g"))
                            g.add(code[i]);
                        if (businessLine[i].startsWith("p"))
                            p.add(code[i]);
                        if (businessLine[i].startsWith("r"))
                            r.add(code[i]);
                    }
                }
            }
        }
        Collections.sort(e);
        Collections.sort(g);
        Collections.sort(p);
        Collections.sort(r);
        res.addAll(e);
        res.addAll(g);
        res.addAll(p);
        res.addAll(r);

        System.out.println(res);

    }

    private static boolean isValidBusiness(String str) {
        return str.equals("electronics")
                || str.equals("grocery")
                || str.equals("pharmacy")
                || str.equals("restaurant");
    }

    private static boolean isValid(String str) {
        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            if (!Character.isLetterOrDigit(ch) && ch != '_') {
                return false;
            }
        }

        return true;
    }

}

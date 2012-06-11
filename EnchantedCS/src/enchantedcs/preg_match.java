/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package enchantedcs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Hexa Null
 */
public class preg_match {

    public static boolean preg_match(String pttr, String input) {
        Pattern p = Pattern.compile(pttr);
        Matcher m = p.matcher(input);
        return m.find();
    }

    public static boolean preg_matchq(String pattern, String kata) {
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(kata);
      
        return m.find();

    }

    public static void main(String[] args) {
    
        System.out.println(preg_match.preg_match("^(be)\\p{Alpha}+(i)$",
                "berlari"));
        System.out.println(preg_match.preg_match("^(be)\\w+(i)",
                "beri"));
        System.out.println(preg_match.preg_match("\\w+([km]u|nya|[kl]ah|pun)",
                "buku"));
        System.out.println(preg_match.preg_match("([km]u|nya|[kl]ah|pun)$",
                "bukunya"))
                ;
        System.out.println(preg_match.preg_match("^(di|[ks]e)\\S{1,}",
                "kesatuan")) ;
        String buku="bukunya";
        System.out.println(buku.replaceAll("/([km]u|nya|[kl]ah|pun)$/", ""));
    }
}

package jsoup;


import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.junit.Test;

import java.io.File;
import java.net.URL;

/**
 * @author pengjie_yao
 * @date 2019/10/30 15:10
 */
public class JsoupTest {


    /**
     * 测试URL
     *
     * @throws Exception
     */
    @Test
    public void testJsonpUrl() throws Exception {
        // 1.获取document对象
        Document document = Jsoup.parse(new URL("http://www.itcast.cn/"), 1000);
        // 2.获取第一个title标题
        Element title = document.getElementsByTag("title").first();
        System.out.println(title.text());
    }

    /**
     * Jsoup解析字符串
     *
     * @throws Exception
     */
    @Test
    public void testJsoupString() throws Exception {
        // 读取文件获取
        String html = FileUtils.readFileToString(new File("D:\\test.html"), "utf-8");

        // 解析字符串
        Document document = Jsoup.parse(html);

        // 获取title内容
        Element title = document.getElementsByTag("title").first();
        System.out.println(title.text());
    }

    /**
     * 使用dom遍历
     *
     * @throws Exception
     */
    @Test
    public void testJsoupDocument() throws Exception {
        // 读取文件获取
        String html = FileUtils.readFileToString(new File("D:\\test.html"), "utf-8");
        // 解析字符串
        Document document = Jsoup.parse(html);

        /**元素的获取**/
        //  1.根据id查询元素getElementById
        Element element = null;
//         element = document.getElementById("city_bj");

        //  2.根据标签获取元素getElementsByTag
//        element = document.getElementsByTag("title").first();

        //  3.根据class获取元素getElementsByClassa
//        element = document.getElementsByClass("class_a class_b").first();
        //  4.根据属性获取元素getElementsByAttribute
//        element = document.getElementsByAttribute("abc").first();
        // 5.根据对应的属性值获取
//        element = document.getElementsByAttributeValue("class", "s_name").first();
//        System.out.println(element.text());

        /**元素中获取数据**/
        // 1.从元素中获取id
        element = document.getElementById("test");
        // 2.从元素中获取className
        String str = document.className();
        // 3.从元素中获取属性的值attr
        str = element.attr("id");
        // 4.从元素中获取所有属性attributes
        str = element.attributes().toString();
        // 5.从元素中获取文本内容text
        str = element.text();
        System.out.println(str);
        System.out.println(element.text());
    }
}

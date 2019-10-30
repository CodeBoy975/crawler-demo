package httpclient;

import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengjie_yao
 * @date 2019/10/3014:42
 */
public class crawlerDemo1 {

    public static void main(String[] args) throws Exception {
        // 1.创建默认的httpclient
        CloseableHttpClient httpClient = HttpClients.createDefault();

//        HttpGet httpGet = new HttpGet("http://www.itcast.cn/");
        HttpPost httpPost = new HttpPost("http://www.itcast.cn/");

        // 申明参数
        List<NameValuePair> params = new ArrayList<NameValuePair>();
        params.add(new BasicNameValuePair("keys", "java"));

        // 创建表单数据Entrity
        UrlEncodedFormEntity urlEncodedFormEntity = new UrlEncodedFormEntity(params, "utf-8");
        httpPost.setEntity(urlEncodedFormEntity);

        CloseableHttpResponse response = httpClient.execute(httpPost);
        if (response.getStatusLine().getStatusCode() == 200) {
            String content = EntityUtils.toString(response.getEntity(), "utf-8");
            System.out.println(content);
        }
        response.close();

    }
}

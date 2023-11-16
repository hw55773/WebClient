/**
 * className:       WeatherWSClient
 * author:          wenhao2002
 * date:            2023/11/16 14:20
 */
import java.util.List;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWS;
import cn.com.webxml.WeatherWSSoap;

public class WeatherWSClient {

    public static void main(String[] args) {
        //创建一个WeatherWS工厂
        WeatherWS factory = new WeatherWS();
        //根据工厂创建一个WeatherWSSoap对象
        WeatherWSSoap weatherWSSoap = factory.getWeatherWSSoap();
        //调用WebService提供的getWeather方法获取四川的天气预报情况
        ArrayOfString weatherInfo = weatherWSSoap.getWeather("苍溪", null);
        List<String> lstWeatherInfo = weatherInfo.getString();
        //遍历天气预报信息
        for (String string : lstWeatherInfo) {
            System.out.println(string);
            System.out.println("------------------------");
        }
    }
}

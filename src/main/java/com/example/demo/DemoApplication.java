package com.example.demo;

import lombok.Data;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
郭晓东
北京昌平区北七家镇白庙村52号
17611647016
王娜娜
北京市丰台区张仪村路4号院玉英超市对面五排一号
13120460551
*/
@Data
@SpringBootApplication
public class DemoApplication {
    @Test
    public void test_01() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.baidu.com");
        driver.manage().window().maximize();
    }


    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

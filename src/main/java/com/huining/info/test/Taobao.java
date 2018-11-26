package com.huining.info.test;


import net.sf.json.JSONObject;
import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
public class Taobao {

    @Autowired
    RedisTemplate redisTemplate;

    @ResponseBody
    @RequestMapping("/tbao")
    public  String test() throws InterruptedException {
      /*  System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        System.setProperty("webdriver.chrome.bin", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        WebDriver driver = new ChromeDriver();*/
//        driver.get("https://login.taobao.com/member/login.jhtml?style=mini&newMini2=true&css_style=alimama&from=alimama&redirectURL=http%3A%2F%2Fwww.alimama.com&full_redirect=true&disableQuickLogin=true");
//        driver.get("http://pub.alimama.com/");


        String url = "https://pub.alimama.com/common/code/getAuctionCode.json?auctionid=548413742542&adzoneid=235390093&siteid=42162461&scenes=1&tkFinalCampaign=20&t=1543235442506&_tb_token_=ebb370416a58b&pvid=10_59.57.192.48_3358_1543235414743";

       /* Thread.sleep(150000);
        Set<Cookie> cs = driver.manage().getCookies();
//        redisTemplate.opsForSet().add("tc",cs);
        redisTemplate.opsForSet().add("tran",cs);*/
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders httpHeaders = new HttpHeaders();

        Set one = new HashSet();
        List list = new ArrayList();
//        Set<Set> set = redisTemplate.opsForSet().members("tc");
        Set<Set> set = redisTemplate.opsForSet().members("trar");
        for (Set<Cookie> cset:set
             ) {
            System.out.println(cset);
            System.out.println("-----------------------------");
            for (Cookie cookie:cset
                 ) {
                String[] ss = cookie.toString().split(";");
                for (String str: ss
                     ) {
                    String tr = StringUtils.trim(str);
                    if (one.add(tr)) {
                        list.add(tr);
                    }
                }
//                System.out.println(cookie.toString()+"mmmmmmmmmmmmmmmmmmmmmmmmmmmmmmmm");
//                System.out.println(cookie);
//                list.add(cookie);
//                driver.manage().addCookie(cookie);
//                httpHeaders.put(HttpHeaders.COOKIE,cookie);
            }
        }
        httpHeaders.put(HttpHeaders.COOKIE,list);
        HttpEntity<MultiValueMap<String, Object>> httpEntity = new HttpEntity(httpHeaders);
        ResponseEntity result = restTemplate.exchange(url,HttpMethod.GET,httpEntity,Object.class);
        System.out.println(result);
        return result.toString();

//        driver.get("http://pub.alimama.com/");
        /*driver.get("https://pub.alimama.com/common/code/getAuctionCode.json?auctionid=559847446080&adzoneid=235390093&siteid=42162461&scenes=1&tkFinalCampaign=20&t=1543235442506&_tb_token_=ebb370416a58b&pvid=10_59.57.192.48_3358_1543235414743");
        Thread.sleep(120000);
        driver.close();*/
        /*
        Thread.sleep(100);
        WebElement link = ((ChromeDriver) driver).findElementById("J_menu_login");
        link.click();
        Thread.sleep(3000);
//        WebElement click = ((ChromeDriver) driver).findElementById("J_Quick2Static");
//        click.click();
//        Thread.sleep(3000);
        WebElement name = ((ChromeDriver) driver).findElementById("TPL_username_1");
        name.clear();
        name.sendKeys("hst541600586");
        Thread.sleep(3000);
        WebElement pass = ((ChromeDriver) driver).findElementById("TPL_password_1");
        pass.clear();
        pass.sendKeys("huangshangting20");
        Thread.sleep(3000);
        WebElement submit = ((ChromeDriver) driver).findElementById("J_SubmitStatic");
        submit.click();
        System.out.print(driver.getTitle());
        */
    }

    @ResponseBody
    @RequestMapping("/rr")
    public void t() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        System.setProperty("webdriver.chrome.bin", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
        WebDriver driver = new ChromeDriver();
//        driver.get("https://login.taobao.com/member/login.jhtml?style=mini&newMini2=true&css_style=alimama&from=alimama&redirectURL=http%3A%2F%2Fwww.alimama.com&full_redirect=true&disableQuickLogin=true");
        driver.get("http://pub.alimama.com/");

        Thread.sleep(150000);
        Set<Cookie> cs = driver.manage().getCookies();
//        redisTemplate.opsForSet().add("tc",cs);
        redisTemplate.opsForSet().add("trar",cs);
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders httpHeaders = new HttpHeaders();

        Set one = new HashSet();
        List list = new ArrayList();
//        Set<Set> set = redisTemplate.opsForSet().members("tc");
        Set<Set> set = redisTemplate.opsForSet().members("trar");
        /*for (Set<Cookie> cset:set
                ) {
            System.out.println(cset);
            System.out.println("-----------------------------");
            for (Cookie cookie:cset
                    ) {
                driver.manage().addCookie(cookie);
            }
        }*/
        driver.get("https://pub.alimama.com/common/code/getAuctionCode.json?auctionid=559847446080&adzoneid=235390093&siteid=42162461&scenes=1&tkFinalCampaign=20&t=1543235442506&_tb_token_=ebb370416a58b&pvid=10_59.57.192.48_3358_1543235414743");
        Thread.sleep(120000);
        driver.close();
    }
}

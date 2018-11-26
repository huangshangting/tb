package com.huining.info.test;


import com.huining.info.discount.dao.TestMapper;

import com.huining.info.discount.domin.Test;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Controller
public class PaChongDouYu {

    @Autowired
    TestMapper testMapper;
    @Autowired
    RedisTemplate redisTemplate;
    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @ResponseBody
    @RequestMapping("/test123")
    public  void open1930724() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
        System.setProperty("webdriver.chrome.bin", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");


        ChromeOptions options = new ChromeOptions();
//        options.addArguments("user-data-dir=C:\\Users\\hst\\AppData\\Local\\Google\\Chrome\\User Data");
        WebDriver driver = new ChromeDriver();
        //        driver.get("http://www.google.com");
        driver.get("https://www.douyu.com");
//        Thread.sleep(60000);
//        Set<Cookie> cs = driver.manage().getCookies();
//        redisTemplate.opsForSet().add("cookie",cs);
//        SetOperations<String, Cookie> set = redisTemplate.opsForSet();
//        set.add("aaaa",cs);
//        for (Cookie c: cs
//             ) {
//            set.add("coo", c);
//        }
        System.out.println(redisTemplate.opsForSet().members("cookie"));
        Set<Set> set = redisTemplate.opsForSet().members("cookie");
        for (Set s:set
             ) {
            for (Object o:s
                 ) {
                Cookie c = (Cookie)o ;
                driver.manage().addCookie(c);
            }
        }

//        redisTemplate.opsForSet().add("ccc",cs);
//        stringRedisTemplate.opsForValue().set("ddd","dd");
//        redisTemplate.opsForValue().set("nnn","uuu");
//        System.out.println(cs);
//
//        JSONArray jsonObject = JSONArray.fromObject(cs);
//
//
//        Test test = new Test();
//        test.setName(jsonObject.toString());
//        test.setName(cs.toString());
//        testMapper.insert(test);

//        Test test = testMapper.selectByPrimaryKey(4);

//        String arrayString = test.getName();
//        JSONArray ja = JSONArray.fromObject(arrayString);

//        String a1 = arrayString.replace("[","").replace("]","").replace("/",".");
//        System.out.println(a1);
//        String[] a1s = a1.split(";");
//        System.out.println("-------------------------------------------");
//        for(String s : a1s){
//            System.out.println(s);
//            String[] ss = s.split("=");
//            System.out.println("-------------");
//            System.out.println(s);
//
//            driver.manage().addCookie(new Cookie(ss[0],ss[1]));
//
//        }

//        Set<Cookie> cs = (Set<Cookie>)JSONArray.toArray(ja,HashSet.class);
//        List<Cookie> cs = (List)JSONArray.toList(ja,ArrayList.class);

//        for(Cookie cookie : cs){
//            System.out.println(cookie);
//            driver.manage().addCookie(cookie);
//        }

        String dy_did = "ff141e2b006183da1b3577f400031501";
        String acf_did = "ff141e2b006183da1b3577f400031501";
        String Hm_lvt_e99aee90ec1b2106afe7ec3b199020a7 ="1526216965,1526223574,1526225465,1526299824";
        String smidV2 = "2018051420102843e24dac5a1d38d89a250ea8fd01d7c90096da48482c32460";
        String Hm_lpvt_e99aee90ec1b2106afe7ec3b199020a7 = "1526299894";
        String acf_uid = "127601598";
        String acf_username = "127601598";
        String acf_nickname = "%E5%B1%B1%E7%A9%B7%E6%B0%B4%E5%B0%BD%E4%B8%B6%E6%9F%B3%E6%9A%97%E8%8A%B1%E6%98%8E";
        String acf_own_room = "1";
        String acf_groupid = "1";
        String acf_phonestatus = "1";
        String acf_avatar = "https%3A%2F%2Fapic.douyucdn.cn%2Fupload%2Favatar%2Fdefault%2F04";
        String acf_ct = "0";
        String acf_ltkid = "88565147";
        String acf_biz = "1";
        String acf_stk = "559d6c6a062bf00a";
        String PHPSESSID = "mll4nvhd41dg2ki14jnh1p4v21";


//        driver.manage().deleteAllCookies();
        Cookie c1 = new Cookie("dy_did",dy_did);
        Cookie c2 = new Cookie("acf_did",acf_did);
        Cookie c3 = new Cookie("Hm_lvt_e99aee90ec1b2106afe7ec3b199020a7",Hm_lvt_e99aee90ec1b2106afe7ec3b199020a7);
        Cookie c4 = new Cookie("smidV2",smidV2);
        Cookie c5 = new Cookie("Hm_lpvt_e99aee90ec1b2106afe7ec3b199020a7",Hm_lpvt_e99aee90ec1b2106afe7ec3b199020a7);
        Cookie c6 = new Cookie("acf_uid",acf_uid);
        Cookie c7 = new Cookie("acf_username",acf_username);
        Cookie c8 = new Cookie("acf_nickname",acf_nickname);
        Cookie c9 = new Cookie("acf_own_room",acf_own_room);
        Cookie c10 = new Cookie("acf_groupid",acf_groupid);
        Cookie c11 = new Cookie("acf_phonestatus",acf_phonestatus);
        Cookie c12 = new Cookie("acf_avatar",acf_avatar);
        Cookie c13 = new Cookie("acf_ct",acf_ct);
        Cookie c14 = new Cookie("acf_ltkid",acf_ltkid);
        Cookie c15 = new Cookie("acf_biz",acf_biz);
        Cookie c16 = new Cookie("acf_stk",acf_stk);
        Cookie c17 = new Cookie("PHPSESSID",PHPSESSID);


//        driver.manage().addCookie(c1);
//        driver.manage().addCookie(c2);
//        driver.manage().addCookie(c3);
//        driver.manage().addCookie(c4);
//        driver.manage().addCookie(c5);
//        driver.manage().addCookie(c6);
//        driver.manage().addCookie(c7);
//        driver.manage().addCookie(c8);
//        driver.manage().addCookie(c9);
//        driver.manage().addCookie(c10);
//        driver.manage().addCookie(c11);
//        driver.manage().addCookie(c12);
//        driver.manage().addCookie(c13);
//        driver.manage().addCookie(c14);
//        driver.manage().addCookie(c15);
//        driver.manage().addCookie(c16);
//        driver.manage().addCookie(c17);
        Thread.sleep(5000);
//        System.out.print(driver.getTitle());
//        driver.get("https://www.douyu.com/1930724");
        driver.get("https://www.douyu.com/138243");

//        driver.get("https://www.douyu.com");





        Thread.sleep(5000);

        int flag = 0;
        while(flag < 300){
//            WebElement putIn = driver.findElement(By.className("cs-textarea"));
            WebElement putIn = driver.findElement(By.className(" ChatSend-txt"));

            putIn.clear();
            putIn.sendKeys("欢迎欢迎");
            Thread.sleep(2000);
//            WebElement send = driver.findElement(By.className("b-btn"));
            WebElement send = driver.findElement(By.className("ChatSend-button"));
            send.click();
            Thread.sleep(20000);
            putIn.clear();
            putIn.sendKeys("欢迎欢迎,我是机器人");
            send.click();
            Thread.sleep(20000);
            putIn.clear();
            putIn.sendKeys("你信不信我可以一直发");
            send.click();
            Thread.sleep(20000);
        }
//        WebElement putIn = driver.findElement(By.className("cs-textarea"));
//        putIn.clear();
//        putIn.sendKeys("欢迎欢迎");
//        Thread.sleep(2000);
//        WebElement send = driver.findElement(By.className("b-btn"));
//        send.click();

//        driver.close();
//        Thread.sleep(2000);
    }
}

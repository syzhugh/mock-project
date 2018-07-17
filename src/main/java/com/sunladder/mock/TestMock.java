package com.sunladder.mock;


import com.sunladder.mock.bean.ParentBean;
import io.javalin.Context;
import io.javalin.Handler;
import io.javalin.Javalin;

public class TestMock {

    public static void main(String[] args) {
        //step1 server
        Javalin server = Javalin.start(52122);

        server.get("/*", new Handler() {
            @Override
            public void handle(Context ctx) throws Exception {
                System.out.println(ctx.path());
                ctx.redirect("http://www.baidu.com");
            }
        });

        server.post("/*", new Handler() {
            @Override
            public void handle(Context ctx) throws Exception {
                System.out.println(ctx.path());
                ctx.redirect("http://www.baidu.com");
            }
        });

        //step2 json
        System.out.println(new ParentBean().getJsonString());
    }
}

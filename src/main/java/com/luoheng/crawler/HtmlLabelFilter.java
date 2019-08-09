package com.luoheng.crawler;

public class HtmlLabelFilter{
    public String scriptFilter(String html){
        return html.replaceAll("<script[\\s\\S]*?>[\\s\\S]*?</script>(?!`)","");
    }

    public String aFilter(String html){
        return html.replaceAll("<a[\\s\\S]*?>[\\s\\S]*?</a>","");
    }

    public String labelFilter(String html){
        return html.replaceAll("<\\/?\\!?[a-z]{1,10}[\\s\\S]*?>","");
    }

    public String noteFilter(String html){
        return html.replaceAll("<\\!--[\\s\\S]*?-->","");
    }

    public static void main(String[] args){

    }
}

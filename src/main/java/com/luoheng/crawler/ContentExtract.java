package com.luoheng.crawler;

public class ContentExtract{
    public void extract(String html){
        HtmlLabelFilter filter=new HtmlLabelFilter();
        String text=html;
        text=filter.scriptFilter(text);
        text=filter.labelFilter(text);
        text=filter.noteFilter(text);
        String[] lines=text.split("\n");
    }
}

package design.structure.adapter.application.example2.wordsfilter;


/**
 * @Author 喻可
 * @Date 2021/7/14 11:17
 */

public class ASensitiveWordsFilter { // A敏感词过滤系统提供的接口

    //text是原始文本，函数输出用***替换敏感词之后的文本
    public String filterSexyWords(String text) {
        // ...
        return text;
    }

    public String filterPoliticalWords(String text) {
        // ...
        return text;
    }
}

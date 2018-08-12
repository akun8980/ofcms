package com.ofsoft.cms.front.controller;

import com.jfinal.core.ActionKey;
import com.jfinal.plugin.activerecord.Record;
import com.ofsoft.cms.core.annotation.Action;
import com.ofsoft.cms.core.config.AdminConst;
import com.ofsoft.cms.core.config.FrontConst;
import com.ofsoft.cms.core.uitle.SiteUtile;

import java.util.Map;

/**
 * 页面配置
 *
 * @author OF
 * @date 2018年1月2日
 */
@Action()
public class IndexController extends BaseController {
    public void test() {
        render("/front/index.html");
    }

    /**
     * 首页页面
     */
    @ActionKey(value = "index")
    public void front() {
        render(FrontConst.TEMPLATE_PATE + SiteUtile.getTemplatePath() + "/index.html");
    }

    /**
     * 首页面配置
     */
    @ActionKey(value = "/")
    public void index() {
        Map params = getParamsMap();
        String page = getPara(0);
        //是否是首页
        if("/".equals(page) || page == null || "index".equals(page)){
            render(FrontConst.TEMPLATE_PATE + SiteUtile.getTemplatePath() + "/index.html");
            return;
        }

        //获取当前栏目
        params.put("site_id", SiteUtile.getSiteId());
        params.put("column_english", page);
        params.put("page", page);
        Record record = SiteUtile.getColumn(params);
        if(record == null){
            render(AdminConst.ERROR_404);
            return ;
        }
        setAttr("columns", record);
        setAttr("params", params);
        //是否是单页
        if("1".equals(record.get("is_open","0"))){
            String templatePath =  SiteUtile.getTemplatePath(record.getStr("column_content_page"),"/article.html");
            render(FrontConst.TEMPLATE_PATE + SiteUtile.getTemplatePath() + templatePath);
            return;
        }
        //是否是内容
        String isContent = getPara(1);
        if("c".equals(isContent)){
            params.put("content_id", getParaToInt(2,0));
            String templatePath = SiteUtile.getTemplatePath(record.getStr("column_content_page"),"/article.html");
            render(FrontConst.TEMPLATE_PATE + SiteUtile.getTemplatePath() + templatePath);
            return;
        }
        //当前页码
        int pageNum = getParaToInt(1, 1);
        setAttr("pageNum", pageNum);
        String templatePath = SiteUtile.getTemplatePath(record.getStr("template_path"),"/list.html");
        render(FrontConst.TEMPLATE_PATE + SiteUtile.getTemplatePath() + templatePath);
    }


    /**
     * 列表页面
     */
    @ActionKey(value = "/list")
    public void list() {
        render(FrontConst.TEMPLATE_PATE + SiteUtile.getTemplatePath() + "/list.html");
    }

    /**
     * 内容页面
     */
    @ActionKey(value = "/content")
    public void content() {
        String p = getRequest().getRequestURI();
        p = p.replace(getRequest().getContextPath(), "").replace("/content", "");
        render(FrontConst.TEMPLATE_PATE + SiteUtile.getTemplatePath() + p);
    }

    /**
     * 栏目页面
     */
    @ActionKey(value = "/column")
    public void column() {
        Map params = getParamsMap();
        String page = getPara(0);
        //当前页码
        int pageNum = getParaToInt(1, 1);
        //获取当前栏目
        params.put("site_id", SiteUtile.getSiteId());
        params.put("column_english", page);
        params.put("page", page);
        Record record = SiteUtile.getColumn(params);
        setAttr("columns", record);
        setAttr("params", params);
        setAttr("pageNum", pageNum);
        String templatePath = record.getStr("template_path");
        if (templatePath == null) {
            templatePath = "index.html";
        } else {
            if (!templatePath.startsWith("/")) {
                templatePath = "/" + templatePath;
            }
            if (!templatePath.endsWith(".html")) {
                templatePath = templatePath + ".html";
            }
        }
        render(FrontConst.TEMPLATE_PATE + SiteUtile.getTemplatePath() + templatePath);
    }

    /**
     * 普通页面
     */
    @ActionKey(value = "/news")
    public void news() {
        String p = getRequest().getRequestURI();
        p = p.replace(getRequest().getContextPath(), "").replace("/page", "");
        render(FrontConst.TEMPLATE_PATE + SiteUtile.getTemplatePath() + p);
    }

    /**
     * 页面配置
     */
    @ActionKey(value = "page")
    public void page() {
        String s = getPara("s");
        if (s.lastIndexOf(".html") != 0) {
            s = s + ".html";
        }
        setAttr("params", getParamsMap());
        render(FrontConst.TEMPLATE_PATE + SiteUtile.getTemplatePath() + s);
    }
}

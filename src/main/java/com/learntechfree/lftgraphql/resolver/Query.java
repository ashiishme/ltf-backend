package com.learntechfree.lftgraphql.resolver;

import com.learntechfree.lftgraphql.article.Article;
import com.learntechfree.lftgraphql.article.ArticleRepository;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class Query implements GraphQLQueryResolver {

    @Autowired
    private ArticleRepository articleRepository;

    public Query(ArticleRepository articleRepository){
        System.out.println("here in query");
        this.articleRepository = articleRepository;
    }

    public Query(){
    }

    public String hello(){
        return "Hello world";
    }

    public List<Article> listArticles(){
       return this.articleRepository.findAll();
    }

}

package cn.accp.Bao;

import cn.accp.eneity.News;

import java.util.List;

/**
 * Created by zhang on 2018/12/12.
 */
public interface NewsDao {
    List<News> selectAll();
}

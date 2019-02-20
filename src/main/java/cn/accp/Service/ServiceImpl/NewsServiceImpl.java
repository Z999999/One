package cn.accp.Service.ServiceImpl;

import cn.accp.Bao.Impl.NewsDaoImpl;
import cn.accp.Bao.NewsDao;
import cn.accp.Service.NewsService;
import cn.accp.eneity.News;

import java.util.List;

/**
 * Created by zhang on 2018/12/12.
 */
public class NewsServiceImpl implements NewsService{
   NewsDao newsDao=new NewsDaoImpl();
    @Override
    public List<News> selectAll() {
        return newsDao.selectAll();
    }
}

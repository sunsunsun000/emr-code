package pkuhit.iih.qa.dao.auto;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import pkuhit.iih.qa.dao.auto.entity.QaSysAmrRankScr;
import xap.sv.dao.annotation.RepositoryConfig;
import org.seasar.doma.BatchDelete;
import org.seasar.doma.BatchInsert;
import org.seasar.doma.BatchUpdate;
import java.util.List;
import org.seasar.doma.ClobFactory;
import java.sql.Clob;


/**
 */
@Dao
@RepositoryConfig
public interface QaSysAmrRankScrDao {

    /**
     * @param qaSysAmrRankScrCd
     * @return the QaSysAmrRankScr entity
     */
    @Select
    QaSysAmrRankScr selectById(String qaSysAmrRankScrCd);


    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(QaSysAmrRankScr entity);
    
    /**
     * 为null的字段不会更新到数据表
     * @param entity
     * @return affected rows
     */
    @Insert(excludeNull=true)
    int insertExludeNull(QaSysAmrRankScr entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(QaSysAmrRankScr entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update(excludeNull=true)
    int updateExcludeNull(QaSysAmrRankScr entity);

    /**
     * 标记删除
     * @param entity
     * 对实体进行标记删除时entity需要设置三个值，updCount，主键，del_f（=1）
     * @return affected rows
     */
    @Update(excludeNull=true)
    int markDelete(QaSysAmrRankScr entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(QaSysAmrRankScr entity);

    @BatchInsert
    int[] batchInsert(List<QaSysAmrRankScr> entities);

    @BatchUpdate
    int[] batchUpdate(List<QaSysAmrRankScr> entities);

    @BatchDelete
    int[] batchDelete(List<QaSysAmrRankScr> entities);
    
    @ClobFactory
    Clob createClob();
}
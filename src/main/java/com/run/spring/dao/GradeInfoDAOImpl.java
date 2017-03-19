package com.run.spring.dao;

import com.run.spring.model.GradeInfo;
import com.run.spring.model.GradeInfoExample;
import java.util.List;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class GradeInfoDAOImpl extends SqlMapClientDaoSupport implements GradeInfoDAO {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_grade_info
     *
     * @mbggenerated Sat Dec 03 16:48:38 CST 2016
     */
    public GradeInfoDAOImpl() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_grade_info
     *
     * @mbggenerated Sat Dec 03 16:48:38 CST 2016
     */
    public int countByExample(GradeInfoExample example) {
        Integer count = (Integer)  getSqlMapClientTemplate().queryForObject("tb_grade_info.countByExample", example);
        return count;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_grade_info
     *
     * @mbggenerated Sat Dec 03 16:48:38 CST 2016
     */
    public int deleteByExample(GradeInfoExample example) {
        int rows = getSqlMapClientTemplate().delete("tb_grade_info.deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_grade_info
     *
     * @mbggenerated Sat Dec 03 16:48:38 CST 2016
     */
    public int deleteByPrimaryKey(Integer id) {
        GradeInfo _key = new GradeInfo();
        _key.setId(id);
        int rows = getSqlMapClientTemplate().delete("tb_grade_info.deleteByPrimaryKey", _key);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_grade_info
     *
     * @mbggenerated Sat Dec 03 16:48:39 CST 2016
     */
    public Integer insert(GradeInfo record) {
        Object newKey = getSqlMapClientTemplate().insert("tb_grade_info.insert", record);
        return (Integer) newKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_grade_info
     *
     * @mbggenerated Sat Dec 03 16:48:39 CST 2016
     */
    public Integer insertSelective(GradeInfo record) {
        Object newKey = getSqlMapClientTemplate().insert("tb_grade_info.insertSelective", record);
        return (Integer) newKey;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_grade_info
     *
     * @mbggenerated Sat Dec 03 16:48:39 CST 2016
     */
    @SuppressWarnings("unchecked")
    public List<GradeInfo> selectByExample(GradeInfoExample example) {
        List<GradeInfo> list = getSqlMapClientTemplate().queryForList("tb_grade_info.selectByExample", example);
        return list;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_grade_info
     *
     * @mbggenerated Sat Dec 03 16:48:39 CST 2016
     */
    public GradeInfo selectByPrimaryKey(Integer id) {
        GradeInfo _key = new GradeInfo();
        _key.setId(id);
        GradeInfo record = (GradeInfo) getSqlMapClientTemplate().queryForObject("tb_grade_info.selectByPrimaryKey", _key);
        return record;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_grade_info
     *
     * @mbggenerated Sat Dec 03 16:48:39 CST 2016
     */
    public int updateByExampleSelective(GradeInfo record, GradeInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_grade_info.updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_grade_info
     *
     * @mbggenerated Sat Dec 03 16:48:39 CST 2016
     */
    public int updateByExample(GradeInfo record, GradeInfoExample example) {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = getSqlMapClientTemplate().update("tb_grade_info.updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_grade_info
     *
     * @mbggenerated Sat Dec 03 16:48:39 CST 2016
     */
    public int updateByPrimaryKeySelective(GradeInfo record) {
        int rows = getSqlMapClientTemplate().update("tb_grade_info.updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_grade_info
     *
     * @mbggenerated Sat Dec 03 16:48:39 CST 2016
     */
    public int updateByPrimaryKey(GradeInfo record) {
        int rows = getSqlMapClientTemplate().update("tb_grade_info.updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_grade_info
     *
     * @mbggenerated Sat Dec 03 16:48:39 CST 2016
     */
    protected static class UpdateByExampleParms extends GradeInfoExample {
        private Object record;

        public UpdateByExampleParms(Object record, GradeInfoExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}
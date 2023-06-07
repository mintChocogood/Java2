package org.zerock.myapp.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.zerock.myapp.domain.JoinGroupPlanDTO;

public interface JoinGroupPlanMapper {
	
	
	@Select("""
			SELECT *
				FROM TBL_GROUPPLAN GP, TBL_GROUP_DETAILPLAN DE
				WHERE GP.PLANNO = DE.PLANNO AND to_date(ENDDATE,'yyyy-MM-dd') >= to_date(CURRENT_DATE ,'yyyy-MM-dd')AND NICKNAME = #{nickName}
				ORDER BY GP.PLANNO ,PLANDAY, TO_CHAR(PLANTIME, 'HH24:MI')
			""")
	public abstract List<JoinGroupPlanDTO> selectList(@Param("nickName") String nickName);

}

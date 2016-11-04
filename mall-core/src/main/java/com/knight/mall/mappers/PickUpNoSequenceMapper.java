package com.knight.mall.mappers;

import java.io.Serializable;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.knight.mall.model.PickUpNoSequence;
import com.knight.mall.query.PickUpNoSequenceQuery;

public interface PickUpNoSequenceMapper  {
	/***/
	PickUpNoSequence load(Long id);

	/***/
	void insert(PickUpNoSequence pickUpNoSequence);

	/***/
	void update(PickUpNoSequence pickUpNoSequence);

	/***/
	void updateStatus(@Param("id") Long id, @Param("status") Serializable status);

	/***/
	void delete(Long id);

	/***/
	List<PickUpNoSequence> queryList(PickUpNoSequenceQuery pickUpNoSequenceQuery);

	/***/
	int queryCount(PickUpNoSequenceQuery pickUpNoSequenceQuery);
}
package io.imking.biz.reward.dto;

import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RwDetailDto {

	private int id;
	
	private String nickname;
	
	private int level;
	
	private BigDecimal taskAmount;
	
	private String title;
	
	private byte type;
	
	private Date createTime;
	
	private long answerCount;
	
	private long questionCount;
	
	private long commentCount;
	
	
}

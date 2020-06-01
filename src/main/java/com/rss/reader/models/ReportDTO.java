package com.rss.reader.models;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class ReportDTO {

	private List<PirateCrew> pirateCrewList;
	
	private List<DevilFruit> devilFruitList;
	
	
}

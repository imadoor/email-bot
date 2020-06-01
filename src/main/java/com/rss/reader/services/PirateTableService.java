package com.rss.reader.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rss.reader.models.DevilFruit;
import com.rss.reader.models.PirateCrew;
import com.rss.reader.models.ReportDTO;

@Service
public class PirateTableService {
	
	@Autowired
	private ReportDTO reportDTO;
	
	public ReportDTO generatePirateTable() {
		List <PirateCrew> pirateCrewList = new ArrayList<PirateCrew>();
		List <DevilFruit> devilFruitList = new ArrayList<DevilFruit>();
		
		PirateCrew strawhatPiratesCrew = new PirateCrew("Luffy", "Zorro", "Nami");
		PirateCrew beastPiratesCrew = new PirateCrew("Kaido", "King", "Queen");
		PirateCrew heartPiratesCrew = new PirateCrew("Law", "Bepo", "Bepo");
		pirateCrewList.add(strawhatPiratesCrew);
		pirateCrewList.add(beastPiratesCrew);
		pirateCrewList.add(heartPiratesCrew);
		
		DevilFruit gomuGomu = new DevilFruit("Gomu Gomu no Mi", "Elasticity");
		DevilFruit smokeSmoke = new DevilFruit("Smoke Smoke no Mi", "Smoke like intangiblity");
		DevilFruit meraMera = new DevilFruit("Mera Mera no Mi", "Fire");
		
		devilFruitList.add(gomuGomu);
		devilFruitList.add(smokeSmoke);
		devilFruitList.add(meraMera);
		
		reportDTO.setDevilFruitList(devilFruitList);
		reportDTO.setPirateCrewList(pirateCrewList);
		
		return reportDTO;
	}
}

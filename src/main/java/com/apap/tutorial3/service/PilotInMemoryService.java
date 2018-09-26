package com.apap.tutorial3.service;

import java.util.ArrayList;
import java.util.List;

import com.apap.tutorial3.model.PilotModel;

import org.springframework.stereotype.Service;

@Service
public class PilotInMemoryService implements PilotService{
	private List<PilotModel> archivePilot;
	
	public PilotInMemoryService() {
		archivePilot = new ArrayList<>();
	}
	
	@Override
	public void addPilot(PilotModel pilot) {
		archivePilot.add(pilot);
	}
	
	@Override
	public List<PilotModel> getPilotList() {
		return archivePilot;
	}

	@Override
	public PilotModel getPilotDetailByLicenseNumber(String licenseNumber) {
		for (PilotModel siPilot : archivePilot) {
			if (siPilot.getLicenseNumber().equals(licenseNumber)) {
				return siPilot;
			}
		}
		return null;
	}

	@Override
	public PilotModel getPilotDetailById(String id) {
		for (PilotModel siPilot : archivePilot) {
			if (siPilot.getId().equals(id)) {
				return siPilot;
			}
		}
		return null;
	}
}

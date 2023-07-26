package com.shaot.model;

import java.util.ArrayList;
import java.util.List;

import com.shaot.dto.company.CompanyForWorkerDto;
import com.shaot.dto.worker.WorkerScheduleDto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
public class Worker {
	private long id;
	@Setter
	private String name;
	@Setter
	private String password;
	private List<CompanyForWorkerDto> companies = new ArrayList<>();
	private List<WorkerScheduleDto> shifts = new ArrayList<>();
	
	public Worker(long id, String name, String password) {
		this.id = id;
		this.name = name;
		this.password = password;
	}
	
	public boolean addCompany(CompanyForWorkerDto company) {
		if(!companies.contains(company)) {
			return companies.add(company);
		}
		return false;
	}
	
	public void removeCompany(CompanyForWorkerDto company) {
		if(companies.contains(company)) {
			companies.remove(company);
		}
	}
	
	public boolean addShift(WorkerScheduleDto shift) {
		if(!shifts.contains(shift)) {
			return shifts.add(shift);
		}
		return false;
	}
}

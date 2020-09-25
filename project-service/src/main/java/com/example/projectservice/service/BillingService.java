package com.example.projectservice.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.projectservice.model.Project;
import com.example.projectservice.model.ProjectViewModel;
import com.example.projectservice.model.Standardrate;
import com.example.projectservice.repository.ProjectRepository;
import com.example.projectservice.repository.StandardrateRepository;

@Service
public class BillingService {
	
	@Autowired
	ProjectRepository projectRepository;
	
	@Autowired
	StandardrateRepository standardrateRepository;
	
	public Standardrate saveBill(Standardrate standardrate) {
        //Optional<Project> projectObj = projectRepository.findById(standardrate.getPid());

        /*LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String fdt = dt.format(formatter);
        LocalDateTime dateTime = LocalDateTime.parse(fdt, formatter);*/

        /*SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date dateTim=formatter.parse(formatDateTime);*/

        Standardrate newBill=new Standardrate();
        newBill.setId(standardrate.getId());
        newBill.setItem(standardrate.getItem());
        newBill.setQty(standardrate.getQty());
        newBill.setUnitPrice(standardrate.getUnitPrice());
        newBill.setTotalPrice(standardrate.getTotalPrice());
        newBill.setBillDate(standardrate.getBillDate());
        newBill.setPid(standardrate.getPid());
        
        return standardrateRepository.save(newBill);
    }
	
	public List<ProjectViewModel> fetchMonthlyDetails(int givenMonth) {
        //LocalDateTime dt = LocalDateTime.now();
		ProjectViewModel viewModel = new ProjectViewModel();
        List<Standardrate> billList = standardrateRepository.findAll();
        List<Project> projectList = projectRepository.findAll();
        List<ProjectViewModel> proViewList = new ArrayList<>();
        //Optional<Project> projectObj = projectRepository.findById(standardrate.getPid());

        billList
                .stream()
                .filter(bill -> bill.getBillDate().getMonthValue() == givenMonth)
                .forEach(bills -> {
                	viewModel.setBid(bills.getId());
                	viewModel.setItem(bills.getItem());
                	viewModel.setQty(bills.getQty());
                	viewModel.setUnitPrice(bills.getUnitPrice());
                	viewModel.setTotalPrice(bills.getTotalPrice());
                	viewModel.setBillDate(bills.getBillDate());
                	
                	projectList.stream().forEach(pro -> {
                if (pro.getId() == bills.getPid()) {
                	viewModel.setProjectName(pro.getProjectName());
                	viewModel.setProjectType(pro.getProjectType());
                	viewModel.setClientName(pro.getClientName());
	                }
	            });
                	proViewList.add(new ProjectViewModel(viewModel.getBid(), viewModel.getItem(),viewModel.getQty(),viewModel.getUnitPrice(),viewModel.getTotalPrice(),viewModel.getBillDate(),viewModel.getProjectName(),viewModel.getProjectType(),viewModel.getClientName()));
        });
        return proViewList;
    }

}

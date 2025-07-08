package com.adminrole.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;

import com.adminrole.model.Admin;
import com.adminrole.repository.AdminRepository;

public class AdminServiceImpl {

	@Autowired
    private AdminRepository adminRepo;

    public Admin login(Admin request) {
        return adminRepo.findByUsername(request.getUsername())
                .filter(admin -> admin.getPassword().equals(request.getPassword()))
                .orElseThrow(() -> new RuntimeException("Invalid credentials"));
    }

}

package com.adminrole.controller;


	@RestController
	@RequestMapping("/admin")
	public class AdminController {

	    @Autowired
	    private AdminService adminService;

	    @PostMapping("/login")
	    public ResponseEntity<Admin> login(@RequestBody Admin request) {
	        Admin loggedInAdmin = adminService.login(request);
	        return ResponseEntity.ok(loggedInAdmin);
	    }
	}

}

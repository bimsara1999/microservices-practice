package com.springbootAcademy.employee_service.service.impl;

import com.springbootAcademy.employee_service.dto.ApiResponseDTO;
import com.springbootAcademy.employee_service.dto.DepartmentDTO;
import com.springbootAcademy.employee_service.dto.EmployeeDTO;
import com.springbootAcademy.employee_service.entity.Employee;
import com.springbootAcademy.employee_service.repository.EmployeeRepository;
import com.springbootAcademy.employee_service.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Service
@AllArgsConstructor
public class EmployeeServiceIMPL implements EmployeeService {

    private EmployeeRepository employeeRepository;
   // private RestTemplate restTemplate;
    private WebClient webClient;




    @Override
    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO) {

        //employee object ekkt entity type
        Employee employee = new Employee(
                employeeDTO.getId(),
                employeeDTO.getFirstname(),
                employeeDTO.getLastname(),
                employeeDTO.getEmail(),
                employeeDTO.getDepartmentCode()
        );
        Employee savedEmployee = employeeRepository.save(employee);

        EmployeeDTO savedEmployeeDTO = new EmployeeDTO(
                savedEmployee.getId(),
                savedEmployee.getFirstname(),
                savedEmployee.getLastname(),
                savedEmployee.getEmail(),
                savedEmployee.getDepartmentCode()
        );
        return savedEmployeeDTO;
    }

    @Override
    public ApiResponseDTO getEmployeeById(Long id) {

        //database ekata entity haraha
        Employee employee = employeeRepository.findById(id).get();


        //communication with rest template

      /*  ResponseEntity<DepartmentDTO> responseEntity =  restTemplate.getForEntity("http://localhost:8080/api/departments/" + employee.getDepartmentCode(), DepartmentDTO.class);
        DepartmentDTO departmentDTO = responseEntity.getBody();*/


        //communication with web client

        DepartmentDTO departmentDTO =   webClient.get()

                .uri("http://localhost:8080/api/departments/" + employee.getDepartmentCode())
                .retrieve()
                .bodyToMono(DepartmentDTO.class)
                .block();


        // using api client
        //DepartmentDTO departmentDTO = apiClient.getDepartment(employee.getDepartmentCode());


        EmployeeDTO employeeDTO = new EmployeeDTO(

                employee.getId(),
                employee.getFirstname(),
                employee.getLastname(),
                employee.getEmail(),
                employee.getDepartmentCode()
        );
        ApiResponseDTO apiResponseDTO = new ApiResponseDTO();
        apiResponseDTO.setEmployeeDTO(employeeDTO);
        apiResponseDTO.setDepartmentDTO(departmentDTO);
        return apiResponseDTO;
    }
}

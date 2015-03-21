package com.micro
import com.micro.model.ClientRepresentation
import com.micro.model.LoanApplicationRepresentation
import com.micro.model.LoanDecisionRepresentation
import com.micro.model.LoanRepresentation
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
/**
 */
@RestController
class ReportingController {

    private List clients = new ArrayList();


    @RequestMapping(value = "/api/clients", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String addNewClient(@RequestBody ClientRepresentation clientRepresentation)  {
        clients.add(clientRepresentation);
        return "new client registered "+ clientRepresentation.firstName;
    }

    @RequestMapping(value = "/api/loans/applications", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String registerLoanApplication(@RequestBody LoanApplicationRepresentation loanApplication)  {
        return "new application registered"
    }

    @RequestMapping(value = "/api/loans", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String registerLoanDetails(@RequestBody LoanRepresentation loan)  {
        return "new load details registered"
    }

    @RequestMapping(value = "/api/loans/decisions", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String registerLoanDecisions(@RequestBody LoanDecisionRepresentation loanDecision)  {
        return "new loan decision registered"
    }
}

package com.micro
import com.micro.model.ClientRepresentation
import com.micro.model.LoanApplicationRepresentation
import com.micro.model.LoanDecisionRepresentation
import com.micro.model.LoanRepresentation
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
/**
 */
@RestController
class ReportingController {

    private List clients = new ArrayList();
    private List<LoanApplicationRepresentation> loanApplicationRepresentations = new ArrayList<>();
    private List loans = new ArrayList();
    private List loanDecisions = new ArrayList();


    @RequestMapping(value = "/api/clients", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String addNewClient(@RequestBody ClientRepresentation clientRepresentation)  {
        clients.add(clientRepresentation);
        return "new client registered "+ clientRepresentation.firstName;
    }

    @RequestMapping(value = "/api/loans/applications", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String registerLoanApplication(@RequestBody LoanApplicationRepresentation loanApplication)  {
        loanApplicationRepresentations.add(loanApplication);
        return "new application registered"
    }

    @RequestMapping(value = "/api/loans", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String registerLoanDetails(@RequestBody LoanRepresentation loan)  {
        loans.add(loan);
        return "new load details registered"
    }

    @RequestMapping(value = "/api/loans/decisions", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String registerLoanDecisions(@RequestBody LoanDecisionRepresentation loanDecision)  {
        loanDecisions.add(loanDecision);
        return "new loan decision registered"
    }

    @RequestMapping(value = "/api/clients", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<ClientRepresentation>  registeredClients() {
        return this.clients;
    }

    @RequestMapping(value = "/api/loans/applications", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<LoanApplicationRepresentation>  registeredLoanApplications() {
        return this.loanApplicationRepresentations;
    }

    @RequestMapping(value = "/api/loans", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<LoanRepresentation>  registeredLoans() {
        return this.loans;
    }

    @RequestMapping(value = "/api/loans/decisions", method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody List<LoanDecisionRepresentation>  registeredLoanDecisions() {
        return this.loanDecisions;
    }
}

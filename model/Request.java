package edu.ctb.upm.midas.rhdwiki.model;

import edu.ctb.upm.midas.rhdwiki.constants.Constants;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

public class Request {

    @Valid
    @NotNull(message = Constants.ERR_NO_PARAMETER)
    private List<Disease> diseases;


    public List<Disease> getDiseases() {
        return diseases;
    }

    public void setDiseases(List<Disease> diseases) {
        this.diseases = diseases;
    }
}

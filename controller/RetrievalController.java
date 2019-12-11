package edu.ctb.upm.midas.rhdwiki.controller;

import edu.ctb.upm.midas.rhdwiki.model.Disease;
import edu.ctb.upm.midas.rhdwiki.model.Request;
import edu.ctb.upm.midas.rhdwiki.service.WikipediaApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mobile.device.Device;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("${my.service.rest.request.mapping.retrieval.general.url}")
public class RetrievalController {

    @Autowired
    private WikipediaApiService wikipediaApiService;

    @RequestMapping(path = { "/disease/history" }, //wikipedia extraction
            method = RequestMethod.POST)
    public void diseaseHistoryRetrieval(@RequestBody @Valid Request request) {
        wikipediaApiService.init(request.getDiseases());
    }

}

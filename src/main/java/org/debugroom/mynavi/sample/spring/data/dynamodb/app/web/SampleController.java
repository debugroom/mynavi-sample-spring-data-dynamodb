package org.debugroom.mynavi.sample.spring.data.dynamodb.app.web;

import org.debugroom.mynavi.sample.spring.data.dynamodb.app.model.SampleModel;
import org.debugroom.mynavi.sample.spring.data.dynamodb.app.model.SampleModelMapper;
import org.debugroom.mynavi.sample.spring.data.dynamodb.domain.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleController {

    @Autowired
    SampleService sampleService;

    @RequestMapping(method = RequestMethod.GET, value="findAll")
    public String findAll(Model model){
        model.addAttribute("mynaviSampleTables", sampleService.getMynaviSampleTables());
        return "findAll";
    }

    @RequestMapping(method = RequestMethod.GET, value="findOne")
    public String findOne(SampleModel sampleModel, Model model){
        model.addAttribute("mynaviSampleTable", sampleService.getMynaviSampleTable(
                SampleModelMapper.mapToMynaviSampleTableKey(sampleModel)));
        return "findOne";
    }

    @RequestMapping(method = RequestMethod.POST,  value="add")
    public String add(SampleModel sampleModel, Model model){
        model.addAttribute("mynaviSampleTable",
                sampleService.addMynaviSampleTable(SampleModelMapper.map(sampleModel)));
        return "add";
    }

    @RequestMapping(method = RequestMethod.POST, value = "update")
    public String update(SampleModel sampleModel, Model model){
        model.addAttribute("mynaviSampleTable",
                sampleService.updateMynaviSampleTable(SampleModelMapper.map(sampleModel)));
        return "update";
    }

    @RequestMapping(method = RequestMethod.POST, value = "delete")
    public String delete(SampleModel sampleModel, Model model){
        model.addAttribute("mynaviSampleTable",
                sampleService.deleteMynaviSampleTable(
                        SampleModelMapper.mapToMynaviSampleTableKey(sampleModel)));
        return "delete";
    }

}

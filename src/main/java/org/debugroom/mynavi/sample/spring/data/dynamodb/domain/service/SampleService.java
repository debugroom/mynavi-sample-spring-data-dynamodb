package org.debugroom.mynavi.sample.spring.data.dynamodb.domain.service;

import org.debugroom.mynavi.sample.spring.data.dynamodb.domain.model.MynaviSampleTable;
import org.debugroom.mynavi.sample.spring.data.dynamodb.domain.model.MynaviSampleTableKey;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface SampleService {


    public MynaviSampleTable getMynaviSampleTable(MynaviSampleTableKey mynaviSampleTableKey);

    public List<MynaviSampleTable> getMynaviSampleTables();

    public MynaviSampleTable addMynaviSampleTable(MynaviSampleTable mynaviSampleTable);

    public MynaviSampleTable updateMynaviSampleTable(MynaviSampleTable mynaviSampleTable);

    public MynaviSampleTable deleteMynaviSampleTable(MynaviSampleTableKey mynaviSampleTableKey);

}

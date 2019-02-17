package org.debugroom.mynavi.sample.spring.data.dynamodb.domain.service;

import org.debugroom.mynavi.sample.spring.data.dynamodb.domain.model.MynaviSampleTable;
import org.debugroom.mynavi.sample.spring.data.dynamodb.domain.model.MynaviSampleTableKey;
import org.debugroom.mynavi.sample.spring.data.dynamodb.domain.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class SampleServiceImpl implements SampleService{

    @Autowired
    SampleRepository sampleRepository;

    @Override
    public MynaviSampleTable getMynaviSampleTable(MynaviSampleTableKey mynaviSampleTableKey) {
        return sampleRepository.findById(mynaviSampleTableKey).get();
    }

    @Override
    public List<MynaviSampleTable> getMynaviSampleTables() {
        List<MynaviSampleTable> sampleTables = new ArrayList<>();
        sampleRepository.findAll().iterator().forEachRemaining(sampleTables::add);
        return sampleTables;
    }

    @Override
    public MynaviSampleTable addMynaviSampleTable(MynaviSampleTable mynaviSampleTable) {
        mynaviSampleTable.setSamplePartitionKey(UUID.randomUUID().toString());
        mynaviSampleTable.setSampleSortKey("1");
        return sampleRepository.save(mynaviSampleTable);
    }

    @Override
    public MynaviSampleTable updateMynaviSampleTable(MynaviSampleTable mynaviSampleTable) {
        return sampleRepository.save(mynaviSampleTable);
    }

    @Override
    public MynaviSampleTable deleteMynaviSampleTable(MynaviSampleTableKey mynaviSampleTableKey) {
        MynaviSampleTable mynaviSampleTable = sampleRepository.findById(mynaviSampleTableKey).get();
        sampleRepository.deleteById(mynaviSampleTableKey);
        return mynaviSampleTable;
    }

}

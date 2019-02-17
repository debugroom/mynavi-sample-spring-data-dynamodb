package org.debugroom.mynavi.sample.spring.data.dynamodb.app.model;

import org.debugroom.mynavi.sample.spring.data.dynamodb.domain.model.MynaviSampleTable;
import org.debugroom.mynavi.sample.spring.data.dynamodb.domain.model.MynaviSampleTableKey;

public interface SampleModelMapper {

    public static MynaviSampleTable map(SampleModel sampleModel){
        return MynaviSampleTable.builder()
                .samplePartitionKey(sampleModel.getSamplePartitionKey())
                .sampleSortKey(sampleModel.getSampleSortKey())
                .sampleText(sampleModel.getSampleText())
                .build();
    }

    public static MynaviSampleTableKey mapToMynaviSampleTableKey(SampleModel sampleModel){
        return MynaviSampleTableKey.builder()
                .samplePartitionKey(sampleModel.getSamplePartitionKey())
                .sampleSortKey(sampleModel.getSampleSortKey())
                .build();
    }
}

package org.debugroom.mynavi.sample.spring.data.dynamodb.app.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class SampleModel implements Serializable {

    private String samplePartitionKey;
    private String sampleSortKey;
    private String sampleText;

}

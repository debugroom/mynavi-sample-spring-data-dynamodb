package org.debugroom.mynavi.sample.spring.data.dynamodb.domain.repository;

import org.debugroom.mynavi.sample.spring.data.dynamodb.domain.model.MynaviSampleTableKey;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import org.debugroom.mynavi.sample.spring.data.dynamodb.domain.model.MynaviSampleTable;

@EnableScan
public interface SampleRepository extends CrudRepository<MynaviSampleTable, MynaviSampleTableKey> {
}

package org.feuyeux.jaxrs2.atup.cases.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AtupTestSuiteService {

    @Autowired
    org.feuyeux.jaxrs2.atup.cases.dao.AtupTestSuiteDao dao;

}
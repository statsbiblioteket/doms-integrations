/*
 * $Id$
 * $Revision$
 * $Date$
 * $Author$
 *
 * The DOMS project.
 * Copyright (C) 2007-2010  The State and University Library
 *
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */package dk.statsbiblioteket.doms.integration.summa;

import java.io.IOException;
import java.util.List;

import dk.statsbiblioteket.summa.common.Record;
import dk.statsbiblioteket.summa.common.configuration.Configuration;
import dk.statsbiblioteket.summa.storage.api.QueryOptions;
import dk.statsbiblioteket.summa.storage.api.ReadableStorage;

/**
 * @author tsh
 *
 */
public class DOMSReadableStorage implements ReadableStorage {

    private final Configuration configuration;
    private DOMSWSClient domsClient;

    public DOMSReadableStorage(Configuration configuration) {
	this.configuration = configuration;
    }
    
    /* (non-Javadoc)
     * @see dk.statsbiblioteket.summa.storage.api.ReadableStorage#getModificationTime(java.lang.String)
     */
    @Override
    public long getModificationTime(String arg0) throws IOException {
	// TODO Auto-generated method stub
	return 0;
    }

    /* (non-Javadoc)
     * @see dk.statsbiblioteket.summa.storage.api.ReadableStorage#getRecordsModifiedAfter(long, java.lang.String, dk.statsbiblioteket.summa.storage.api.QueryOptions)
     */
    @Override
    public long getRecordsModifiedAfter(long arg0, String arg1,
	    QueryOptions arg2) throws IOException {
	// TODO Auto-generated method stub
	return 0;
    }

    /* (non-Javadoc)
     * @see dk.statsbiblioteket.summa.storage.api.ReadableStorage#next(long, int)
     */
    @Override
    public List<Record> next(long arg0, int arg1) throws IOException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Record getRecord(String arg0, QueryOptions arg1) throws IOException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public List<Record> getRecords(List<String> arg0, QueryOptions arg1)
            throws IOException {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public Record next(long arg0) throws IOException {
	// TODO Auto-generated method stub
	return null;
    }
}

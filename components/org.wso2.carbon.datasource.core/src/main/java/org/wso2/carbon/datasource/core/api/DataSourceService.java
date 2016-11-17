/*
 *  Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.wso2.carbon.datasource.core.api;

import org.wso2.carbon.datasource.core.beans.DataSourceDefinition;
import org.wso2.carbon.datasource.core.exception.DataSourceException;

/**
 * DataSourceService interface which exposes the operations allowed to perform on data sources.
 */
public interface DataSourceService {

    /**
     * Returns a {@code CarbonDataSource} object for the given name.
     *
     * @param name String
     * @return DataSource Object
     * @throws DataSourceException
     */
    Object getDataSource(String name) throws DataSourceException;

    /**
     * Returns a {@code CarbonDataSource} object for the given dataSourceDefinition.
     *
     * @param dataSourceDefinition    {@code DataSourceDefinition} to create the datasource object.
     * @return {@code Object}
     * @throws DataSourceException
     */
    Object createDataSource(DataSourceDefinition dataSourceDefinition) throws DataSourceException;
}

/*
* Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/

package org.wso2.carbon.identity.api.server.idp.v1.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.wso2.carbon.identity.api.server.idp.v1.model.Property;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;
import javax.validation.Valid;
import javax.xml.bind.annotation.*;

public class OutboundConnectorPUTRequest  {
  
    private String connectorId;
    private String name;
    private Boolean isEnabled = false;
    private Boolean blockingEnabled = false;
    private Boolean rulesEnabled = false;
    private List<Property> properties = null;


    /**
    **/
    public OutboundConnectorPUTRequest connectorId(String connectorId) {

        this.connectorId = connectorId;
        return this;
    }
    
    @ApiModelProperty(example = "U0NJTQ", value = "")
    @JsonProperty("connectorId")
    @Valid
    public String getConnectorId() {
        return connectorId;
    }
    public void setConnectorId(String connectorId) {
        this.connectorId = connectorId;
    }

    /**
    **/
    public OutboundConnectorPUTRequest name(String name) {

        this.name = name;
        return this;
    }
    
    @ApiModelProperty(example = "SCIM", value = "")
    @JsonProperty("name")
    @Valid
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    /**
    **/
    public OutboundConnectorPUTRequest isEnabled(Boolean isEnabled) {

        this.isEnabled = isEnabled;
        return this;
    }
    
    @ApiModelProperty(example = "true", value = "")
    @JsonProperty("isEnabled")
    @Valid
    public Boolean getIsEnabled() {
        return isEnabled;
    }
    public void setIsEnabled(Boolean isEnabled) {
        this.isEnabled = isEnabled;
    }

    /**
    **/
    public OutboundConnectorPUTRequest blockingEnabled(Boolean blockingEnabled) {

        this.blockingEnabled = blockingEnabled;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("blockingEnabled")
    @Valid
    public Boolean getBlockingEnabled() {
        return blockingEnabled;
    }
    public void setBlockingEnabled(Boolean blockingEnabled) {
        this.blockingEnabled = blockingEnabled;
    }

    /**
    **/
    public OutboundConnectorPUTRequest rulesEnabled(Boolean rulesEnabled) {

        this.rulesEnabled = rulesEnabled;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("rulesEnabled")
    @Valid
    public Boolean getRulesEnabled() {
        return rulesEnabled;
    }
    public void setRulesEnabled(Boolean rulesEnabled) {
        this.rulesEnabled = rulesEnabled;
    }

    /**
    **/
    public OutboundConnectorPUTRequest properties(List<Property> properties) {

        this.properties = properties;
        return this;
    }
    
    @ApiModelProperty(value = "")
    @JsonProperty("properties")
    @Valid
    public List<Property> getProperties() {
        return properties;
    }
    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public OutboundConnectorPUTRequest addPropertiesItem(Property propertiesItem) {
        if (this.properties == null) {
            this.properties = new ArrayList<>();
        }
        this.properties.add(propertiesItem);
        return this;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {

        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OutboundConnectorPUTRequest outboundConnectorPUTRequest = (OutboundConnectorPUTRequest) o;
        return Objects.equals(this.connectorId, outboundConnectorPUTRequest.connectorId) &&
            Objects.equals(this.name, outboundConnectorPUTRequest.name) &&
            Objects.equals(this.isEnabled, outboundConnectorPUTRequest.isEnabled) &&
            Objects.equals(this.blockingEnabled, outboundConnectorPUTRequest.blockingEnabled) &&
            Objects.equals(this.rulesEnabled, outboundConnectorPUTRequest.rulesEnabled) &&
            Objects.equals(this.properties, outboundConnectorPUTRequest.properties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectorId, name, isEnabled, blockingEnabled, rulesEnabled, properties);
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("class OutboundConnectorPUTRequest {\n");
        
        sb.append("    connectorId: ").append(toIndentedString(connectorId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
        sb.append("    blockingEnabled: ").append(toIndentedString(blockingEnabled)).append("\n");
        sb.append("    rulesEnabled: ").append(toIndentedString(rulesEnabled)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
    * Convert the given object to string with each line indented by 4 spaces
    * (except the first line).
    */
    private String toIndentedString(java.lang.Object o) {

        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n");
    }
}


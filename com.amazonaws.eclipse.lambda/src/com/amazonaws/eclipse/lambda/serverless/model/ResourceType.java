/*
* Copyright 2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
*
* Licensed under the Apache License, Version 2.0 (the "License").
* You may not use this file except in compliance with the License.
* A copy of the License is located at
*
*  http://aws.amazon.com/apache2.0
*
* or in the "license" file accompanying this file. This file is distributed
* on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
* express or implied. See the License for the specific language governing
* permissions and limitations under the License.
*/
package com.amazonaws.eclipse.lambda.serverless.model;

public enum ResourceType {

    AWS_SERVERLESS_FUNCTION("AWS::Serverless::Function"),
    AWS_SERVERLESS_API("AWS::Serverless::Api"),
    AWS_S3_BUCKET("AWS::S3::Bucket"),
    AWS_DYNAMODB_TABLE("AWS::DynamoDB::Table"),
    AWS_SERVERLESS_SIMPLE_TABLE("AWS::Serverless::SimpleTable");
    //TODO: Ideally, we should add all the resources supported by CloudFormation

    private String value;

    private ResourceType(String value) {
        this.value = value;
    }

    public static ResourceType fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (ResourceType enumEntry : ResourceType.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }

    @Override
    public String toString() {
        return this.value;
    }
}

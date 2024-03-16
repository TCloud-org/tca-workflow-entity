package com.tcloud.dto;

import com.tcloud.constant.Environment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.jackson.Jacksonized;

import java.time.ZonedDateTime;

@Getter
@EqualsAndHashCode
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@Jacksonized
public class ServiceConfiguration {
    private Long serviceId;

    private String serviceName;

    private String clientId;

    private String baseUrl;

    private Environment environment;

    private String alias;

    private Long version;

    private ZonedDateTime createdAt;
}

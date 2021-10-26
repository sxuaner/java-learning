// package com.java.learning.javase.utils;

// /*
// Original:
// https://stackoverflow.com/questions/63194021/the-method-apisjava-util-function-predicatespringfox-documentation-requesthand
//  *
//  *  Copyright 2015-2018 the original author or authors.
//  *
//  *  Licensed under the Apache License, Version 2.0 (the "License");
//  *  you may not use this file except in compliance with the License.
//  *  You may obtain a copy of the License at
//  *
//  *         http://www.apache.org/licenses/LICENSE-2.0
//  *
//  *  Unless required by applicable law or agreed to in writing, software
//  *  distributed under the License is distributed on an "AS IS" BASIS,
//  *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  *  See the License for the specific language governing permissions and
//  *  limitations under the License.
//  *
//  *
//  */


// import com.fasterxml.classmate.TypeResolver;
// import org.joda.time.LocalDate;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.SpringApplication;
// import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.ComponentScan;
// import org.springframework.http.HttpMethod;
// import org.springframework.http.MediaType;
// import org.springframework.http.ResponseEntity;
// import org.springframework.web.context.request.async.DeferredResult;
// import springfox.documentation.builders.PathSelectors;
// import springfox.documentation.builders.RequestHandlerSelectors;
// import springfox.documentation.builders.ResponseBuilder;
// import springfox.documentation.schema.ScalarType;
// import springfox.documentation.schema.WildcardType;
// import springfox.documentation.service.ApiKey;
// import springfox.documentation.service.AuthorizationScope;
// import springfox.documentation.service.ParameterType;
// import springfox.documentation.service.SecurityReference;
// import springfox.documentation.service.Tag;
// import springfox.documentation.spi.DocumentationType;
// import springfox.documentation.spi.service.contexts.SecurityContext;
// import springfox.documentation.spring.web.plugins.Docket;
// import springfox.documentation.swagger.web.DocExpansion;
// import springfox.documentation.swagger.web.ModelRendering;
// import springfox.documentation.swagger.web.OperationsSorter;
// import springfox.documentation.swagger.web.SecurityConfiguration;
// import springfox.documentation.swagger.web.SecurityConfigurationBuilder;
// import springfox.documentation.swagger.web.TagsSorter;
// import springfox.documentation.swagger.web.UiConfiguration;
// import springfox.documentation.swagger.web.UiConfigurationBuilder;
// import springfox.documentation.swagger2.annotations.EnableSwagger2;
// import springfox.petstore.controller.PetController;

// import java.util.List;

// import static java.util.Collections.*;
// import static springfox.documentation.schema.AlternateTypeRules.*;


// @SpringBootApplication
// @ComponentScan(basePackageClasses = {PetController.class})  // Instructs spring where to scan for API controllers
// public class Swagger2SpringBoot {

//   public static void main(String[] args) {
//     SpringApplication.run(Swagger2SpringBoot.class, args);
//   }
// }

// //   @Bean
// //   public Docket petApi() {
// //     return new Docket(DocumentationType.SWAGGER_2)    // Docket, Springfox’s, primary api configuration mechanism is initialized for swagger specification 2.0
// //         .select()  //select() returns an instance of ApiSelectorBuilder to give fine grained control over the endpoints exposed via swagger.
// //         .apis(RequestHandlerSelectors.any()) 
// //         //apis() allows selection of RequestHandler's using a predicate. The example here uses an any predicate (default). Out of the box predicates 
// //         // provided are any, none, withClassAnnotation, withMethodAnnotation and basePackage.
// //         .paths(PathSelectors.any()) 
// //         // paths() allows selection of Path's using a predicate. The example here uses an any predicate (default). Out of the box we provide 
// //         // predicates for regex, ant, any, none.
// //         .build() // The selector needs to be built after configuring the api and path selectors.
// //         .pathMapping("/") // Adds a servlet path mapping, when the servlet has a path mapping. This
// //                           // prefixes paths with the provided path mapping.
// //         .directModelSubstitute(LocalDate.class, String.class) // Convenience rule builder that substitutes LocalDate
// //                                                               // with String when rendering model properties
// //         .genericModelSubstitutes(ResponseEntity.class)
// //         .alternateTypeRules(
// //             newRule(typeResolver.resolve(DeferredResult.class,
// //                 typeResolver.resolve(ResponseEntity.class, WildcardType.class)),
// //                 typeResolver.resolve(WildcardType.class))) // Convenience rule builder that substitutes a generic type
// //                                                            // with
// //                                                           // one type parameter with the type parameter. In this example
// //                                                           // ResponseEntity<T> with T. alternateTypeRules allows custom
// //                                                           // rules that are a bit more involved. The example substitutes
// //                                                           // DeferredResult<ResponseEntity<T>> with T generically.
// //         .useDefaultResponseMessages(false)      // Flag to indicate if default http response codes need to be used or not.
// //         .globalResponses(HttpMethod.GET, 
// //             singletonList(new ResponseBuilder()
// //                 .code("500")
// //                 .description("500 message")
// //                 .representation(MediaType.TEXT_XML)
// //                 .apply(r ->
// //                     r.model(m ->
// //                         m.referenceModel(ref ->
// //                             ref.key(k ->
// //                                 k.qualifiedModelName(q ->
// //                                     q.namespace("some:namespace")
// //                                         .name("ERROR")))))) 
// //                 .build()))// Allows globally overriding response messages for different http methods. In
// //                           // this example we override the 500 error code for all GET requests
// //                           // and indicate that it will use the response model Error (which will be
// //                           // defined elsewhere)
// //         .securitySchemes(singletonList(apiKey())) // Sets up the security schemes used to protect the apis. Supported
// //                                                   // schemes are ApiKey, BasicAuth and OAuth
// //         .securityContexts(singletonList(securityContext())) // Provides a way to globally set up security contexts for
// //                                                             // operation. The idea here is that we provide a way to
// //                                                             // select operations to be protected by one of the specified
// //                                                             // security schemes.
// //         .enableUrlTemplating(true) 
// //         .globalRequestParameters(
// //             singletonList(new springfox.documentation.builders.RequestParameterBuilder()
// //                 .name("someGlobalParameter")
// //                 .description("Description of someGlobalParameter")
// //                 .in(ParameterType.QUERY)
// //                 .required(true)
// //                 .query(q -> q.model(m -> m.scalarModel(ScalarType.STRING)))
// //                 .build()))// Allows globally configuration of default path-/request-/headerparameters
// //                           // which are common for every rest operation of the api, but aren`t needed in
// //                           // spring controller method signature (for example authenticaton information).
// //                           // Parameters added here will be part of every API Operation in the generated
// //                           // swagger specification. on how the security is setup the name of the header
// //                           // used may need to be different. Overriding this value is a way to override the
// //                           // default behavior.
// //         .tags(new Tag("Pet Service", "All apis relating to pets")) // Adding tags is a way to define all the available
// //                                                                    // tags that services/operations can opt into.
// //                                                                    // Currently this only has name and description.
// //         .additionalModels(typeResolver.resolve(AdditionalModel.class)); 
// //         // Are there models in the application that are not "reachable"? Not reachable
// //         // is when we have models that we would like to be described but aren’t
// //         // explicitly used in any operation. An example of this is an operation that
// //         // returns a model serialized as a string. We do want to communicate the
// //         // expectation of the schema for the string. This is a way to do exactly that.
// //   }

// //   @Autowired
// //   private TypeResolver typeResolver;

// //   private ApiKey apiKey() {
// //     return new ApiKey("mykey", "api_key", "header"); // Here we use ApiKey as the security schema that is identified by
// //                                                      // the name mykey
// //   }

// //   private SecurityContext securityContext() {
// //     return SecurityContext.builder()
// //         .securityReferences(defaultAuth())
// //         .forPaths(PathSelectors.regex("/anyPath.*")) 
// //         .build();
// //   }// Selector for the paths this security context applies to.

// //   List<SecurityReference> defaultAuth() {
// //     AuthorizationScope authorizationScope
// //         = new AuthorizationScope("global", "accessEverything");
// //     AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
// //     authorizationScopes[0] = authorizationScope;
// //     return singletonList(
// //         new SecurityReference("mykey", authorizationScopes)); 
// //   }// Here we use the same key defined in the security scheme mykey

// //   @Bean
// //   SecurityConfiguration security() {
// //     return SecurityConfigurationBuilder.builder() 
// //         .clientId("test-app-client-id")
// //         .clientSecret("test-app-client-secret")
// //         .realm("test-app-realm")
// //         .appName("test-app")
// //         .scopeSeparator(",")
// //         .additionalQueryStringParams(null)
// //         .useBasicAuthenticationWithAccessCodeGrant(false)
// //         .enableCsrfSupport(false)
// //         .build();
// //   }// Optional swagger-ui security configuration for oauth and apiKey settings

// //   @Bean
// //   UiConfiguration uiConfig() {
// //     return UiConfigurationBuilder.builder() 
// //         .deepLinking(true)
// //         .displayOperationId(false)
// //         .defaultModelsExpandDepth(1)
// //         .defaultModelExpandDepth(1)
// //         .defaultModelRendering(ModelRendering.EXAMPLE)
// //         .displayRequestDuration(false)
// //         .docExpansion(DocExpansion.NONE)
// //         .filter(false)
// //         .maxDisplayedTags(null)
// //         .operationsSorter(OperationsSorter.ALPHA)
// //         .showExtensions(false)
// //         .showCommonExtensions(false)
// //         .tagsSorter(TagsSorter.ALPHA)
// //         .supportedSubmitMethods(UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS)
// //         .validatorUrl(null)
// //         .build();
// //   }// Optional swagger-ui ui configuration currently only supports the validation url

// // }
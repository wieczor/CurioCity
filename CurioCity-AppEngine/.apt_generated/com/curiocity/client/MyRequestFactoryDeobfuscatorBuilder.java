// Automatically Generated -- DO NOT EDIT
// com.curiocity.client.MyRequestFactory
package com.curiocity.client;
import java.util.Arrays;
import com.google.web.bindery.requestfactory.vm.impl.OperationData;
import com.google.web.bindery.requestfactory.vm.impl.OperationKey;
public final class MyRequestFactoryDeobfuscatorBuilder extends com.google.web.bindery.requestfactory.vm.impl.Deobfuscator.Builder {
{
withOperation(new OperationKey("QHBIgoICq5GeyvViGhVvzwwyCRY="),
  new OperationData.Builder()
  .withClientMethodDescriptor("()Lcom/google/web/bindery/requestfactory/shared/InstanceRequest;")
  .withDomainMethodDescriptor("()Ljava/lang/String;")
  .withMethodName("send")
  .withRequestContext("com.curiocity.client.MyRequestFactory$MessageRequest")
  .build());
withOperation(new OperationKey("eynLtMCZagUsYIdAEYysiNzQQDo="),
  new OperationData.Builder()
  .withClientMethodDescriptor("()Lcom/google/web/bindery/requestfactory/shared/Request;")
  .withDomainMethodDescriptor("()Ljava/lang/String;")
  .withMethodName("getMessage")
  .withRequestContext("com.curiocity.client.MyRequestFactory$HelloWorldRequest")
  .build());
withOperation(new OperationKey("Bs9q6_Iz1nWgdkaqucV_mrxd1LE="),
  new OperationData.Builder()
  .withClientMethodDescriptor("()Lcom/google/web/bindery/requestfactory/shared/InstanceRequest;")
  .withDomainMethodDescriptor("()V")
  .withMethodName("register")
  .withRequestContext("com.curiocity.client.MyRequestFactory$RegistrationInfoRequest")
  .build());
withOperation(new OperationKey("97kiwkelINucDkfX0qG8dij1$w0="),
  new OperationData.Builder()
  .withClientMethodDescriptor("()Lcom/google/web/bindery/requestfactory/shared/InstanceRequest;")
  .withDomainMethodDescriptor("()V")
  .withMethodName("unregister")
  .withRequestContext("com.curiocity.client.MyRequestFactory$RegistrationInfoRequest")
  .build());
withRawTypeToken("_Vy0xHxfbrJdVlcGR0E4RrYhj8g=", "com.curiocity.shared.MessageProxy");
withRawTypeToken("AkFjmOXQlRcf5cNf5m2HCGu8r00=", "com.curiocity.shared.RegistrationInfoProxy");
withRawTypeToken("8KVVbwaaAtl6KgQNlOTsLCp9TIU=", "com.google.web.bindery.requestfactory.shared.ValueProxy");
withRawTypeToken("FXHD5YU0TiUl3uBaepdkYaowx9k=", "com.google.web.bindery.requestfactory.shared.BaseProxy");
withClientToDomainMappings("com.curiocity.server.Message", Arrays.asList("com.curiocity.shared.MessageProxy"));
withClientToDomainMappings("com.curiocity.server.RegistrationInfo", Arrays.asList("com.curiocity.shared.RegistrationInfoProxy"));
}}

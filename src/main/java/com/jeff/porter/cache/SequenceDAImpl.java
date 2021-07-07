/*
 * Copyright (c) PCMS Group plc 2013. All Rights Reserved.
 * This source code is copyright of PCMS Group plc. The information
 * contained herein is proprietary and confidential to PCMS Group plc.
 * This proprietary and confidential information, either in whole or in
 * part, shall not be used for any purpose unless permitted by the terms
 * of a valid license agreement.
 */
package com.jeff.porter.cache;

import com.jeff.porter.cache.mapper.SequenceMapper;

import javax.inject.Inject;
import javax.inject.Named;
import java.math.BigInteger;
import java.util.List;

@Named("sequenceDAImpl")
public class SequenceDAImpl
{
  @Inject
  private List<SequenceMapper> sequenceMappers;

  public BigInteger getSequenceIncrement(String sequenceName)
  {
    return null;  // normally call to the DB here, if we could wire in the sequenceMapper

  }

}

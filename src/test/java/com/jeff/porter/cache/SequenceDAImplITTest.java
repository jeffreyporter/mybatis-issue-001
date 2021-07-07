/*
 * Copyright (c) PCMS Group plc 2014. All Rights Reserved.
 * This source code is copyright of PCMS Group plc. The information
 * contained herein is proprietary and confidential to PCMS Group plc.
 * This proprietary and confidential information, either in whole or in
 * part, shall not be used for any purpose unless permitted by the terms
 * of a valid license agreement.
 */
package com.jeff.porter.cache;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class SequenceDAImplITTest
{
  private static final String TABLE_NAME = "STOCK_MOVEMENT";

  @Autowired
  private SequenceDAImpl sequenceDA;

  @Test
  public void thatGetIncrementReturnsCorrectValue()
  {
    BigInteger sequenceIncrement = sequenceDA.getSequenceIncrement(TABLE_NAME);
    assertEquals(BigInteger.valueOf(1000), sequenceIncrement);
  }
}

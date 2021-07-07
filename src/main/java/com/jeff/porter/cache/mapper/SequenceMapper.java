/*
 * Copyright (c) PCMS Group plc 2013. All Rights Reserved.
 * This source code is copyright of PCMS Group plc. The information
 * contained herein is proprietary and confidential to PCMS Group plc.
 * This proprietary and confidential information, either in whole or in
 * part, shall not be used for any purpose unless permitted by the terms
 * of a valid license agreement.
 */
package com.jeff.porter.cache.mapper;

import com.jeff.porter.annotation.MybatisMapper;

@MybatisMapper
public interface SequenceMapper
{
  void getSequenceIncrement(int type);
}

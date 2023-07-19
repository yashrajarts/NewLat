/**
 * 
 */
package com.mabsisa.txnreport.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.mabsisa.txnreport.config.DataStore;
import com.mabsisa.txnreport.model.Txn;

/**
 * @author Debu Paul
 *
 */
@Component
public class TxnReportService {

  @Autowired
  DataStore dataStore;

  public List<Txn> getData(int pageNumber, int pageSize, List<String> fields) {
    System.out.println(fields);
    return dataStore.getTxns().stream().skip(pageNumber * pageSize).limit(pageSize).map(txn -> {
      if (!fields.contains("field1")) {
        txn.setField1(null);
      }
      if (!fields.contains("field2")) {
        txn.setField2(null);
      }
      if (!fields.contains("field3")) {
        txn.setField3(null);
      }
      if (!fields.contains("field4")) {
        txn.setField4(null);
      }
      if (!fields.contains("field5")) {
        txn.setField5(null);
      }
      if (!fields.contains("field6")) {
        txn.setField6(null);
      }
      if (!fields.contains("field7")) {
        txn.setField7(null);
      }
      if (!fields.contains("field8")) {
        txn.setField8(null);
      }
      if (!fields.contains("field9")) {
        txn.setField9(null);
      }
      if (!fields.contains("field10")) {
        txn.setField10(null);
      }
      if (!fields.contains("field11")) {
        txn.setField11(null);
      }
      if (!fields.contains("field12")) {
        txn.setField12(null);
      }
      if (!fields.contains("field13")) {
        txn.setField13(null);
      }
      if (!fields.contains("field14")) {
        txn.setField14(null);
      }
      if (!fields.contains("field15")) {
        txn.setField15(null);
      }
      if (!fields.contains("field16")) {
        txn.setField16(null);
      }
      if (!fields.contains("field17")) {
        txn.setField17(null);
      }
      if (!fields.contains("field18")) {
        txn.setField18(null);
      }
      if (!fields.contains("field19")) {
        txn.setField19(null);
      }
      if (!fields.contains("field20")) {
        txn.setField20(null);
      }
      if (!fields.contains("field21")) {
        txn.setField21(null);
      }
      if (!fields.contains("field22")) {
        txn.setField22(null);
      }
      if (!fields.contains("field23")) {
        txn.setField23(null);
      }
      if (!fields.contains("field24")) {
        txn.setField24(null);
      }
      if (!fields.contains("field25")) {
        txn.setField25(null);
      }
      return txn;
    }).collect(Collectors.toList());
  }

}

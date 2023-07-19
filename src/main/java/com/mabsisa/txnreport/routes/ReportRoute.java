/**
 * 
 */
package com.mabsisa.txnreport.routes;

import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import com.mabsisa.txnreport.config.DataStore;
import com.mabsisa.txnreport.model.Txn;
import com.mabsisa.txnreport.service.TxnReportService;

/**
 * @author abhinab
 *
 */
@RestController
public class ReportRoute {

  @Autowired
  TxnReportService txnReportService;

  @Autowired
  DataStore dataStore;

  @GetMapping("/txn-report/v1/view/{pagenumber}/{pagesize}/{fields}")
  public ResponseEntity<List<Txn>> getTxns(
      @RequestHeader(value = "token", required = true) String token,
      @PathVariable(value = "pagenumber", required = true) int pageNumber,
      @PathVariable(value = "pagesize", required = true) int pageSize,
      @PathVariable(value = "fields", required = true) String[] fields) {

    ResponseEntity<List<Txn>> responseEntity;

    if (StringUtils.isEmpty(token) || !dataStore.getAuthTokens().contains(token)) {
      responseEntity = ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(null);
    } else {
      responseEntity = ResponseEntity.ok()
          .body(txnReportService.getData(pageNumber, pageSize, Arrays.asList(fields)));
    }

    return responseEntity;
  }

}

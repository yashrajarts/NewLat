/**
 * 
 */
package com.mabsisa.txnreport.config;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;
import com.mabsisa.txnreport.model.Txn;
import lombok.Data;

/**
 * @author Debu Paul
 *
 */
@Data
@Configuration
public class DataStore {

  List<Txn> txns;
  List<String> authTokens;

  @PostConstruct
  public void init() {
    txns = new ArrayList<>();

    for (int j = 0; j < 100; j++) {
      String i = String.valueOf(j);
      Txn txn = new Txn(i, i, i, i, i, i, i, i, i, i, i, i, i, i, i, i, i, i, i, i, i, i, i, i, i);
      txns.add(txn);
    }

    authTokens = Arrays.asList("sa4d5sad6asd65as6d4sad6a", "5as4d6asd4a6s4dsa6d5s");
  }

}

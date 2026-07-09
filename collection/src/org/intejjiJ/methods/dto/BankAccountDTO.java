package org.intejjiJ.methods.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class BankAccountDTO implements Serializable,Comparable<BankAccountDTO> {
    private long accountNumber;
    private String accountHolderName;
    private double balance;

    @Override
    public int compareTo(BankAccountDTO o) {
        return Double.compare(this.balance, o.balance);
    }

}

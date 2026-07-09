package org.intejjiJ.methods.runner;

import org.intejjiJ.methods.dto.BankAccountDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BankAccountRunner {
    public static void main(String[] args) {

        BankAccountDTO account1 = new BankAccountDTO(8741329454L, "Mahesh", 12345);
        BankAccountDTO account2 = new BankAccountDTO(5647891234L, "Karthik", 9876543);
        BankAccountDTO account3 = new BankAccountDTO(4579931544L, "Sharat", 4567.45);
        BankAccountDTO account4 = new BankAccountDTO(7895469823L, "Pooja", 32165);
        BankAccountDTO account5 = new BankAccountDTO(7894516985L, "Radha", 654987);

        List<BankAccountDTO> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        accounts.add(account4);
        accounts.add(account5);

        System.out.println("Bank Accounts sorting by balance");
        Collections.sort(accounts);
        accounts.forEach(account -> System.out.println(account));
    }
}

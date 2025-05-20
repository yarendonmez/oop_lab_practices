package com.yarendonmez.week7.Q3;

public class Main {
    // Özel exception sınıfı
    static class InsufficientBalanceException extends Exception {
        public InsufficientBalanceException(String message) {
            super(message);
        }
    }

    // Temel Account sınıfı
    static class Account {
        protected double balance;

        public Account(double balance) {
            this.balance = balance;
        }

        public void withdraw(double amount) throws InsufficientBalanceException {
            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient funds in Account.");
            }
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        }
    }

    // Account'tan türeyen BankAccount sınıfı
    static class BankAccount extends Account {
        public BankAccount(double balance) {
            super(balance);
        }

        @Override
        public void withdraw(double amount) throws InsufficientBalanceException {
            if (amount > balance) {
                throw new InsufficientBalanceException("Insufficient funds in BankAccount.");
            }
            super.withdraw(amount);
        }
    }

    // BankAccount'tan türeyen PremiumAccount sınıfı
    static class PremiumAccount extends BankAccount {
        private static final double WITHDRAW_LIMIT = 10000;

        public PremiumAccount(double balance) {
            super(balance);
        }

        @Override
        public void withdraw(double amount) throws InsufficientBalanceException {
            if (amount > balance) {
                throw new InsufficientBalanceException("Not enough balance in PremiumAccount.");
            } else if (amount > WITHDRAW_LIMIT) {
                throw new InsufficientBalanceException("Amount exceeds withdrawal limit of " + WITHDRAW_LIMIT);
            }
            super.withdraw(amount);
        }
    }

    // Ana test kodu
    public static void main(String[] args) {
        PremiumAccount account = new PremiumAccount(5000);

        try {
            System.out.println("Attempting to withdraw 8000...");
            account.withdraw(8000);
        } catch (InsufficientBalanceException e) {
            System.out.println("⚠️ Withdrawal failed: " + e.getMessage());
        }

        System.out.println("✅ Operation completed.");
    }
}


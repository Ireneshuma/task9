public class Task03 {
        public static void main(String[]args) throws NotEnoughMoneyException {
            Account User01 = new Account("Jack","0000 1111 2222 3333 4444",9000);
            Account User02 = new Account("Samuel","0000 2211 3322 4433 1144",7000);
            try{
                User02.Transfer(8000);
            }
            catch(NotEnoughMoneyException ex){
                System.out.println(ex);
            }
            finally{
                System.out.println("Amount left on your Bank is "+User02.balance);
            }

        }

    }






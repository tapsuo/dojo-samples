val trxResult = data?.getStringExtra("com.dojo.extra.TRANSACTION_RESULT", transactionResult: String/enum (SUCCESSFUL, DECLINED, CANCELLED, UNSUCCESSFUL))
val trxTransactionId = data?.getStringExtra("com.dojo.extra.TRANSACTION_ID", transactionId: String)
val trxAuthCode = data?.getStringExtra("com.dojo.extra.AUTH_CODE", authCode: String)

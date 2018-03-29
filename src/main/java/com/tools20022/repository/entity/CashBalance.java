/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.entity;

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.BalanceAdjustmentTypeCode;
import com.tools20022.repository.codeset.BalanceCounterpartyCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Numerical representation of the net increases and decreases in an account at
 * a specific point in time. A cash balance is calculated from a sum of cash
 * credits minus a sum of cash debits.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="CashBalance" src="doc-files/CashBalance.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Balance Balance}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashBalance#mmCashAccount
 * CashBalance.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashBalance#mmCalculationType
 * CashBalance.mmCalculationType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashBalance#mmCounterparty
 * CashBalance.mmCounterparty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashBalance#mmAmount
 * CashBalance.mmAmount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashBalance#mmAvailability
 * CashBalance.mmAvailability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashBalance#mmCashBalanceEntry
 * CashBalance.mmCashBalanceEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashBalance#mmBalanceAdjustmentCode
 * CashBalance.mmBalanceAdjustmentCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashBalance#mmRelatedCardPaymentValidationProcess
 * CashBalance.mmRelatedCardPaymentValidationProcess}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashBalance#mmCutOffDate
 * CashBalance.mmCutOffDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashBalance#mmRelatedRegisteredContract
 * CashBalance.mmRelatedRegisteredContract}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#mmCashBalance
 * CashAccount.mmCashBalance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#mmCashBalance
 * CashEntry.mmCashBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemMemberRole#mmCashBalance
 * SystemMemberRole.mmCashBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAvailability#mmCashBalance
 * CashAvailability.mmCashBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmBalance
 * CardPaymentValidation.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmContractBalance
 * RegisteredContract.mmContractBalance}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport9#mmBalance
 * AccountReport9.mmBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport11#mmBalance
 * AccountReport11.mmBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport12#mmBalance
 * AccountReport12.mmBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport16#mmBalance
 * AccountReport16.mmBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement1#mmBalance
 * AccountStatement1.mmBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement2#mmBalance
 * AccountStatement2.mmBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement3#mmBalance
 * AccountStatement3.mmBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement4#mmBalance
 * AccountStatement4.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalance2#mmCashSubBalanceIdentification
 * IntraBalance2.mmCashSubBalanceIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport18#mmBalance
 * AccountReport18.mmBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement5#mmBalance
 * AccountStatement5.mmBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement6#mmBalance
 * AccountStatement6.mmBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport19#mmBalance
 * AccountReport19.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalance4#mmCashSubBalanceIdentification
 * IntraBalance4.mmCashSubBalanceIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement8#mmBalance
 * AccountStatement8.mmBalance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport22#mmBalance
 * AccountReport22.mmBalance}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceDetails2
 * BalanceDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceDetails3
 * BalanceDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceDetails4
 * BalanceDetails4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashBalance4 CashBalance4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashBalanceDetails2
 * CashBalanceDetails2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashBalanceDetails3
 * CashBalanceDetails3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashBalanceDetails4
 * CashBalanceDetails4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashBalanceDetails5
 * CashBalanceDetails5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashBalanceDetails6
 * CashBalanceDetails6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashBalanceDetails7
 * CashBalanceDetails7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashBalance5 CashBalance5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashBalance6 CashBalance6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashBalance1 CashBalance1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport9 AccountReport9}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BalanceType5Choice
 * BalanceType5Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BalanceSubType1Choice
 * BalanceSubType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceType12 BalanceType12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashBalance3 CashBalance3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport11
 * AccountReport11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport12
 * AccountReport12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport16
 * AccountReport16}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountNotification1
 * AccountNotification1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountNotification2
 * AccountNotification2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountNotification5
 * AccountNotification5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountNotification7
 * AccountNotification7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashBalance2 CashBalance2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement1
 * AccountStatement1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement2
 * AccountStatement2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement3
 * AccountStatement3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement4
 * AccountStatement4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PayInCallItem PayInCallItem}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportData1 ReportData1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportData5 ReportData5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportData2 ReportData2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceStatus BalanceStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportData3 ReportData3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceStatus2 BalanceStatus2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ReportData4 ReportData4}</li>
 * <li>{@linkplain com.tools20022.repository.choice.CashBalanceType1FormatType
 * CashBalanceType1FormatType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountNotification3
 * AccountNotification3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountNotification4
 * AccountNotification4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountNotification6
 * AccountNotification6}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BillingBalanceType1Choice
 * BillingBalanceType1Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BillingBalance1
 * BillingBalance1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceAdjustment1
 * BalanceAdjustment1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport18
 * AccountReport18}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement5
 * AccountStatement5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountNotification10
 * AccountNotification10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountNotification11
 * AccountNotification11}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ContractBalance1
 * ContractBalance1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement6
 * AccountStatement6}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport19
 * AccountReport19}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountNotification13
 * AccountNotification13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountNotification12
 * AccountNotification12}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashBalance7 CashBalance7}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement8
 * AccountStatement8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountNotification15
 * AccountNotification15}</li>
 * <li>{@linkplain com.tools20022.repository.choice.BalanceType10Choice
 * BalanceType10Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BalanceType13 BalanceType13}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport22
 * AccountReport22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashBalance8 CashBalance8}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashBalance10 CashBalance10}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashBalance9 CashBalance9}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CashBalance11 CashBalance11}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CashBalance"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Numerical representation of the net increases and decreases in an account at a specific point in time. A cash balance is calculated from a sum of cash credits minus a sum of cash debits."
 * </li>
 * </ul>
 */
public class CashBalance extends Balance {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.entity.CashAccount> cashAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#mmCashBalance
	 * CashAccount.mmCashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAccount
	 * CashAccount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport9#mmAccount
	 * AccountReport9.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport11#mmAccount
	 * AccountReport11.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport12#mmAccount
	 * AccountReport12.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport16#mmAccount
	 * AccountReport16.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification1#mmAccount
	 * AccountNotification1.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification1#mmRelatedAccount
	 * AccountNotification1.mmRelatedAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification2#mmAccount
	 * AccountNotification2.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification2#mmRelatedAccount
	 * AccountNotification2.mmRelatedAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification5#mmAccount
	 * AccountNotification5.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification5#mmRelatedAccount
	 * AccountNotification5.mmRelatedAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification7#mmAccount
	 * AccountNotification7.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification7#mmRelatedAccount
	 * AccountNotification7.mmRelatedAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatement1#mmAccount
	 * AccountStatement1.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatement2#mmAccount
	 * AccountStatement2.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatement3#mmAccount
	 * AccountStatement3.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatement4#mmAccount
	 * AccountStatement4.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification3#mmAccount
	 * AccountNotification3.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification3#mmRelatedAccount
	 * AccountNotification3.mmRelatedAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification4#mmAccount
	 * AccountNotification4.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification4#mmRelatedAccount
	 * AccountNotification4.mmRelatedAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification6#mmAccount
	 * AccountNotification6.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification6#mmRelatedAccount
	 * AccountNotification6.mmRelatedAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport18#mmAccount
	 * AccountReport18.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatement5#mmAccount
	 * AccountStatement5.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification10#mmAccount
	 * AccountNotification10.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification10#mmRelatedAccount
	 * AccountNotification10.mmRelatedAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11#mmAccount
	 * AccountNotification11.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11#mmRelatedAccount
	 * AccountNotification11.mmRelatedAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatement6#mmAccount
	 * AccountStatement6.mmAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport19#mmAccount
	 * AccountReport19.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification13#mmAccount
	 * AccountNotification13.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification13#mmRelatedAccount
	 * AccountNotification13.mmRelatedAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmAccount
	 * AccountNotification12.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmRelatedAccount
	 * AccountNotification12.mmRelatedAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountStatement8#mmAccount
	 * AccountStatement8.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification15#mmAccount
	 * AccountNotification15.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification15#mmRelatedAccount
	 * AccountNotification15.mmRelatedAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport22#mmAccount
	 * AccountReport22.mmAccount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance CashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash account for which a balance is calculated."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashBalance, List<CashAccount>> mmCashAccount = new MMBusinessAssociationEnd<CashBalance, List<CashAccount>>() {
		{
			derivation_lazy = () -> Arrays.asList(AccountReport9.mmAccount, AccountReport11.mmAccount, AccountReport12.mmAccount, AccountReport16.mmAccount, AccountNotification1.mmAccount, AccountNotification1.mmRelatedAccount,
					AccountNotification2.mmAccount, AccountNotification2.mmRelatedAccount, AccountNotification5.mmAccount, AccountNotification5.mmRelatedAccount, AccountNotification7.mmAccount, AccountNotification7.mmRelatedAccount,
					AccountStatement1.mmAccount, AccountStatement2.mmAccount, AccountStatement3.mmAccount, AccountStatement4.mmAccount, AccountNotification3.mmAccount, AccountNotification3.mmRelatedAccount, AccountNotification4.mmAccount,
					AccountNotification4.mmRelatedAccount, AccountNotification6.mmAccount, AccountNotification6.mmRelatedAccount, AccountReport18.mmAccount, AccountStatement5.mmAccount, AccountNotification10.mmAccount,
					AccountNotification10.mmRelatedAccount, AccountNotification11.mmAccount, AccountNotification11.mmRelatedAccount, AccountStatement6.mmAccount, AccountReport19.mmAccount, AccountNotification13.mmAccount,
					AccountNotification13.mmRelatedAccount, AccountNotification12.mmAccount, AccountNotification12.mmRelatedAccount, AccountStatement8.mmAccount, AccountNotification15.mmAccount, AccountNotification15.mmRelatedAccount,
					AccountReport22.mmAccount);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Cash account for which a balance is calculated.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.mmCashBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
		}

		@Override
		public List<CashAccount> getValue(CashBalance obj) {
			return obj.getCashAccount();
		}

		@Override
		public void setValue(CashBalance obj, List<CashAccount> value) {
			obj.setCashAccount(value);
		}
	};
	protected BalanceCounterpartyCode calculationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceCounterpartyCode
	 * BalanceCounterpartyCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails2#mmCounterpartyType
	 * BalanceDetails2.mmCounterpartyType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails3#mmCounterpartyType
	 * BalanceDetails3.mmCounterpartyType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails4#mmCounterpartyType
	 * BalanceDetails4.mmCounterpartyType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalance4#mmCounterpartyType
	 * CashBalance4.mmCounterpartyType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalance9#mmCounterpartyType
	 * CashBalance9.mmCounterpartyType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance CashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the balance is calculated against one other party or against a group of parties."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashBalance, BalanceCounterpartyCode> mmCalculationType = new MMBusinessAttribute<CashBalance, BalanceCounterpartyCode>() {
		{
			derivation_lazy = () -> Arrays.asList(BalanceDetails2.mmCounterpartyType, BalanceDetails3.mmCounterpartyType, BalanceDetails4.mmCounterpartyType, CashBalance4.mmCounterpartyType, CashBalance9.mmCounterpartyType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CalculationType";
			definition = "Specifies whether the balance is calculated against one other party or against a group of parties.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BalanceCounterpartyCode.mmObject();
		}

		@Override
		public BalanceCounterpartyCode getValue(CashBalance obj) {
			return obj.getCalculationType();
		}

		@Override
		public void setValue(CashBalance obj, BalanceCounterpartyCode value) {
			obj.setCalculationType(value);
		}
	};
	protected List<SystemMemberRole> counterparty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemMemberRole#mmCashBalance
	 * SystemMemberRole.mmCashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.SystemMemberRole
	 * SystemMemberRole}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails2#mmCounterpartyIdentification
	 * BalanceDetails2.mmCounterpartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails3#mmCounterpartyIdentification
	 * BalanceDetails3.mmCounterpartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails4#mmCounterpartyIdentification
	 * BalanceDetails4.mmCounterpartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalance4#mmCounterpartyIdentification
	 * CashBalance4.mmCounterpartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalance9#mmCounterpartyIdentification
	 * CashBalance9.mmCounterpartyIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance CashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Counterparty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party against which a balance is calculated (from the point of view of the account owner).  A bilateral balance is calculated against one other party; a multilateral balance is calculated against a group of parties."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashBalance, List<SystemMemberRole>> mmCounterparty = new MMBusinessAssociationEnd<CashBalance, List<SystemMemberRole>>() {
		{
			derivation_lazy = () -> Arrays.asList(BalanceDetails2.mmCounterpartyIdentification, BalanceDetails3.mmCounterpartyIdentification, BalanceDetails4.mmCounterpartyIdentification, CashBalance4.mmCounterpartyIdentification,
					CashBalance9.mmCounterpartyIdentification);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Counterparty";
			definition = "Party against which a balance is calculated (from the point of view of the account owner).  A bilateral balance is calculated against one other party; a multilateral balance is calculated against a group of parties.";
			minOccurs = 1;
			opposite_lazy = () -> SystemMemberRole.mmCashBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> SystemMemberRole.mmObject();
		}

		@Override
		public List<SystemMemberRole> getValue(CashBalance obj) {
			return obj.getCounterparty();
		}

		@Override
		public void setValue(CashBalance obj, List<SystemMemberRole> value) {
			obj.setCounterparty(value);
		}
	};
	protected CurrencyAndAmount amount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails2#mmAmount
	 * CashBalanceDetails2.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails3#mmAmount
	 * CashBalanceDetails3.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails4#mmAmount
	 * CashBalanceDetails4.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails5#mmAmount
	 * CashBalanceDetails5.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails6#mmAmount
	 * CashBalanceDetails6.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails7#mmAmount
	 * CashBalanceDetails7.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance5#mmAmount
	 * CashBalance5.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance6#mmAmount
	 * CashBalance6.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance1#mmAmount
	 * CashBalance1.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance3#mmAmount
	 * CashBalance3.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance2#mmAmount
	 * CashBalance2.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PayInCallItem#mmAmount
	 * PayInCallItem.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportData1#mmPayInCallAmount
	 * ReportData1.mmPayInCallAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceStatus#mmBalance
	 * BalanceStatus.mmBalance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceStatus2#mmBalance
	 * BalanceStatus2.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction9#mmBalance
	 * CardPaymentTransaction9.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction18#mmBalance
	 * CardPaymentTransaction18.mmBalance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceDetails6#mmAmount
	 * BalanceDetails6.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceDetails5#mmAmount
	 * BalanceDetails5.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService1#mmBalanceRequiredAccountAmount
	 * BillingService1.mmBalanceRequiredAccountAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1#mmBalanceAmount
	 * BalanceAdjustment1.mmBalanceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1#mmAverageAmount
	 * BalanceAdjustment1.mmAverageAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#mmBalanceRequiredAmount
	 * BillingServiceAdjustment1.mmBalanceRequiredAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction24#mmBalance
	 * CardPaymentTransaction24.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction39#mmBalance
	 * CardPaymentTransaction39.mmBalance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContractBalance1#mmAmount
	 * ContractBalance1.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance7#mmAmount
	 * CashBalance7.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService2#mmBalanceRequiredAccountAmount
	 * BillingService2.mmBalanceRequiredAccountAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction54#mmBalance
	 * CardPaymentTransaction54.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction67#mmBalance
	 * CardPaymentTransaction67.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConcentrationAccount1#mmEndOfDay
	 * ConcentrationAccount1.mmEndOfDay}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConcentrationAccount1#mmPeakCredit
	 * ConcentrationAccount1.mmPeakCredit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ConcentrationAccount1#mmPeakDebit
	 * ConcentrationAccount1.mmPeakDebit}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.PaymentAccount1#mmNetPayment
	 * PaymentAccount1.mmNetPayment}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance8#mmAmount
	 * CashBalance8.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance10#mmAmount
	 * CashBalance10.mmAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance11#mmAmount
	 * CashBalance11.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction84#mmBalance
	 * CardPaymentTransaction84.mmBalance}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance CashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency and amount of money of the cash balance."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashBalance, CurrencyAndAmount> mmAmount = new MMBusinessAttribute<CashBalance, CurrencyAndAmount>() {
		{
			derivation_lazy = () -> Arrays.asList(CashBalanceDetails2.mmAmount, CashBalanceDetails3.mmAmount, CashBalanceDetails4.mmAmount, CashBalanceDetails5.mmAmount, CashBalanceDetails6.mmAmount, CashBalanceDetails7.mmAmount,
					CashBalance5.mmAmount, CashBalance6.mmAmount, CashBalance1.mmAmount, CashBalance3.mmAmount, CashBalance2.mmAmount, PayInCallItem.mmAmount, ReportData1.mmPayInCallAmount, BalanceStatus.mmBalance,
					BalanceStatus2.mmBalance, CardPaymentTransaction9.mmBalance, CardPaymentTransaction18.mmBalance, BalanceDetails6.mmAmount, BalanceDetails5.mmAmount, BillingService1.mmBalanceRequiredAccountAmount,
					BalanceAdjustment1.mmBalanceAmount, BalanceAdjustment1.mmAverageAmount, BillingServiceAdjustment1.mmBalanceRequiredAmount, CardPaymentTransaction24.mmBalance, CardPaymentTransaction39.mmBalance,
					ContractBalance1.mmAmount, CashBalance7.mmAmount, BillingService2.mmBalanceRequiredAccountAmount, CardPaymentTransaction54.mmBalance, CardPaymentTransaction67.mmBalance, ConcentrationAccount1.mmEndOfDay,
					ConcentrationAccount1.mmPeakCredit, ConcentrationAccount1.mmPeakDebit, PaymentAccount1.mmNetPayment, CashBalance8.mmAmount, CashBalance10.mmAmount, CashBalance11.mmAmount, CardPaymentTransaction84.mmBalance);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Currency and amount of money of the cash balance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public CurrencyAndAmount getValue(CashBalance obj) {
			return obj.getAmount();
		}

		@Override
		public void setValue(CashBalance obj, CurrencyAndAmount value) {
			obj.setAmount(value);
		}
	};
	protected CashAvailability availability;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAvailability#mmCashBalance
	 * CashAvailability.mmCashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashAvailability
	 * CashAvailability}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalance1#mmAvailability
	 * CashBalance1.mmAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry1#mmAvailability
	 * ReportEntry1.mmAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalance3#mmAvailability
	 * CashBalance3.mmAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode3#mmAvailability
	 * TotalsPerBankTransactionCode3.mmAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry4#mmAvailability
	 * ReportEntry4.mmAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalance2#mmAvailability
	 * CashBalance2.mmAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementEntry1#mmAvailability
	 * StatementEntry1.mmAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry7#mmAvailability
	 * ReportEntry7.mmAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalance7#mmAvailability
	 * CashBalance7.mmAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry8#mmAvailability
	 * ReportEntry8.mmAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode4#mmAvailability
	 * TotalsPerBankTransactionCode4.mmAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalance8#mmAvailability
	 * CashBalance8.mmAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportEntry9#mmAvailability
	 * ReportEntry9.mmAvailability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode5#mmAvailability
	 * TotalsPerBankTransactionCode5.mmAvailability}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance CashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Availability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Elements used to indicate when the booked amount of money will become available, that is can be accessed and start generating interest."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashBalance, CashAvailability> mmAvailability = new MMBusinessAssociationEnd<CashBalance, CashAvailability>() {
		{
			derivation_lazy = () -> Arrays.asList(CashBalance1.mmAvailability, ReportEntry1.mmAvailability, CashBalance3.mmAvailability, TotalsPerBankTransactionCode3.mmAvailability, ReportEntry4.mmAvailability,
					CashBalance2.mmAvailability, StatementEntry1.mmAvailability, ReportEntry7.mmAvailability, CashBalance7.mmAvailability, ReportEntry8.mmAvailability, TotalsPerBankTransactionCode4.mmAvailability,
					CashBalance8.mmAvailability, ReportEntry9.mmAvailability, TotalsPerBankTransactionCode5.mmAvailability);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Availability";
			definition = "Elements used to indicate when the booked amount of money will become available, that is can be accessed and start generating interest.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> CashAvailability.mmCashBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashAvailability.mmObject();
		}

		@Override
		public CashAvailability getValue(CashBalance obj) {
			return obj.getAvailability();
		}

		@Override
		public void setValue(CashBalance obj, CashAvailability value) {
			obj.setAvailability(value);
		}
	};
	protected List<CashEntry> cashBalanceEntry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#mmCashBalance
	 * CashEntry.mmCashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.CashEntry CashEntry}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport9#mmEntry
	 * AccountReport9.mmEntry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport11#mmEntry
	 * AccountReport11.mmEntry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport12#mmEntry
	 * AccountReport12.mmEntry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport16#mmEntry
	 * AccountReport16.mmEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification1#mmEntry
	 * AccountNotification1.mmEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification2#mmEntry
	 * AccountNotification2.mmEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification5#mmEntry
	 * AccountNotification5.mmEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification7#mmEntry
	 * AccountNotification7.mmEntry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement1#mmEntry
	 * AccountStatement1.mmEntry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement2#mmEntry
	 * AccountStatement2.mmEntry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement3#mmEntry
	 * AccountStatement3.mmEntry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement4#mmEntry
	 * AccountStatement4.mmEntry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportData5#mmAccountValue
	 * ReportData5.mmAccountValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification3#mmItem
	 * AccountNotification3.mmItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification4#mmItem
	 * AccountNotification4.mmItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification6#mmItem
	 * AccountNotification6.mmItem}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingBalance1#mmValue
	 * BillingBalance1.mmValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport18#mmEntry
	 * AccountReport18.mmEntry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement5#mmEntry
	 * AccountStatement5.mmEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification10#mmItem
	 * AccountNotification10.mmItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11#mmEntry
	 * AccountNotification11.mmEntry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement6#mmEntry
	 * AccountStatement6.mmEntry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport19#mmEntry
	 * AccountReport19.mmEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification13#mmItem
	 * AccountNotification13.mmItem}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12#mmEntry
	 * AccountNotification12.mmEntry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement8#mmEntry
	 * AccountStatement8.mmEntry}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification15#mmEntry
	 * AccountNotification15.mmEntry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport22#mmEntry
	 * AccountReport22.mmEntry}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance CashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashBalanceEntry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Credit or debit postings used to calculate a balance."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashBalance, List<CashEntry>> mmCashBalanceEntry = new MMBusinessAssociationEnd<CashBalance, List<CashEntry>>() {
		{
			derivation_lazy = () -> Arrays.asList(AccountReport9.mmEntry, AccountReport11.mmEntry, AccountReport12.mmEntry, AccountReport16.mmEntry, AccountNotification1.mmEntry, AccountNotification2.mmEntry, AccountNotification5.mmEntry,
					AccountNotification7.mmEntry, AccountStatement1.mmEntry, AccountStatement2.mmEntry, AccountStatement3.mmEntry, AccountStatement4.mmEntry, ReportData5.mmAccountValue, AccountNotification3.mmItem,
					AccountNotification4.mmItem, AccountNotification6.mmItem, BillingBalance1.mmValue, AccountReport18.mmEntry, AccountStatement5.mmEntry, AccountNotification10.mmItem, AccountNotification11.mmEntry,
					AccountStatement6.mmEntry, AccountReport19.mmEntry, AccountNotification13.mmItem, AccountNotification12.mmEntry, AccountStatement8.mmEntry, AccountNotification15.mmEntry, AccountReport22.mmEntry);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CashBalanceEntry";
			definition = "Credit or debit postings used to calculate a balance.";
			minOccurs = 0;
			opposite_lazy = () -> CashEntry.mmCashBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CashEntry.mmObject();
		}

		@Override
		public List<CashEntry> getValue(CashBalance obj) {
			return obj.getCashBalanceEntry();
		}

		@Override
		public void setValue(CashBalance obj, List<CashEntry> value) {
			obj.setCashBalanceEntry(value);
		}
	};
	protected BalanceAdjustmentTypeCode balanceAdjustmentCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceAdjustmentTypeCode
	 * BalanceAdjustmentTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceAdjustment1#mmType
	 * BalanceAdjustment1.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance CashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceAdjustmentCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the type of allowed balance adjustment."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashBalance, BalanceAdjustmentTypeCode> mmBalanceAdjustmentCode = new MMBusinessAttribute<CashBalance, BalanceAdjustmentTypeCode>() {
		{
			derivation_lazy = () -> Arrays.asList(BalanceAdjustment1.mmType);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "BalanceAdjustmentCode";
			definition = "Defines the type of allowed balance adjustment.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BalanceAdjustmentTypeCode.mmObject();
		}

		@Override
		public BalanceAdjustmentTypeCode getValue(CashBalance obj) {
			return obj.getBalanceAdjustmentCode();
		}

		@Override
		public void setValue(CashBalance obj, BalanceAdjustmentTypeCode value) {
			obj.setBalanceAdjustmentCode(value);
		}
	};
	protected CardPaymentValidation relatedCardPaymentValidationProcess;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmBalance
	 * CardPaymentValidation.mmBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation
	 * CardPaymentValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance CashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedCardPaymentValidationProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Validation process which verifies the balance attached to the card."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashBalance, Optional<CardPaymentValidation>> mmRelatedCardPaymentValidationProcess = new MMBusinessAssociationEnd<CashBalance, Optional<CardPaymentValidation>>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedCardPaymentValidationProcess";
			definition = "Validation process which verifies the balance attached to the card.";
			maxOccurs = 1;
			minOccurs = 0;
			opposite_lazy = () -> CardPaymentValidation.mmBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> CardPaymentValidation.mmObject();
		}

		@Override
		public Optional<CardPaymentValidation> getValue(CashBalance obj) {
			return obj.getRelatedCardPaymentValidationProcess();
		}

		@Override
		public void setValue(CashBalance obj, Optional<CardPaymentValidation> value) {
			obj.setRelatedCardPaymentValidationProcess(value.orElse(null));
		}
	};
	protected ISODate cutOffDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.FinancingItemList1#mmAmountCutOffDate
	 * FinancingItemList1.mmAmountCutOffDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance CashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CutOffDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Predetermined date in a billing or processing cycle when account activity for the previous reporting period is summarized (when checks written against an account are collected and summarized in a monthly statement). Checks paid or deposits received after the cut-off date are included in the next month's statement."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute<CashBalance, ISODate> mmCutOffDate = new MMBusinessAttribute<CashBalance, ISODate>() {
		{
			derivation_lazy = () -> Arrays.asList(FinancingItemList1.mmAmountCutOffDate);
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "CutOffDate";
			definition = "Predetermined date in a billing or processing cycle when account activity for the previous reporting period is summarized (when checks written against an account are collected and summarized in a monthly statement). Checks paid or deposits received after the cut-off date are included in the next month's statement.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(CashBalance obj) {
			return obj.getCutOffDate();
		}

		@Override
		public void setValue(CashBalance obj, ISODate value) {
			obj.setCutOffDate(value);
		}
	};
	protected RegisteredContract relatedRegisteredContract;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#mmContractBalance
	 * RegisteredContract.mmContractBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.RegisteredContract
	 * RegisteredContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance CashBalance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedRegisteredContract"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Related contract balance on date of contract registration."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd<CashBalance, RegisteredContract> mmRelatedRegisteredContract = new MMBusinessAssociationEnd<CashBalance, RegisteredContract>() {
		{
			isDerived = false;
			elementContext_lazy = () -> com.tools20022.repository.entity.CashBalance.mmObject();
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RelatedRegisteredContract";
			definition = "Related contract balance on date of contract registration.";
			maxOccurs = 1;
			minOccurs = 1;
			opposite_lazy = () -> RegisteredContract.mmContractBalance;
			aggregation = MMAggregation.NONE;
			type_lazy = () -> RegisteredContract.mmObject();
		}

		@Override
		public RegisteredContract getValue(CashBalance obj) {
			return obj.getRelatedRegisteredContract();
		}

		@Override
		public void setValue(CashBalance obj, RegisteredContract value) {
			obj.setRelatedRegisteredContract(value);
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CashBalance";
				definition = "Numerical representation of the net increases and decreases in an account at a specific point in time. A cash balance is calculated from a sum of cash credits minus a sum of cash debits.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.mmCashBalance, CashEntry.mmCashBalance, SystemMemberRole.mmCashBalance, CashAvailability.mmCashBalance,
						CardPaymentValidation.mmBalance, RegisteredContract.mmContractBalance);
				derivationElement_lazy = () -> Arrays.asList(AccountReport9.mmBalance, AccountReport11.mmBalance, AccountReport12.mmBalance, AccountReport16.mmBalance, AccountStatement1.mmBalance, AccountStatement2.mmBalance,
						AccountStatement3.mmBalance, AccountStatement4.mmBalance, IntraBalance2.mmCashSubBalanceIdentification, AccountReport18.mmBalance, AccountStatement5.mmBalance, AccountStatement6.mmBalance, AccountReport19.mmBalance,
						IntraBalance4.mmCashSubBalanceIdentification, AccountStatement8.mmBalance, AccountReport22.mmBalance);
				superType_lazy = () -> Balance.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashBalance.mmCashAccount, com.tools20022.repository.entity.CashBalance.mmCalculationType, com.tools20022.repository.entity.CashBalance.mmCounterparty,
						com.tools20022.repository.entity.CashBalance.mmAmount, com.tools20022.repository.entity.CashBalance.mmAvailability, com.tools20022.repository.entity.CashBalance.mmCashBalanceEntry,
						com.tools20022.repository.entity.CashBalance.mmBalanceAdjustmentCode, com.tools20022.repository.entity.CashBalance.mmRelatedCardPaymentValidationProcess, com.tools20022.repository.entity.CashBalance.mmCutOffDate,
						com.tools20022.repository.entity.CashBalance.mmRelatedRegisteredContract);
				derivationComponent_lazy = () -> Arrays.asList(BalanceDetails2.mmObject(), BalanceDetails3.mmObject(), BalanceDetails4.mmObject(), CashBalance4.mmObject(), CashBalanceDetails2.mmObject(), CashBalanceDetails3.mmObject(),
						CashBalanceDetails4.mmObject(), CashBalanceDetails5.mmObject(), CashBalanceDetails6.mmObject(), CashBalanceDetails7.mmObject(), CashBalance5.mmObject(), CashBalance6.mmObject(), CashBalance1.mmObject(),
						AccountReport9.mmObject(), BalanceType5Choice.mmObject(), BalanceSubType1Choice.mmObject(), BalanceType12.mmObject(), CashBalance3.mmObject(), AccountReport11.mmObject(), AccountReport12.mmObject(),
						AccountReport16.mmObject(), AccountNotification1.mmObject(), AccountNotification2.mmObject(), AccountNotification5.mmObject(), AccountNotification7.mmObject(), CashBalance2.mmObject(), AccountStatement1.mmObject(),
						AccountStatement2.mmObject(), AccountStatement3.mmObject(), AccountStatement4.mmObject(), PayInCallItem.mmObject(), ReportData1.mmObject(), ReportData5.mmObject(), ReportData2.mmObject(), BalanceStatus.mmObject(),
						ReportData3.mmObject(), BalanceStatus2.mmObject(), ReportData4.mmObject(), CashBalanceType1FormatType.mmObject(), AccountNotification3.mmObject(), AccountNotification4.mmObject(), AccountNotification6.mmObject(),
						BillingBalanceType1Choice.mmObject(), BillingBalance1.mmObject(), BalanceAdjustment1.mmObject(), AccountReport18.mmObject(), AccountStatement5.mmObject(), AccountNotification10.mmObject(),
						AccountNotification11.mmObject(), ContractBalance1.mmObject(), AccountStatement6.mmObject(), AccountReport19.mmObject(), AccountNotification13.mmObject(), AccountNotification12.mmObject(), CashBalance7.mmObject(),
						AccountStatement8.mmObject(), AccountNotification15.mmObject(), BalanceType10Choice.mmObject(), BalanceType13.mmObject(), AccountReport22.mmObject(), CashBalance8.mmObject(), CashBalance10.mmObject(),
						CashBalance9.mmObject(), CashBalance11.mmObject());
			}

			@Override
			public Class<?> getInstanceClass() {
				return CashBalance.class;
			}
		});
		return mmObject_lazy.get();
	}

	public List<CashAccount> getCashAccount() {
		return cashAccount == null ? cashAccount = new ArrayList<>() : cashAccount;
	}

	public CashBalance setCashAccount(List<com.tools20022.repository.entity.CashAccount> cashAccount) {
		this.cashAccount = Objects.requireNonNull(cashAccount);
		return this;
	}

	public BalanceCounterpartyCode getCalculationType() {
		return calculationType;
	}

	public CashBalance setCalculationType(BalanceCounterpartyCode calculationType) {
		this.calculationType = Objects.requireNonNull(calculationType);
		return this;
	}

	public List<SystemMemberRole> getCounterparty() {
		return counterparty == null ? counterparty = new ArrayList<>() : counterparty;
	}

	public CashBalance setCounterparty(List<SystemMemberRole> counterparty) {
		this.counterparty = Objects.requireNonNull(counterparty);
		return this;
	}

	public CurrencyAndAmount getAmount() {
		return amount;
	}

	public CashBalance setAmount(CurrencyAndAmount amount) {
		this.amount = Objects.requireNonNull(amount);
		return this;
	}

	public CashAvailability getAvailability() {
		return availability;
	}

	public CashBalance setAvailability(CashAvailability availability) {
		this.availability = Objects.requireNonNull(availability);
		return this;
	}

	public List<CashEntry> getCashBalanceEntry() {
		return cashBalanceEntry == null ? cashBalanceEntry = new ArrayList<>() : cashBalanceEntry;
	}

	public CashBalance setCashBalanceEntry(List<CashEntry> cashBalanceEntry) {
		this.cashBalanceEntry = Objects.requireNonNull(cashBalanceEntry);
		return this;
	}

	public BalanceAdjustmentTypeCode getBalanceAdjustmentCode() {
		return balanceAdjustmentCode;
	}

	public CashBalance setBalanceAdjustmentCode(BalanceAdjustmentTypeCode balanceAdjustmentCode) {
		this.balanceAdjustmentCode = Objects.requireNonNull(balanceAdjustmentCode);
		return this;
	}

	public Optional<CardPaymentValidation> getRelatedCardPaymentValidationProcess() {
		return relatedCardPaymentValidationProcess == null ? Optional.empty() : Optional.of(relatedCardPaymentValidationProcess);
	}

	public CashBalance setRelatedCardPaymentValidationProcess(CardPaymentValidation relatedCardPaymentValidationProcess) {
		this.relatedCardPaymentValidationProcess = relatedCardPaymentValidationProcess;
		return this;
	}

	public ISODate getCutOffDate() {
		return cutOffDate;
	}

	public CashBalance setCutOffDate(ISODate cutOffDate) {
		this.cutOffDate = Objects.requireNonNull(cutOffDate);
		return this;
	}

	public RegisteredContract getRelatedRegisteredContract() {
		return relatedRegisteredContract;
	}

	public CashBalance setRelatedRegisteredContract(RegisteredContract relatedRegisteredContract) {
		this.relatedRegisteredContract = Objects.requireNonNull(relatedRegisteredContract);
		return this;
	}
}
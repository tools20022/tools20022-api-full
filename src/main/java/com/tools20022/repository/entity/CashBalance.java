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

import com.tools20022.metamodel.MMBusinessAssociationEnd;
import com.tools20022.metamodel.MMBusinessAttribute;
import com.tools20022.metamodel.MMBusinessComponent;
import com.tools20022.repository.choice.BalanceSubType1Choice;
import com.tools20022.repository.choice.BalanceType5Choice;
import com.tools20022.repository.choice.BillingBalanceType1Choice;
import com.tools20022.repository.choice.CashBalanceType1FormatType;
import com.tools20022.repository.codeset.BalanceAdjustmentTypeCode;
import com.tools20022.repository.codeset.BalanceCounterpartyCode;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.Balance;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
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
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashBalance#CashAccount
 * CashBalance.CashAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashBalance#CalculationType
 * CashBalance.CalculationType}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashBalance#Counterparty
 * CashBalance.Counterparty}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashBalance#Amount
 * CashBalance.Amount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashBalance#Availability
 * CashBalance.Availability}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashBalance#CashBalanceEntry
 * CashBalance.CashBalanceEntry}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashBalance#BalanceAdjustmentCode
 * CashBalance.BalanceAdjustmentCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashBalance#RelatedCardPaymentValidationProcess
 * CashBalance.RelatedCardPaymentValidationProcess}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashBalance#CutOffDate
 * CashBalance.CutOffDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashBalance#RelatedRegisteredContract
 * CashBalance.RelatedRegisteredContract}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.CashAccount#CashBalance
 * CashAccount.CashBalance}</li>
 * <li>{@linkplain com.tools20022.repository.entity.CashEntry#CashBalance
 * CashEntry.CashBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.SystemMemberRole#CashBalance
 * SystemMemberRole.CashBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CashAvailability#CashBalance
 * CashAvailability.CashBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#Balance
 * CardPaymentValidation.Balance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.RegisteredContract#ContractBalance
 * RegisteredContract.ContractBalance}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport9#Balance
 * AccountReport9.Balance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport11#Balance
 * AccountReport11.Balance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport12#Balance
 * AccountReport12.Balance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport16#Balance
 * AccountReport16.Balance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement1#Balance
 * AccountStatement1.Balance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement2#Balance
 * AccountStatement2.Balance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement3#Balance
 * AccountStatement3.Balance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement4#Balance
 * AccountStatement4.Balance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalance2#CashSubBalanceIdentification
 * IntraBalance2.CashSubBalanceIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport18#Balance
 * AccountReport18.Balance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement5#Balance
 * AccountStatement5.Balance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement6#Balance
 * AccountStatement6.Balance}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountReport19#Balance
 * AccountReport19.Balance}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Balance Balance}</li>
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
	/**
	 * Cash account for which a balance is calculated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAccount#CashBalance
	 * CashAccount.CashBalance}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport9#Account
	 * AccountReport9.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport11#Account
	 * AccountReport11.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport12#Account
	 * AccountReport12.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport16#Account
	 * AccountReport16.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification1#Account
	 * AccountNotification1.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification1#RelatedAccount
	 * AccountNotification1.RelatedAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification2#Account
	 * AccountNotification2.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification2#RelatedAccount
	 * AccountNotification2.RelatedAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification5#Account
	 * AccountNotification5.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification5#RelatedAccount
	 * AccountNotification5.RelatedAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification7#Account
	 * AccountNotification7.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification7#RelatedAccount
	 * AccountNotification7.RelatedAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement1#Account
	 * AccountStatement1.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement2#Account
	 * AccountStatement2.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement3#Account
	 * AccountStatement3.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement4#Account
	 * AccountStatement4.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification3#Account
	 * AccountNotification3.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification3#RelatedAccount
	 * AccountNotification3.RelatedAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification4#Account
	 * AccountNotification4.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification4#RelatedAccount
	 * AccountNotification4.RelatedAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification6#Account
	 * AccountNotification6.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification6#RelatedAccount
	 * AccountNotification6.RelatedAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport18#Account
	 * AccountReport18.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement5#Account
	 * AccountStatement5.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification10#Account
	 * AccountNotification10.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification10#RelatedAccount
	 * AccountNotification10.RelatedAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11#Account
	 * AccountNotification11.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11#RelatedAccount
	 * AccountNotification11.RelatedAccount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement6#Account
	 * AccountStatement6.Account}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport19#Account
	 * AccountReport19.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification13#Account
	 * AccountNotification13.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification13#RelatedAccount
	 * AccountNotification13.RelatedAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12#Account
	 * AccountNotification12.Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12#RelatedAccount
	 * AccountNotification12.RelatedAccount}</li>
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
	public static final MMBusinessAssociationEnd CashAccount = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountReport9.Account, com.tools20022.repository.msg.AccountReport11.Account, com.tools20022.repository.msg.AccountReport12.Account,
					com.tools20022.repository.msg.AccountReport16.Account, com.tools20022.repository.msg.AccountNotification1.Account, com.tools20022.repository.msg.AccountNotification1.RelatedAccount,
					com.tools20022.repository.msg.AccountNotification2.Account, com.tools20022.repository.msg.AccountNotification2.RelatedAccount, com.tools20022.repository.msg.AccountNotification5.Account,
					com.tools20022.repository.msg.AccountNotification5.RelatedAccount, com.tools20022.repository.msg.AccountNotification7.Account, com.tools20022.repository.msg.AccountNotification7.RelatedAccount,
					com.tools20022.repository.msg.AccountStatement1.Account, com.tools20022.repository.msg.AccountStatement2.Account, com.tools20022.repository.msg.AccountStatement3.Account,
					com.tools20022.repository.msg.AccountStatement4.Account, com.tools20022.repository.msg.AccountNotification3.Account, com.tools20022.repository.msg.AccountNotification3.RelatedAccount,
					com.tools20022.repository.msg.AccountNotification4.Account, com.tools20022.repository.msg.AccountNotification4.RelatedAccount, com.tools20022.repository.msg.AccountNotification6.Account,
					com.tools20022.repository.msg.AccountNotification6.RelatedAccount, com.tools20022.repository.msg.AccountReport18.Account, com.tools20022.repository.msg.AccountStatement5.Account,
					com.tools20022.repository.msg.AccountNotification10.Account, com.tools20022.repository.msg.AccountNotification10.RelatedAccount, com.tools20022.repository.msg.AccountNotification11.Account,
					com.tools20022.repository.msg.AccountNotification11.RelatedAccount, com.tools20022.repository.msg.AccountStatement6.Account, com.tools20022.repository.msg.AccountReport19.Account,
					com.tools20022.repository.msg.AccountNotification13.Account, com.tools20022.repository.msg.AccountNotification13.RelatedAccount, com.tools20022.repository.msg.AccountNotification12.Account,
					com.tools20022.repository.msg.AccountNotification12.RelatedAccount);
			elementContext_lazy = () -> CashBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashAccount";
			definition = "Cash account for which a balance is calculated.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.CashAccount.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAccount.CashBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies whether the balance is calculated against one other party or
	 * against a group of parties.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails2#CounterpartyType
	 * BalanceDetails2.CounterpartyType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails3#CounterpartyType
	 * BalanceDetails3.CounterpartyType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails4#CounterpartyType
	 * BalanceDetails4.CounterpartyType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalance4#CounterpartyType
	 * CashBalance4.CounterpartyType}</li>
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
	public static final MMBusinessAttribute CalculationType = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BalanceDetails2.CounterpartyType, com.tools20022.repository.msg.BalanceDetails3.CounterpartyType,
					com.tools20022.repository.msg.BalanceDetails4.CounterpartyType, com.tools20022.repository.msg.CashBalance4.CounterpartyType);
			elementContext_lazy = () -> CashBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CalculationType";
			definition = "Specifies whether the balance is calculated against one other party or against a group of parties.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BalanceCounterpartyCode.mmObject();
		}
	};
	/**
	 * Party against which a balance is calculated (from the point of view of
	 * the account owner). A bilateral balance is calculated against one other
	 * party; a multilateral balance is calculated against a group of parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.SystemMemberRole#CashBalance
	 * SystemMemberRole.CashBalance}</li>
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
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails2#CounterpartyIdentification
	 * BalanceDetails2.CounterpartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails3#CounterpartyIdentification
	 * BalanceDetails3.CounterpartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceDetails4#CounterpartyIdentification
	 * BalanceDetails4.CounterpartyIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalance4#CounterpartyIdentification
	 * CashBalance4.CounterpartyIdentification}</li>
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
	public static final MMBusinessAssociationEnd Counterparty = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BalanceDetails2.CounterpartyIdentification, com.tools20022.repository.msg.BalanceDetails3.CounterpartyIdentification,
					com.tools20022.repository.msg.BalanceDetails4.CounterpartyIdentification, com.tools20022.repository.msg.CashBalance4.CounterpartyIdentification);
			elementContext_lazy = () -> CashBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Counterparty";
			definition = "Party against which a balance is calculated (from the point of view of the account owner).  A bilateral balance is calculated against one other party; a multilateral balance is calculated against a group of parties.";
			minOccurs = 1;
			type_lazy = () -> SystemMemberRole.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.SystemMemberRole.CashBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Currency and amount of money of the cash balance.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalanceDetails2#Amount
	 * CashBalanceDetails2.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalanceDetails3#Amount
	 * CashBalanceDetails3.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalanceDetails4#Amount
	 * CashBalanceDetails4.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalanceDetails5#Amount
	 * CashBalanceDetails5.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalanceDetails6#Amount
	 * CashBalanceDetails6.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalanceDetails7#Amount
	 * CashBalanceDetails7.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance5#Amount
	 * CashBalance5.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance6#Amount
	 * CashBalance6.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance1#Amount
	 * CashBalance1.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance3#Amount
	 * CashBalance3.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance2#Amount
	 * CashBalance2.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.PayInCallItem#Amount
	 * PayInCallItem.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReportData1#PayInCallAmount
	 * ReportData1.PayInCallAmount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceStatus#Balance
	 * BalanceStatus.Balance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceStatus2#Balance
	 * BalanceStatus2.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction9#Balance
	 * CardPaymentTransaction9.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction18#Balance
	 * CardPaymentTransaction18.Balance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceDetails6#Amount
	 * BalanceDetails6.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceDetails5#Amount
	 * BalanceDetails5.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService1#BalanceRequiredAccountAmount
	 * BillingService1.BalanceRequiredAccountAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1#BalanceAmount
	 * BalanceAdjustment1.BalanceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BalanceAdjustment1#AverageAmount
	 * BalanceAdjustment1.AverageAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingServiceAdjustment1#BalanceRequiredAmount
	 * BillingServiceAdjustment1.BalanceRequiredAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction24#Balance
	 * CardPaymentTransaction24.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction39#Balance
	 * CardPaymentTransaction39.Balance}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ContractBalance1#Amount
	 * ContractBalance1.Amount}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance7#Amount
	 * CashBalance7.Amount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BillingService2#BalanceRequiredAccountAmount
	 * BillingService2.BalanceRequiredAccountAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction54#Balance
	 * CardPaymentTransaction54.Balance}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction67#Balance
	 * CardPaymentTransaction67.Balance}</li>
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
	public static final MMBusinessAttribute Amount = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashBalanceDetails2.Amount, com.tools20022.repository.msg.CashBalanceDetails3.Amount, com.tools20022.repository.msg.CashBalanceDetails4.Amount,
					com.tools20022.repository.msg.CashBalanceDetails5.Amount, com.tools20022.repository.msg.CashBalanceDetails6.Amount, com.tools20022.repository.msg.CashBalanceDetails7.Amount,
					com.tools20022.repository.msg.CashBalance5.Amount, com.tools20022.repository.msg.CashBalance6.Amount, com.tools20022.repository.msg.CashBalance1.Amount, com.tools20022.repository.msg.CashBalance3.Amount,
					com.tools20022.repository.msg.CashBalance2.Amount, com.tools20022.repository.msg.PayInCallItem.Amount, com.tools20022.repository.msg.ReportData1.PayInCallAmount, com.tools20022.repository.msg.BalanceStatus.Balance,
					com.tools20022.repository.msg.BalanceStatus2.Balance, com.tools20022.repository.msg.CardPaymentTransaction9.Balance, com.tools20022.repository.msg.CardPaymentTransaction18.Balance,
					com.tools20022.repository.msg.BalanceDetails6.Amount, com.tools20022.repository.msg.BalanceDetails5.Amount, com.tools20022.repository.msg.BillingService1.BalanceRequiredAccountAmount,
					com.tools20022.repository.msg.BalanceAdjustment1.BalanceAmount, com.tools20022.repository.msg.BalanceAdjustment1.AverageAmount, com.tools20022.repository.msg.BillingServiceAdjustment1.BalanceRequiredAmount,
					com.tools20022.repository.msg.CardPaymentTransaction24.Balance, com.tools20022.repository.msg.CardPaymentTransaction39.Balance, com.tools20022.repository.msg.ContractBalance1.Amount,
					com.tools20022.repository.msg.CashBalance7.Amount, com.tools20022.repository.msg.BillingService2.BalanceRequiredAccountAmount, com.tools20022.repository.msg.CardPaymentTransaction54.Balance,
					com.tools20022.repository.msg.CardPaymentTransaction67.Balance);
			elementContext_lazy = () -> CashBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Amount";
			definition = "Currency and amount of money of the cash balance.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	/**
	 * Elements used to indicate when the booked amount of money will become
	 * available, that is can be accessed and start generating interest.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashAvailability#CashBalance
	 * CashAvailability.CashBalance}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance1#Availability
	 * CashBalance1.Availability}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry1#Availability
	 * ReportEntry1.Availability}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance3#Availability
	 * CashBalance3.Availability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode3#Availability
	 * TotalsPerBankTransactionCode3.Availability}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry4#Availability
	 * ReportEntry4.Availability}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance2#Availability
	 * CashBalance2.Availability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.StatementEntry1#Availability
	 * StatementEntry1.Availability}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry7#Availability
	 * ReportEntry7.Availability}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance7#Availability
	 * CashBalance7.Availability}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8#Availability
	 * ReportEntry8.Availability}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TotalsPerBankTransactionCode4#Availability
	 * TotalsPerBankTransactionCode4.Availability}</li>
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
	public static final MMBusinessAssociationEnd Availability = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashBalance1.Availability, com.tools20022.repository.msg.ReportEntry1.Availability, com.tools20022.repository.msg.CashBalance3.Availability,
					com.tools20022.repository.msg.TotalsPerBankTransactionCode3.Availability, com.tools20022.repository.msg.ReportEntry4.Availability, com.tools20022.repository.msg.CashBalance2.Availability,
					com.tools20022.repository.msg.StatementEntry1.Availability, com.tools20022.repository.msg.ReportEntry7.Availability, com.tools20022.repository.msg.CashBalance7.Availability,
					com.tools20022.repository.msg.ReportEntry8.Availability, com.tools20022.repository.msg.TotalsPerBankTransactionCode4.Availability);
			elementContext_lazy = () -> CashBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Availability";
			definition = "Elements used to indicate when the booked amount of money will become available, that is can be accessed and start generating interest.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CashAvailability.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashAvailability.CashBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Credit or debit postings used to calculate a balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CashEntry#CashBalance
	 * CashEntry.CashBalance}</li>
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
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport9#Entry
	 * AccountReport9.Entry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport11#Entry
	 * AccountReport11.Entry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport12#Entry
	 * AccountReport12.Entry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport16#Entry
	 * AccountReport16.Entry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountNotification1#Entry
	 * AccountNotification1.Entry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountNotification2#Entry
	 * AccountNotification2.Entry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountNotification5#Entry
	 * AccountNotification5.Entry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountNotification7#Entry
	 * AccountNotification7.Entry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement1#Entry
	 * AccountStatement1.Entry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement2#Entry
	 * AccountStatement2.Entry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement3#Entry
	 * AccountStatement3.Entry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement4#Entry
	 * AccountStatement4.Entry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportData5#AccountValue
	 * ReportData5.AccountValue}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountNotification3#Item
	 * AccountNotification3.Item}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountNotification4#Item
	 * AccountNotification4.Item}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountNotification6#Item
	 * AccountNotification6.Item}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.BillingBalance1#Value
	 * BillingBalance1.Value}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport18#Entry
	 * AccountReport18.Entry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement5#Entry
	 * AccountStatement5.Entry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountNotification10#Item
	 * AccountNotification10.Item}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification11#Entry
	 * AccountNotification11.Entry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountStatement6#Entry
	 * AccountStatement6.Entry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountReport19#Entry
	 * AccountReport19.Entry}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.AccountNotification13#Item
	 * AccountNotification13.Item}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountNotification12#Entry
	 * AccountNotification12.Entry}</li>
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
	public static final MMBusinessAssociationEnd CashBalanceEntry = new MMBusinessAssociationEnd() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountReport9.Entry, com.tools20022.repository.msg.AccountReport11.Entry, com.tools20022.repository.msg.AccountReport12.Entry,
					com.tools20022.repository.msg.AccountReport16.Entry, com.tools20022.repository.msg.AccountNotification1.Entry, com.tools20022.repository.msg.AccountNotification2.Entry,
					com.tools20022.repository.msg.AccountNotification5.Entry, com.tools20022.repository.msg.AccountNotification7.Entry, com.tools20022.repository.msg.AccountStatement1.Entry,
					com.tools20022.repository.msg.AccountStatement2.Entry, com.tools20022.repository.msg.AccountStatement3.Entry, com.tools20022.repository.msg.AccountStatement4.Entry,
					com.tools20022.repository.msg.ReportData5.AccountValue, com.tools20022.repository.msg.AccountNotification3.Item, com.tools20022.repository.msg.AccountNotification4.Item,
					com.tools20022.repository.msg.AccountNotification6.Item, com.tools20022.repository.msg.BillingBalance1.Value, com.tools20022.repository.msg.AccountReport18.Entry, com.tools20022.repository.msg.AccountStatement5.Entry,
					com.tools20022.repository.msg.AccountNotification10.Item, com.tools20022.repository.msg.AccountNotification11.Entry, com.tools20022.repository.msg.AccountStatement6.Entry,
					com.tools20022.repository.msg.AccountReport19.Entry, com.tools20022.repository.msg.AccountNotification13.Item, com.tools20022.repository.msg.AccountNotification12.Entry);
			elementContext_lazy = () -> CashBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CashBalanceEntry";
			definition = "Credit or debit postings used to calculate a balance.";
			minOccurs = 0;
			type_lazy = () -> CashEntry.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CashEntry.CashBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Defines the type of allowed balance adjustment.
	 * <p>
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
	 * <li>{@linkplain com.tools20022.repository.msg.BalanceAdjustment1#Type
	 * BalanceAdjustment1.Type}</li>
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
	public static final MMBusinessAttribute BalanceAdjustmentCode = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BalanceAdjustment1.Type);
			elementContext_lazy = () -> CashBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BalanceAdjustmentCode";
			definition = "Defines the type of allowed balance adjustment.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BalanceAdjustmentTypeCode.mmObject();
		}
	};
	/**
	 * Validation process which verifies the balance attached to the card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#Balance
	 * CardPaymentValidation.Balance}</li>
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
	public static final MMBusinessAssociationEnd RelatedCardPaymentValidationProcess = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedCardPaymentValidationProcess";
			definition = "Validation process which verifies the balance attached to the card.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> CardPaymentValidation.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.CardPaymentValidation.Balance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Predetermined date in a billing or processing cycle when account activity
	 * for the previous reporting period is summarized (when checks written
	 * against an account are collected and summarized in a monthly statement).
	 * Checks paid or deposits received after the cut-off date are included in
	 * the next month's statement.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.FinancingItemList1#AmountCutOffDate
	 * FinancingItemList1.AmountCutOffDate}</li>
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
	public static final MMBusinessAttribute CutOffDate = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancingItemList1.AmountCutOffDate);
			elementContext_lazy = () -> CashBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "CutOffDate";
			definition = "Predetermined date in a billing or processing cycle when account activity for the previous reporting period is summarized (when checks written against an account are collected and summarized in a monthly statement). Checks paid or deposits received after the cut-off date are included in the next month's statement.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	/**
	 * Related contract balance on date of contract registration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.RegisteredContract#ContractBalance
	 * RegisteredContract.ContractBalance}</li>
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
	public static final MMBusinessAssociationEnd RelatedRegisteredContract = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> CashBalance.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "RelatedRegisteredContract";
			definition = "Related contract balance on date of contract registration.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> RegisteredContract.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.RegisteredContract.ContractBalance;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CashBalance";
				definition = "Numerical representation of the net increases and decreases in an account at a specific point in time. A cash balance is calculated from a sum of cash credits minus a sum of cash debits.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashAccount.CashBalance, com.tools20022.repository.entity.CashEntry.CashBalance, com.tools20022.repository.entity.SystemMemberRole.CashBalance,
						com.tools20022.repository.entity.CashAvailability.CashBalance, com.tools20022.repository.entity.CardPaymentValidation.Balance, com.tools20022.repository.entity.RegisteredContract.ContractBalance);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountReport9.Balance, com.tools20022.repository.msg.AccountReport11.Balance, com.tools20022.repository.msg.AccountReport12.Balance,
						com.tools20022.repository.msg.AccountReport16.Balance, com.tools20022.repository.msg.AccountStatement1.Balance, com.tools20022.repository.msg.AccountStatement2.Balance,
						com.tools20022.repository.msg.AccountStatement3.Balance, com.tools20022.repository.msg.AccountStatement4.Balance, com.tools20022.repository.msg.IntraBalance2.CashSubBalanceIdentification,
						com.tools20022.repository.msg.AccountReport18.Balance, com.tools20022.repository.msg.AccountStatement5.Balance, com.tools20022.repository.msg.AccountStatement6.Balance,
						com.tools20022.repository.msg.AccountReport19.Balance);
				superType_lazy = () -> Balance.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.CashBalance.CashAccount, com.tools20022.repository.entity.CashBalance.CalculationType, com.tools20022.repository.entity.CashBalance.Counterparty,
						com.tools20022.repository.entity.CashBalance.Amount, com.tools20022.repository.entity.CashBalance.Availability, com.tools20022.repository.entity.CashBalance.CashBalanceEntry,
						com.tools20022.repository.entity.CashBalance.BalanceAdjustmentCode, com.tools20022.repository.entity.CashBalance.RelatedCardPaymentValidationProcess, com.tools20022.repository.entity.CashBalance.CutOffDate,
						com.tools20022.repository.entity.CashBalance.RelatedRegisteredContract);
				derivationComponent_lazy = () -> Arrays.asList(BalanceDetails2.mmObject(), BalanceDetails3.mmObject(), BalanceDetails4.mmObject(), CashBalance4.mmObject(), CashBalanceDetails2.mmObject(), CashBalanceDetails3.mmObject(),
						CashBalanceDetails4.mmObject(), CashBalanceDetails5.mmObject(), CashBalanceDetails6.mmObject(), CashBalanceDetails7.mmObject(), CashBalance5.mmObject(), CashBalance6.mmObject(), CashBalance1.mmObject(),
						AccountReport9.mmObject(), BalanceType5Choice.mmObject(), BalanceSubType1Choice.mmObject(), BalanceType12.mmObject(), CashBalance3.mmObject(), AccountReport11.mmObject(), AccountReport12.mmObject(),
						AccountReport16.mmObject(), AccountNotification1.mmObject(), AccountNotification2.mmObject(), AccountNotification5.mmObject(), AccountNotification7.mmObject(), CashBalance2.mmObject(), AccountStatement1.mmObject(),
						AccountStatement2.mmObject(), AccountStatement3.mmObject(), AccountStatement4.mmObject(), PayInCallItem.mmObject(), ReportData1.mmObject(), ReportData5.mmObject(), ReportData2.mmObject(), BalanceStatus.mmObject(),
						ReportData3.mmObject(), BalanceStatus2.mmObject(), ReportData4.mmObject(), CashBalanceType1FormatType.mmObject(), AccountNotification3.mmObject(), AccountNotification4.mmObject(), AccountNotification6.mmObject(),
						BillingBalanceType1Choice.mmObject(), BillingBalance1.mmObject(), BalanceAdjustment1.mmObject(), AccountReport18.mmObject(), AccountStatement5.mmObject(), AccountNotification10.mmObject(),
						AccountNotification11.mmObject(), ContractBalance1.mmObject(), AccountStatement6.mmObject(), AccountReport19.mmObject(), AccountNotification13.mmObject(), AccountNotification12.mmObject(), CashBalance7.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}
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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of an account or the status of the processing of the
 * actions linked to the management of an account.
 * <p>
 * <strong>Class diagram</strong>
 * <p>
 * <embed name="AccountStatus" src="doc-files/AccountStatus.svg">
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getElement
 * element} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.AccountStatus#Account
 * AccountStatus.Account}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountStatus#Status
 * AccountStatus.Status}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountStatus#Blocked
 * AccountStatus.Blocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountStatus#ManagementStatus
 * AccountStatus.ManagementStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountStatus#EntryStatus
 * AccountStatus.EntryStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountStatus#BalanceStatus
 * AccountStatus.BalanceStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountStatus#BlockedReason
 * AccountStatus.BlockedReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Account#Status
 * Account.Status}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason2#Status
 * AccountManagementStatusAndReason2.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason3#Status
 * AccountManagementStatusAndReason3.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason4#Status
 * AccountManagementStatusAndReason4.Status}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5#Status
 * AccountManagementStatusAndReason5.Status}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatus2#Other
 * AccountStatus2.Other}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMBusinessComponent#getSuperType
 * superType} = {@linkplain com.tools20022.repository.entity.Status Status}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationComponent
 * derivationComponent} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Blocked1 Blocked1}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectedStatus5
 * RejectedStatus5}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason1
 * AccountManagementStatusAndReason1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status12Choice
 * Status12Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason2
 * AccountManagementStatusAndReason2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason3
 * AccountManagementStatusAndReason3}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status14Choice
 * Status14Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason16
 * RejectionReason16}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason4
 * AccountManagementStatusAndReason4}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Blocked2 Blocked2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason32
 * RejectionReason32}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason33
 * RejectionReason33}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status21Choice
 * Status21Choice}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status20Choice
 * Status20Choice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason31
 * RejectionReason31}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5
 * AccountManagementStatusAndReason5}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatus2 AccountStatus2}</li>
 * <li>{@linkplain com.tools20022.repository.msg.OtherAccountStatus1
 * OtherAccountStatus1}</li>
 * <li>{@linkplain com.tools20022.repository.choice.Status25Choice
 * Status25Choice}</li>
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
 * "AccountStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of an account or the status of the processing of the actions linked to the management of an account."
 * </li>
 * </ul>
 */
public class AccountStatus extends Status {

	final static private AtomicReference<MMBusinessComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Identifies the account for which a status is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} = {@linkplain com.tools20022.repository.entity.Account#Status
	 * Account.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getAggregation
	 * aggregation} = com.tools20022.metamodel.MMAggregation.NONE</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.entity.Account Account}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus AccountStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the account for which a status is provided."</li>
	 * </ul>
	 */
	public static final MMBusinessAssociationEnd Account = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AccountStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Identifies the account for which a status is provided.";
			minOccurs = 0;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
			opposite_lazy = () -> com.tools20022.repository.entity.Account.Status;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
		}
	};
	/**
	 * Specifies the status of an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AccountStatusCode
	 * AccountStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount1#Status
	 * SecuritiesAccount1.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.SecuritiesAccount4#Status
	 * SecuritiesAccount4.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount5#Status
	 * CustomerAccount5.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#Status
	 * CustomerAccountModification1.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount4#Status
	 * CustomerAccount4.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.OtherAccountStatus1#Status
	 * OtherAccountStatus1.Status}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus AccountStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of an account."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Status = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesAccount1.Status, com.tools20022.repository.msg.SecuritiesAccount4.Status, com.tools20022.repository.msg.CustomerAccount5.Status,
					com.tools20022.repository.msg.CustomerAccountModification1.Status, com.tools20022.repository.msg.CustomerAccount4.Status, com.tools20022.repository.msg.OtherAccountStatus1.Status);
			elementContext_lazy = () -> AccountStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Specifies the status of an account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AccountStatusCode.mmObject();
		}
	};
	/**
	 * Indicates whether the account is blocked.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Blocked1#Blocked
	 * Blocked1.Blocked}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Blocked2#Blocked
	 * Blocked2.Blocked}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BlockedStatusReason2#Blocked
	 * BlockedStatusReason2.Blocked}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus AccountStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Blocked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the account is blocked."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute Blocked = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Blocked1.Blocked, com.tools20022.repository.msg.Blocked2.Blocked, com.tools20022.repository.msg.BlockedStatusReason2.Blocked);
			elementContext_lazy = () -> AccountStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Blocked";
			definition = "Indicates whether the account is blocked.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Specifies the status of the processing of a request linked to the
	 * management of an account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.AccountManagementStatusCode
	 * AccountManagementStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason1#Status
	 * AccountManagementStatusAndReason1.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Status12Choice#Status
	 * Status12Choice.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Status14Choice#Status
	 * Status14Choice.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Status20Choice#Status
	 * Status20Choice.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Status25Choice#Status
	 * Status25Choice.Status}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus AccountStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManagementStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the status of the processing of a request linked to the management of an account."
	 * </li>
	 * </ul>
	 */
	public static final MMBusinessAttribute ManagementStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountManagementStatusAndReason1.Status, com.tools20022.repository.choice.Status12Choice.Status, com.tools20022.repository.choice.Status14Choice.Status,
					com.tools20022.repository.choice.Status20Choice.Status, com.tools20022.repository.choice.Status25Choice.Status);
			elementContext_lazy = () -> AccountStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ManagementStatus";
			definition = "Specifies the status of the processing of a request linked to the management of an account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> AccountManagementStatusCode.mmObject();
		}
	};
	/**
	 * Status of an entry on the books of the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EntryStatusCode
	 * EntryStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntrySearch2#EntryStatus
	 * AccountCashEntrySearch2.EntryStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch3#EntryStatus
	 * CashAccountEntrySearch3.EntryStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryDetails3#EntryStatus
	 * AccountCashEntryDetails3.EntryStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashEntry1#Status
	 * CashEntry1.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry1#Status
	 * ReportEntry1.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry2#Status
	 * ReportEntry2.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry3#Status
	 * ReportEntry3.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry4#Status
	 * ReportEntry4.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.NotificationEntry1#Status
	 * NotificationEntry1.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StatementEntry1#Status
	 * StatementEntry1.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TransactionType1#Status
	 * TransactionType1.Status}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4#EntryStatus
	 * CashAccountEntrySearch4.EntryStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry7#Status
	 * ReportEntry7.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8#Status
	 * ReportEntry8.Status}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus AccountStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntryStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of an entry on the books of the account servicer."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute EntryStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountCashEntrySearch2.EntryStatus, com.tools20022.repository.msg.CashAccountEntrySearch3.EntryStatus,
					com.tools20022.repository.msg.AccountCashEntryDetails3.EntryStatus, com.tools20022.repository.msg.CashEntry1.Status, com.tools20022.repository.msg.ReportEntry1.Status, com.tools20022.repository.msg.ReportEntry2.Status,
					com.tools20022.repository.msg.ReportEntry3.Status, com.tools20022.repository.msg.ReportEntry4.Status, com.tools20022.repository.msg.NotificationEntry1.Status, com.tools20022.repository.msg.StatementEntry1.Status,
					com.tools20022.repository.msg.TransactionType1.Status, com.tools20022.repository.msg.CashAccountEntrySearch4.EntryStatus, com.tools20022.repository.msg.ReportEntry7.Status,
					com.tools20022.repository.msg.ReportEntry8.Status);
			elementContext_lazy = () -> AccountStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EntryStatus";
			definition = "Status of an entry on the books of the account servicer.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> EntryStatusCode.mmObject();
		}
	};
	/**
	 * Current status of a cash balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BalanceStatusCode
	 * BalanceStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalanceDetails2#Status
	 * CashBalanceDetails2.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalanceDetails3#Status
	 * CashBalanceDetails3.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalanceDetails4#Status
	 * CashBalanceDetails4.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalanceDetails5#Status
	 * CashBalanceDetails5.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalanceDetails6#Status
	 * CashBalanceDetails6.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalanceDetails7#Status
	 * CashBalanceDetails7.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance5#Status
	 * CashBalance5.Status}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance6#Status
	 * CashBalance6.Status}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus AccountStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Current status of a cash balance."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BalanceStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashBalanceDetails2.Status, com.tools20022.repository.msg.CashBalanceDetails3.Status, com.tools20022.repository.msg.CashBalanceDetails4.Status,
					com.tools20022.repository.msg.CashBalanceDetails5.Status, com.tools20022.repository.msg.CashBalanceDetails6.Status, com.tools20022.repository.msg.CashBalanceDetails7.Status,
					com.tools20022.repository.msg.CashBalance5.Status, com.tools20022.repository.msg.CashBalance6.Status);
			elementContext_lazy = () -> AccountStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BalanceStatus";
			definition = "Current status of a cash balance.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> BalanceStatusCode.mmObject();
		}
	};
	/**
	 * Specifies the different reasons for which the account is blocked.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ReasonBlockedCode
	 * ReasonBlockedCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BlockedStatusReason2#Reason
	 * BlockedStatusReason2.Reason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus AccountStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BlockedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the different reasons for which the account is blocked."</li>
	 * </ul>
	 */
	public static final MMBusinessAttribute BlockedReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BlockedStatusReason2.Reason);
			elementContext_lazy = () -> AccountStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BlockedReason";
			definition = "Specifies the different reasons for which the account is blocked.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> ReasonBlockedCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountStatus";
				definition = "Specifies the status of an account or the status of the processing of the actions linked to the management of an account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.Status);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountManagementStatusAndReason2.Status, com.tools20022.repository.msg.AccountManagementStatusAndReason3.Status,
						com.tools20022.repository.msg.AccountManagementStatusAndReason4.Status, com.tools20022.repository.msg.AccountManagementStatusAndReason5.Status, com.tools20022.repository.msg.AccountStatus2.Other);
				superType_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountStatus.Account, com.tools20022.repository.entity.AccountStatus.Status, com.tools20022.repository.entity.AccountStatus.Blocked,
						com.tools20022.repository.entity.AccountStatus.ManagementStatus, com.tools20022.repository.entity.AccountStatus.EntryStatus, com.tools20022.repository.entity.AccountStatus.BalanceStatus,
						com.tools20022.repository.entity.AccountStatus.BlockedReason);
				derivationComponent_lazy = () -> Arrays.asList(Blocked1.mmObject(), RejectedStatus5.mmObject(), AccountManagementStatusAndReason1.mmObject(), Status12Choice.mmObject(), AccountManagementStatusAndReason2.mmObject(),
						AccountManagementStatusAndReason3.mmObject(), Status14Choice.mmObject(), RejectionReason16.mmObject(), AccountManagementStatusAndReason4.mmObject(), Blocked2.mmObject(), RejectionReason32.mmObject(),
						RejectionReason33.mmObject(), Status21Choice.mmObject(), Status20Choice.mmObject(), RejectionReason31.mmObject(), AccountManagementStatusAndReason5.mmObject(), AccountStatus2.mmObject(),
						OtherAccountStatus1.mmObject(), Status25Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}
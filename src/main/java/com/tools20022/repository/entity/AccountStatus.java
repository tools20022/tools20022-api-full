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
import java.util.List;

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
 * <li>{@linkplain com.tools20022.repository.entity.AccountStatus#mmAccount
 * AccountStatus.mmAccount}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountStatus#mmStatus
 * AccountStatus.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountStatus#mmBlocked
 * AccountStatus.mmBlocked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountStatus#mmManagementStatus
 * AccountStatus.mmManagementStatus}</li>
 * <li>{@linkplain com.tools20022.repository.entity.AccountStatus#mmEntryStatus
 * AccountStatus.mmEntryStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountStatus#mmBalanceStatus
 * AccountStatus.mmBalanceStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.entity.AccountStatus#mmBlockedReason
 * AccountStatus.mmBlockedReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getAssociationDomain
 * associationDomain} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.entity.Account#mmStatus
 * Account.mmStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMBusinessComponent#getDerivationElement
 * derivationElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason2#mmStatus
 * AccountManagementStatusAndReason2.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason3#mmStatus
 * AccountManagementStatusAndReason3.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason4#mmStatus
 * AccountManagementStatusAndReason4.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason5#mmStatus
 * AccountManagementStatusAndReason5.mmStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AccountStatus2#mmOther
 * AccountStatus2.mmOther}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
	protected List<com.tools20022.repository.entity.Account> account;
	/**
	 * Identifies the account for which a status is provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessAssociationEnd#getOpposite
	 * opposite} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmStatus
	 * Account.mmStatus}</li>
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
	public static final MMBusinessAssociationEnd mmAccount = new MMBusinessAssociationEnd() {
		{
			elementContext_lazy = () -> AccountStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Account";
			definition = "Identifies the account for which a status is provided.";
			minOccurs = 0;
			opposite_lazy = () -> com.tools20022.repository.entity.Account.mmStatus;
			aggregation = com.tools20022.metamodel.MMAggregation.NONE;
			type_lazy = () -> com.tools20022.repository.entity.Account.mmObject();
		}
	};
	protected AccountStatusCode status;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus AccountStatus}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount1#mmStatus
	 * SecuritiesAccount1.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SecuritiesAccount4#mmStatus
	 * SecuritiesAccount4.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount5#mmStatus
	 * CustomerAccount5.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CustomerAccountModification1#mmStatus
	 * CustomerAccountModification1.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CustomerAccount4#mmStatus
	 * CustomerAccount4.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.OtherAccountStatus1#mmStatus
	 * OtherAccountStatus1.mmStatus}</li>
	 * </ul>
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
	public static final MMBusinessAttribute mmStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesAccount1.mmStatus, com.tools20022.repository.msg.SecuritiesAccount4.mmStatus, com.tools20022.repository.msg.CustomerAccount5.mmStatus,
					com.tools20022.repository.msg.CustomerAccountModification1.mmStatus, com.tools20022.repository.msg.CustomerAccount4.mmStatus, com.tools20022.repository.msg.OtherAccountStatus1.mmStatus);
			elementContext_lazy = () -> AccountStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Status";
			definition = "Specifies the status of an account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AccountStatusCode.mmObject();
		}
	};
	protected YesNoIndicator blocked;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus AccountStatus}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Blocked1#mmBlocked
	 * Blocked1.mmBlocked}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Blocked2#mmBlocked
	 * Blocked2.mmBlocked}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BlockedStatusReason2#mmBlocked
	 * BlockedStatusReason2.mmBlocked}</li>
	 * </ul>
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
	public static final MMBusinessAttribute mmBlocked = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Blocked1.mmBlocked, com.tools20022.repository.msg.Blocked2.mmBlocked, com.tools20022.repository.msg.BlockedStatusReason2.mmBlocked);
			elementContext_lazy = () -> AccountStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "Blocked";
			definition = "Indicates whether the account is blocked.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected AccountManagementStatusCode managementStatus;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus AccountStatus}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountManagementStatusAndReason1#mmStatus
	 * AccountManagementStatusAndReason1.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Status12Choice#mmStatus
	 * Status12Choice.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Status14Choice#mmStatus
	 * Status14Choice.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Status20Choice#mmStatus
	 * Status20Choice.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.choice.Status25Choice#mmStatus
	 * Status25Choice.mmStatus}</li>
	 * </ul>
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
	public static final MMBusinessAttribute mmManagementStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountManagementStatusAndReason1.mmStatus, com.tools20022.repository.choice.Status12Choice.mmStatus, com.tools20022.repository.choice.Status14Choice.mmStatus,
					com.tools20022.repository.choice.Status20Choice.mmStatus, com.tools20022.repository.choice.Status25Choice.mmStatus);
			elementContext_lazy = () -> AccountStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "ManagementStatus";
			definition = "Specifies the status of the processing of a request linked to the management of an account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> AccountManagementStatusCode.mmObject();
		}
	};
	protected EntryStatusCode entryStatus;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus AccountStatus}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntrySearch2#mmEntryStatus
	 * AccountCashEntrySearch2.mmEntryStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch3#mmEntryStatus
	 * CashAccountEntrySearch3.mmEntryStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AccountCashEntryDetails3#mmEntryStatus
	 * AccountCashEntryDetails3.mmEntryStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashEntry1#mmStatus
	 * CashEntry1.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry1#mmStatus
	 * ReportEntry1.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry2#mmStatus
	 * ReportEntry2.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry3#mmStatus
	 * ReportEntry3.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry4#mmStatus
	 * ReportEntry4.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.NotificationEntry1#mmStatus
	 * NotificationEntry1.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.StatementEntry1#mmStatus
	 * StatementEntry1.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TransactionType1#mmStatus
	 * TransactionType1.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashAccountEntrySearch4#mmEntryStatus
	 * CashAccountEntrySearch4.mmEntryStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry7#mmStatus
	 * ReportEntry7.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.ReportEntry8#mmStatus
	 * ReportEntry8.mmStatus}</li>
	 * </ul>
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
	public static final MMBusinessAttribute mmEntryStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountCashEntrySearch2.mmEntryStatus, com.tools20022.repository.msg.CashAccountEntrySearch3.mmEntryStatus,
					com.tools20022.repository.msg.AccountCashEntryDetails3.mmEntryStatus, com.tools20022.repository.msg.CashEntry1.mmStatus, com.tools20022.repository.msg.ReportEntry1.mmStatus,
					com.tools20022.repository.msg.ReportEntry2.mmStatus, com.tools20022.repository.msg.ReportEntry3.mmStatus, com.tools20022.repository.msg.ReportEntry4.mmStatus, com.tools20022.repository.msg.NotificationEntry1.mmStatus,
					com.tools20022.repository.msg.StatementEntry1.mmStatus, com.tools20022.repository.msg.TransactionType1.mmStatus, com.tools20022.repository.msg.CashAccountEntrySearch4.mmEntryStatus,
					com.tools20022.repository.msg.ReportEntry7.mmStatus, com.tools20022.repository.msg.ReportEntry8.mmStatus);
			elementContext_lazy = () -> AccountStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "EntryStatus";
			definition = "Status of an entry on the books of the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> EntryStatusCode.mmObject();
		}
	};
	protected BalanceStatusCode balanceStatus;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus AccountStatus}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails2#mmStatus
	 * CashBalanceDetails2.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails3#mmStatus
	 * CashBalanceDetails3.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails4#mmStatus
	 * CashBalanceDetails4.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails5#mmStatus
	 * CashBalanceDetails5.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails6#mmStatus
	 * CashBalanceDetails6.mmStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CashBalanceDetails7#mmStatus
	 * CashBalanceDetails7.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance5#mmStatus
	 * CashBalance5.mmStatus}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.CashBalance6#mmStatus
	 * CashBalance6.mmStatus}</li>
	 * </ul>
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
	public static final MMBusinessAttribute mmBalanceStatus = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CashBalanceDetails2.mmStatus, com.tools20022.repository.msg.CashBalanceDetails3.mmStatus, com.tools20022.repository.msg.CashBalanceDetails4.mmStatus,
					com.tools20022.repository.msg.CashBalanceDetails5.mmStatus, com.tools20022.repository.msg.CashBalanceDetails6.mmStatus, com.tools20022.repository.msg.CashBalanceDetails7.mmStatus,
					com.tools20022.repository.msg.CashBalance5.mmStatus, com.tools20022.repository.msg.CashBalance6.mmStatus);
			elementContext_lazy = () -> AccountStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BalanceStatus";
			definition = "Current status of a cash balance.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BalanceStatusCode.mmObject();
		}
	};
	protected ReasonBlockedCode blockedReason;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMBusinessElement#getElementContext
	 * elementContext} =
	 * {@linkplain com.tools20022.repository.entity.AccountStatus AccountStatus}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMBusinessElement#getDerivation
	 * derivation} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BlockedStatusReason2#mmReason
	 * BlockedStatusReason2.mmReason}</li>
	 * </ul>
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
	public static final MMBusinessAttribute mmBlockedReason = new MMBusinessAttribute() {
		{
			derivation_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BlockedStatusReason2.mmReason);
			elementContext_lazy = () -> AccountStatus.mmObject();
			isDerived = false;
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
			name = "BlockedReason";
			definition = "Specifies the different reasons for which the account is blocked.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ReasonBlockedCode.mmObject();
		}
	};

	static public MMBusinessComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMBusinessComponent() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AccountStatus";
				definition = "Specifies the status of an account or the status of the processing of the actions linked to the management of an account.";
				associationDomain_lazy = () -> Arrays.asList(com.tools20022.repository.entity.Account.mmStatus);
				derivationElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountManagementStatusAndReason2.mmStatus, com.tools20022.repository.msg.AccountManagementStatusAndReason3.mmStatus,
						com.tools20022.repository.msg.AccountManagementStatusAndReason4.mmStatus, com.tools20022.repository.msg.AccountManagementStatusAndReason5.mmStatus, com.tools20022.repository.msg.AccountStatus2.mmOther);
				superType_lazy = () -> com.tools20022.repository.entity.Status.mmObject();
				element_lazy = () -> Arrays.asList(com.tools20022.repository.entity.AccountStatus.mmAccount, com.tools20022.repository.entity.AccountStatus.mmStatus, com.tools20022.repository.entity.AccountStatus.mmBlocked,
						com.tools20022.repository.entity.AccountStatus.mmManagementStatus, com.tools20022.repository.entity.AccountStatus.mmEntryStatus, com.tools20022.repository.entity.AccountStatus.mmBalanceStatus,
						com.tools20022.repository.entity.AccountStatus.mmBlockedReason);
				derivationComponent_lazy = () -> Arrays.asList(Blocked1.mmObject(), RejectedStatus5.mmObject(), AccountManagementStatusAndReason1.mmObject(), Status12Choice.mmObject(), AccountManagementStatusAndReason2.mmObject(),
						AccountManagementStatusAndReason3.mmObject(), Status14Choice.mmObject(), RejectionReason16.mmObject(), AccountManagementStatusAndReason4.mmObject(), Blocked2.mmObject(), RejectionReason32.mmObject(),
						RejectionReason33.mmObject(), Status21Choice.mmObject(), Status20Choice.mmObject(), RejectionReason31.mmObject(), AccountManagementStatusAndReason5.mmObject(), AccountStatus2.mmObject(),
						OtherAccountStatus1.mmObject(), Status25Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<Account> getAccount() {
		return account;
	}

	public void setAccount(List<com.tools20022.repository.entity.Account> account) {
		this.account = account;
	}

	public AccountStatusCode getStatus() {
		return status;
	}

	public void setStatus(AccountStatusCode status) {
		this.status = status;
	}

	public YesNoIndicator getBlocked() {
		return blocked;
	}

	public void setBlocked(YesNoIndicator blocked) {
		this.blocked = blocked;
	}

	public AccountManagementStatusCode getManagementStatus() {
		return managementStatus;
	}

	public void setManagementStatus(AccountManagementStatusCode managementStatus) {
		this.managementStatus = managementStatus;
	}

	public EntryStatusCode getEntryStatus() {
		return entryStatus;
	}

	public void setEntryStatus(EntryStatusCode entryStatus) {
		this.entryStatus = entryStatus;
	}

	public BalanceStatusCode getBalanceStatus() {
		return balanceStatus;
	}

	public void setBalanceStatus(BalanceStatusCode balanceStatus) {
		this.balanceStatus = balanceStatus;
	}

	public ReasonBlockedCode getBlockedReason() {
		return blockedReason;
	}

	public void setBlockedReason(ReasonBlockedCode blockedReason) {
		this.blockedReason = blockedReason;
	}
}
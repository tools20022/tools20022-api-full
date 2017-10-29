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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.YesNoIndicator;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Details about praticipant's liquidity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1#Account
 * AccountLiquidityReport1.Account}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1#AccountOverdueIndicator
 * AccountLiquidityReport1.AccountOverdueIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1#LimitInformation
 * AccountLiquidityReport1.LimitInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1#LiquidityInformation
 * AccountLiquidityReport1.LiquidityInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1#ArrestInformation
 * AccountLiquidityReport1.ArrestInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1#DebitQueuedTransactions
 * AccountLiquidityReport1.DebitQueuedTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1#CreditQueuedTransactions
 * AccountLiquidityReport1.CreditQueuedTransactions}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountLiquidityReport1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details about praticipant's liquidity."</li>
 * </ul>
 */
public class AccountLiquidityReport1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	/**
	 * Unique and unambiguous identification for the account between the account
	 * owner and the account servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount25
	 * CashAccount25}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1
	 * AccountLiquidityReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd Account = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountLiquidityReport1.mmObject();
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> CashAccount25.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Indicates overdue FTI queue on the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1
	 * AccountLiquidityReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOvrdueInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOverdueIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates overdue FTI queue on the account."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute AccountOverdueIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountLiquidityReport1.mmObject();
			isDerived = false;
			xmlTag = "AcctOvrdueInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOverdueIndicator";
			definition = "Indicates overdue FTI queue on the account.";
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	/**
	 * Information about funds limits set on the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AccountLimits1
	 * AccountLimits1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1
	 * AccountLiquidityReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LmtInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about funds limits set on the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd LimitInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountLiquidityReport1.mmObject();
			isDerived = false;
			xmlTag = "LmtInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitInformation";
			definition = "Information about funds limits set on the account.";
			minOccurs = 0;
			type_lazy = () -> AccountLimits1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Information about liquidity of the funds of the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.LiquidityDetails1
	 * LiquidityDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1
	 * AccountLiquidityReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LqdtyInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidityInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about liquidity of the funds of the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd LiquidityInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountLiquidityReport1.mmObject();
			isDerived = false;
			xmlTag = "LqdtyInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidityInformation";
			definition = "Information about liquidity of the funds of the account.";
			minOccurs = 0;
			maxOccurs = 1;
			type_lazy = () -> LiquidityDetails1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Information about restricted (arrested) funds on the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ArrestedFunds1
	 * ArrestedFunds1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1
	 * AccountLiquidityReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ArrstInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ArrestInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about restricted (arrested) funds on the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd ArrestInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountLiquidityReport1.mmObject();
			isDerived = false;
			xmlTag = "ArrstInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ArrestInformation";
			definition = "Information about restricted (arrested) funds on the account.";
			minOccurs = 1;
			maxOccurs = 1;
			type_lazy = () -> ArrestedFunds1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Information about queued debit transactions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QueuedTransactionsReport1
	 * QueuedTransactionsReport1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1
	 * AccountLiquidityReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DbtQdTxs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DebitQueuedTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about queued debit transactions."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd DebitQueuedTransactions = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountLiquidityReport1.mmObject();
			isDerived = false;
			xmlTag = "DbtQdTxs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitQueuedTransactions";
			definition = "Information about queued debit transactions.";
			minOccurs = 0;
			maxOccurs = 5;
			type_lazy = () -> QueuedTransactionsReport1.mmObject();
			isComposite = true;
		}
	};
	/**
	 * Information about queued credit transactions
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QueuedTransactionsReport1
	 * QueuedTransactionsReport1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1
	 * AccountLiquidityReport1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtQdTxs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditQueuedTransactions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about queued credit transactions"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd CreditQueuedTransactions = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountLiquidityReport1.mmObject();
			isDerived = false;
			xmlTag = "CdtQdTxs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditQueuedTransactions";
			definition = "Information about queued credit transactions";
			minOccurs = 0;
			maxOccurs = 2;
			type_lazy = () -> QueuedTransactionsReport1.mmObject();
			isComposite = true;
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountLiquidityReport1.Account, com.tools20022.repository.msg.AccountLiquidityReport1.AccountOverdueIndicator,
						com.tools20022.repository.msg.AccountLiquidityReport1.LimitInformation, com.tools20022.repository.msg.AccountLiquidityReport1.LiquidityInformation,
						com.tools20022.repository.msg.AccountLiquidityReport1.ArrestInformation, com.tools20022.repository.msg.AccountLiquidityReport1.DebitQueuedTransactions,
						com.tools20022.repository.msg.AccountLiquidityReport1.CreditQueuedTransactions);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AccountLiquidityReport1";
				definition = "Details about praticipant's liquidity.";
			}
		});
		return mmObject_lazy.get();
	}
}
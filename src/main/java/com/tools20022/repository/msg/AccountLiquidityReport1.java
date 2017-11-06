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
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1#mmAccount
 * AccountLiquidityReport1.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1#mmAccountOverdueIndicator
 * AccountLiquidityReport1.mmAccountOverdueIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1#mmLimitInformation
 * AccountLiquidityReport1.mmLimitInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1#mmLiquidityInformation
 * AccountLiquidityReport1.mmLiquidityInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1#mmArrestInformation
 * AccountLiquidityReport1.mmArrestInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1#mmDebitQueuedTransactions
 * AccountLiquidityReport1.mmDebitQueuedTransactions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AccountLiquidityReport1#mmCreditQueuedTransactions
 * AccountLiquidityReport1.mmCreditQueuedTransactions}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountLiquidityReport1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details about praticipant's liquidity."</li>
 * </ul>
 */
public class AccountLiquidityReport1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CashAccount25 account;
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
	public static final MMMessageAssociationEnd mmAccount = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountLiquidityReport1.mmObject();
			isDerived = false;
			xmlTag = "Acct";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount25.mmObject();
		}
	};
	protected YesNoIndicator accountOverdueIndicator;
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
	public static final MMMessageAttribute mmAccountOverdueIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AccountLiquidityReport1.mmObject();
			isDerived = false;
			xmlTag = "AcctOvrdueInd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOverdueIndicator";
			definition = "Indicates overdue FTI queue on the account.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.AccountLimits1> limitInformation;
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
	public static final MMMessageAssociationEnd mmLimitInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountLiquidityReport1.mmObject();
			isDerived = false;
			xmlTag = "LmtInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitInformation";
			definition = "Information about funds limits set on the account.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AccountLimits1.mmObject();
		}
	};
	protected LiquidityDetails1 liquidityInformation;
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
	public static final MMMessageAssociationEnd mmLiquidityInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountLiquidityReport1.mmObject();
			isDerived = false;
			xmlTag = "LqdtyInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidityInformation";
			definition = "Information about liquidity of the funds of the account.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.LiquidityDetails1.mmObject();
		}
	};
	protected ArrestedFunds1 arrestInformation;
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
	public static final MMMessageAssociationEnd mmArrestInformation = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountLiquidityReport1.mmObject();
			isDerived = false;
			xmlTag = "ArrstInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ArrestInformation";
			definition = "Information about restricted (arrested) funds on the account.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ArrestedFunds1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.QueuedTransactionsReport1> debitQueuedTransactions;
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
	public static final MMMessageAssociationEnd mmDebitQueuedTransactions = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountLiquidityReport1.mmObject();
			isDerived = false;
			xmlTag = "DbtQdTxs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DebitQueuedTransactions";
			definition = "Information about queued debit transactions.";
			maxOccurs = 5;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.QueuedTransactionsReport1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.QueuedTransactionsReport1> creditQueuedTransactions;
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
	public static final MMMessageAssociationEnd mmCreditQueuedTransactions = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AccountLiquidityReport1.mmObject();
			isDerived = false;
			xmlTag = "CdtQdTxs";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditQueuedTransactions";
			definition = "Information about queued credit transactions";
			maxOccurs = 2;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.QueuedTransactionsReport1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AccountLiquidityReport1.mmAccount, com.tools20022.repository.msg.AccountLiquidityReport1.mmAccountOverdueIndicator,
						com.tools20022.repository.msg.AccountLiquidityReport1.mmLimitInformation, com.tools20022.repository.msg.AccountLiquidityReport1.mmLiquidityInformation,
						com.tools20022.repository.msg.AccountLiquidityReport1.mmArrestInformation, com.tools20022.repository.msg.AccountLiquidityReport1.mmDebitQueuedTransactions,
						com.tools20022.repository.msg.AccountLiquidityReport1.mmCreditQueuedTransactions);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "AccountLiquidityReport1";
				definition = "Details about praticipant's liquidity.";
			}
		});
		return mmObject_lazy.get();
	}

	public CashAccount25 getAccount() {
		return account;
	}

	public void setAccount(com.tools20022.repository.msg.CashAccount25 account) {
		this.account = account;
	}

	public YesNoIndicator getAccountOverdueIndicator() {
		return accountOverdueIndicator;
	}

	public void setAccountOverdueIndicator(YesNoIndicator accountOverdueIndicator) {
		this.accountOverdueIndicator = accountOverdueIndicator;
	}

	public List<AccountLimits1> getLimitInformation() {
		return limitInformation;
	}

	public void setLimitInformation(List<com.tools20022.repository.msg.AccountLimits1> limitInformation) {
		this.limitInformation = limitInformation;
	}

	public LiquidityDetails1 getLiquidityInformation() {
		return liquidityInformation;
	}

	public void setLiquidityInformation(com.tools20022.repository.msg.LiquidityDetails1 liquidityInformation) {
		this.liquidityInformation = liquidityInformation;
	}

	public ArrestedFunds1 getArrestInformation() {
		return arrestInformation;
	}

	public void setArrestInformation(com.tools20022.repository.msg.ArrestedFunds1 arrestInformation) {
		this.arrestInformation = arrestInformation;
	}

	public List<QueuedTransactionsReport1> getDebitQueuedTransactions() {
		return debitQueuedTransactions;
	}

	public void setDebitQueuedTransactions(List<com.tools20022.repository.msg.QueuedTransactionsReport1> debitQueuedTransactions) {
		this.debitQueuedTransactions = debitQueuedTransactions;
	}

	public List<QueuedTransactionsReport1> getCreditQueuedTransactions() {
		return creditQueuedTransactions;
	}

	public void setCreditQueuedTransactions(List<com.tools20022.repository.msg.QueuedTransactionsReport1> creditQueuedTransactions) {
		this.creditQueuedTransactions = creditQueuedTransactions;
	}
}
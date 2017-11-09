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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.entity.IntraPositionTransfer;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Defines the criteria based on which information is included.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria1#mmReferences
 * IntraBalanceQueryCriteria1.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria1#mmStatus
 * IntraBalanceQueryCriteria1.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria1#mmCashAccountOwner
 * IntraBalanceQueryCriteria1.mmCashAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria1#mmCashAccount
 * IntraBalanceQueryCriteria1.mmCashAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria1#mmBalanceType
 * IntraBalanceQueryCriteria1.mmBalanceType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria1#mmCashSubBalanceIdentification
 * IntraBalanceQueryCriteria1.mmCashSubBalanceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria1#mmSettlementAmount
 * IntraBalanceQueryCriteria1.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria1#mmSettledAmount
 * IntraBalanceQueryCriteria1.mmSettledAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria1#mmSettlementCurrency
 * IntraBalanceQueryCriteria1.mmSettlementCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria1#mmIntendedSettlementDate
 * IntraBalanceQueryCriteria1.mmIntendedSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria1#mmEffectiveSettlementDate
 * IntraBalanceQueryCriteria1.mmEffectiveSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria1#mmPriority
 * IntraBalanceQueryCriteria1.mmPriority}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria1#mmMessageOriginator
 * IntraBalanceQueryCriteria1.mmMessageOriginator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria1#mmCreationDateTime
 * IntraBalanceQueryCriteria1.mmCreationDateTime}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.IntraPositionTransfer
 * IntraPositionTransfer}</li>
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
 * "IntraBalanceQueryCriteria1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria based on which information is included."</li>
 * </ul>
 */
public class IntraBalanceQueryCriteria1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<References36Choice> references;
	/**
	 * Collective reference identifying a set of messages.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.References36Choice
	 * References36Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria1
	 * IntraBalanceQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Refs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "References"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collective reference identifying a set of messages."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReferences = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IntraBalanceQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Refs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "References";
			definition = "Collective reference identifying a set of messages.";
			minOccurs = 0;
			complexType_lazy = () -> References36Choice.mmObject();
		}
	};
	protected IntraBalanceQueryStatus1 status;
	/**
	 * Provides the status of settlement of a transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryStatus1
	 * IntraBalanceQueryStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria1
	 * IntraBalanceQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of settlement of a transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmStatus = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IntraBalanceQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Provides the status of settlement of a transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.IntraBalanceQueryStatus1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SystemPartyIdentification5> cashAccountOwner;
	/**
	 * Party that owns the account.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification5
	 * SystemPartyIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria1
	 * IntraBalanceQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that owns the account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashAccountOwner = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> IntraBalanceQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "CshAcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountOwner";
			definition = "Party that owns the account.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SystemPartyIdentification5.mmObject();
		}
	};
	protected List<AccountIdentificationSearchCriteria2Choice> cashAccount;
	/**
	 * Account in which cash is maintained.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentificationSearchCriteria2Choice
	 * AccountIdentificationSearchCriteria2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria1
	 * IntraBalanceQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account in which cash is maintained."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashAccount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IntraBalanceQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "CshAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccount";
			definition = "Account in which cash is maintained.";
			minOccurs = 0;
			complexType_lazy = () -> AccountIdentificationSearchCriteria2Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.IntraBalanceType1> balanceType;
	/**
	 * Balance to which the amount of money is moved.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceType1
	 * IntraBalanceType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria1
	 * IntraBalanceQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BalTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance to which the amount of money is moved."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBalanceType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IntraBalanceQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "BalTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceType";
			definition = "Balance to which the amount of money is moved.";
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.IntraBalanceType1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.GenericIdentification37> cashSubBalanceIdentification;
	/**
	 * Number identifying a lot constituting the sub-balance.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification37
	 * GenericIdentification37}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria1
	 * IntraBalanceQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshSubBalId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSubBalanceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number identifying a lot constituting the sub-balance."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashSubBalanceIdentification = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> IntraBalanceQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "CshSubBalId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSubBalanceIdentification";
			definition = "Number identifying a lot constituting the sub-balance.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification37.mmObject();
		}
	};
	protected ImpliedCurrencyAmountRangeChoice settlementAmount;
	/**
	 * Total amount of money to be settled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice
	 * ImpliedCurrencyAmountRangeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria1
	 * IntraBalanceQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total amount of money to be settled."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IntraBalanceQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Total amount of money to be settled.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ImpliedCurrencyAmountRangeChoice.mmObject();
		}
	};
	protected ImpliedCurrencyAmountRangeChoice settledAmount;
	/**
	 * Amount of money effectively settled and which will be credited to/debited
	 * from the account owner's cash account. It may differ from the instructed
	 * settlement amount based on market tolerance level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ImpliedCurrencyAmountRangeChoice
	 * ImpliedCurrencyAmountRangeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria1
	 * IntraBalanceQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttldAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettledAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money effectively settled and which will be credited to/debited from the account owner's cash account. It may differ from the instructed settlement amount based on market tolerance level."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettledAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IntraBalanceQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SttldAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettledAmount";
			definition = "Amount of money effectively settled and which will be credited to/debited from the account owner's cash account. It may differ from the instructed settlement amount based on market tolerance level.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ImpliedCurrencyAmountRangeChoice.mmObject();
		}
	};
	protected List<ActiveOrHistoricCurrencyCode> settlementCurrency;
	/**
	 * Currency in which the instructed amount is expressed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria1
	 * IntraBalanceQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency in which the instructed amount is expressed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementCurrency = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IntraBalanceQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "SttlmCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementCurrency";
			definition = "Currency in which the instructed amount is expressed.";
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	protected DateAndDateTimeSearch2Choice intendedSettlementDate;
	/**
	 * Date and time at which the amount of money is intended to be moved.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeSearch2Choice
	 * DateAndDateTimeSearch2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria1
	 * IntraBalanceQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntnddSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntendedSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the amount of money is intended to be moved."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIntendedSettlementDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IntraBalanceQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "IntnddSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntendedSettlementDate";
			definition = "Date and time at which the amount of money is intended to be moved.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeSearch2Choice.mmObject();
		}
	};
	protected DateAndDateTimeSearch2Choice effectiveSettlementDate;
	/**
	 * Date and time at which the amount of money is moved.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeSearch2Choice
	 * DateAndDateTimeSearch2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria1
	 * IntraBalanceQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the amount of money is moved."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEffectiveSettlementDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IntraBalanceQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "FctvSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveSettlementDate";
			definition = "Date and time at which the amount of money is moved.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeSearch2Choice.mmObject();
		}
	};
	protected List<PriorityNumeric1Choice> priority;
	/**
	 * Specifies whether the transaction is to be executed with a high priority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriorityNumeric1Choice
	 * PriorityNumeric1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria1
	 * IntraBalanceQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Priority"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the transaction is to be executed with a high priority."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPriority = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IntraBalanceQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "Prty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Priority";
			definition = "Specifies whether the transaction is to be executed with a high priority.";
			minOccurs = 0;
			complexType_lazy = () -> PriorityNumeric1Choice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SystemPartyIdentification5> messageOriginator;
	/**
	 * Party that originated the message, if other than the sender.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification5
	 * SystemPartyIdentification5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria1
	 * IntraBalanceQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgOrgtr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageOriginator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that originated the message, if other than the sender."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMessageOriginator = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> IntraBalanceQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "MsgOrgtr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageOriginator";
			definition = "Party that originated the message, if other than the sender.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SystemPartyIdentification5.mmObject();
		}
	};
	protected DateAndDateTimeSearch2Choice creationDateTime;
	/**
	 * Specifies the creation date/time of the intra-balance movement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeSearch2Choice
	 * DateAndDateTimeSearch2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.IntraBalanceQueryCriteria1
	 * IntraBalanceQueryCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the creation date/time of the intra-balance movement."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreationDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> IntraBalanceQueryCriteria1.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Specifies the creation date/time of the intra-balance movement.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeSearch2Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(IntraBalanceQueryCriteria1.mmReferences, IntraBalanceQueryCriteria1.mmStatus, IntraBalanceQueryCriteria1.mmCashAccountOwner, IntraBalanceQueryCriteria1.mmCashAccount,
						IntraBalanceQueryCriteria1.mmBalanceType, IntraBalanceQueryCriteria1.mmCashSubBalanceIdentification, IntraBalanceQueryCriteria1.mmSettlementAmount, IntraBalanceQueryCriteria1.mmSettledAmount,
						IntraBalanceQueryCriteria1.mmSettlementCurrency, IntraBalanceQueryCriteria1.mmIntendedSettlementDate, IntraBalanceQueryCriteria1.mmEffectiveSettlementDate, IntraBalanceQueryCriteria1.mmPriority,
						IntraBalanceQueryCriteria1.mmMessageOriginator, IntraBalanceQueryCriteria1.mmCreationDateTime);
				trace_lazy = () -> IntraPositionTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "IntraBalanceQueryCriteria1";
				definition = "Defines the criteria based on which information is included.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<References36Choice> getReferences() {
		return references;
	}

	public void setReferences(List<References36Choice> references) {
		this.references = references;
	}

	public IntraBalanceQueryStatus1 getStatus() {
		return status;
	}

	public void setStatus(com.tools20022.repository.msg.IntraBalanceQueryStatus1 status) {
		this.status = status;
	}

	public List<SystemPartyIdentification5> getCashAccountOwner() {
		return cashAccountOwner;
	}

	public void setCashAccountOwner(List<com.tools20022.repository.msg.SystemPartyIdentification5> cashAccountOwner) {
		this.cashAccountOwner = cashAccountOwner;
	}

	public List<AccountIdentificationSearchCriteria2Choice> getCashAccount() {
		return cashAccount;
	}

	public void setCashAccount(List<AccountIdentificationSearchCriteria2Choice> cashAccount) {
		this.cashAccount = cashAccount;
	}

	public List<IntraBalanceType1> getBalanceType() {
		return balanceType;
	}

	public void setBalanceType(List<com.tools20022.repository.msg.IntraBalanceType1> balanceType) {
		this.balanceType = balanceType;
	}

	public List<GenericIdentification37> getCashSubBalanceIdentification() {
		return cashSubBalanceIdentification;
	}

	public void setCashSubBalanceIdentification(List<com.tools20022.repository.msg.GenericIdentification37> cashSubBalanceIdentification) {
		this.cashSubBalanceIdentification = cashSubBalanceIdentification;
	}

	public ImpliedCurrencyAmountRangeChoice getSettlementAmount() {
		return settlementAmount;
	}

	public void setSettlementAmount(ImpliedCurrencyAmountRangeChoice settlementAmount) {
		this.settlementAmount = settlementAmount;
	}

	public ImpliedCurrencyAmountRangeChoice getSettledAmount() {
		return settledAmount;
	}

	public void setSettledAmount(ImpliedCurrencyAmountRangeChoice settledAmount) {
		this.settledAmount = settledAmount;
	}

	public List<ActiveOrHistoricCurrencyCode> getSettlementCurrency() {
		return settlementCurrency;
	}

	public void setSettlementCurrency(List<ActiveOrHistoricCurrencyCode> settlementCurrency) {
		this.settlementCurrency = settlementCurrency;
	}

	public DateAndDateTimeSearch2Choice getIntendedSettlementDate() {
		return intendedSettlementDate;
	}

	public void setIntendedSettlementDate(DateAndDateTimeSearch2Choice intendedSettlementDate) {
		this.intendedSettlementDate = intendedSettlementDate;
	}

	public DateAndDateTimeSearch2Choice getEffectiveSettlementDate() {
		return effectiveSettlementDate;
	}

	public void setEffectiveSettlementDate(DateAndDateTimeSearch2Choice effectiveSettlementDate) {
		this.effectiveSettlementDate = effectiveSettlementDate;
	}

	public List<PriorityNumeric1Choice> getPriority() {
		return priority;
	}

	public void setPriority(List<PriorityNumeric1Choice> priority) {
		this.priority = priority;
	}

	public List<SystemPartyIdentification5> getMessageOriginator() {
		return messageOriginator;
	}

	public void setMessageOriginator(List<com.tools20022.repository.msg.SystemPartyIdentification5> messageOriginator) {
		this.messageOriginator = messageOriginator;
	}

	public DateAndDateTimeSearch2Choice getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(DateAndDateTimeSearch2Choice creationDateTime) {
		this.creationDateTime = creationDateTime;
	}
}
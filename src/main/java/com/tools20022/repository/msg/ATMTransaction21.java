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
import com.tools20022.repository.datatype.Max10000Binary;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Inquiry information for the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction21#mmTransactionIdentification
 * ATMTransaction21.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction21#mmTransactionResponse
 * ATMTransaction21.mmTransactionResponse}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction21#mmAction
 * ATMTransaction21.mmAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction21#mmCustomerServiceProfile
 * ATMTransaction21.mmCustomerServiceProfile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction21#mmCurrencyConversion
 * ATMTransaction21.mmCurrencyConversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction21#mmAccountInformation
 * ATMTransaction21.mmAccountInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction21#mmAccountStatementData
 * ATMTransaction21.mmAccountStatementData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction21#mmCurrencyExchange
 * ATMTransaction21.mmCurrencyExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ATMTransaction21#mmICCRelatedData
 * ATMTransaction21.mmICCRelatedData}</li>
 * <li>{@linkplain com.tools20022.repository.msg.ATMTransaction21#mmCommand
 * ATMTransaction21.mmCommand}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
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
 * "ATMTransaction21"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Inquiry information for the transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ATMTransaction21", propOrder = {"transactionIdentification", "transactionResponse", "action", "customerServiceProfile", "currencyConversion", "accountInformation", "accountStatementData", "currencyExchange",
		"iCCRelatedData", "command"})
public class ATMTransaction21 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxId", required = true)
	protected TransactionIdentifier1 transactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionIdentifier1
	 * TransactionIdentifier1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmCardPaymentAcquiring
	 * CardPayment.mmCardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction21
	 * ATMTransaction21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the transaction assigned by the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction21, TransactionIdentifier1> mmTransactionIdentification = new MMMessageAssociationEnd<ATMTransaction21, TransactionIdentifier1>() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmCardPaymentAcquiring;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction21.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Identification of the transaction assigned by the ATM.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> TransactionIdentifier1.mmObject();
		}

		@Override
		public TransactionIdentifier1 getValue(ATMTransaction21 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(ATMTransaction21 obj, TransactionIdentifier1 value) {
			obj.setTransactionIdentification(value);
		}
	};
	@XmlElement(name = "TxRspn", required = true)
	protected ResponseType7 transactionResponse;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ResponseType7
	 * ResponseType7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction21
	 * ATMTransaction21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxRspn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionResponse"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Result of the inquiry service."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction21, ResponseType7> mmTransactionResponse = new MMMessageAssociationEnd<ATMTransaction21, ResponseType7>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction21.mmObject();
			isDerived = false;
			xmlTag = "TxRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionResponse";
			definition = "Result of the inquiry service.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ResponseType7.mmObject();
		}

		@Override
		public ResponseType7 getValue(ATMTransaction21 obj) {
			return obj.getTransactionResponse();
		}

		@Override
		public void setValue(ATMTransaction21 obj, ResponseType7 value) {
			obj.setTransactionResponse(value);
		}
	};
	@XmlElement(name = "Actn")
	protected List<Action7> action;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Action7 Action7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction21
	 * ATMTransaction21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Actn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Action"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sequence of actions to be performed by the ATM to complete the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction21, List<Action7>> mmAction = new MMMessageAssociationEnd<ATMTransaction21, List<Action7>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction21.mmObject();
			isDerived = false;
			xmlTag = "Actn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Action";
			definition = "Sequence of actions to be performed by the ATM to complete the transaction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Action7.mmObject();
		}

		@Override
		public List<Action7> getValue(ATMTransaction21 obj) {
			return obj.getAction();
		}

		@Override
		public void setValue(ATMTransaction21 obj, List<Action7> value) {
			obj.setAction(value);
		}
	};
	@XmlElement(name = "CstmrSvcPrfl")
	protected ATMCustomerProfile5 customerServiceProfile;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCustomerProfile5
	 * ATMCustomerProfile5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction21
	 * ATMTransaction21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CstmrSvcPrfl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustomerServiceProfile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Profile of the customer with the allowed services and restrictions."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction21, Optional<ATMCustomerProfile5>> mmCustomerServiceProfile = new MMMessageAssociationEnd<ATMTransaction21, Optional<ATMCustomerProfile5>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction21.mmObject();
			isDerived = false;
			xmlTag = "CstmrSvcPrfl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerServiceProfile";
			definition = "Profile of the customer with the allowed services and restrictions.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCustomerProfile5.mmObject();
		}

		@Override
		public Optional<ATMCustomerProfile5> getValue(ATMTransaction21 obj) {
			return obj.getCustomerServiceProfile();
		}

		@Override
		public void setValue(ATMTransaction21 obj, Optional<ATMCustomerProfile5> value) {
			obj.setCustomerServiceProfile(value.orElse(null));
		}
	};
	@XmlElement(name = "CcyConvs")
	protected CurrencyConversion10 currencyConversion;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyConversion10
	 * CurrencyConversion10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmCurrencyExchange
	 * Payment.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction21
	 * ATMTransaction21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyConvs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyConversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dynamic currency conversion result."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction21, Optional<CurrencyConversion10>> mmCurrencyConversion = new MMMessageAssociationEnd<ATMTransaction21, Optional<CurrencyConversion10>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmCurrencyExchange;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction21.mmObject();
			isDerived = false;
			xmlTag = "CcyConvs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversion";
			definition = "Dynamic currency conversion result.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CurrencyConversion10.mmObject();
		}

		@Override
		public Optional<CurrencyConversion10> getValue(ATMTransaction21 obj) {
			return obj.getCurrencyConversion();
		}

		@Override
		public void setValue(ATMTransaction21 obj, Optional<CurrencyConversion10> value) {
			obj.setCurrencyConversion(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctInf")
	protected List<CardAccount12> accountInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CardAccount12
	 * CardAccount12}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmAccount
	 * Payment.mmAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction21
	 * ATMTransaction21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account information associated to the customer."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction21, List<CardAccount12>> mmAccountInformation = new MMMessageAssociationEnd<ATMTransaction21, List<CardAccount12>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction21.mmObject();
			isDerived = false;
			xmlTag = "AcctInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountInformation";
			definition = "Account information associated to the customer.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CardAccount12.mmObject();
		}

		@Override
		public List<CardAccount12> getValue(ATMTransaction21 obj) {
			return obj.getAccountInformation();
		}

		@Override
		public void setValue(ATMTransaction21 obj, List<CardAccount12> value) {
			obj.setAccountInformation(value);
		}
	};
	@XmlElement(name = "AcctStmtData")
	protected List<ATMAccountStatement1> accountStatementData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMAccountStatement1
	 * ATMAccountStatement1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction21
	 * ATMTransaction21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctStmtData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountStatementData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Statement information of an account."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction21, List<ATMAccountStatement1>> mmAccountStatementData = new MMMessageAssociationEnd<ATMTransaction21, List<ATMAccountStatement1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction21.mmObject();
			isDerived = false;
			xmlTag = "AcctStmtData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountStatementData";
			definition = "Statement information of an account.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMAccountStatement1.mmObject();
		}

		@Override
		public List<ATMAccountStatement1> getValue(ATMTransaction21 obj) {
			return obj.getAccountStatementData();
		}

		@Override
		public void setValue(ATMTransaction21 obj, List<ATMAccountStatement1> value) {
			obj.setAccountStatementData(value);
		}
	};
	@XmlElement(name = "CcyXchg")
	protected CurrencyConversion5 currencyExchange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyConversion5
	 * CurrencyConversion5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmCurrencyExchange
	 * Payment.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction21
	 * ATMTransaction21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CcyXchg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Exchange rate and calculated amount to be presented to the customer when the dispense currency or the deposit currency (target currency) is different to account currency (source currency)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction21, Optional<CurrencyConversion5>> mmCurrencyExchange = new MMMessageAssociationEnd<ATMTransaction21, Optional<CurrencyConversion5>>() {
		{
			businessElementTrace_lazy = () -> Payment.mmCurrencyExchange;
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction21.mmObject();
			isDerived = false;
			xmlTag = "CcyXchg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyExchange";
			definition = "Exchange rate and calculated amount to be presented to the customer when the dispense currency or the deposit currency (target currency) is different to account currency (source currency).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CurrencyConversion5.mmObject();
		}

		@Override
		public Optional<CurrencyConversion5> getValue(ATMTransaction21 obj) {
			return obj.getCurrencyExchange();
		}

		@Override
		public void setValue(ATMTransaction21 obj, Optional<CurrencyConversion5> value) {
			obj.setCurrencyExchange(value.orElse(null));
		}
	};
	@XmlElement(name = "ICCRltdData")
	protected Max10000Binary iCCRelatedData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max10000Binary
	 * Max10000Binary}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction21
	 * ATMTransaction21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ICCRltdData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ICCRelatedData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Sequence of one or more TLV data elements from the ATM application, in accordance with ISO 7816-6, not in a specific order. Present if the transaction is performed with an EMV chip card application."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<ATMTransaction21, Optional<Max10000Binary>> mmICCRelatedData = new MMMessageAttribute<ATMTransaction21, Optional<Max10000Binary>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction21.mmObject();
			isDerived = false;
			xmlTag = "ICCRltdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ICCRelatedData";
			definition = "Sequence of one or more TLV data elements from the ATM application, in accordance with ISO 7816-6, not in a specific order. Present if the transaction is performed with an EMV chip card application.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}

		@Override
		public Optional<Max10000Binary> getValue(ATMTransaction21 obj) {
			return obj.getICCRelatedData();
		}

		@Override
		public void setValue(ATMTransaction21 obj, Optional<Max10000Binary> value) {
			obj.setICCRelatedData(value.orElse(null));
		}
	};
	@XmlElement(name = "Cmd")
	protected List<ATMCommand7> command;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ATMCommand7
	 * ATMCommand7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ATMTransaction21
	 * ATMTransaction21}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cmd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Command"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Maintenance command to perform on the ATM."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ATMTransaction21, List<ATMCommand7>> mmCommand = new MMMessageAssociationEnd<ATMTransaction21, List<ATMCommand7>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ATMTransaction21.mmObject();
			isDerived = false;
			xmlTag = "Cmd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Command";
			definition = "Maintenance command to perform on the ATM.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ATMCommand7.mmObject();
		}

		@Override
		public List<ATMCommand7> getValue(ATMTransaction21 obj) {
			return obj.getCommand();
		}

		@Override
		public void setValue(ATMTransaction21 obj, List<ATMCommand7> value) {
			obj.setCommand(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ATMTransaction21.mmTransactionIdentification, com.tools20022.repository.msg.ATMTransaction21.mmTransactionResponse,
						com.tools20022.repository.msg.ATMTransaction21.mmAction, com.tools20022.repository.msg.ATMTransaction21.mmCustomerServiceProfile, com.tools20022.repository.msg.ATMTransaction21.mmCurrencyConversion,
						com.tools20022.repository.msg.ATMTransaction21.mmAccountInformation, com.tools20022.repository.msg.ATMTransaction21.mmAccountStatementData, com.tools20022.repository.msg.ATMTransaction21.mmCurrencyExchange,
						com.tools20022.repository.msg.ATMTransaction21.mmICCRelatedData, com.tools20022.repository.msg.ATMTransaction21.mmCommand);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMTransaction21";
				definition = "Inquiry information for the transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public TransactionIdentifier1 getTransactionIdentification() {
		return transactionIdentification;
	}

	public ATMTransaction21 setTransactionIdentification(TransactionIdentifier1 transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public ResponseType7 getTransactionResponse() {
		return transactionResponse;
	}

	public ATMTransaction21 setTransactionResponse(ResponseType7 transactionResponse) {
		this.transactionResponse = Objects.requireNonNull(transactionResponse);
		return this;
	}

	public List<Action7> getAction() {
		return action == null ? action = new ArrayList<>() : action;
	}

	public ATMTransaction21 setAction(List<Action7> action) {
		this.action = Objects.requireNonNull(action);
		return this;
	}

	public Optional<ATMCustomerProfile5> getCustomerServiceProfile() {
		return customerServiceProfile == null ? Optional.empty() : Optional.of(customerServiceProfile);
	}

	public ATMTransaction21 setCustomerServiceProfile(ATMCustomerProfile5 customerServiceProfile) {
		this.customerServiceProfile = customerServiceProfile;
		return this;
	}

	public Optional<CurrencyConversion10> getCurrencyConversion() {
		return currencyConversion == null ? Optional.empty() : Optional.of(currencyConversion);
	}

	public ATMTransaction21 setCurrencyConversion(CurrencyConversion10 currencyConversion) {
		this.currencyConversion = currencyConversion;
		return this;
	}

	public List<CardAccount12> getAccountInformation() {
		return accountInformation == null ? accountInformation = new ArrayList<>() : accountInformation;
	}

	public ATMTransaction21 setAccountInformation(List<CardAccount12> accountInformation) {
		this.accountInformation = Objects.requireNonNull(accountInformation);
		return this;
	}

	public List<ATMAccountStatement1> getAccountStatementData() {
		return accountStatementData == null ? accountStatementData = new ArrayList<>() : accountStatementData;
	}

	public ATMTransaction21 setAccountStatementData(List<ATMAccountStatement1> accountStatementData) {
		this.accountStatementData = Objects.requireNonNull(accountStatementData);
		return this;
	}

	public Optional<CurrencyConversion5> getCurrencyExchange() {
		return currencyExchange == null ? Optional.empty() : Optional.of(currencyExchange);
	}

	public ATMTransaction21 setCurrencyExchange(CurrencyConversion5 currencyExchange) {
		this.currencyExchange = currencyExchange;
		return this;
	}

	public Optional<Max10000Binary> getICCRelatedData() {
		return iCCRelatedData == null ? Optional.empty() : Optional.of(iCCRelatedData);
	}

	public ATMTransaction21 setICCRelatedData(Max10000Binary iCCRelatedData) {
		this.iCCRelatedData = iCCRelatedData;
		return this;
	}

	public List<ATMCommand7> getCommand() {
		return command == null ? command = new ArrayList<>() : command;
	}

	public ATMTransaction21 setCommand(List<ATMCommand7> command) {
		this.command = Objects.requireNonNull(command);
		return this;
	}
}
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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ATMTransaction21", propOrder = {"transactionIdentification", "transactionResponse", "action", "customerServiceProfile", "currencyConversion", "accountInformation", "accountStatementData", "currencyExchange",
		"ICCRelatedData", "command"})
public class ATMTransaction21 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected TransactionIdentifier1 transactionIdentification;
	/**
	 * Identification of the transaction assigned by the ATM.
	 * <p>
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
	public static final MMMessageAssociationEnd mmTransactionIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmCardPaymentAcquiring;
			componentContext_lazy = () -> ATMTransaction21.mmObject();
			isDerived = false;
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Identification of the transaction assigned by the ATM.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionIdentifier1.mmObject();
		}
	};
	protected ResponseType7 transactionResponse;
	/**
	 * Result of the inquiry service.
	 * <p>
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
	public static final MMMessageAssociationEnd mmTransactionResponse = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction21.mmObject();
			isDerived = false;
			xmlTag = "TxRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionResponse";
			definition = "Result of the inquiry service.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ResponseType7.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Action7> action;
	/**
	 * Sequence of actions to be performed by the ATM to complete the
	 * transaction.
	 * <p>
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
	public static final MMMessageAssociationEnd mmAction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction21.mmObject();
			isDerived = false;
			xmlTag = "Actn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Action";
			definition = "Sequence of actions to be performed by the ATM to complete the transaction.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Action7.mmObject();
		}
	};
	protected ATMCustomerProfile5 customerServiceProfile;
	/**
	 * Profile of the customer with the allowed services and restrictions.
	 * <p>
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
	public static final MMMessageAssociationEnd mmCustomerServiceProfile = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction21.mmObject();
			isDerived = false;
			xmlTag = "CstmrSvcPrfl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustomerServiceProfile";
			definition = "Profile of the customer with the allowed services and restrictions.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMCustomerProfile5.mmObject();
		}
	};
	protected CurrencyConversion10 currencyConversion;
	/**
	 * Dynamic currency conversion result.
	 * <p>
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
	public static final MMMessageAssociationEnd mmCurrencyConversion = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmCurrencyExchange;
			componentContext_lazy = () -> ATMTransaction21.mmObject();
			isDerived = false;
			xmlTag = "CcyConvs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversion";
			definition = "Dynamic currency conversion result.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CurrencyConversion10.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CardAccount12> accountInformation;
	/**
	 * Account information associated to the customer.
	 * <p>
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
	public static final MMMessageAssociationEnd mmAccountInformation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmAccount;
			componentContext_lazy = () -> ATMTransaction21.mmObject();
			isDerived = false;
			xmlTag = "AcctInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountInformation";
			definition = "Account information associated to the customer.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardAccount12.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ATMAccountStatement1> accountStatementData;
	/**
	 * Statement information of an account.
	 * <p>
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
	public static final MMMessageAssociationEnd mmAccountStatementData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction21.mmObject();
			isDerived = false;
			xmlTag = "AcctStmtData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountStatementData";
			definition = "Statement information of an account.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMAccountStatement1.mmObject();
		}
	};
	protected CurrencyConversion5 currencyExchange;
	/**
	 * Exchange rate and calculated amount to be presented to the customer when
	 * the dispense currency or the deposit currency (target currency) is
	 * different to account currency (source currency).
	 * <p>
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
	public static final MMMessageAssociationEnd mmCurrencyExchange = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmCurrencyExchange;
			componentContext_lazy = () -> ATMTransaction21.mmObject();
			isDerived = false;
			xmlTag = "CcyXchg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyExchange";
			definition = "Exchange rate and calculated amount to be presented to the customer when the dispense currency or the deposit currency (target currency) is different to account currency (source currency).";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CurrencyConversion5.mmObject();
		}
	};
	protected Max10000Binary iCCRelatedData;
	/**
	 * Sequence of one or more TLV data elements from the ATM application, in
	 * accordance with ISO 7816-6, not in a specific order. Present if the
	 * transaction is performed with an EMV chip card application.
	 * <p>
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
	public static final MMMessageAttribute mmICCRelatedData = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> ATMTransaction21.mmObject();
			isDerived = false;
			xmlTag = "ICCRltdData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ICCRelatedData";
			definition = "Sequence of one or more TLV data elements from the ATM application, in accordance with ISO 7816-6, not in a specific order. Present if the transaction is performed with an EMV chip card application.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max10000Binary.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ATMCommand7> command;
	/**
	 * Maintenance command to perform on the ATM.
	 * <p>
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
	public static final MMMessageAssociationEnd mmCommand = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> ATMTransaction21.mmObject();
			isDerived = false;
			xmlTag = "Cmd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Command";
			definition = "Maintenance command to perform on the ATM.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ATMCommand7.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(ATMTransaction21.mmTransactionIdentification, ATMTransaction21.mmTransactionResponse, ATMTransaction21.mmAction, ATMTransaction21.mmCustomerServiceProfile,
						ATMTransaction21.mmCurrencyConversion, ATMTransaction21.mmAccountInformation, ATMTransaction21.mmAccountStatementData, ATMTransaction21.mmCurrencyExchange, ATMTransaction21.mmICCRelatedData,
						ATMTransaction21.mmCommand);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ATMTransaction21";
				definition = "Inquiry information for the transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TxId", required = true)
	public TransactionIdentifier1 getTransactionIdentification() {
		return transactionIdentification;
	}

	public void setTransactionIdentification(com.tools20022.repository.msg.TransactionIdentifier1 transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
	}

	@XmlElement(name = "TxRspn", required = true)
	public ResponseType7 getTransactionResponse() {
		return transactionResponse;
	}

	public void setTransactionResponse(com.tools20022.repository.msg.ResponseType7 transactionResponse) {
		this.transactionResponse = transactionResponse;
	}

	@XmlElement(name = "Actn")
	public List<Action7> getAction() {
		return action;
	}

	public void setAction(List<com.tools20022.repository.msg.Action7> action) {
		this.action = action;
	}

	@XmlElement(name = "CstmrSvcPrfl")
	public ATMCustomerProfile5 getCustomerServiceProfile() {
		return customerServiceProfile;
	}

	public void setCustomerServiceProfile(com.tools20022.repository.msg.ATMCustomerProfile5 customerServiceProfile) {
		this.customerServiceProfile = customerServiceProfile;
	}

	@XmlElement(name = "CcyConvs")
	public CurrencyConversion10 getCurrencyConversion() {
		return currencyConversion;
	}

	public void setCurrencyConversion(com.tools20022.repository.msg.CurrencyConversion10 currencyConversion) {
		this.currencyConversion = currencyConversion;
	}

	@XmlElement(name = "AcctInf")
	public List<CardAccount12> getAccountInformation() {
		return accountInformation;
	}

	public void setAccountInformation(List<com.tools20022.repository.msg.CardAccount12> accountInformation) {
		this.accountInformation = accountInformation;
	}

	@XmlElement(name = "AcctStmtData")
	public List<ATMAccountStatement1> getAccountStatementData() {
		return accountStatementData;
	}

	public void setAccountStatementData(List<com.tools20022.repository.msg.ATMAccountStatement1> accountStatementData) {
		this.accountStatementData = accountStatementData;
	}

	@XmlElement(name = "CcyXchg")
	public CurrencyConversion5 getCurrencyExchange() {
		return currencyExchange;
	}

	public void setCurrencyExchange(com.tools20022.repository.msg.CurrencyConversion5 currencyExchange) {
		this.currencyExchange = currencyExchange;
	}

	@XmlElement(name = "ICCRltdData")
	public Max10000Binary getICCRelatedData() {
		return iCCRelatedData;
	}

	public void setICCRelatedData(Max10000Binary iCCRelatedData) {
		this.iCCRelatedData = iCCRelatedData;
	}

	@XmlElement(name = "Cmd")
	public List<ATMCommand7> getCommand() {
		return command;
	}

	public void setCommand(List<com.tools20022.repository.msg.ATMCommand7> command) {
		this.command = command;
	}
}
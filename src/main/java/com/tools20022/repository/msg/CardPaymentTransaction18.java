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
import com.tools20022.repository.codeset.CurrencyCode;
import com.tools20022.repository.datatype.ImpliedCurrencyAndAmount;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.CardPaymentAcquiring;
import com.tools20022.repository.entity.CashBalance;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Authorisation response from the acquirer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction18#mmAuthorisationResult
 * CardPaymentTransaction18.mmAuthorisationResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction18#mmTransactionVerificationResult
 * CardPaymentTransaction18.mmTransactionVerificationResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction18#mmBalance
 * CardPaymentTransaction18.mmBalance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction18#mmCurrency
 * CardPaymentTransaction18.mmCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction18#mmAction
 * CardPaymentTransaction18.mmAction}</li>
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
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardPaymentTransaction18"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Authorisation response from the acquirer."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CardPaymentTransaction24
 * CardPaymentTransaction24}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction9
 * CardPaymentTransaction9}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CardPaymentTransaction18", propOrder = {"authorisationResult", "transactionVerificationResult", "balance", "currency", "action"})
public class CardPaymentTransaction18 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected AuthorisationResult1 authorisationResult;
	/**
	 * Outcome of the authorisation, and actions to perform.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AuthorisationResult1
	 * AuthorisationResult1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmValidation
	 * CardPaymentAcquiring.mmValidation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction18
	 * CardPaymentTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AuthstnRslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AuthorisationResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Outcome of the authorisation, and actions to perform."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction24#mmAuthorisationResult
	 * CardPaymentTransaction24.mmAuthorisationResult}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAuthorisationResult = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmValidation;
			componentContext_lazy = () -> CardPaymentTransaction18.mmObject();
			isDerived = false;
			xmlTag = "AuthstnRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AuthorisationResult";
			definition = "Outcome of the authorisation, and actions to perform.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction24.mmAuthorisationResult);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AuthorisationResult1.mmObject();
		}
	};
	protected TransactionVerificationResult2 transactionVerificationResult;
	/**
	 * Result of the verifications performed by the issuer to deliver or decline
	 * the authorisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.TransactionVerificationResult2
	 * TransactionVerificationResult2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction18
	 * CardPaymentTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxVrfctnRslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionVerificationResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Result of the verifications performed by the issuer to deliver or decline the authorisation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction24#mmTransactionVerificationResult
	 * CardPaymentTransaction24.mmTransactionVerificationResult}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionVerificationResult = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> CardPaymentTransaction18.mmObject();
			isDerived = false;
			xmlTag = "TxVrfctnRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionVerificationResult";
			definition = "Result of the verifications performed by the issuer to deliver or decline the authorisation.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction24.mmTransactionVerificationResult);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionVerificationResult2.mmObject();
		}
	};
	protected ImpliedCurrencyAndAmount balance;
	/**
	 * Balance of the account, related to the payment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ImpliedCurrencyAndAmount
	 * ImpliedCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashBalance#mmAmount
	 * CashBalance.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction18
	 * CardPaymentTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Bal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Balance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Balance of the account, related to the payment."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction24#mmBalance
	 * CardPaymentTransaction24.mmBalance}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBalance = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashBalance.mmAmount;
			componentContext_lazy = () -> CardPaymentTransaction18.mmObject();
			isDerived = false;
			xmlTag = "Bal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Balance";
			definition = "Balance of the account, related to the payment.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction24.mmBalance);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ImpliedCurrencyAndAmount.mmObject();
		}
	};
	protected CurrencyCode currency;
	/**
	 * Currency associated with the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CurrencyCode
	 * CurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmCurrencyOfTransfer
	 * Payment.mmCurrencyOfTransfer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction18
	 * CardPaymentTransaction18}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ccy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Currency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency associated with the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmCurrencyOfTransfer;
			componentContext_lazy = () -> CardPaymentTransaction18.mmObject();
			isDerived = false;
			xmlTag = "Ccy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Currency";
			definition = "Currency associated with the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyCode.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Action2> action;
	/**
	 * Set of actions to be performed by the POI (Point Of Interaction) system.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Action2 Action2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment#mmCardPaymentAcquiring
	 * CardPayment.mmCardPaymentAcquiring}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction18
	 * CardPaymentTransaction18}</li>
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
	 * "Set of actions to be performed by the POI (Point Of Interaction) system."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction24#mmAction
	 * CardPaymentTransaction24.mmAction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAction = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPayment.mmCardPaymentAcquiring;
			componentContext_lazy = () -> CardPaymentTransaction18.mmObject();
			isDerived = false;
			xmlTag = "Actn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Action";
			definition = "Set of actions to be performed by the POI (Point Of Interaction) system.";
			nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction24.mmAction);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Action2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CardPaymentTransaction18.mmAuthorisationResult, CardPaymentTransaction18.mmTransactionVerificationResult, CardPaymentTransaction18.mmBalance, CardPaymentTransaction18.mmCurrency,
						CardPaymentTransaction18.mmAction);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "CardPaymentTransaction18";
				definition = "Authorisation response from the acquirer.";
				nextVersions_lazy = () -> Arrays.asList(CardPaymentTransaction24.mmObject());
				previousVersion_lazy = () -> CardPaymentTransaction9.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AuthstnRslt", required = true)
	public AuthorisationResult1 getAuthorisationResult() {
		return authorisationResult;
	}

	public void setAuthorisationResult(com.tools20022.repository.msg.AuthorisationResult1 authorisationResult) {
		this.authorisationResult = authorisationResult;
	}

	@XmlElement(name = "TxVrfctnRslt")
	public TransactionVerificationResult2 getTransactionVerificationResult() {
		return transactionVerificationResult;
	}

	public void setTransactionVerificationResult(com.tools20022.repository.msg.TransactionVerificationResult2 transactionVerificationResult) {
		this.transactionVerificationResult = transactionVerificationResult;
	}

	@XmlElement(name = "Bal")
	public ImpliedCurrencyAndAmount getBalance() {
		return balance;
	}

	public void setBalance(ImpliedCurrencyAndAmount balance) {
		this.balance = balance;
	}

	@XmlElement(name = "Ccy")
	public CurrencyCode getCurrency() {
		return currency;
	}

	public void setCurrency(CurrencyCode currency) {
		this.currency = currency;
	}

	@XmlElement(name = "Actn")
	public List<Action2> getAction() {
		return action;
	}

	public void setAction(List<com.tools20022.repository.msg.Action2> action) {
		this.action = action;
	}
}
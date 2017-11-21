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
import com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV01;
import com.tools20022.repository.codeset.Response1Code;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.Payment;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Currencey conversion outcome from the service provider.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse1#mmEnvironment
 * AcceptorCurrencyConversionResponse1.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse1#mmTransaction
 * AcceptorCurrencyConversionResponse1.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse1#mmTransactionResponse
 * AcceptorCurrencyConversionResponse1.mmTransactionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse1#mmCurrencyConversion
 * AcceptorCurrencyConversionResponse1.mmCurrencyConversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CardPayment
 * CardPayment}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionResponseV01#mmCurrencyConversionResponse
 * AcceptorCurrencyConversionResponseV01.mmCurrencyConversionResponse}</li>
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
 * "AcceptorCurrencyConversionResponse1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Currencey conversion outcome from the service provider."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse2
 * AcceptorCurrencyConversionResponse2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AcceptorCurrencyConversionResponse1", propOrder = {"environment", "transaction", "transactionResponse", "currencyConversion"})
public class AcceptorCurrencyConversionResponse1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CardPaymentEnvironment21 environment;
	/**
	 * Environment of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment21
	 * CardPaymentEnvironment21}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse1
	 * AcceptorCurrencyConversionResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Envt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Environment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Environment of the transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse2#mmEnvironment
	 * AcceptorCurrencyConversionResponse2.mmEnvironment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEnvironment = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> AcceptorCurrencyConversionResponse1.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorCurrencyConversionResponse2.mmEnvironment);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment21.mmObject();
		}
	};
	protected CardPaymentTransaction23 transaction;
	/**
	 * Currency conversion of a card payment transaction between an acceptor and
	 * an acquirer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransaction23
	 * CardPaymentTransaction23}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse1
	 * AcceptorCurrencyConversionResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency conversion of a card payment transaction between an acceptor and an acquirer."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse2#mmTransaction
	 * AcceptorCurrencyConversionResponse2.mmTransaction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransaction = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> AcceptorCurrencyConversionResponse1.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Currency conversion of a card payment transaction between an acceptor and an acquirer.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorCurrencyConversionResponse2.mmTransaction);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardPaymentTransaction23.mmObject();
		}
	};
	protected Response1Code transactionResponse;
	/**
	 * Result of the currency conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.Response1Code
	 * Response1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse1
	 * AcceptorCurrencyConversionResponse1}</li>
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
	 * definition} = "Result of the currency conversion."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionResponse = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> AcceptorCurrencyConversionResponse1.mmObject();
			isDerived = false;
			xmlTag = "TxRspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionResponse";
			definition = "Result of the currency conversion.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Response1Code.mmObject();
		}
	};
	protected CurrencyConversion1 currencyConversion;
	/**
	 * Details of the currency conversion.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyConversion1
	 * CurrencyConversion1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmCurrencyExchange
	 * Payment.mmCurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse1
	 * AcceptorCurrencyConversionResponse1}</li>
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
	 * definition} = "Details of the currency conversion."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcceptorCurrencyConversionResponse2#mmCurrencyConversion
	 * AcceptorCurrencyConversionResponse2.mmCurrencyConversion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCurrencyConversion = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmCurrencyExchange;
			componentContext_lazy = () -> AcceptorCurrencyConversionResponse1.mmObject();
			isDerived = false;
			xmlTag = "CcyConvs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrencyConversion";
			definition = "Details of the currency conversion.";
			nextVersions_lazy = () -> Arrays.asList(AcceptorCurrencyConversionResponse2.mmCurrencyConversion);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CurrencyConversion1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AcceptorCurrencyConversionResponse1.mmEnvironment, AcceptorCurrencyConversionResponse1.mmTransaction, AcceptorCurrencyConversionResponse1.mmTransactionResponse,
						AcceptorCurrencyConversionResponse1.mmCurrencyConversion);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcceptorCurrencyConversionResponseV01.mmCurrencyConversionResponse);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorCurrencyConversionResponse1";
				definition = "Currencey conversion outcome from the service provider.";
				nextVersions_lazy = () -> Arrays.asList(AcceptorCurrencyConversionResponse2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Envt", required = true)
	public CardPaymentEnvironment21 getEnvironment() {
		return environment;
	}

	public void setEnvironment(com.tools20022.repository.msg.CardPaymentEnvironment21 environment) {
		this.environment = environment;
	}

	@XmlElement(name = "Tx", required = true)
	public CardPaymentTransaction23 getTransaction() {
		return transaction;
	}

	public void setTransaction(com.tools20022.repository.msg.CardPaymentTransaction23 transaction) {
		this.transaction = transaction;
	}

	@XmlElement(name = "TxRspn", required = true)
	public Response1Code getTransactionResponse() {
		return transactionResponse;
	}

	public void setTransactionResponse(Response1Code transactionResponse) {
		this.transactionResponse = transactionResponse;
	}

	@XmlElement(name = "CcyConvs", required = true)
	public CurrencyConversion1 getCurrencyConversion() {
		return currencyConversion;
	}

	public void setCurrencyConversion(com.tools20022.repository.msg.CurrencyConversion1 currencyConversion) {
		this.currencyConversion = currencyConversion;
	}
}
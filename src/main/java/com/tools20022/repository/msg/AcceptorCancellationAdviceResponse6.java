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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV06;
import com.tools20022.repository.area.caaa.AcceptorCurrencyConversionAdviceResponseV01;
import com.tools20022.repository.entity.CardPayment;
import com.tools20022.repository.entity.CardPaymentAcquiring;
import com.tools20022.repository.entity.CardPaymentValidation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Cancellation advice response from the acquirer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse6#mmEnvironment
 * AcceptorCancellationAdviceResponse6.mmEnvironment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse6#mmTransaction
 * AcceptorCancellationAdviceResponse6.mmTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse6#mmTMSTrigger
 * AcceptorCancellationAdviceResponse6.mmTMSTrigger}</li>
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
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCancellationAdviceResponseV06#mmCancellationAdviceResponse
 * AcceptorCancellationAdviceResponseV06.mmCancellationAdviceResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caaa.AcceptorCurrencyConversionAdviceResponseV01#mmCurrencyConversionAdviceResponse
 * AcceptorCurrencyConversionAdviceResponseV01.
 * mmCurrencyConversionAdviceResponse}</li>
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
 * "AcceptorCancellationAdviceResponse6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Cancellation advice response from the acquirer."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse5
 * AcceptorCancellationAdviceResponse5}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcceptorCancellationAdviceResponse6", propOrder = {"environment", "transaction", "tMSTrigger"})
public class AcceptorCancellationAdviceResponse6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Envt", required = true)
	protected CardPaymentEnvironment65 environment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentEnvironment65
	 * CardPaymentEnvironment65}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPayment CardPayment}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse6
	 * AcceptorCancellationAdviceResponse6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse5#mmEnvironment
	 * AcceptorCancellationAdviceResponse5.mmEnvironment}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEnvironment = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CardPayment.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorCancellationAdviceResponse6.mmObject();
			isDerived = false;
			xmlTag = "Envt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Environment";
			definition = "Environment of the transaction.";
			previousVersion_lazy = () -> AcceptorCancellationAdviceResponse5.mmEnvironment;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardPaymentEnvironment65.mmObject();
		}
	};
	@XmlElement(name = "Tx", required = true)
	protected CardPaymentTransactionAdviceResponse6 transaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse6
	 * CardPaymentTransactionAdviceResponse6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentValidation#mmResponse
	 * CardPaymentValidation.mmResponse}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse6
	 * AcceptorCancellationAdviceResponse6}</li>
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
	 * "Cancellation transaction from an acceptor to the acquirer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse5#mmTransaction
	 * AcceptorCancellationAdviceResponse5.mmTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransaction = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPaymentValidation.mmResponse;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorCancellationAdviceResponse6.mmObject();
			isDerived = false;
			xmlTag = "Tx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transaction";
			definition = "Cancellation transaction from an acceptor to the acquirer.";
			previousVersion_lazy = () -> AcceptorCancellationAdviceResponse5.mmTransaction;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse6.mmObject();
		}
	};
	@XmlElement(name = "TMSTrggr")
	protected TMSTrigger1 tMSTrigger;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TMSTrigger1
	 * TMSTrigger1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CardPaymentAcquiring#mmTMSTrigger
	 * CardPaymentAcquiring.mmTMSTrigger}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse6
	 * AcceptorCancellationAdviceResponse6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TMSTrggr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TMSTrigger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Instructions for contacting the terminal management host."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcceptorCancellationAdviceResponse5#mmTMSTrigger
	 * AcceptorCancellationAdviceResponse5.mmTMSTrigger}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTMSTrigger = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CardPaymentAcquiring.mmTMSTrigger;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptorCancellationAdviceResponse6.mmObject();
			isDerived = false;
			xmlTag = "TMSTrggr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TMSTrigger";
			definition = "Instructions for contacting the terminal management host.";
			previousVersion_lazy = () -> AcceptorCancellationAdviceResponse5.mmTMSTrigger;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TMSTrigger1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptorCancellationAdviceResponse6.mmEnvironment, com.tools20022.repository.msg.AcceptorCancellationAdviceResponse6.mmTransaction,
						com.tools20022.repository.msg.AcceptorCancellationAdviceResponse6.mmTMSTrigger);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcceptorCancellationAdviceResponseV06.mmCancellationAdviceResponse, AcceptorCurrencyConversionAdviceResponseV01.mmCurrencyConversionAdviceResponse);
				trace_lazy = () -> CardPayment.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptorCancellationAdviceResponse6";
				definition = "Cancellation advice response from the acquirer.";
				previousVersion_lazy = () -> AcceptorCancellationAdviceResponse5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public CardPaymentEnvironment65 getEnvironment() {
		return environment;
	}

	public AcceptorCancellationAdviceResponse6 setEnvironment(com.tools20022.repository.msg.CardPaymentEnvironment65 environment) {
		this.environment = Objects.requireNonNull(environment);
		return this;
	}

	public CardPaymentTransactionAdviceResponse6 getTransaction() {
		return transaction;
	}

	public AcceptorCancellationAdviceResponse6 setTransaction(com.tools20022.repository.msg.CardPaymentTransactionAdviceResponse6 transaction) {
		this.transaction = Objects.requireNonNull(transaction);
		return this;
	}

	public Optional<TMSTrigger1> getTMSTrigger() {
		return tMSTrigger == null ? Optional.empty() : Optional.of(tMSTrigger);
	}

	public AcceptorCancellationAdviceResponse6 setTMSTrigger(com.tools20022.repository.msg.TMSTrigger1 tMSTrigger) {
		this.tMSTrigger = tMSTrigger;
		return this;
	}
}
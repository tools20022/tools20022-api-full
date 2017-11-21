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
import com.tools20022.repository.choice.PaymentIdentification4Choice;
import com.tools20022.repository.entity.PaymentInstruction;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Contains the requested modifications.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionModification2#mmPaymentIdentification
 * TransactionModification2.mmPaymentIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TransactionModification2#mmNewPaymentValueSet
 * TransactionModification2.mmNewPaymentValueSet}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PaymentInstruction
 * PaymentInstruction}</li>
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
 * "TransactionModification2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Contains the requested modifications. "</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TransactionModification3
 * TransactionModification3}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TransactionModification2", propOrder = {"paymentIdentification", "newPaymentValueSet"})
public class TransactionModification2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected PaymentIdentification4Choice paymentIdentification;
	/**
	 * Reference to the instruction related to the payment for which a
	 * modification is requested.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PaymentIdentification4Choice
	 * PaymentIdentification4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionModification2
	 * TransactionModification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PmtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PaymentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the instruction related to the payment for which a modification is requested."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionModification3#mmPaymentIdentification
	 * TransactionModification3.mmPaymentIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPaymentIdentification = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> TransactionModification2.mmObject();
			isDerived = false;
			xmlTag = "PmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PaymentIdentification";
			definition = "Reference to the instruction related to the payment for which a modification is requested.";
			nextVersions_lazy = () -> Arrays.asList(TransactionModification3.mmPaymentIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PaymentIdentification4Choice.mmObject();
		}
	};
	protected PaymentInstruction2 newPaymentValueSet;
	/**
	 * New payment values.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentInstruction2
	 * PaymentInstruction2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentInstruction
	 * PaymentInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TransactionModification2
	 * TransactionModification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewPmtValSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewPaymentValueSet"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "New payment values."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TransactionModification3#mmNewPaymentValueSet
	 * TransactionModification3.mmNewPaymentValueSet}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNewPaymentValueSet = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PaymentInstruction.mmObject();
			componentContext_lazy = () -> TransactionModification2.mmObject();
			isDerived = false;
			xmlTag = "NewPmtValSet";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewPaymentValueSet";
			definition = "New payment values.";
			nextVersions_lazy = () -> Arrays.asList(TransactionModification3.mmNewPaymentValueSet);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentInstruction2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TransactionModification2.mmPaymentIdentification, TransactionModification2.mmNewPaymentValueSet);
				trace_lazy = () -> PaymentInstruction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TransactionModification2";
				definition = "Contains the requested modifications. ";
				nextVersions_lazy = () -> Arrays.asList(TransactionModification3.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PmtId", required = true)
	public PaymentIdentification4Choice getPaymentIdentification() {
		return paymentIdentification;
	}

	public void setPaymentIdentification(PaymentIdentification4Choice paymentIdentification) {
		this.paymentIdentification = paymentIdentification;
	}

	@XmlElement(name = "NewPmtValSet", required = true)
	public PaymentInstruction2 getNewPaymentValueSet() {
		return newPaymentValueSet;
	}

	public void setNewPaymentValueSet(com.tools20022.repository.msg.PaymentInstruction2 newPaymentValueSet) {
		this.newPaymentValueSet = newPaymentValueSet;
	}
}
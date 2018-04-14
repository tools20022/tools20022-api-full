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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.Presentation;
import com.tools20022.repository.entity.Undertaking;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details related to the local undertaking.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking11#mmNewUndertakingAmount
 * Undertaking11.mmNewUndertakingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking11#mmNewExpiryDetails
 * Undertaking11.mmNewExpiryDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Undertaking11#mmNewBeneficiary
 * Undertaking11.mmNewBeneficiary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking11#mmNewUndertakingTermsAndConditions
 * Undertaking11.mmNewUndertakingTermsAndConditions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Undertaking11#mmDeliveryChannel
 * Undertaking11.mmDeliveryChannel}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Undertaking
 * Undertaking}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Undertaking11"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details related to the local undertaking."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Undertaking11", propOrder = {"newUndertakingAmount", "newExpiryDetails", "newBeneficiary", "newUndertakingTermsAndConditions", "deliveryChannel"})
public class Undertaking11 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NewUdrtkgAmt")
	protected UndertakingAmount2 newUndertakingAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingAmount2
	 * UndertakingAmount2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUndertakingAmount
	 * Undertaking.mmUndertakingAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking11 Undertaking11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewUdrtkgAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewUndertakingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to the requested new amount for the local undertaking."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking11, Optional<UndertakingAmount2>> mmNewUndertakingAmount = new MMMessageAttribute<Undertaking11, Optional<UndertakingAmount2>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmUndertakingAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking11.mmObject();
			isDerived = false;
			xmlTag = "NewUdrtkgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewUndertakingAmount";
			definition = "Details related to the requested new amount for the local undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UndertakingAmount2.mmObject();
		}

		@Override
		public Optional<UndertakingAmount2> getValue(Undertaking11 obj) {
			return obj.getNewUndertakingAmount();
		}

		@Override
		public void setValue(Undertaking11 obj, Optional<UndertakingAmount2> value) {
			obj.setNewUndertakingAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "NewXpryDtls")
	protected ExpiryDetails1 newExpiryDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.ExpiryDetails1
	 * ExpiryDetails1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmExpiry
	 * Undertaking.mmExpiry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking11 Undertaking11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewXpryDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewExpiryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to the requested new expiry terms for the local undertaking."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking11, Optional<ExpiryDetails1>> mmNewExpiryDetails = new MMMessageAttribute<Undertaking11, Optional<ExpiryDetails1>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmExpiry;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking11.mmObject();
			isDerived = false;
			xmlTag = "NewXpryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewExpiryDetails";
			definition = "Details related to the requested new expiry terms for the local undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ExpiryDetails1.mmObject();
		}

		@Override
		public Optional<ExpiryDetails1> getValue(Undertaking11 obj) {
			return obj.getNewExpiryDetails();
		}

		@Override
		public void setValue(Undertaking11 obj, Optional<ExpiryDetails1> value) {
			obj.setNewExpiryDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "NewBnfcry")
	protected PartyIdentification43 newBeneficiary;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification43
	 * PartyIdentification43}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking11 Undertaking11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewBnfcry"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewBeneficiary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to the requested new beneficiary for the local undertaking."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking11, Optional<PartyIdentification43>> mmNewBeneficiary = new MMMessageAttribute<Undertaking11, Optional<PartyIdentification43>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking11.mmObject();
			isDerived = false;
			xmlTag = "NewBnfcry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewBeneficiary";
			definition = "Details related to the requested new beneficiary for the local undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification43.mmObject();
		}

		@Override
		public Optional<PartyIdentification43> getValue(Undertaking11 obj) {
			return obj.getNewBeneficiary();
		}

		@Override
		public void setValue(Undertaking11 obj, Optional<PartyIdentification43> value) {
			obj.setNewBeneficiary(value.orElse(null));
		}
	};
	@XmlElement(name = "NewUdrtkgTermsAndConds")
	protected Narrative1 newUndertakingTermsAndConditions;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Narrative1
	 * Narrative1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking11 Undertaking11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewUdrtkgTermsAndConds"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewUndertakingTermsAndConditions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to the requested new terms and conditions for the local undertaking."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking11, Optional<Narrative1>> mmNewUndertakingTermsAndConditions = new MMMessageAttribute<Undertaking11, Optional<Narrative1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking11.mmObject();
			isDerived = false;
			xmlTag = "NewUdrtkgTermsAndConds";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewUndertakingTermsAndConditions";
			definition = "Details related to the requested new terms and conditions for the local undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Narrative1.mmObject();
		}

		@Override
		public Optional<Narrative1> getValue(Undertaking11 obj) {
			return obj.getNewUndertakingTermsAndConditions();
		}

		@Override
		public void setValue(Undertaking11 obj, Optional<Narrative1> value) {
			obj.setNewUndertakingTermsAndConditions(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvryChanl")
	protected CommunicationChannel1 deliveryChannel;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationChannel1
	 * CommunicationChannel1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Presentation#mmCommunicationMethod
	 * Presentation.mmCommunicationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Undertaking11 Undertaking11}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryChanl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryChannel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to the delivery channel for the amended local undertaking."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Undertaking11, Optional<CommunicationChannel1>> mmDeliveryChannel = new MMMessageAttribute<Undertaking11, Optional<CommunicationChannel1>>() {
		{
			businessElementTrace_lazy = () -> Presentation.mmCommunicationMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.Undertaking11.mmObject();
			isDerived = false;
			xmlTag = "DlvryChanl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryChannel";
			definition = "Details related to the delivery channel for the amended local undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CommunicationChannel1.mmObject();
		}

		@Override
		public Optional<CommunicationChannel1> getValue(Undertaking11 obj) {
			return obj.getDeliveryChannel();
		}

		@Override
		public void setValue(Undertaking11 obj, Optional<CommunicationChannel1> value) {
			obj.setDeliveryChannel(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Undertaking11.mmNewUndertakingAmount, com.tools20022.repository.msg.Undertaking11.mmNewExpiryDetails,
						com.tools20022.repository.msg.Undertaking11.mmNewBeneficiary, com.tools20022.repository.msg.Undertaking11.mmNewUndertakingTermsAndConditions, com.tools20022.repository.msg.Undertaking11.mmDeliveryChannel);
				trace_lazy = () -> Undertaking.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Undertaking11";
				definition = "Details related to the local undertaking.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<UndertakingAmount2> getNewUndertakingAmount() {
		return newUndertakingAmount == null ? Optional.empty() : Optional.of(newUndertakingAmount);
	}

	public Undertaking11 setNewUndertakingAmount(UndertakingAmount2 newUndertakingAmount) {
		this.newUndertakingAmount = newUndertakingAmount;
		return this;
	}

	public Optional<ExpiryDetails1> getNewExpiryDetails() {
		return newExpiryDetails == null ? Optional.empty() : Optional.of(newExpiryDetails);
	}

	public Undertaking11 setNewExpiryDetails(ExpiryDetails1 newExpiryDetails) {
		this.newExpiryDetails = newExpiryDetails;
		return this;
	}

	public Optional<PartyIdentification43> getNewBeneficiary() {
		return newBeneficiary == null ? Optional.empty() : Optional.of(newBeneficiary);
	}

	public Undertaking11 setNewBeneficiary(PartyIdentification43 newBeneficiary) {
		this.newBeneficiary = newBeneficiary;
		return this;
	}

	public Optional<Narrative1> getNewUndertakingTermsAndConditions() {
		return newUndertakingTermsAndConditions == null ? Optional.empty() : Optional.of(newUndertakingTermsAndConditions);
	}

	public Undertaking11 setNewUndertakingTermsAndConditions(Narrative1 newUndertakingTermsAndConditions) {
		this.newUndertakingTermsAndConditions = newUndertakingTermsAndConditions;
		return this;
	}

	public Optional<CommunicationChannel1> getDeliveryChannel() {
		return deliveryChannel == null ? Optional.empty() : Optional.of(deliveryChannel);
	}

	public Undertaking11 setDeliveryChannel(CommunicationChannel1 deliveryChannel) {
		this.deliveryChannel = deliveryChannel;
		return this;
	}
}
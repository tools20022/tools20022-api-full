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
import com.tools20022.repository.area.tsrv.UndertakingAmendmentAdviceV01;
import com.tools20022.repository.entity.AmendmentOfUndertaking;
import com.tools20022.repository.entity.Undertaking;
import com.tools20022.repository.entity.UndertakingAdvisingParty;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AdvisingPartyAdditionalInformation1;
import com.tools20022.repository.msg.PartyAndSignature2;
import com.tools20022.repository.msg.UndertakingAmendmentMessage1;
import com.tools20022.repository.msg.UndertakingConfirmation1;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the amendment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment2#mmUndertakingAmendmentMessage
 * Amendment2.mmUndertakingAmendmentMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment2#mmFirstAdvisingPartyAdditionalInformation
 * Amendment2.mmFirstAdvisingPartyAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment2#mmSecondAdvisingPartyAdditionalInformation
 * Amendment2.mmSecondAdvisingPartyAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment2#mmConfirmationDetails
 * Amendment2.mmConfirmationDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Amendment2#mmDigitalSignature
 * Amendment2.mmDigitalSignature}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking
 * AmendmentOfUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingAmendmentAdviceV01#mmUndertakingAmendmentAdviceDetails
 * UndertakingAmendmentAdviceV01.mmUndertakingAmendmentAdviceDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Amendment2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the amendment."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Amendment2", propOrder = {"undertakingAmendmentMessage", "firstAdvisingPartyAdditionalInformation", "secondAdvisingPartyAdditionalInformation", "confirmationDetails", "digitalSignature"})
public class Amendment2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "UdrtkgAmdmntMsg", required = true)
	protected UndertakingAmendmentMessage1 undertakingAmendmentMessage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingAmendmentMessage1
	 * UndertakingAmendmentMessage1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking
	 * AmendmentOfUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment2
	 * Amendment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UdrtkgAmdmntMsg"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingAmendmentMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contents of the related Undertaking Amendment message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Amendment2, UndertakingAmendmentMessage1> mmUndertakingAmendmentMessage = new MMMessageAssociationEnd<Amendment2, UndertakingAmendmentMessage1>() {
		{
			businessComponentTrace_lazy = () -> AmendmentOfUndertaking.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment2.mmObject();
			isDerived = false;
			xmlTag = "UdrtkgAmdmntMsg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingAmendmentMessage";
			definition = "Contents of the related Undertaking Amendment message.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> UndertakingAmendmentMessage1.mmObject();
		}

		@Override
		public UndertakingAmendmentMessage1 getValue(Amendment2 obj) {
			return obj.getUndertakingAmendmentMessage();
		}

		@Override
		public void setValue(Amendment2 obj, UndertakingAmendmentMessage1 value) {
			obj.setUndertakingAmendmentMessage(value);
		}
	};
	@XmlElement(name = "FrstAdvsgPtyAddtlInf")
	protected AdvisingPartyAdditionalInformation1 firstAdvisingPartyAdditionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdvisingPartyAdditionalInformation1
	 * AdvisingPartyAdditionalInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingAdvisingParty
	 * UndertakingAdvisingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment2
	 * Amendment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrstAdvsgPtyAddtlInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstAdvisingPartyAdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information related to the first advising party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Amendment2, Optional<AdvisingPartyAdditionalInformation1>> mmFirstAdvisingPartyAdditionalInformation = new MMMessageAttribute<Amendment2, Optional<AdvisingPartyAdditionalInformation1>>() {
		{
			businessComponentTrace_lazy = () -> UndertakingAdvisingParty.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment2.mmObject();
			isDerived = false;
			xmlTag = "FrstAdvsgPtyAddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstAdvisingPartyAdditionalInformation";
			definition = "Additional information related to the first advising party.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdvisingPartyAdditionalInformation1.mmObject();
		}

		@Override
		public Optional<AdvisingPartyAdditionalInformation1> getValue(Amendment2 obj) {
			return obj.getFirstAdvisingPartyAdditionalInformation();
		}

		@Override
		public void setValue(Amendment2 obj, Optional<AdvisingPartyAdditionalInformation1> value) {
			obj.setFirstAdvisingPartyAdditionalInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "ScndAdvsgPtyAddtlInf")
	protected AdvisingPartyAdditionalInformation1 secondAdvisingPartyAdditionalInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdvisingPartyAdditionalInformation1
	 * AdvisingPartyAdditionalInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingAdvisingParty
	 * UndertakingAdvisingParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment2
	 * Amendment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndAdvsgPtyAddtlInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondAdvisingPartyAdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information related to the second advising party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Amendment2, Optional<AdvisingPartyAdditionalInformation1>> mmSecondAdvisingPartyAdditionalInformation = new MMMessageAttribute<Amendment2, Optional<AdvisingPartyAdditionalInformation1>>() {
		{
			businessComponentTrace_lazy = () -> UndertakingAdvisingParty.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment2.mmObject();
			isDerived = false;
			xmlTag = "ScndAdvsgPtyAddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondAdvisingPartyAdditionalInformation";
			definition = "Additional information related to the second advising party.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdvisingPartyAdditionalInformation1.mmObject();
		}

		@Override
		public Optional<AdvisingPartyAdditionalInformation1> getValue(Amendment2 obj) {
			return obj.getSecondAdvisingPartyAdditionalInformation();
		}

		@Override
		public void setValue(Amendment2 obj, Optional<AdvisingPartyAdditionalInformation1> value) {
			obj.setSecondAdvisingPartyAdditionalInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "ConfDtls")
	protected UndertakingConfirmation1 confirmationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingConfirmation1
	 * UndertakingConfirmation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking#mmUndertaking
	 * AmendmentOfUndertaking.mmUndertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment2
	 * Amendment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details concerning the confirmation of the proposed amendment."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Amendment2, Optional<UndertakingConfirmation1>> mmConfirmationDetails = new MMMessageAssociationEnd<Amendment2, Optional<UndertakingConfirmation1>>() {
		{
			businessElementTrace_lazy = () -> AmendmentOfUndertaking.mmUndertaking;
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment2.mmObject();
			isDerived = false;
			xmlTag = "ConfDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationDetails";
			definition = "Details concerning the confirmation of the proposed amendment.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UndertakingConfirmation1.mmObject();
		}

		@Override
		public Optional<UndertakingConfirmation1> getValue(Amendment2 obj) {
			return obj.getConfirmationDetails();
		}

		@Override
		public void setValue(Amendment2 obj, Optional<UndertakingConfirmation1> value) {
			obj.setConfirmationDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "DgtlSgntr")
	protected List<PartyAndSignature2> digitalSignature;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PartyAndSignature2
	 * PartyAndSignature2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmElectronicSignature
	 * Undertaking.mmElectronicSignature}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment2
	 * Amendment2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DgtlSgntr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DigitalSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Digital signature of the party providing additional undertaking amendment advice details."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Amendment2, List<PartyAndSignature2>> mmDigitalSignature = new MMMessageAssociationEnd<Amendment2, List<PartyAndSignature2>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmElectronicSignature;
			componentContext_lazy = () -> com.tools20022.repository.msg.Amendment2.mmObject();
			isDerived = false;
			xmlTag = "DgtlSgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigitalSignature";
			definition = "Digital signature of the party providing additional undertaking amendment advice details.";
			maxOccurs = 3;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyAndSignature2.mmObject();
		}

		@Override
		public List<PartyAndSignature2> getValue(Amendment2 obj) {
			return obj.getDigitalSignature();
		}

		@Override
		public void setValue(Amendment2 obj, List<PartyAndSignature2> value) {
			obj.setDigitalSignature(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Amendment2.mmUndertakingAmendmentMessage, com.tools20022.repository.msg.Amendment2.mmFirstAdvisingPartyAdditionalInformation,
						com.tools20022.repository.msg.Amendment2.mmSecondAdvisingPartyAdditionalInformation, com.tools20022.repository.msg.Amendment2.mmConfirmationDetails, com.tools20022.repository.msg.Amendment2.mmDigitalSignature);
				messageBuildingBlock_lazy = () -> Arrays.asList(UndertakingAmendmentAdviceV01.mmUndertakingAmendmentAdviceDetails);
				trace_lazy = () -> AmendmentOfUndertaking.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Amendment2";
				definition = "Details of the amendment.";
			}
		});
		return mmObject_lazy.get();
	}

	public UndertakingAmendmentMessage1 getUndertakingAmendmentMessage() {
		return undertakingAmendmentMessage;
	}

	public Amendment2 setUndertakingAmendmentMessage(UndertakingAmendmentMessage1 undertakingAmendmentMessage) {
		this.undertakingAmendmentMessage = Objects.requireNonNull(undertakingAmendmentMessage);
		return this;
	}

	public Optional<AdvisingPartyAdditionalInformation1> getFirstAdvisingPartyAdditionalInformation() {
		return firstAdvisingPartyAdditionalInformation == null ? Optional.empty() : Optional.of(firstAdvisingPartyAdditionalInformation);
	}

	public Amendment2 setFirstAdvisingPartyAdditionalInformation(AdvisingPartyAdditionalInformation1 firstAdvisingPartyAdditionalInformation) {
		this.firstAdvisingPartyAdditionalInformation = firstAdvisingPartyAdditionalInformation;
		return this;
	}

	public Optional<AdvisingPartyAdditionalInformation1> getSecondAdvisingPartyAdditionalInformation() {
		return secondAdvisingPartyAdditionalInformation == null ? Optional.empty() : Optional.of(secondAdvisingPartyAdditionalInformation);
	}

	public Amendment2 setSecondAdvisingPartyAdditionalInformation(AdvisingPartyAdditionalInformation1 secondAdvisingPartyAdditionalInformation) {
		this.secondAdvisingPartyAdditionalInformation = secondAdvisingPartyAdditionalInformation;
		return this;
	}

	public Optional<UndertakingConfirmation1> getConfirmationDetails() {
		return confirmationDetails == null ? Optional.empty() : Optional.of(confirmationDetails);
	}

	public Amendment2 setConfirmationDetails(UndertakingConfirmation1 confirmationDetails) {
		this.confirmationDetails = confirmationDetails;
		return this;
	}

	public List<PartyAndSignature2> getDigitalSignature() {
		return digitalSignature == null ? digitalSignature = new ArrayList<>() : digitalSignature;
	}

	public Amendment2 setDigitalSignature(List<PartyAndSignature2> digitalSignature) {
		this.digitalSignature = Objects.requireNonNull(digitalSignature);
		return this;
	}
}
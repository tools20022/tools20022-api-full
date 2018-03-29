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
import com.tools20022.repository.area.tsrv.UndertakingIssuanceAdviceV01;
import com.tools20022.repository.entity.Undertaking;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AdvisingPartyAdditionalInformation1;
import com.tools20022.repository.msg.PartyAndSignature2;
import com.tools20022.repository.msg.UndertakingConfirmation1;
import com.tools20022.repository.msg.UndertakingIssuanceMessage;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the advice for the issuance of an undertaking.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice1#mmUndertakingIssuanceMessage
 * UndertakingAdvice1.mmUndertakingIssuanceMessage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice1#mmFirstAdvisingPartyAdditionalInformation
 * UndertakingAdvice1.mmFirstAdvisingPartyAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice1#mmSecondAdvisingPartyAdditionalInformation
 * UndertakingAdvice1.mmSecondAdvisingPartyAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice1#mmConfirmationDetails
 * UndertakingAdvice1.mmConfirmationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice1#mmDigitalSignature
 * UndertakingAdvice1.mmDigitalSignature}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Undertaking
 * Undertaking}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingIssuanceAdviceV01#mmUndertakingIssuanceAdviceDetails
 * UndertakingIssuanceAdviceV01.mmUndertakingIssuanceAdviceDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintIssuanceTypeRule#forUndertakingAdvice1
 * ConstraintIssuanceTypeRule.forUndertakingAdvice1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintApplicant1Rule#forUndertakingAdvice1
 * ConstraintApplicant1Rule.forUndertakingAdvice1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRequestedLocalUndertakingRule#forUndertakingAdvice1
 * ConstraintRequestedLocalUndertakingRule.forUndertakingAdvice1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "UndertakingAdvice1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the advice for the issuance of an undertaking."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "UndertakingAdvice1", propOrder = {"undertakingIssuanceMessage", "firstAdvisingPartyAdditionalInformation", "secondAdvisingPartyAdditionalInformation", "confirmationDetails", "digitalSignature"})
public class UndertakingAdvice1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "UdrtkgIssncMsg", required = true)
	protected UndertakingIssuanceMessage undertakingIssuanceMessage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingIssuanceMessage
	 * UndertakingIssuanceMessage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking Undertaking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice1
	 * UndertakingAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UdrtkgIssncMsg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UndertakingIssuanceMessage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Contents of the related UndertakingIssuance message."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UndertakingAdvice1, UndertakingIssuanceMessage> mmUndertakingIssuanceMessage = new MMMessageAssociationEnd<UndertakingAdvice1, UndertakingIssuanceMessage>() {
		{
			businessComponentTrace_lazy = () -> Undertaking.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingAdvice1.mmObject();
			isDerived = false;
			xmlTag = "UdrtkgIssncMsg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingIssuanceMessage";
			definition = "Contents of the related UndertakingIssuance message.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> UndertakingIssuanceMessage.mmObject();
		}

		@Override
		public UndertakingIssuanceMessage getValue(UndertakingAdvice1 obj) {
			return obj.getUndertakingIssuanceMessage();
		}

		@Override
		public void setValue(UndertakingAdvice1 obj, UndertakingIssuanceMessage value) {
			obj.setUndertakingIssuanceMessage(value);
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice1
	 * UndertakingAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrstAdvsgPtyAddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstAdvisingPartyAdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information related to the first advising party."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UndertakingAdvice1, Optional<AdvisingPartyAdditionalInformation1>> mmFirstAdvisingPartyAdditionalInformation = new MMMessageAttribute<UndertakingAdvice1, Optional<AdvisingPartyAdditionalInformation1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingAdvice1.mmObject();
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
		public Optional<AdvisingPartyAdditionalInformation1> getValue(UndertakingAdvice1 obj) {
			return obj.getFirstAdvisingPartyAdditionalInformation();
		}

		@Override
		public void setValue(UndertakingAdvice1 obj, Optional<AdvisingPartyAdditionalInformation1> value) {
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice1
	 * UndertakingAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScndAdvsgPtyAddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecondAdvisingPartyAdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information related to the second advising party."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<UndertakingAdvice1, Optional<AdvisingPartyAdditionalInformation1>> mmSecondAdvisingPartyAdditionalInformation = new MMMessageAttribute<UndertakingAdvice1, Optional<AdvisingPartyAdditionalInformation1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingAdvice1.mmObject();
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
		public Optional<AdvisingPartyAdditionalInformation1> getValue(UndertakingAdvice1 obj) {
			return obj.getSecondAdvisingPartyAdditionalInformation();
		}

		@Override
		public void setValue(UndertakingAdvice1 obj, Optional<AdvisingPartyAdditionalInformation1> value) {
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice1
	 * UndertakingAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details related to the confirmation of the undertaking."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UndertakingAdvice1, Optional<UndertakingConfirmation1>> mmConfirmationDetails = new MMMessageAssociationEnd<UndertakingAdvice1, Optional<UndertakingConfirmation1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingAdvice1.mmObject();
			isDerived = false;
			xmlTag = "ConfDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationDetails";
			definition = "Details related to the confirmation of the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> UndertakingConfirmation1.mmObject();
		}

		@Override
		public Optional<UndertakingConfirmation1> getValue(UndertakingAdvice1 obj) {
			return obj.getConfirmationDetails();
		}

		@Override
		public void setValue(UndertakingAdvice1 obj, Optional<UndertakingConfirmation1> value) {
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UndertakingAdvice1
	 * UndertakingAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DgtlSgntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DigitalSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Digital signature of the party providing additional undertaking advice details."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<UndertakingAdvice1, List<PartyAndSignature2>> mmDigitalSignature = new MMMessageAssociationEnd<UndertakingAdvice1, List<PartyAndSignature2>>() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmElectronicSignature;
			componentContext_lazy = () -> com.tools20022.repository.msg.UndertakingAdvice1.mmObject();
			isDerived = false;
			xmlTag = "DgtlSgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigitalSignature";
			definition = "Digital signature of the party providing additional undertaking advice details.";
			maxOccurs = 3;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyAndSignature2.mmObject();
		}

		@Override
		public List<PartyAndSignature2> getValue(UndertakingAdvice1 obj) {
			return obj.getDigitalSignature();
		}

		@Override
		public void setValue(UndertakingAdvice1 obj, List<PartyAndSignature2> value) {
			obj.setDigitalSignature(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UndertakingAdvice1.mmUndertakingIssuanceMessage, com.tools20022.repository.msg.UndertakingAdvice1.mmFirstAdvisingPartyAdditionalInformation,
						com.tools20022.repository.msg.UndertakingAdvice1.mmSecondAdvisingPartyAdditionalInformation, com.tools20022.repository.msg.UndertakingAdvice1.mmConfirmationDetails,
						com.tools20022.repository.msg.UndertakingAdvice1.mmDigitalSignature);
				messageBuildingBlock_lazy = () -> Arrays.asList(UndertakingIssuanceAdviceV01.mmUndertakingIssuanceAdviceDetails);
				trace_lazy = () -> Undertaking.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintIssuanceTypeRule.forUndertakingAdvice1, com.tools20022.repository.constraints.ConstraintApplicant1Rule.forUndertakingAdvice1,
						com.tools20022.repository.constraints.ConstraintRequestedLocalUndertakingRule.forUndertakingAdvice1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UndertakingAdvice1";
				definition = "Details of the advice for the issuance of an undertaking.";
			}
		});
		return mmObject_lazy.get();
	}

	public UndertakingIssuanceMessage getUndertakingIssuanceMessage() {
		return undertakingIssuanceMessage;
	}

	public UndertakingAdvice1 setUndertakingIssuanceMessage(UndertakingIssuanceMessage undertakingIssuanceMessage) {
		this.undertakingIssuanceMessage = Objects.requireNonNull(undertakingIssuanceMessage);
		return this;
	}

	public Optional<AdvisingPartyAdditionalInformation1> getFirstAdvisingPartyAdditionalInformation() {
		return firstAdvisingPartyAdditionalInformation == null ? Optional.empty() : Optional.of(firstAdvisingPartyAdditionalInformation);
	}

	public UndertakingAdvice1 setFirstAdvisingPartyAdditionalInformation(AdvisingPartyAdditionalInformation1 firstAdvisingPartyAdditionalInformation) {
		this.firstAdvisingPartyAdditionalInformation = firstAdvisingPartyAdditionalInformation;
		return this;
	}

	public Optional<AdvisingPartyAdditionalInformation1> getSecondAdvisingPartyAdditionalInformation() {
		return secondAdvisingPartyAdditionalInformation == null ? Optional.empty() : Optional.of(secondAdvisingPartyAdditionalInformation);
	}

	public UndertakingAdvice1 setSecondAdvisingPartyAdditionalInformation(AdvisingPartyAdditionalInformation1 secondAdvisingPartyAdditionalInformation) {
		this.secondAdvisingPartyAdditionalInformation = secondAdvisingPartyAdditionalInformation;
		return this;
	}

	public Optional<UndertakingConfirmation1> getConfirmationDetails() {
		return confirmationDetails == null ? Optional.empty() : Optional.of(confirmationDetails);
	}

	public UndertakingAdvice1 setConfirmationDetails(UndertakingConfirmation1 confirmationDetails) {
		this.confirmationDetails = confirmationDetails;
		return this;
	}

	public List<PartyAndSignature2> getDigitalSignature() {
		return digitalSignature == null ? digitalSignature = new ArrayList<>() : digitalSignature;
	}

	public UndertakingAdvice1 setDigitalSignature(List<PartyAndSignature2> digitalSignature) {
		this.digitalSignature = Objects.requireNonNull(digitalSignature);
		return this;
	}
}
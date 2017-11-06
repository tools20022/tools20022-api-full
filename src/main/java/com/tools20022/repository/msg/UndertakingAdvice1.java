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
import com.tools20022.repository.entity.Undertaking;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
public class UndertakingAdvice1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected UndertakingIssuanceMessage undertakingIssuanceMessage;
	/**
	 * Contents of the related UndertakingIssuance message.
	 * <p>
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
	public static final MMMessageAssociationEnd mmUndertakingIssuanceMessage = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Undertaking.mmObject();
			componentContext_lazy = () -> UndertakingAdvice1.mmObject();
			isDerived = false;
			xmlTag = "UdrtkgIssncMsg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UndertakingIssuanceMessage";
			definition = "Contents of the related UndertakingIssuance message.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UndertakingIssuanceMessage.mmObject();
		}
	};
	protected AdvisingPartyAdditionalInformation1 firstAdvisingPartyAdditionalInformation;
	/**
	 * Additional information related to the first advising party.
	 * <p>
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
	public static final MMMessageAttribute mmFirstAdvisingPartyAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> UndertakingAdvice1.mmObject();
			isDerived = false;
			xmlTag = "FrstAdvsgPtyAddtlInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstAdvisingPartyAdditionalInformation";
			definition = "Additional information related to the first advising party.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AdvisingPartyAdditionalInformation1.mmObject();
		}
	};
	protected AdvisingPartyAdditionalInformation1 secondAdvisingPartyAdditionalInformation;
	/**
	 * Additional information related to the second advising party.
	 * <p>
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
	public static final MMMessageAttribute mmSecondAdvisingPartyAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> UndertakingAdvice1.mmObject();
			isDerived = false;
			xmlTag = "ScndAdvsgPtyAddtlInf";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecondAdvisingPartyAdditionalInformation";
			definition = "Additional information related to the second advising party.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AdvisingPartyAdditionalInformation1.mmObject();
		}
	};
	protected UndertakingConfirmation1 confirmationDetails;
	/**
	 * Details related to the confirmation of the undertaking.
	 * <p>
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
	public static final MMMessageAssociationEnd mmConfirmationDetails = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> UndertakingAdvice1.mmObject();
			isDerived = false;
			xmlTag = "ConfDtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationDetails";
			definition = "Details related to the confirmation of the undertaking.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UndertakingConfirmation1.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.PartyAndSignature2> digitalSignature;
	/**
	 * Digital signature of the party providing additional undertaking advice
	 * details.
	 * <p>
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
	public static final MMMessageAssociationEnd mmDigitalSignature = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Undertaking.mmElectronicSignature;
			componentContext_lazy = () -> UndertakingAdvice1.mmObject();
			isDerived = false;
			xmlTag = "DgtlSgntr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigitalSignature";
			definition = "Digital signature of the party providing additional undertaking advice details.";
			maxOccurs = 3;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PartyAndSignature2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.UndertakingAdvice1.mmUndertakingIssuanceMessage, com.tools20022.repository.msg.UndertakingAdvice1.mmFirstAdvisingPartyAdditionalInformation,
						com.tools20022.repository.msg.UndertakingAdvice1.mmSecondAdvisingPartyAdditionalInformation, com.tools20022.repository.msg.UndertakingAdvice1.mmConfirmationDetails,
						com.tools20022.repository.msg.UndertakingAdvice1.mmDigitalSignature);
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsrv.UndertakingIssuanceAdviceV01.mmUndertakingIssuanceAdviceDetails);
				trace_lazy = () -> Undertaking.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "UndertakingAdvice1";
				definition = "Details of the advice for the issuance of an undertaking.";
			}
		});
		return mmObject_lazy.get();
	}

	public UndertakingIssuanceMessage getUndertakingIssuanceMessage() {
		return undertakingIssuanceMessage;
	}

	public void setUndertakingIssuanceMessage(com.tools20022.repository.msg.UndertakingIssuanceMessage undertakingIssuanceMessage) {
		this.undertakingIssuanceMessage = undertakingIssuanceMessage;
	}

	public AdvisingPartyAdditionalInformation1 getFirstAdvisingPartyAdditionalInformation() {
		return firstAdvisingPartyAdditionalInformation;
	}

	public void setFirstAdvisingPartyAdditionalInformation(com.tools20022.repository.msg.AdvisingPartyAdditionalInformation1 firstAdvisingPartyAdditionalInformation) {
		this.firstAdvisingPartyAdditionalInformation = firstAdvisingPartyAdditionalInformation;
	}

	public AdvisingPartyAdditionalInformation1 getSecondAdvisingPartyAdditionalInformation() {
		return secondAdvisingPartyAdditionalInformation;
	}

	public void setSecondAdvisingPartyAdditionalInformation(com.tools20022.repository.msg.AdvisingPartyAdditionalInformation1 secondAdvisingPartyAdditionalInformation) {
		this.secondAdvisingPartyAdditionalInformation = secondAdvisingPartyAdditionalInformation;
	}

	public UndertakingConfirmation1 getConfirmationDetails() {
		return confirmationDetails;
	}

	public void setConfirmationDetails(com.tools20022.repository.msg.UndertakingConfirmation1 confirmationDetails) {
		this.confirmationDetails = confirmationDetails;
	}

	public List<PartyAndSignature2> getDigitalSignature() {
		return digitalSignature;
	}

	public void setDigitalSignature(List<com.tools20022.repository.msg.PartyAndSignature2> digitalSignature) {
		this.digitalSignature = digitalSignature;
	}
}
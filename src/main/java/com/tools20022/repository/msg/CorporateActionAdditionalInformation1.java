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
import com.tools20022.repository.area.seev.AgentCAElectionAdviceV01;
import com.tools20022.repository.area.seev.AgentCAInformationAdviceV01;
import com.tools20022.repository.area.seev.AgentCAInformationStatusAdviceV01;
import com.tools20022.repository.choice.BeneficiaryCertificationType1FormatChoice;
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.BeneficialOwner;
import com.tools20022.repository.entity.CorporateActionDistribution;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides additional information about the delivery details, beneficial owner
 * details, etc.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAdditionalInformation1#mmBeneficialOwnerDetails
 * CorporateActionAdditionalInformation1.mmBeneficialOwnerDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAdditionalInformation1#mmRegistrationDetails
 * CorporateActionAdditionalInformation1.mmRegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAdditionalInformation1#mmReceiverIdentification
 * CorporateActionAdditionalInformation1.mmReceiverIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAdditionalInformation1#mmCertificationIndicator
 * CorporateActionAdditionalInformation1.mmCertificationIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAdditionalInformation1#mmCertificationType
 * CorporateActionAdditionalInformation1.mmCertificationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAdditionalInformation1#mmDeliveryDetails
 * CorporateActionAdditionalInformation1.mmDeliveryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionAdditionalInformation1#mmAdditionalInstruction
 * CorporateActionAdditionalInformation1.mmAdditionalInstruction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAElectionAdviceV01#mmAdditionalInformation
 * AgentCAElectionAdviceV01.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAInformationAdviceV01#mmCorporateActionAdditionalInformation
 * AgentCAInformationAdviceV01.mmCorporateActionAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAInformationStatusAdviceV01#mmCorporateActionAdditionalInformation
 * AgentCAInformationStatusAdviceV01.mmCorporateActionAdditionalInformation}</li>
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
 * "CorporateActionAdditionalInformation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides additional information about the delivery details, beneficial owner details, etc."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionAdditionalInformation1", propOrder = {"beneficialOwnerDetails", "registrationDetails", "receiverIdentification", "certificationIndicator", "certificationType", "deliveryDetails", "additionalInstruction"})
public class CorporateActionAdditionalInformation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.msg.BeneficialOwner1> beneficialOwnerDetails;
	/**
	 * Provides information about the beneficial owner of the securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BeneficialOwner1
	 * BeneficialOwner1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner
	 * BeneficialOwner}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAdditionalInformation1
	 * CorporateActionAdditionalInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfclOwnrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficialOwnerDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the beneficial owner of the securities."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBeneficialOwnerDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> BeneficialOwner.mmObject();
			componentContext_lazy = () -> CorporateActionAdditionalInformation1.mmObject();
			isDerived = false;
			xmlTag = "BnfclOwnrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficialOwnerDetails";
			definition = "Provides information about the beneficial owner of the securities.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.BeneficialOwner1.mmObject();
		}
	};
	protected Max350Text registrationDetails;
	/**
	 * Provides information required for the registration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmRegistrationDetails
	 * CorporateActionEvent.mmRegistrationDetails}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAdditionalInformation1
	 * CorporateActionAdditionalInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegistrationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information required for the registration."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegistrationDetails = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmRegistrationDetails;
			componentContext_lazy = () -> CorporateActionAdditionalInformation1.mmObject();
			isDerived = false;
			xmlTag = "RegnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegistrationDetails";
			definition = "Provides information required for the registration.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected PartyIdentification2Choice receiverIdentification;
	/**
	 * Identification of the receiver of outturned resources (cash/securities)
	 * in case the resources need to be delivered outside the CSD.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAdditionalInformation1
	 * CorporateActionAdditionalInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiverIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the receiver of outturned resources (cash/securities) in case the resources need to be delivered outside the CSD."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReceiverIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> CorporateActionAdditionalInformation1.mmObject();
			isDerived = false;
			xmlTag = "RcvrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverIdentification";
			definition = "Identification of the receiver of outturned resources (cash/securities) in case the resources need to be delivered outside the CSD.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}
	};
	protected YesNoIndicator certificationIndicator;
	/**
	 * Whether or not certification is required from the account owner. Y:
	 * certification required N: no certification required
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmCertificationIndicator
	 * BeneficialOwner.mmCertificationIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAdditionalInformation1
	 * CorporateActionAdditionalInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Whether or not certification is required from the account owner. \nY: certification required \nN: no certification required"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCertificationIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmCertificationIndicator;
			componentContext_lazy = () -> CorporateActionAdditionalInformation1.mmObject();
			isDerived = false;
			xmlTag = "CertfctnInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationIndicator";
			definition = "Whether or not certification is required from the account owner. \nY: certification required \nN: no certification required";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected BeneficiaryCertificationType1FormatChoice certificationType;
	/**
	 * Type of certification which is required.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BeneficiaryCertificationType1FormatChoice
	 * BeneficiaryCertificationType1FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BeneficialOwner#mmCertificationType
	 * BeneficialOwner.mmCertificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAdditionalInformation1
	 * CorporateActionAdditionalInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CertfctnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CertificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of certification which is required."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCertificationType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BeneficialOwner.mmCertificationType;
			componentContext_lazy = () -> CorporateActionAdditionalInformation1.mmObject();
			isDerived = false;
			xmlTag = "CertfctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CertificationType";
			definition = "Type of certification which is required.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BeneficiaryCertificationType1FormatChoice.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ProceedsDelivery1> deliveryDetails;
	/**
	 * Provides information about the delivery details of proceeds.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProceedsDelivery1
	 * ProceedsDelivery1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmCorporateActionProceedsDeliveryInstruction
	 * CorporateActionDistribution.mmCorporateActionProceedsDeliveryInstruction}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAdditionalInformation1
	 * CorporateActionAdditionalInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the delivery details of proceeds."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeliveryDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmCorporateActionProceedsDeliveryInstruction;
			componentContext_lazy = () -> CorporateActionAdditionalInformation1.mmObject();
			isDerived = false;
			xmlTag = "DlvryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryDetails";
			definition = "Provides information about the delivery details of proceeds.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ProceedsDelivery1.mmObject();
		}
	};
	protected Max350Text additionalInstruction;
	/**
	 * Provides additional details pertaining to the corporate action
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionAdditionalInformation1
	 * CorporateActionAdditionalInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInstr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInstruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional details pertaining to the corporate action instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalInstruction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionAdditionalInformation1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInstr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInstruction";
			definition = "Provides additional details pertaining to the corporate action instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionAdditionalInformation1.mmBeneficialOwnerDetails, CorporateActionAdditionalInformation1.mmRegistrationDetails,
						CorporateActionAdditionalInformation1.mmReceiverIdentification, CorporateActionAdditionalInformation1.mmCertificationIndicator, CorporateActionAdditionalInformation1.mmCertificationType,
						CorporateActionAdditionalInformation1.mmDeliveryDetails, CorporateActionAdditionalInformation1.mmAdditionalInstruction);
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCAElectionAdviceV01.mmAdditionalInformation, AgentCAInformationAdviceV01.mmCorporateActionAdditionalInformation,
						AgentCAInformationStatusAdviceV01.mmCorporateActionAdditionalInformation);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionAdditionalInformation1";
				definition = "Provides additional information about the delivery details, beneficial owner details, etc.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "BnfclOwnrDtls")
	public List<BeneficialOwner1> getBeneficialOwnerDetails() {
		return beneficialOwnerDetails;
	}

	public void setBeneficialOwnerDetails(List<com.tools20022.repository.msg.BeneficialOwner1> beneficialOwnerDetails) {
		this.beneficialOwnerDetails = beneficialOwnerDetails;
	}

	@XmlElement(name = "RegnDtls")
	public Max350Text getRegistrationDetails() {
		return registrationDetails;
	}

	public void setRegistrationDetails(Max350Text registrationDetails) {
		this.registrationDetails = registrationDetails;
	}

	@XmlElement(name = "RcvrId")
	public PartyIdentification2Choice getReceiverIdentification() {
		return receiverIdentification;
	}

	public void setReceiverIdentification(PartyIdentification2Choice receiverIdentification) {
		this.receiverIdentification = receiverIdentification;
	}

	@XmlElement(name = "CertfctnInd")
	public YesNoIndicator getCertificationIndicator() {
		return certificationIndicator;
	}

	public void setCertificationIndicator(YesNoIndicator certificationIndicator) {
		this.certificationIndicator = certificationIndicator;
	}

	@XmlElement(name = "CertfctnTp")
	public BeneficiaryCertificationType1FormatChoice getCertificationType() {
		return certificationType;
	}

	public void setCertificationType(BeneficiaryCertificationType1FormatChoice certificationType) {
		this.certificationType = certificationType;
	}

	@XmlElement(name = "DlvryDtls")
	public List<ProceedsDelivery1> getDeliveryDetails() {
		return deliveryDetails;
	}

	public void setDeliveryDetails(List<com.tools20022.repository.msg.ProceedsDelivery1> deliveryDetails) {
		this.deliveryDetails = deliveryDetails;
	}

	@XmlElement(name = "AddtlInstr")
	public Max350Text getAdditionalInstruction() {
		return additionalInstruction;
	}

	public void setAdditionalInstruction(Max350Text additionalInstruction) {
		this.additionalInstruction = additionalInstruction;
	}
}
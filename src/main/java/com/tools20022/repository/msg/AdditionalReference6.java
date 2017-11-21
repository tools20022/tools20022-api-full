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
import com.tools20022.repository.area.acmt.*;
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.choice.PartyIdentification90Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reference to a related message or transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalReference6#mmReference
 * AdditionalReference6.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalReference6#mmReferenceIssuer
 * AdditionalReference6.mmReferenceIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalReference6#mmMessageName
 * AdditionalReference6.mmMessageName}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.GenericIdentification
 * GenericIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV07#mmPoolReference
 * PortfolioTransferInstructionV07.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV07#mmPreviousReference
 * PortfolioTransferInstructionV07.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV07#mmRelatedReference
 * PortfolioTransferInstructionV07.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#mmPoolReference
 * AccountHoldingInformationV05.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#mmPreviousReference
 * AccountHoldingInformationV05.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#mmRelatedReference
 * AccountHoldingInformationV05.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV07#mmPoolReference
 * PortfolioTransferCancellationRequestV07.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV07#mmPreviousReference
 * PortfolioTransferCancellationRequestV07.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV07#mmRelatedReference
 * PortfolioTransferCancellationRequestV07.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV07#mmPoolReference
 * TransferInConfirmationV07.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV07#mmPreviousReference
 * TransferInConfirmationV07.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV07#mmRelatedReference
 * TransferInConfirmationV07.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06#mmPreviousReference
 * AccountOpeningInstructionV06.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV07#mmPoolReference
 * TransferOutConfirmationV07.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV07#mmPreviousReference
 * TransferOutConfirmationV07.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV07#mmRelatedReference
 * TransferOutConfirmationV07.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#mmRelatedReference
 * AccountDetailsConfirmationV06.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#mmPoolReference
 * PortfolioTransferConfirmationV07.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#mmPreviousReference
 * PortfolioTransferConfirmationV07.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#mmRelatedReference
 * PortfolioTransferConfirmationV07.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV07#mmPoolReference
 * TransferOutInstructionV07.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV07#mmPreviousReference
 * TransferOutInstructionV07.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV07#mmRelatedReference
 * TransferOutInstructionV07.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV05#mmRelatedReference
 * AccountManagementStatusReportV05.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#mmPreviousReference
 * AccountModificationInstructionV06.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV07#mmPoolReference
 * TransferInInstructionV07.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV07#mmPreviousReference
 * TransferInInstructionV07.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV07#mmRelatedReference
 * TransferInInstructionV07.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#mmPoolReference
 * AccountHoldingInformationRequestV04.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#mmPreviousReference
 * AccountHoldingInformationRequestV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#mmRelatedReference
 * AccountHoldingInformationRequestV04.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#mmRelatedReference
 * AccountDetailsConfirmationV07.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#mmPreviousReference
 * AccountModificationInstructionV07.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#mmPreviousReference
 * AccountOpeningInstructionV07.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV06#mmRelatedReference
 * AccountManagementStatusReportV06.mmRelatedReference}</li>
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
 * "AdditionalReference6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reference to a related message or transaction."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalReference7
 * AdditionalReference7}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AdditionalReference4
 * AdditionalReference4}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AdditionalReference6", propOrder = {"reference", "referenceIssuer", "messageName"})
public class AdditionalReference6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text reference;
	/**
	 * Message identification of a message. This reference was assigned by the
	 * party issuing the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference6
	 * AdditionalReference6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ref"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message identification of a message. This reference was assigned by the party issuing the message."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference7#mmReference
	 * AdditionalReference7.mmReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference4#mmReference
	 * AdditionalReference4.mmReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> AdditionalReference6.mmObject();
			isDerived = false;
			xmlTag = "Ref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Message identification of a message. This reference was assigned by the party issuing the message.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalReference7.mmReference);
			previousVersion_lazy = () -> AdditionalReference4.mmReference;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected PartyIdentification90Choice referenceIssuer;
	/**
	 * Issuer of the reference.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification90Choice
	 * PartyIdentification90Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference6
	 * AdditionalReference6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefIssr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceIssuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Issuer of the reference."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference7#mmReferenceIssuer
	 * AdditionalReference7.mmReferenceIssuer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference4#mmReferenceIssuer
	 * AdditionalReference4.mmReferenceIssuer}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReferenceIssuer = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> AdditionalReference6.mmObject();
			isDerived = false;
			xmlTag = "RefIssr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceIssuer";
			definition = "Issuer of the reference.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalReference7.mmReferenceIssuer);
			previousVersion_lazy = () -> AdditionalReference4.mmReferenceIssuer;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification90Choice.mmObject();
		}
	};
	protected Max35Text messageName;
	/**
	 * Name of the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference6
	 * AdditionalReference6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name of the message."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference7#mmMessageName
	 * AdditionalReference7.mmMessageName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference4#mmMessageName
	 * AdditionalReference4.mmMessageName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMessageName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AdditionalReference6.mmObject();
			isDerived = false;
			xmlTag = "MsgNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageName";
			definition = "Name of the message.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalReference7.mmMessageName);
			previousVersion_lazy = () -> AdditionalReference4.mmMessageName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AdditionalReference6.mmReference, AdditionalReference6.mmReferenceIssuer, AdditionalReference6.mmMessageName);
				messageBuildingBlock_lazy = () -> Arrays.asList(PortfolioTransferInstructionV07.mmPoolReference, PortfolioTransferInstructionV07.mmPreviousReference, PortfolioTransferInstructionV07.mmRelatedReference,
						AccountHoldingInformationV05.mmPoolReference, AccountHoldingInformationV05.mmPreviousReference, AccountHoldingInformationV05.mmRelatedReference, PortfolioTransferCancellationRequestV07.mmPoolReference,
						PortfolioTransferCancellationRequestV07.mmPreviousReference, PortfolioTransferCancellationRequestV07.mmRelatedReference, TransferInConfirmationV07.mmPoolReference, TransferInConfirmationV07.mmPreviousReference,
						TransferInConfirmationV07.mmRelatedReference, AccountOpeningInstructionV06.mmPreviousReference, TransferOutConfirmationV07.mmPoolReference, TransferOutConfirmationV07.mmPreviousReference,
						TransferOutConfirmationV07.mmRelatedReference, AccountDetailsConfirmationV06.mmRelatedReference, PortfolioTransferConfirmationV07.mmPoolReference, PortfolioTransferConfirmationV07.mmPreviousReference,
						PortfolioTransferConfirmationV07.mmRelatedReference, TransferOutInstructionV07.mmPoolReference, TransferOutInstructionV07.mmPreviousReference, TransferOutInstructionV07.mmRelatedReference,
						AccountManagementStatusReportV05.mmRelatedReference, AccountModificationInstructionV06.mmPreviousReference, TransferInInstructionV07.mmPoolReference, TransferInInstructionV07.mmPreviousReference,
						TransferInInstructionV07.mmRelatedReference, AccountHoldingInformationRequestV04.mmPoolReference, AccountHoldingInformationRequestV04.mmPreviousReference, AccountHoldingInformationRequestV04.mmRelatedReference,
						AccountDetailsConfirmationV07.mmRelatedReference, AccountModificationInstructionV07.mmPreviousReference, AccountOpeningInstructionV07.mmPreviousReference, AccountManagementStatusReportV06.mmRelatedReference);
				trace_lazy = () -> GenericIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditionalReference6";
				definition = "Reference to a related message or transaction.";
				nextVersions_lazy = () -> Arrays.asList(AdditionalReference7.mmObject());
				previousVersion_lazy = () -> AdditionalReference4.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Ref", required = true)
	public Max35Text getReference() {
		return reference;
	}

	public void setReference(Max35Text reference) {
		this.reference = reference;
	}

	@XmlElement(name = "RefIssr")
	public PartyIdentification90Choice getReferenceIssuer() {
		return referenceIssuer;
	}

	public void setReferenceIssuer(PartyIdentification90Choice referenceIssuer) {
		this.referenceIssuer = referenceIssuer;
	}

	@XmlElement(name = "MsgNm")
	public Max35Text getMessageName() {
		return messageName;
	}

	public void setMessageName(Max35Text messageName) {
		this.messageName = messageName;
	}
}
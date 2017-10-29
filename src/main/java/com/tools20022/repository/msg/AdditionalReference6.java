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
import com.tools20022.repository.choice.PartyIdentification90Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.GenericIdentification;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Reference to a related message or transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalReference6#Reference
 * AdditionalReference6.Reference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalReference6#ReferenceIssuer
 * AdditionalReference6.ReferenceIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalReference6#MessageName
 * AdditionalReference6.MessageName}</li>
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
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV07#PoolReference
 * PortfolioTransferInstructionV07.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV07#PreviousReference
 * PortfolioTransferInstructionV07.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV07#RelatedReference
 * PortfolioTransferInstructionV07.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#PoolReference
 * AccountHoldingInformationV05.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#PreviousReference
 * AccountHoldingInformationV05.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV05#RelatedReference
 * AccountHoldingInformationV05.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV07#PoolReference
 * PortfolioTransferCancellationRequestV07.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV07#PreviousReference
 * PortfolioTransferCancellationRequestV07.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV07#RelatedReference
 * PortfolioTransferCancellationRequestV07.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV07#PoolReference
 * TransferInConfirmationV07.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV07#PreviousReference
 * TransferInConfirmationV07.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV07#RelatedReference
 * TransferInConfirmationV07.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV06#PreviousReference
 * AccountOpeningInstructionV06.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV07#PoolReference
 * TransferOutConfirmationV07.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV07#PreviousReference
 * TransferOutConfirmationV07.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV07#RelatedReference
 * TransferOutConfirmationV07.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06#RelatedReference
 * AccountDetailsConfirmationV06.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#PoolReference
 * PortfolioTransferConfirmationV07.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#PreviousReference
 * PortfolioTransferConfirmationV07.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07#RelatedReference
 * PortfolioTransferConfirmationV07.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV07#PoolReference
 * TransferOutInstructionV07.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV07#PreviousReference
 * TransferOutInstructionV07.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV07#RelatedReference
 * TransferOutInstructionV07.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV05#RelatedReference
 * AccountManagementStatusReportV05.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV06#PreviousReference
 * AccountModificationInstructionV06.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV07#PoolReference
 * TransferInInstructionV07.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV07#PreviousReference
 * TransferInInstructionV07.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV07#RelatedReference
 * TransferInInstructionV07.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#PoolReference
 * AccountHoldingInformationRequestV04.PoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#PreviousReference
 * AccountHoldingInformationRequestV04.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04#RelatedReference
 * AccountHoldingInformationRequestV04.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07#RelatedReference
 * AccountDetailsConfirmationV07.RelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountModificationInstructionV07#PreviousReference
 * AccountModificationInstructionV07.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningInstructionV07#PreviousReference
 * AccountOpeningInstructionV07.PreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountManagementStatusReportV06#RelatedReference
 * AccountManagementStatusReportV06.RelatedReference}</li>
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
public class AdditionalReference6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#Identification
	 * GenericIdentification.Identification}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference7#Reference
	 * AdditionalReference7.Reference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference4#Reference
	 * AdditionalReference4.Reference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute Reference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AdditionalReference6.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.GenericIdentification.Identification;
			isDerived = false;
			xmlTag = "Ref";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Message identification of a message. This reference was assigned by the party issuing the message.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AdditionalReference4.Reference;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditionalReference7.Reference);
			minOccurs = 1;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.entity.Party#Identification
	 * Party.Identification}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference7#ReferenceIssuer
	 * AdditionalReference7.ReferenceIssuer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference4#ReferenceIssuer
	 * AdditionalReference4.ReferenceIssuer}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute ReferenceIssuer = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AdditionalReference6.mmObject();
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.Identification;
			isDerived = false;
			xmlTag = "RefIssr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceIssuer";
			definition = "Issuer of the reference.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AdditionalReference4.ReferenceIssuer;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditionalReference7.ReferenceIssuer);
			minOccurs = 0;
			maxOccurs = 1;
			complexType_lazy = () -> PartyIdentification90Choice.mmObject();
		}
	};
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
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference7#MessageName
	 * AdditionalReference7.MessageName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference4#MessageName
	 * AdditionalReference4.MessageName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute MessageName = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AdditionalReference6.mmObject();
			isDerived = false;
			xmlTag = "MsgNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageName";
			definition = "Name of the message.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.AdditionalReference4.MessageName;
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditionalReference7.MessageName);
			minOccurs = 0;
			maxOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditionalReference6.Reference, com.tools20022.repository.msg.AdditionalReference6.ReferenceIssuer,
						com.tools20022.repository.msg.AdditionalReference6.MessageName);
				trace_lazy = () -> GenericIdentification.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.PortfolioTransferInstructionV07.PoolReference, com.tools20022.repository.area.sese.PortfolioTransferInstructionV07.PreviousReference,
						com.tools20022.repository.area.sese.PortfolioTransferInstructionV07.RelatedReference, com.tools20022.repository.area.sese.AccountHoldingInformationV05.PoolReference,
						com.tools20022.repository.area.sese.AccountHoldingInformationV05.PreviousReference, com.tools20022.repository.area.sese.AccountHoldingInformationV05.RelatedReference,
						com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV07.PoolReference, com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV07.PreviousReference,
						com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV07.RelatedReference, com.tools20022.repository.area.sese.TransferInConfirmationV07.PoolReference,
						com.tools20022.repository.area.sese.TransferInConfirmationV07.PreviousReference, com.tools20022.repository.area.sese.TransferInConfirmationV07.RelatedReference,
						com.tools20022.repository.area.acmt.AccountOpeningInstructionV06.PreviousReference, com.tools20022.repository.area.sese.TransferOutConfirmationV07.PoolReference,
						com.tools20022.repository.area.sese.TransferOutConfirmationV07.PreviousReference, com.tools20022.repository.area.sese.TransferOutConfirmationV07.RelatedReference,
						com.tools20022.repository.area.acmt.AccountDetailsConfirmationV06.RelatedReference, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07.PoolReference,
						com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07.PreviousReference, com.tools20022.repository.area.sese.PortfolioTransferConfirmationV07.RelatedReference,
						com.tools20022.repository.area.sese.TransferOutInstructionV07.PoolReference, com.tools20022.repository.area.sese.TransferOutInstructionV07.PreviousReference,
						com.tools20022.repository.area.sese.TransferOutInstructionV07.RelatedReference, com.tools20022.repository.area.acmt.AccountManagementStatusReportV05.RelatedReference,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV06.PreviousReference, com.tools20022.repository.area.sese.TransferInInstructionV07.PoolReference,
						com.tools20022.repository.area.sese.TransferInInstructionV07.PreviousReference, com.tools20022.repository.area.sese.TransferInInstructionV07.RelatedReference,
						com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04.PoolReference, com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04.PreviousReference,
						com.tools20022.repository.area.sese.AccountHoldingInformationRequestV04.RelatedReference, com.tools20022.repository.area.acmt.AccountDetailsConfirmationV07.RelatedReference,
						com.tools20022.repository.area.acmt.AccountModificationInstructionV07.PreviousReference, com.tools20022.repository.area.acmt.AccountOpeningInstructionV07.PreviousReference,
						com.tools20022.repository.area.acmt.AccountManagementStatusReportV06.RelatedReference);
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AdditionalReference6";
				definition = "Reference to a related message or transaction.";
				previousVersion_lazy = () -> AdditionalReference4.mmObject();
				nextVersions_lazy = () -> Arrays.asList(AdditionalReference7.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}
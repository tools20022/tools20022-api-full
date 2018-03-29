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
import com.tools20022.repository.area.sese.*;
import com.tools20022.repository.area.setr.*;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentification113;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * References a related message or provides another reference, such as a pool
 * reference, linking a set of messages. The party which issued the related
 * reference may be the Sender of the referenced message or a party other than
 * the Sender.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalReference8#mmReference
 * AdditionalReference8.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalReference8#mmReferenceIssuer
 * AdditionalReference8.mmReferenceIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AdditionalReference8#mmMessageName
 * AdditionalReference8.mmMessageName}</li>
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
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV04#mmPreviousReference
 * SubscriptionBulkOrderConfirmationV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationV04#mmRelatedReference
 * SubscriptionBulkOrderConfirmationV04.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderV04#mmPreviousReference
 * RedemptionBulkOrderV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderCancellationRequestV04#mmPreviousReference
 * SubscriptionBulkOrderCancellationRequestV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderV04#mmPreviousReference
 * RedemptionOrderV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderCancellationRequestV04#mmPreviousReference
 * SubscriptionOrderCancellationRequestV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV02#mmPreviousReference
 * RedemptionBulkOrderConfirmationCancellationInstructionV02.mmPreviousReference
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationCancellationInstructionV02#mmRelatedReference
 * RedemptionBulkOrderConfirmationCancellationInstructionV02.mmRelatedReference}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV04#mmPreviousReference
 * RedemptionBulkOrderConfirmationV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderConfirmationV04#mmRelatedReference
 * RedemptionBulkOrderConfirmationV04.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionBulkOrderCancellationRequestV04#mmPreviousReference
 * RedemptionBulkOrderCancellationRequestV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV04#mmPreviousReference
 * SwitchOrderConfirmationV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationV04#mmRelatedReference
 * SwitchOrderConfirmationV04.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04#mmPreviousReference
 * SubscriptionOrderConfirmationV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationV04#mmRelatedReference
 * SubscriptionOrderConfirmationV04.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV02#mmPreviousReference
 * SubscriptionOrderConfirmationCancellationInstructionV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderConfirmationCancellationInstructionV02#mmRelatedReference
 * SubscriptionOrderConfirmationCancellationInstructionV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderCancellationRequestV04#mmPreviousReference
 * SwitchOrderCancellationRequestV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderV04#mmPreviousReference
 * SwitchOrderV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV02#mmPreviousReference
 * RedemptionOrderConfirmationCancellationInstructionV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationCancellationInstructionV02#mmRelatedReference
 * RedemptionOrderConfirmationCancellationInstructionV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV04#mmPreviousReference
 * RedemptionOrderConfirmationV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderConfirmationV04#mmRelatedReference
 * RedemptionOrderConfirmationV04.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02#mmPreviousReference
 * SubscriptionBulkOrderConfirmationCancellationInstructionV02.
 * mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderConfirmationCancellationInstructionV02#mmRelatedReference
 * SubscriptionBulkOrderConfirmationCancellationInstructionV02.
 * mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.RedemptionOrderCancellationRequestV04#mmPreviousReference
 * RedemptionOrderCancellationRequestV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionBulkOrderV04#mmPreviousReference
 * SubscriptionBulkOrderV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02#mmPreviousReference
 * SwitchOrderConfirmationCancellationInstructionV02.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02#mmRelatedReference
 * SwitchOrderConfirmationCancellationInstructionV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SubscriptionOrderV04#mmPreviousReference
 * SubscriptionOrderV04.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV08#mmPreviousReference
 * ReversalOfTransferOutConfirmationV08.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferOutConfirmationV08#mmRelatedReference
 * ReversalOfTransferOutConfirmationV08.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV08#mmPreviousReference
 * TransferInConfirmationV08.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInConfirmationV08#mmRelatedReference
 * TransferInConfirmationV08.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV08#mmPreviousReference
 * PortfolioTransferInstructionV08.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferInstructionV08#mmRelatedReference
 * PortfolioTransferInstructionV08.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV08#mmPreviousReference
 * PortfolioTransferCancellationRequestV08.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferCancellationRequestV08#mmRelatedReference
 * PortfolioTransferCancellationRequestV08.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV08#mmPreviousReference
 * TransferOutCancellationRequestV08.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutCancellationRequestV08#mmRelatedReference
 * TransferOutCancellationRequestV08.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV08#mmPreviousReference
 * TransferInInstructionV08.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInInstructionV08#mmRelatedReference
 * TransferInInstructionV08.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV08#mmPreviousReference
 * PortfolioTransferConfirmationV08.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.PortfolioTransferConfirmationV08#mmRelatedReference
 * PortfolioTransferConfirmationV08.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV06#mmPreviousReference
 * AccountHoldingInformationV06.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationV06#mmRelatedReference
 * AccountHoldingInformationV06.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV08#mmPreviousReference
 * TransferOutConfirmationV08.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV08#mmRelatedReference
 * TransferOutConfirmationV08.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV08#mmPreviousReference
 * TransferInCancellationRequestV08.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferInCancellationRequestV08#mmRelatedReference
 * TransferInCancellationRequestV08.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV08#mmPreviousReference
 * TransferOutInstructionV08.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutInstructionV08#mmRelatedReference
 * TransferOutInstructionV08.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferCancellationStatusReportV06#mmCounterpartyReference
 * TransferCancellationStatusReportV06.mmCounterpartyReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV05#mmPreviousReference
 * AccountHoldingInformationRequestV05.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.AccountHoldingInformationRequestV05#mmRelatedReference
 * AccountHoldingInformationRequestV05.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV08#mmPreviousReference
 * ReversalOfTransferInConfirmationV08.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.ReversalOfTransferInConfirmationV08#mmRelatedReference
 * ReversalOfTransferInConfirmationV08.mmRelatedReference}</li>
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
 * "AdditionalReference8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "References a related message or provides another reference, such as a pool reference, linking a set of messages. The party which issued the related reference may be the Sender of the referenced message or a party other than the Sender."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AdditionalReference9
 * AdditionalReference9}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
 * AdditionalReference3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AdditionalReference8", propOrder = {"reference", "referenceIssuer", "messageName"})
public class AdditionalReference8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Ref", required = true)
	protected Max35Text reference;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference8
	 * AdditionalReference8}</li>
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
	 * "Reference issued by a party to identify an instruction, transaction or a message."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference9#mmReference
	 * AdditionalReference9.mmReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3#mmReference
	 * AdditionalReference3.mmReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditionalReference8, Max35Text> mmReference = new MMMessageAttribute<AdditionalReference8, Max35Text>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalReference8.mmObject();
			isDerived = false;
			xmlTag = "Ref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Reference issued by a party to identify an instruction, transaction or a message.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalReference9.mmReference);
			previousVersion_lazy = () -> AdditionalReference3.mmReference;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(AdditionalReference8 obj) {
			return obj.getReference();
		}

		@Override
		public void setValue(AdditionalReference8 obj, Max35Text value) {
			obj.setReference(value);
		}
	};
	@XmlElement(name = "RefIssr")
	protected PartyIdentification113 referenceIssuer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification113
	 * PartyIdentification113}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference8
	 * AdditionalReference8}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference9#mmReferenceIssuer
	 * AdditionalReference9.mmReferenceIssuer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3#mmReferenceIssuer
	 * AdditionalReference3.mmReferenceIssuer}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditionalReference8, Optional<PartyIdentification113>> mmReferenceIssuer = new MMMessageAttribute<AdditionalReference8, Optional<PartyIdentification113>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalReference8.mmObject();
			isDerived = false;
			xmlTag = "RefIssr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceIssuer";
			definition = "Issuer of the reference.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalReference9.mmReferenceIssuer);
			previousVersion_lazy = () -> AdditionalReference3.mmReferenceIssuer;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification113.mmObject();
		}

		@Override
		public Optional<PartyIdentification113> getValue(AdditionalReference8 obj) {
			return obj.getReferenceIssuer();
		}

		@Override
		public void setValue(AdditionalReference8 obj, Optional<PartyIdentification113> value) {
			obj.setReferenceIssuer(value.orElse(null));
		}
	};
	@XmlElement(name = "MsgNm")
	protected Max35Text messageName;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference8
	 * AdditionalReference8}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference9#mmMessageName
	 * AdditionalReference9.mmMessageName}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3#mmMessageName
	 * AdditionalReference3.mmMessageName}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AdditionalReference8, Optional<Max35Text>> mmMessageName = new MMMessageAttribute<AdditionalReference8, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AdditionalReference8.mmObject();
			isDerived = false;
			xmlTag = "MsgNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageName";
			definition = "Name of the message.";
			nextVersions_lazy = () -> Arrays.asList(AdditionalReference9.mmMessageName);
			previousVersion_lazy = () -> AdditionalReference3.mmMessageName;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(AdditionalReference8 obj) {
			return obj.getMessageName();
		}

		@Override
		public void setValue(AdditionalReference8 obj, Optional<Max35Text> value) {
			obj.setMessageName(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AdditionalReference8.mmReference, com.tools20022.repository.msg.AdditionalReference8.mmReferenceIssuer,
						com.tools20022.repository.msg.AdditionalReference8.mmMessageName);
				messageBuildingBlock_lazy = () -> Arrays.asList(SubscriptionBulkOrderConfirmationV04.mmPreviousReference, SubscriptionBulkOrderConfirmationV04.mmRelatedReference, RedemptionBulkOrderV04.mmPreviousReference,
						SubscriptionBulkOrderCancellationRequestV04.mmPreviousReference, RedemptionOrderV04.mmPreviousReference, SubscriptionOrderCancellationRequestV04.mmPreviousReference,
						RedemptionBulkOrderConfirmationCancellationInstructionV02.mmPreviousReference, RedemptionBulkOrderConfirmationCancellationInstructionV02.mmRelatedReference, RedemptionBulkOrderConfirmationV04.mmPreviousReference,
						RedemptionBulkOrderConfirmationV04.mmRelatedReference, RedemptionBulkOrderCancellationRequestV04.mmPreviousReference, SwitchOrderConfirmationV04.mmPreviousReference, SwitchOrderConfirmationV04.mmRelatedReference,
						SubscriptionOrderConfirmationV04.mmPreviousReference, SubscriptionOrderConfirmationV04.mmRelatedReference, SubscriptionOrderConfirmationCancellationInstructionV02.mmPreviousReference,
						SubscriptionOrderConfirmationCancellationInstructionV02.mmRelatedReference, SwitchOrderCancellationRequestV04.mmPreviousReference, SwitchOrderV04.mmPreviousReference,
						RedemptionOrderConfirmationCancellationInstructionV02.mmPreviousReference, RedemptionOrderConfirmationCancellationInstructionV02.mmRelatedReference, RedemptionOrderConfirmationV04.mmPreviousReference,
						RedemptionOrderConfirmationV04.mmRelatedReference, SubscriptionBulkOrderConfirmationCancellationInstructionV02.mmPreviousReference, SubscriptionBulkOrderConfirmationCancellationInstructionV02.mmRelatedReference,
						RedemptionOrderCancellationRequestV04.mmPreviousReference, SubscriptionBulkOrderV04.mmPreviousReference, SwitchOrderConfirmationCancellationInstructionV02.mmPreviousReference,
						SwitchOrderConfirmationCancellationInstructionV02.mmRelatedReference, SubscriptionOrderV04.mmPreviousReference, ReversalOfTransferOutConfirmationV08.mmPreviousReference,
						ReversalOfTransferOutConfirmationV08.mmRelatedReference, TransferInConfirmationV08.mmPreviousReference, TransferInConfirmationV08.mmRelatedReference, PortfolioTransferInstructionV08.mmPreviousReference,
						PortfolioTransferInstructionV08.mmRelatedReference, PortfolioTransferCancellationRequestV08.mmPreviousReference, PortfolioTransferCancellationRequestV08.mmRelatedReference,
						TransferOutCancellationRequestV08.mmPreviousReference, TransferOutCancellationRequestV08.mmRelatedReference, TransferInInstructionV08.mmPreviousReference, TransferInInstructionV08.mmRelatedReference,
						PortfolioTransferConfirmationV08.mmPreviousReference, PortfolioTransferConfirmationV08.mmRelatedReference, AccountHoldingInformationV06.mmPreviousReference, AccountHoldingInformationV06.mmRelatedReference,
						TransferOutConfirmationV08.mmPreviousReference, TransferOutConfirmationV08.mmRelatedReference, TransferInCancellationRequestV08.mmPreviousReference, TransferInCancellationRequestV08.mmRelatedReference,
						TransferOutInstructionV08.mmPreviousReference, TransferOutInstructionV08.mmRelatedReference, TransferCancellationStatusReportV06.mmCounterpartyReference, AccountHoldingInformationRequestV05.mmPreviousReference,
						AccountHoldingInformationRequestV05.mmRelatedReference, ReversalOfTransferInConfirmationV08.mmPreviousReference, ReversalOfTransferInConfirmationV08.mmRelatedReference);
				trace_lazy = () -> GenericIdentification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AdditionalReference8";
				definition = "References a related message or provides another reference, such as a pool reference, linking a set of messages. The party which issued the related reference may be the Sender of the referenced message or a party other than the Sender.";
				nextVersions_lazy = () -> Arrays.asList(AdditionalReference9.mmObject());
				previousVersion_lazy = () -> AdditionalReference3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getReference() {
		return reference;
	}

	public AdditionalReference8 setReference(Max35Text reference) {
		this.reference = Objects.requireNonNull(reference);
		return this;
	}

	public Optional<PartyIdentification113> getReferenceIssuer() {
		return referenceIssuer == null ? Optional.empty() : Optional.of(referenceIssuer);
	}

	public AdditionalReference8 setReferenceIssuer(PartyIdentification113 referenceIssuer) {
		this.referenceIssuer = referenceIssuer;
		return this;
	}

	public Optional<Max35Text> getMessageName() {
		return messageName == null ? Optional.empty() : Optional.of(messageName);
	}

	public AdditionalReference8 setMessageName(Max35Text messageName) {
		this.messageName = messageName;
		return this;
	}
}
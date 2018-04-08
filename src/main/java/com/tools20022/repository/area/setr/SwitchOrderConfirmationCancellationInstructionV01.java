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

package com.tools20022.repository.area.setr;

import com.tools20022.metamodel.*;
import com.tools20022.repository.area.SecuritiesTradePreviousVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An executing party, for example, a transfer agent, sends the
 * SwitchOrderConfirmationCancellationInstruction message to the instructing
 * party, for example, an investment manager or its authorised representative to
 * amend a previously sent SwitchOrderConfirmation message.<br>
 * <b>Usage</b><br>
 * The SwitchOrderConfirmationCancellationInstruction message is used to cancel
 * a previously sent SwitchOrderConfirmation.<br>
 * The amendment indicator element is used to specify whether the switch order
 * confirmation cancellation is to be followed by a switch order confirmation
 * amendment.<br>
 * There are two ways to specify the switch order confirmation cancellation.
 * Either:<br>
 * - the business references, for example, OrderReference, DealReference, of the
 * switch order confirmation are quoted, or,<br>
 * - all the details of the switch order confirmation (this includes the
 * OrderReference and DealReference) are quoted, but this is not recommended.<br>
 * The message identification of the SwitchOrderConfirmation message may also be
 * quoted in PreviousReference.<br>
 * It is also possible to instruct the cancellation of the confirmation message
 * by quoting its message identification in PreviousReference, but this is not
 * recommended.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01#CancellationByReferenceOrByOrderConfirmationDetailsRule
 * SwitchOrderConfirmationCancellationInstructionV01.
 * CancellationByReferenceOrByOrderConfirmationDetailsRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01#mmMessageIdentification
 * SwitchOrderConfirmationCancellationInstructionV01.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01#mmPoolReference
 * SwitchOrderConfirmationCancellationInstructionV01.mmPoolReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01#mmPreviousReference
 * SwitchOrderConfirmationCancellationInstructionV01.mmPreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01#mmRelatedReference
 * SwitchOrderConfirmationCancellationInstructionV01.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01#mmCancellationByReference
 * SwitchOrderConfirmationCancellationInstructionV01.mmCancellationByReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01#mmCancellationByOrderConfirmationDetails
 * SwitchOrderConfirmationCancellationInstructionV01.
 * mmCancellationByOrderConfirmationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01#mmCopyDetails
 * SwitchOrderConfirmationCancellationInstructionV01.mmCopyDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.InvestmentFundsISOPreviousversion
 * InvestmentFundsISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SwtchOrdrConfCxlInstrV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesTradePreviousVersion
 * SecuritiesTradePreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code setr.055.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintAccountIdentificationRule#for_setr_SwitchOrderConfirmationCancellationInstructionV01
 * ConstraintAccountIdentificationRule.
 * for_setr_SwitchOrderConfirmationCancellationInstructionV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SwitchOrderConfirmationCancellationInstructionV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn executing party, for example, a transfer agent, sends the SwitchOrderConfirmationCancellationInstruction message to the instructing party, for example, an investment manager or its authorised representative to amend a previously sent SwitchOrderConfirmation message.\r\nUsage\r\nThe SwitchOrderConfirmationCancellationInstruction message is used to cancel a previously sent SwitchOrderConfirmation.\r\nThe amendment indicator element is used to specify whether the switch order confirmation cancellation is to be followed by a switch order confirmation amendment.\r\nThere are two ways to specify the switch order confirmation cancellation. Either:\r\n- the business references, for example, OrderReference, DealReference, of the switch order confirmation are quoted, or,\r\n- all the details of the switch order confirmation (this includes the OrderReference and DealReference) are quoted, but this is not recommended.\r\nThe message identification of the SwitchOrderConfirmation message may also be quoted in PreviousReference.\r\nIt is also possible to instruct the cancellation of the confirmation message by quoting its message identification in PreviousReference, but this is not recommended."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02
 * SwitchOrderConfirmationCancellationInstructionV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SwitchOrderConfirmationCancellationInstructionV01", propOrder = {"messageIdentification", "poolReference", "previousReference", "relatedReference", "cancellationByReference", "cancellationByOrderConfirmationDetails",
		"copyDetails"})
public class SwitchOrderConfirmationCancellationInstructionV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	/**
	 * Either CancellationByOrderConfirmationDetails or CancellationByReference
	 * may be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageDefinition
	 * messageDefinition} =
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01
	 * SwitchOrderConfirmationCancellationInstructionV01}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMXor#getImpactedMessageBuildingBlocks
	 * impactedMessageBuildingBlocks} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01#mmCancellationByReference
	 * SwitchOrderConfirmationCancellationInstructionV01.
	 * mmCancellationByReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01#mmCancellationByOrderConfirmationDetails
	 * SwitchOrderConfirmationCancellationInstructionV01.
	 * mmCancellationByOrderConfirmationDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationByReferenceOrByOrderConfirmationDetailsRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either CancellationByOrderConfirmationDetails or CancellationByReference may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor CancellationByReferenceOrByOrderConfirmationDetailsRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationByReferenceOrByOrderConfirmationDetailsRule";
			definition = "Either CancellationByOrderConfirmationDetails or CancellationByReference may be present, but not both.";
			impactedMessageBuildingBlocks_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01.mmCancellationByReference,
					com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01.mmCancellationByOrderConfirmationDetails);
			messageDefinition_lazy = () -> com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01.mmObject();
		}
	};
	@XmlElement(name = "MsgId", required = true)
	protected MessageIdentification1 messageIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference that uniquely identifies a message from a business application standpoint."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02#mmMessageIdentification
	 * SwitchOrderConfirmationCancellationInstructionV02.mmMessageIdentification
	 * }</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SwitchOrderConfirmationCancellationInstructionV01, MessageIdentification1> mmMessageIdentification = new MMMessageBuildingBlock<SwitchOrderConfirmationCancellationInstructionV01, MessageIdentification1>() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Reference that uniquely identifies a message from a business application standpoint.";
			nextVersions_lazy = () -> Arrays.asList(SwitchOrderConfirmationCancellationInstructionV02.mmMessageIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(SwitchOrderConfirmationCancellationInstructionV01 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(SwitchOrderConfirmationCancellationInstructionV01 obj, MessageIdentification1 value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "PoolRef")
	protected AdditionalReference3 poolReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collective reference identifying a set of messages."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02#mmPoolReference
	 * SwitchOrderConfirmationCancellationInstructionV02.mmPoolReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SwitchOrderConfirmationCancellationInstructionV01, Optional<AdditionalReference3>> mmPoolReference = new MMMessageBuildingBlock<SwitchOrderConfirmationCancellationInstructionV01, Optional<AdditionalReference3>>() {
		{
			xmlTag = "PoolRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolReference";
			definition = "Collective reference identifying a set of messages.";
			nextVersions_lazy = () -> Arrays.asList(SwitchOrderConfirmationCancellationInstructionV02.mmPoolReference);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public Optional<AdditionalReference3> getValue(SwitchOrderConfirmationCancellationInstructionV01 obj) {
			return obj.getPoolReference();
		}

		@Override
		public void setValue(SwitchOrderConfirmationCancellationInstructionV01 obj, Optional<AdditionalReference3> value) {
			obj.setPoolReference(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsRef")
	protected List<AdditionalReference3> previousReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reference to a linked message that was previously sent."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02#mmPreviousReference
	 * SwitchOrderConfirmationCancellationInstructionV02.mmPreviousReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SwitchOrderConfirmationCancellationInstructionV01, List<AdditionalReference3>> mmPreviousReference = new MMMessageBuildingBlock<SwitchOrderConfirmationCancellationInstructionV01, List<AdditionalReference3>>() {
		{
			xmlTag = "PrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousReference";
			definition = "Reference to a linked message that was previously sent.";
			nextVersions_lazy = () -> Arrays.asList(SwitchOrderConfirmationCancellationInstructionV02.mmPreviousReference);
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public List<AdditionalReference3> getValue(SwitchOrderConfirmationCancellationInstructionV01 obj) {
			return obj.getPreviousReference();
		}

		@Override
		public void setValue(SwitchOrderConfirmationCancellationInstructionV01 obj, List<AdditionalReference3> value) {
			obj.setPreviousReference(value);
		}
	};
	@XmlElement(name = "RltdRef")
	protected AdditionalReference3 relatedReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to a linked message that was previously received."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02#mmRelatedReference
	 * SwitchOrderConfirmationCancellationInstructionV02.mmRelatedReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SwitchOrderConfirmationCancellationInstructionV01, Optional<AdditionalReference3>> mmRelatedReference = new MMMessageBuildingBlock<SwitchOrderConfirmationCancellationInstructionV01, Optional<AdditionalReference3>>() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Reference to a linked message that was previously received.";
			nextVersions_lazy = () -> Arrays.asList(SwitchOrderConfirmationCancellationInstructionV02.mmRelatedReference);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public Optional<AdditionalReference3> getValue(SwitchOrderConfirmationCancellationInstructionV01 obj) {
			return obj.getRelatedReference();
		}

		@Override
		public void setValue(SwitchOrderConfirmationCancellationInstructionV01 obj, Optional<AdditionalReference3> value) {
			obj.setRelatedReference(value.orElse(null));
		}
	};
	@XmlElement(name = "CxlByRef")
	protected InvestmentFundOrderExecution1 cancellationByReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundOrderExecution1
	 * InvestmentFundOrderExecution1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlByRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationByReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "References of the switch orders to be cancelled."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SwitchOrderConfirmationCancellationInstructionV01, Optional<InvestmentFundOrderExecution1>> mmCancellationByReference = new MMMessageBuildingBlock<SwitchOrderConfirmationCancellationInstructionV01, Optional<InvestmentFundOrderExecution1>>() {
		{
			xmlTag = "CxlByRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationByReference";
			definition = "References of the switch orders to be cancelled.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> InvestmentFundOrderExecution1.mmObject();
		}

		@Override
		public Optional<InvestmentFundOrderExecution1> getValue(SwitchOrderConfirmationCancellationInstructionV01 obj) {
			return obj.getCancellationByReference();
		}

		@Override
		public void setValue(SwitchOrderConfirmationCancellationInstructionV01 obj, Optional<InvestmentFundOrderExecution1> value) {
			obj.setCancellationByReference(value.orElse(null));
		}
	};
	@XmlElement(name = "CxlByOrdrConfDtls")
	protected SwitchOrderConfirmation1 cancellationByOrderConfirmationDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SwitchOrderConfirmation1
	 * SwitchOrderConfirmation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlByOrdrConfDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationByOrderConfirmationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Common information related to all the switch orders confirmations to be cancelled."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SwitchOrderConfirmationCancellationInstructionV01, Optional<SwitchOrderConfirmation1>> mmCancellationByOrderConfirmationDetails = new MMMessageBuildingBlock<SwitchOrderConfirmationCancellationInstructionV01, Optional<SwitchOrderConfirmation1>>() {
		{
			xmlTag = "CxlByOrdrConfDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationByOrderConfirmationDetails";
			definition = "Common information related to all the switch orders confirmations to be cancelled.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SwitchOrderConfirmation1.mmObject();
		}

		@Override
		public Optional<SwitchOrderConfirmation1> getValue(SwitchOrderConfirmationCancellationInstructionV01 obj) {
			return obj.getCancellationByOrderConfirmationDetails();
		}

		@Override
		public void setValue(SwitchOrderConfirmationCancellationInstructionV01 obj, Optional<SwitchOrderConfirmation1> value) {
			obj.setCancellationByOrderConfirmationDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "CpyDtls")
	protected CopyInformation2 copyDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CopyInformation2
	 * CopyInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CpyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CopyDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information provided when the message is a copy of a previous message."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV02#mmCopyDetails
	 * SwitchOrderConfirmationCancellationInstructionV02.mmCopyDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SwitchOrderConfirmationCancellationInstructionV01, Optional<CopyInformation2>> mmCopyDetails = new MMMessageBuildingBlock<SwitchOrderConfirmationCancellationInstructionV01, Optional<CopyInformation2>>() {
		{
			xmlTag = "CpyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CopyDetails";
			definition = "Information provided when the message is a copy of a previous message.";
			nextVersions_lazy = () -> Arrays.asList(SwitchOrderConfirmationCancellationInstructionV02.mmCopyDetails);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CopyInformation2.mmObject();
		}

		@Override
		public Optional<CopyInformation2> getValue(SwitchOrderConfirmationCancellationInstructionV01 obj) {
			return obj.getCopyDetails();
		}

		@Override
		public void setValue(SwitchOrderConfirmationCancellationInstructionV01 obj, Optional<CopyInformation2> value) {
			obj.setCopyDetails(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintAccountIdentificationRule.for_setr_SwitchOrderConfirmationCancellationInstructionV01);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SwitchOrderConfirmationCancellationInstructionV01";
				definition = "Scope\r\nAn executing party, for example, a transfer agent, sends the SwitchOrderConfirmationCancellationInstruction message to the instructing party, for example, an investment manager or its authorised representative to amend a previously sent SwitchOrderConfirmation message.\r\nUsage\r\nThe SwitchOrderConfirmationCancellationInstruction message is used to cancel a previously sent SwitchOrderConfirmation.\r\nThe amendment indicator element is used to specify whether the switch order confirmation cancellation is to be followed by a switch order confirmation amendment.\r\nThere are two ways to specify the switch order confirmation cancellation. Either:\r\n- the business references, for example, OrderReference, DealReference, of the switch order confirmation are quoted, or,\r\n- all the details of the switch order confirmation (this includes the OrderReference and DealReference) are quoted, but this is not recommended.\r\nThe message identification of the SwitchOrderConfirmation message may also be quoted in PreviousReference.\r\nIt is also possible to instruct the cancellation of the confirmation message by quoting its message identification in PreviousReference, but this is not recommended.";
				nextVersions_lazy = () -> Arrays.asList(SwitchOrderConfirmationCancellationInstructionV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(InvestmentFundsISOPreviousversion.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01.CancellationByReferenceOrByOrderConfirmationDetailsRule);
				rootElement = "Document";
				xmlTag = "SwtchOrdrConfCxlInstrV01";
				businessArea_lazy = () -> SecuritiesTradePreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01.mmMessageIdentification,
						com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01.mmPoolReference, com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01.mmPreviousReference,
						com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01.mmRelatedReference,
						com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01.mmCancellationByReference,
						com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01.mmCancellationByOrderConfirmationDetails,
						com.tools20022.repository.area.setr.SwitchOrderConfirmationCancellationInstructionV01.mmCopyDetails);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "setr";
						messageFunctionality = "055";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SwitchOrderConfirmationCancellationInstructionV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public SwitchOrderConfirmationCancellationInstructionV01 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public Optional<AdditionalReference3> getPoolReference() {
		return poolReference == null ? Optional.empty() : Optional.of(poolReference);
	}

	public SwitchOrderConfirmationCancellationInstructionV01 setPoolReference(AdditionalReference3 poolReference) {
		this.poolReference = poolReference;
		return this;
	}

	public List<AdditionalReference3> getPreviousReference() {
		return previousReference == null ? previousReference = new ArrayList<>() : previousReference;
	}

	public SwitchOrderConfirmationCancellationInstructionV01 setPreviousReference(List<AdditionalReference3> previousReference) {
		this.previousReference = Objects.requireNonNull(previousReference);
		return this;
	}

	public Optional<AdditionalReference3> getRelatedReference() {
		return relatedReference == null ? Optional.empty() : Optional.of(relatedReference);
	}

	public SwitchOrderConfirmationCancellationInstructionV01 setRelatedReference(AdditionalReference3 relatedReference) {
		this.relatedReference = relatedReference;
		return this;
	}

	public Optional<InvestmentFundOrderExecution1> getCancellationByReference() {
		return cancellationByReference == null ? Optional.empty() : Optional.of(cancellationByReference);
	}

	public SwitchOrderConfirmationCancellationInstructionV01 setCancellationByReference(InvestmentFundOrderExecution1 cancellationByReference) {
		this.cancellationByReference = cancellationByReference;
		return this;
	}

	public Optional<SwitchOrderConfirmation1> getCancellationByOrderConfirmationDetails() {
		return cancellationByOrderConfirmationDetails == null ? Optional.empty() : Optional.of(cancellationByOrderConfirmationDetails);
	}

	public SwitchOrderConfirmationCancellationInstructionV01 setCancellationByOrderConfirmationDetails(SwitchOrderConfirmation1 cancellationByOrderConfirmationDetails) {
		this.cancellationByOrderConfirmationDetails = cancellationByOrderConfirmationDetails;
		return this;
	}

	public Optional<CopyInformation2> getCopyDetails() {
		return copyDetails == null ? Optional.empty() : Optional.of(copyDetails);
	}

	public SwitchOrderConfirmationCancellationInstructionV01 setCopyDetails(CopyInformation2 copyDetails) {
		this.copyDetails = copyDetails;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.055.001.01")
	static public class Document {
		@XmlElement(name = "SwtchOrdrConfCxlInstrV01", required = true)
		public SwitchOrderConfirmationCancellationInstructionV01 messageBody;
	}
}
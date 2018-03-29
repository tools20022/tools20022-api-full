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

package com.tools20022.repository.area.tsmt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.TradeServicesManagementPreviousVersion;
import com.tools20022.repository.choice.BankContactPerson1Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import com.tools20022.repository.msgset.TradeServicesManagementISOPreviousversion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The InitialBaselineSubmission message is sent by the initiator of a
 * transaction to the matching application.<br>
 * This message is used to initiate a transaction.<br>
 * <b>Usage</b><br>
 * The InitialBaselineSubmission message can be sent by a party to register a
 * transaction in the matching application. The message can be submitted with
 * either lodge or push-through instruction.<br>
 * When the push-through instruction is present, the matching application
 * acknowledges the receipt of the message to the sender by sending an
 * Acknowledgement message, stores the submitted information and informs the
 * counterparty about the registration of the transaction by sending a
 * FullPushThroughReport message. With the BaselineReSubmission message the
 * counterparty responds with matching baseline information in order to
 * establish the transaction (baseline).<br>
 * When the lodge instruction is present, the matching application acknowledges
 * the receipt of the message to the sender by sending an Acknowledgement
 * message and stores the submitted information. No matching of the submitted
 * baseline data with other baseline information will take place. For example
 * the submission of an InitialBaselineSubmission message containing a lodge
 * instruction establishes the transaction (baseline) in the matching
 * application.<br>
 * The InitialBaselineSubmission message consists of data which relates to the
 * purchasing agreement covered by the transaction, for example line item
 * details, shipping details.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV04#mmSubmissionIdentification
 * InitialBaselineSubmissionV04.mmSubmissionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV04#mmSubmitterTransactionReference
 * InitialBaselineSubmissionV04.mmSubmitterTransactionReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV04#mmInstruction
 * InitialBaselineSubmissionV04.mmInstruction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV04#mmBaseline
 * InitialBaselineSubmissionV04.mmBaseline}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV04#mmBuyerContactPerson
 * InitialBaselineSubmissionV04.mmBuyerContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV04#mmSellerContactPerson
 * InitialBaselineSubmissionV04.mmSellerContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV04#mmBankContactPerson
 * InitialBaselineSubmissionV04.mmBankContactPerson}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV04#mmOtherBankContactPerson
 * InitialBaselineSubmissionV04.mmOtherBankContactPerson}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.TradeServicesManagementISOPreviousversion
 * TradeServicesManagementISOPreviousversion}</li>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "InitlBaselnSubmissn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.TradeServicesManagementPreviousVersion
 * TradeServicesManagementPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code tsmt.019.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InitialBaselineSubmissionV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe InitialBaselineSubmission message is sent by the initiator of a transaction to the matching application.\r\nThis message is used to initiate a transaction.\r\nUsage\r\nThe InitialBaselineSubmission message can be sent by a party to register a transaction in the matching application. The message can be submitted with either lodge or push-through instruction.\r\nWhen the push-through instruction is present, the matching application acknowledges the receipt of the message to the sender by sending an Acknowledgement message, stores the submitted information and informs the counterparty about the registration of the transaction by sending a FullPushThroughReport message. With the BaselineReSubmission message the counterparty responds with matching baseline information in order to establish the transaction (baseline).\r\nWhen the lodge instruction is present, the matching application acknowledges the receipt of the message to the sender by sending an Acknowledgement message and stores the submitted information. No matching of the submitted baseline data with other baseline information will take place. For example the submission of an InitialBaselineSubmission message containing a lodge instruction establishes the transaction (baseline) in the matching application.\r\nThe InitialBaselineSubmission message consists of data which relates to the purchasing agreement covered by the transaction, for example line item details, shipping details."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05
 * InitialBaselineSubmissionV05}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV03
 * InitialBaselineSubmissionV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InitialBaselineSubmissionV04", propOrder = {"submissionIdentification", "submitterTransactionReference", "instruction", "baseline", "buyerContactPerson", "sellerContactPerson", "bankContactPerson", "otherBankContactPerson"})
public class InitialBaselineSubmissionV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SubmissnId", required = true)
	protected MessageIdentification1 submissionIdentification;
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
	 * xmlTag} = "SubmissnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmissionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the submitted information."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05#mmSubmissionIdentification
	 * InitialBaselineSubmissionV05.mmSubmissionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV03#mmSubmissionIdentification
	 * InitialBaselineSubmissionV03.mmSubmissionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<InitialBaselineSubmissionV04, MessageIdentification1> mmSubmissionIdentification = new MMMessageBuildingBlock<InitialBaselineSubmissionV04, MessageIdentification1>() {
		{
			xmlTag = "SubmissnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmissionIdentification";
			definition = "Identifies the submitted information.";
			nextVersions_lazy = () -> Arrays.asList(InitialBaselineSubmissionV05.mmSubmissionIdentification);
			previousVersion_lazy = () -> InitialBaselineSubmissionV03.mmSubmissionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(InitialBaselineSubmissionV04 obj) {
			return obj.getSubmissionIdentification();
		}

		@Override
		public void setValue(InitialBaselineSubmissionV04 obj, MessageIdentification1 value) {
			obj.setSubmissionIdentification(value);
		}
	};
	@XmlElement(name = "SubmitrTxRef", required = true)
	protected SimpleIdentificationInformation submitterTransactionReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SimpleIdentificationInformation
	 * SimpleIdentificationInformation}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubmitrTxRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmitterTransactionReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the transaction for the requesting financial institution."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05#mmSubmitterTransactionReference
	 * InitialBaselineSubmissionV05.mmSubmitterTransactionReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV03#mmSubmitterTransactionReference
	 * InitialBaselineSubmissionV03.mmSubmitterTransactionReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<InitialBaselineSubmissionV04, SimpleIdentificationInformation> mmSubmitterTransactionReference = new MMMessageBuildingBlock<InitialBaselineSubmissionV04, SimpleIdentificationInformation>() {
		{
			xmlTag = "SubmitrTxRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmitterTransactionReference";
			definition = "Reference to the transaction for the requesting financial institution.";
			nextVersions_lazy = () -> Arrays.asList(InitialBaselineSubmissionV05.mmSubmitterTransactionReference);
			previousVersion_lazy = () -> InitialBaselineSubmissionV03.mmSubmitterTransactionReference;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> SimpleIdentificationInformation.mmObject();
		}

		@Override
		public SimpleIdentificationInformation getValue(InitialBaselineSubmissionV04 obj) {
			return obj.getSubmitterTransactionReference();
		}

		@Override
		public void setValue(InitialBaselineSubmissionV04 obj, SimpleIdentificationInformation value) {
			obj.setSubmitterTransactionReference(value);
		}
	};
	@XmlElement(name = "Instr", required = true)
	protected InstructionType1 instruction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.InstructionType1
	 * InstructionType1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Instr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Instruction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the instruction requested by the submitter by means of a code."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05#mmInstruction
	 * InitialBaselineSubmissionV05.mmInstruction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV03#mmInstruction
	 * InitialBaselineSubmissionV03.mmInstruction}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<InitialBaselineSubmissionV04, InstructionType1> mmInstruction = new MMMessageBuildingBlock<InitialBaselineSubmissionV04, InstructionType1>() {
		{
			xmlTag = "Instr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Instruction";
			definition = "Specifies the instruction requested by the submitter by means of a code.";
			nextVersions_lazy = () -> Arrays.asList(InitialBaselineSubmissionV05.mmInstruction);
			previousVersion_lazy = () -> InitialBaselineSubmissionV03.mmInstruction;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> InstructionType1.mmObject();
		}

		@Override
		public InstructionType1 getValue(InitialBaselineSubmissionV04 obj) {
			return obj.getInstruction();
		}

		@Override
		public void setValue(InitialBaselineSubmissionV04 obj, InstructionType1 value) {
			obj.setInstruction(value);
		}
	};
	@XmlElement(name = "Baseln", required = true)
	protected Baseline4 baseline;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Baseline4
	 * Baseline4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Baseln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Baseline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the commercial details of the underlying transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05#mmBaseline
	 * InitialBaselineSubmissionV05.mmBaseline}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV03#mmBaseline
	 * InitialBaselineSubmissionV03.mmBaseline}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<InitialBaselineSubmissionV04, Baseline4> mmBaseline = new MMMessageBuildingBlock<InitialBaselineSubmissionV04, Baseline4>() {
		{
			xmlTag = "Baseln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Baseline";
			definition = "Specifies the commercial details of the underlying transaction.";
			nextVersions_lazy = () -> Arrays.asList(InitialBaselineSubmissionV05.mmBaseline);
			previousVersion_lazy = () -> InitialBaselineSubmissionV03.mmBaseline;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Baseline4.mmObject();
		}

		@Override
		public Baseline4 getValue(InitialBaselineSubmissionV04 obj) {
			return obj.getBaseline();
		}

		@Override
		public void setValue(InitialBaselineSubmissionV04 obj, Baseline4 value) {
			obj.setBaseline(value);
		}
	};
	@XmlElement(name = "BuyrCtctPrsn")
	protected List<ContactIdentification1> buyerContactPerson;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1
	 * ContactIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BuyrCtctPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BuyerContactPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Person to be contacted in the organisation of the buyer."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05#mmBuyerContactPerson
	 * InitialBaselineSubmissionV05.mmBuyerContactPerson}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV03#mmBuyerContactPerson
	 * InitialBaselineSubmissionV03.mmBuyerContactPerson}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<InitialBaselineSubmissionV04, List<ContactIdentification1>> mmBuyerContactPerson = new MMMessageBuildingBlock<InitialBaselineSubmissionV04, List<ContactIdentification1>>() {
		{
			xmlTag = "BuyrCtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BuyerContactPerson";
			definition = "Person to be contacted in the organisation of the buyer.";
			nextVersions_lazy = () -> Arrays.asList(InitialBaselineSubmissionV05.mmBuyerContactPerson);
			previousVersion_lazy = () -> InitialBaselineSubmissionV03.mmBuyerContactPerson;
			minOccurs = 0;
			complexType_lazy = () -> ContactIdentification1.mmObject();
		}

		@Override
		public List<ContactIdentification1> getValue(InitialBaselineSubmissionV04 obj) {
			return obj.getBuyerContactPerson();
		}

		@Override
		public void setValue(InitialBaselineSubmissionV04 obj, List<ContactIdentification1> value) {
			obj.setBuyerContactPerson(value);
		}
	};
	@XmlElement(name = "SellrCtctPrsn")
	protected List<ContactIdentification1> sellerContactPerson;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification1
	 * ContactIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SellrCtctPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SellerContactPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Person to be contacted in the organisation of the seller."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05#mmSellerContactPerson
	 * InitialBaselineSubmissionV05.mmSellerContactPerson}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV03#mmSellerContactPerson
	 * InitialBaselineSubmissionV03.mmSellerContactPerson}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<InitialBaselineSubmissionV04, List<ContactIdentification1>> mmSellerContactPerson = new MMMessageBuildingBlock<InitialBaselineSubmissionV04, List<ContactIdentification1>>() {
		{
			xmlTag = "SellrCtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SellerContactPerson";
			definition = "Person to be contacted in the organisation of the seller.";
			nextVersions_lazy = () -> Arrays.asList(InitialBaselineSubmissionV05.mmSellerContactPerson);
			previousVersion_lazy = () -> InitialBaselineSubmissionV03.mmSellerContactPerson;
			minOccurs = 0;
			complexType_lazy = () -> ContactIdentification1.mmObject();
		}

		@Override
		public List<ContactIdentification1> getValue(InitialBaselineSubmissionV04 obj) {
			return obj.getSellerContactPerson();
		}

		@Override
		public void setValue(InitialBaselineSubmissionV04 obj, List<ContactIdentification1> value) {
			obj.setSellerContactPerson(value);
		}
	};
	@XmlElement(name = "BkCtctPrsn", required = true)
	protected BankContactPerson1Choice bankContactPerson;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BankContactPerson1Choice
	 * BankContactPerson1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BkCtctPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BankContactPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Person to be contacted in the seller's bank or buyer's bank."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05#mmBankContactPerson
	 * InitialBaselineSubmissionV05.mmBankContactPerson}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<InitialBaselineSubmissionV04, BankContactPerson1Choice> mmBankContactPerson = new MMMessageBuildingBlock<InitialBaselineSubmissionV04, BankContactPerson1Choice>() {
		{
			xmlTag = "BkCtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BankContactPerson";
			definition = "Person to be contacted in the seller's bank or buyer's bank.";
			nextVersions_lazy = () -> Arrays.asList(InitialBaselineSubmissionV05.mmBankContactPerson);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BankContactPerson1Choice.mmObject();
		}

		@Override
		public BankContactPerson1Choice getValue(InitialBaselineSubmissionV04 obj) {
			return obj.getBankContactPerson();
		}

		@Override
		public void setValue(InitialBaselineSubmissionV04 obj, BankContactPerson1Choice value) {
			obj.setBankContactPerson(value);
		}
	};
	@XmlElement(name = "OthrBkCtctPrsn")
	protected List<ContactIdentification3> otherBankContactPerson;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContactIdentification3
	 * ContactIdentification3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrBkCtctPrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherBankContactPerson"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Person to be contacted in another bank than seller or buyer's bank."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV05#mmOtherBankContactPerson
	 * InitialBaselineSubmissionV05.mmOtherBankContactPerson}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV03#mmOtherBankContactPerson
	 * InitialBaselineSubmissionV03.mmOtherBankContactPerson}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<InitialBaselineSubmissionV04, List<ContactIdentification3>> mmOtherBankContactPerson = new MMMessageBuildingBlock<InitialBaselineSubmissionV04, List<ContactIdentification3>>() {
		{
			xmlTag = "OthrBkCtctPrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBankContactPerson";
			definition = "Person to be contacted in another bank than seller or buyer's bank.";
			nextVersions_lazy = () -> Arrays.asList(InitialBaselineSubmissionV05.mmOtherBankContactPerson);
			previousVersion_lazy = () -> InitialBaselineSubmissionV03.mmOtherBankContactPerson;
			minOccurs = 0;
			complexType_lazy = () -> ContactIdentification3.mmObject();
		}

		@Override
		public List<ContactIdentification3> getValue(InitialBaselineSubmissionV04 obj) {
			return obj.getOtherBankContactPerson();
		}

		@Override
		public void setValue(InitialBaselineSubmissionV04 obj, List<ContactIdentification3> value) {
			obj.setOtherBankContactPerson(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "InitialBaselineSubmissionV04";
				definition = "Scope\r\nThe InitialBaselineSubmission message is sent by the initiator of a transaction to the matching application.\r\nThis message is used to initiate a transaction.\r\nUsage\r\nThe InitialBaselineSubmission message can be sent by a party to register a transaction in the matching application. The message can be submitted with either lodge or push-through instruction.\r\nWhen the push-through instruction is present, the matching application acknowledges the receipt of the message to the sender by sending an Acknowledgement message, stores the submitted information and informs the counterparty about the registration of the transaction by sending a FullPushThroughReport message. With the BaselineReSubmission message the counterparty responds with matching baseline information in order to establish the transaction (baseline).\r\nWhen the lodge instruction is present, the matching application acknowledges the receipt of the message to the sender by sending an Acknowledgement message and stores the submitted information. No matching of the submitted baseline data with other baseline information will take place. For example the submission of an InitialBaselineSubmission message containing a lodge instruction establishes the transaction (baseline) in the matching application.\r\nThe InitialBaselineSubmission message consists of data which relates to the purchasing agreement covered by the transaction, for example line item details, shipping details.";
				nextVersions_lazy = () -> Arrays.asList(InitialBaselineSubmissionV05.mmObject());
				previousVersion_lazy = () -> InitialBaselineSubmissionV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(TradeServicesManagementISOPreviousversion.mmObject(), ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "InitlBaselnSubmissn";
				businessArea_lazy = () -> TradeServicesManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV04.mmSubmissionIdentification,
						com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV04.mmSubmitterTransactionReference, com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV04.mmInstruction,
						com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV04.mmBaseline, com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV04.mmBuyerContactPerson,
						com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV04.mmSellerContactPerson, com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV04.mmBankContactPerson,
						com.tools20022.repository.area.tsmt.InitialBaselineSubmissionV04.mmOtherBankContactPerson);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "tsmt";
						messageFunctionality = "019";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return InitialBaselineSubmissionV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getSubmissionIdentification() {
		return submissionIdentification;
	}

	public InitialBaselineSubmissionV04 setSubmissionIdentification(MessageIdentification1 submissionIdentification) {
		this.submissionIdentification = Objects.requireNonNull(submissionIdentification);
		return this;
	}

	public SimpleIdentificationInformation getSubmitterTransactionReference() {
		return submitterTransactionReference;
	}

	public InitialBaselineSubmissionV04 setSubmitterTransactionReference(SimpleIdentificationInformation submitterTransactionReference) {
		this.submitterTransactionReference = Objects.requireNonNull(submitterTransactionReference);
		return this;
	}

	public InstructionType1 getInstruction() {
		return instruction;
	}

	public InitialBaselineSubmissionV04 setInstruction(InstructionType1 instruction) {
		this.instruction = Objects.requireNonNull(instruction);
		return this;
	}

	public Baseline4 getBaseline() {
		return baseline;
	}

	public InitialBaselineSubmissionV04 setBaseline(Baseline4 baseline) {
		this.baseline = Objects.requireNonNull(baseline);
		return this;
	}

	public List<ContactIdentification1> getBuyerContactPerson() {
		return buyerContactPerson == null ? buyerContactPerson = new ArrayList<>() : buyerContactPerson;
	}

	public InitialBaselineSubmissionV04 setBuyerContactPerson(List<ContactIdentification1> buyerContactPerson) {
		this.buyerContactPerson = Objects.requireNonNull(buyerContactPerson);
		return this;
	}

	public List<ContactIdentification1> getSellerContactPerson() {
		return sellerContactPerson == null ? sellerContactPerson = new ArrayList<>() : sellerContactPerson;
	}

	public InitialBaselineSubmissionV04 setSellerContactPerson(List<ContactIdentification1> sellerContactPerson) {
		this.sellerContactPerson = Objects.requireNonNull(sellerContactPerson);
		return this;
	}

	public BankContactPerson1Choice getBankContactPerson() {
		return bankContactPerson;
	}

	public InitialBaselineSubmissionV04 setBankContactPerson(BankContactPerson1Choice bankContactPerson) {
		this.bankContactPerson = Objects.requireNonNull(bankContactPerson);
		return this;
	}

	public List<ContactIdentification3> getOtherBankContactPerson() {
		return otherBankContactPerson == null ? otherBankContactPerson = new ArrayList<>() : otherBankContactPerson;
	}

	public InitialBaselineSubmissionV04 setOtherBankContactPerson(List<ContactIdentification3> otherBankContactPerson) {
		this.otherBankContactPerson = Objects.requireNonNull(otherBankContactPerson);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:tsmt.019.001.04")
	static public class Document {
		@XmlElement(name = "InitlBaselnSubmissn", required = true)
		public InitialBaselineSubmissionV04 messageBody;
	}
}
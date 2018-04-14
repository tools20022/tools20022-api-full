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

package com.tools20022.repository.area.semt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesManagementLatestVersion;
import com.tools20022.repository.choice.ReportItemStatus1Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.TransparencyOfHoldingsMaintenance20162017;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * SCOPE<br>
 * <br>
 * An account owner, such as a custodian, central securities depository,
 * international securities depository or transfer agent, sends the
 * SecuritiesBalanceTransparencyReportStatusAdvice message in response to a
 * SecuritiesBalanceTransparencyReport, to accept or reject the statement of
 * holdings as sent in a SecuritiesBalanceTransparencyReport.<br>
 * <br>
 * USAGE<br>
 * The SecuritiesBalanceTransparencyReportStatusAdvice is used to accept
 * (Accepted), partially accept (Accepted With Exception) or reject (Rejected) a
 * previously received SecuritiesBalanceTransparencyReport.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code semt.042.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesManagementLatestVersion
 * SecuritiesManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01#mmMessageIdentification
 * SecuritiesBalanceTransparencyReportStatusAdviceV01.mmMessageIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01#mmSenderIdentification
 * SecuritiesBalanceTransparencyReportStatusAdviceV01.mmSenderIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01#mmReceiverIdentification
 * SecuritiesBalanceTransparencyReportStatusAdviceV01.mmReceiverIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01#mmRelatedStatement
 * SecuritiesBalanceTransparencyReportStatusAdviceV01.mmRelatedStatement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01#mmStatus
 * SecuritiesBalanceTransparencyReportStatusAdviceV01.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01#mmNumberOfItemsPerStatus
 * SecuritiesBalanceTransparencyReportStatusAdviceV01.mmNumberOfItemsPerStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01#mmSupplementaryData
 * SecuritiesBalanceTransparencyReportStatusAdviceV01.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.TransparencyOfHoldingsMaintenance20162017
 * TransparencyOfHoldingsMaintenance20162017}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesBalTrnsprncyRptStsAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesBalanceTransparencyReportStatusAdviceV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "SCOPE\r\n\r\nAn account owner, such as a custodian, central securities depository, international securities depository or transfer agent, sends the SecuritiesBalanceTransparencyReportStatusAdvice message in response to a SecuritiesBalanceTransparencyReport, to accept or reject the statement of holdings as sent in a SecuritiesBalanceTransparencyReport.\r\n\r\nUSAGE\r\nThe SecuritiesBalanceTransparencyReportStatusAdvice is used to accept (Accepted), partially accept (Accepted With Exception) or reject (Rejected) a previously received SecuritiesBalanceTransparencyReport."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesBalanceTransparencyReportStatusAdviceV01", propOrder = {"messageIdentification", "senderIdentification", "receiverIdentification", "relatedStatement", "status", "numberOfItemsPerStatus", "supplementaryData"})
public class SecuritiesBalanceTransparencyReportStatusAdviceV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the status advice message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesBalanceTransparencyReportStatusAdviceV01, MessageIdentification1> mmMessageIdentification = new MMMessageBuildingBlock<SecuritiesBalanceTransparencyReportStatusAdviceV01, MessageIdentification1>() {
		{
			xmlTag = "MsgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageIdentification";
			definition = "Unique and unambiguous identification of the status advice message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(SecuritiesBalanceTransparencyReportStatusAdviceV01 obj) {
			return obj.getMessageIdentification();
		}

		@Override
		public void setValue(SecuritiesBalanceTransparencyReportStatusAdviceV01 obj, MessageIdentification1 value) {
			obj.setMessageIdentification(value);
		}
	};
	@XmlElement(name = "SndrId", required = true)
	protected PartyIdentification100 senderIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification100
	 * PartyIdentification100}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SndrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SenderIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the party that is the sender of the status advice message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesBalanceTransparencyReportStatusAdviceV01, PartyIdentification100> mmSenderIdentification = new MMMessageBuildingBlock<SecuritiesBalanceTransparencyReportStatusAdviceV01, PartyIdentification100>() {
		{
			xmlTag = "SndrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SenderIdentification";
			definition = "Identification of the party that is the sender of the status advice message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification100.mmObject();
		}

		@Override
		public PartyIdentification100 getValue(SecuritiesBalanceTransparencyReportStatusAdviceV01 obj) {
			return obj.getSenderIdentification();
		}

		@Override
		public void setValue(SecuritiesBalanceTransparencyReportStatusAdviceV01 obj, PartyIdentification100 value) {
			obj.setSenderIdentification(value);
		}
	};
	@XmlElement(name = "RcvrId")
	protected PartyIdentification100 receiverIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification100
	 * PartyIdentification100}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiverIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the party that is the receiver of the status advice message."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesBalanceTransparencyReportStatusAdviceV01, Optional<PartyIdentification100>> mmReceiverIdentification = new MMMessageBuildingBlock<SecuritiesBalanceTransparencyReportStatusAdviceV01, Optional<PartyIdentification100>>() {
		{
			xmlTag = "RcvrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiverIdentification";
			definition = "Identification of the party that is the receiver of the status advice message.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification100.mmObject();
		}

		@Override
		public Optional<PartyIdentification100> getValue(SecuritiesBalanceTransparencyReportStatusAdviceV01 obj) {
			return obj.getReceiverIdentification();
		}

		@Override
		public void setValue(SecuritiesBalanceTransparencyReportStatusAdviceV01 obj, Optional<PartyIdentification100> value) {
			obj.setReceiverIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdStmt", required = true)
	protected StatementReference1 relatedStatement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.StatementReference1
	 * StatementReference1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdStmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedStatement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of the statement for which the status advice has been issued."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesBalanceTransparencyReportStatusAdviceV01, StatementReference1> mmRelatedStatement = new MMMessageBuildingBlock<SecuritiesBalanceTransparencyReportStatusAdviceV01, StatementReference1>() {
		{
			xmlTag = "RltdStmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedStatement";
			definition = "Reference of the statement for which the status advice has been issued.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> StatementReference1.mmObject();
		}

		@Override
		public StatementReference1 getValue(SecuritiesBalanceTransparencyReportStatusAdviceV01 obj) {
			return obj.getRelatedStatement();
		}

		@Override
		public void setValue(SecuritiesBalanceTransparencyReportStatusAdviceV01 obj, StatementReference1 value) {
			obj.setRelatedStatement(value);
		}
	};
	@XmlElement(name = "Sts", required = true)
	protected ReportItemStatus1Choice status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ReportItemStatus1Choice
	 * ReportItemStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of the referenced statement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesBalanceTransparencyReportStatusAdviceV01, ReportItemStatus1Choice> mmStatus = new MMMessageBuildingBlock<SecuritiesBalanceTransparencyReportStatusAdviceV01, ReportItemStatus1Choice>() {
		{
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Status of the referenced statement.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ReportItemStatus1Choice.mmObject();
		}

		@Override
		public ReportItemStatus1Choice getValue(SecuritiesBalanceTransparencyReportStatusAdviceV01 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(SecuritiesBalanceTransparencyReportStatusAdviceV01 obj, ReportItemStatus1Choice value) {
			obj.setStatus(value);
		}
	};
	@XmlElement(name = "NbOfItmsPerSts")
	protected List<NumberOfItemsPerStatus1> numberOfItemsPerStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.NumberOfItemsPerStatus1
	 * NumberOfItemsPerStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NbOfItmsPerSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NumberOfItemsPerStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of items for each identical transaction status."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesBalanceTransparencyReportStatusAdviceV01, List<NumberOfItemsPerStatus1>> mmNumberOfItemsPerStatus = new MMMessageBuildingBlock<SecuritiesBalanceTransparencyReportStatusAdviceV01, List<NumberOfItemsPerStatus1>>() {
		{
			xmlTag = "NbOfItmsPerSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NumberOfItemsPerStatus";
			definition = "Number of items for each identical transaction status.";
			maxOccurs = 2;
			minOccurs = 0;
			complexType_lazy = () -> NumberOfItemsPerStatus1.mmObject();
		}

		@Override
		public List<NumberOfItemsPerStatus1> getValue(SecuritiesBalanceTransparencyReportStatusAdviceV01 obj) {
			return obj.getNumberOfItemsPerStatus();
		}

		@Override
		public void setValue(SecuritiesBalanceTransparencyReportStatusAdviceV01 obj, List<NumberOfItemsPerStatus1> value) {
			obj.setNumberOfItemsPerStatus(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesBalanceTransparencyReportStatusAdviceV01, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<SecuritiesBalanceTransparencyReportStatusAdviceV01, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(SecuritiesBalanceTransparencyReportStatusAdviceV01 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(SecuritiesBalanceTransparencyReportStatusAdviceV01 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesBalanceTransparencyReportStatusAdviceV01";
				definition = "SCOPE\r\n\r\nAn account owner, such as a custodian, central securities depository, international securities depository or transfer agent, sends the SecuritiesBalanceTransparencyReportStatusAdvice message in response to a SecuritiesBalanceTransparencyReport, to accept or reject the statement of holdings as sent in a SecuritiesBalanceTransparencyReport.\r\n\r\nUSAGE\r\nThe SecuritiesBalanceTransparencyReportStatusAdvice is used to accept (Accepted), partially accept (Accepted With Exception) or reject (Rejected) a previously received SecuritiesBalanceTransparencyReport.";
				messageSet_lazy = () -> Arrays.asList(TransparencyOfHoldingsMaintenance20162017.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesBalTrnsprncyRptStsAdvc";
				businessArea_lazy = () -> SecuritiesManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01.mmMessageIdentification,
						com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01.mmSenderIdentification,
						com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01.mmReceiverIdentification,
						com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01.mmRelatedStatement, com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01.mmStatus,
						com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01.mmNumberOfItemsPerStatus,
						com.tools20022.repository.area.semt.SecuritiesBalanceTransparencyReportStatusAdviceV01.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "semt";
						messageFunctionality = "042";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesBalanceTransparencyReportStatusAdviceV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getMessageIdentification() {
		return messageIdentification;
	}

	public SecuritiesBalanceTransparencyReportStatusAdviceV01 setMessageIdentification(MessageIdentification1 messageIdentification) {
		this.messageIdentification = Objects.requireNonNull(messageIdentification);
		return this;
	}

	public PartyIdentification100 getSenderIdentification() {
		return senderIdentification;
	}

	public SecuritiesBalanceTransparencyReportStatusAdviceV01 setSenderIdentification(PartyIdentification100 senderIdentification) {
		this.senderIdentification = Objects.requireNonNull(senderIdentification);
		return this;
	}

	public Optional<PartyIdentification100> getReceiverIdentification() {
		return receiverIdentification == null ? Optional.empty() : Optional.of(receiverIdentification);
	}

	public SecuritiesBalanceTransparencyReportStatusAdviceV01 setReceiverIdentification(PartyIdentification100 receiverIdentification) {
		this.receiverIdentification = receiverIdentification;
		return this;
	}

	public StatementReference1 getRelatedStatement() {
		return relatedStatement;
	}

	public SecuritiesBalanceTransparencyReportStatusAdviceV01 setRelatedStatement(StatementReference1 relatedStatement) {
		this.relatedStatement = Objects.requireNonNull(relatedStatement);
		return this;
	}

	public ReportItemStatus1Choice getStatus() {
		return status;
	}

	public SecuritiesBalanceTransparencyReportStatusAdviceV01 setStatus(ReportItemStatus1Choice status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public List<NumberOfItemsPerStatus1> getNumberOfItemsPerStatus() {
		return numberOfItemsPerStatus == null ? numberOfItemsPerStatus = new ArrayList<>() : numberOfItemsPerStatus;
	}

	public SecuritiesBalanceTransparencyReportStatusAdviceV01 setNumberOfItemsPerStatus(List<NumberOfItemsPerStatus1> numberOfItemsPerStatus) {
		this.numberOfItemsPerStatus = Objects.requireNonNull(numberOfItemsPerStatus);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public SecuritiesBalanceTransparencyReportStatusAdviceV01 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:semt.042.001.01")
	static public class Document {
		@XmlElement(name = "SctiesBalTrnsprncyRptStsAdvc", required = true)
		public SecuritiesBalanceTransparencyReportStatusAdviceV01 messageBody;
	}
}
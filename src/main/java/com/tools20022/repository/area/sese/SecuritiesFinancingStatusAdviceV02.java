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

package com.tools20022.repository.area.sese;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesSettlementArchive;
import com.tools20022.repository.choice.MatchingStatus3Choice;
import com.tools20022.repository.choice.ProcessingStatus3Choice;
import com.tools20022.repository.choice.RepoCallRequestStatus2Choice;
import com.tools20022.repository.choice.SettlementStatus2Choice;
import com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msg.TransactionIdentifications1;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An securities financing transaction account servicer sends a
 * SecuritiesFinancingStatusAdvice to an account owner to advise the status of a
 * securities financing transaction previously instructed by the account owner.<br>
 * The status advice may be sent as a response to the request of the account
 * owner or not.<br>
 * The account servicer/owner relationship may be:<br>
 * - a central securities depository or another settlement market infrastructure
 * managing securities financing transactions on behalf of their participants<br>
 * - an agent (sub-custodian) managing securities financing transactions on
 * behalf of their global custodian customer, or<br>
 * - a custodian managing securities financing transactions on behalf of an
 * investment management institution or a broker/dealer.<br>
 * <b>Usage</b><br>
 * The message may also be used to:<br>
 * - re-send a message previously sent,<br>
 * - provide a third party with a copy of a message for information,<br>
 * - re-send to a third party a copy of a message for information.<br>
 * using the relevant elements in the Business Application Header. ISO 15022 -
 * 20022 Coexistence This ISO 20022 message is reversed engineered from ISO
 * 15022. Both standards will coexist for a certain number of years. Until this
 * coexistence period ends, the usage of certain data types is restricted to
 * ensure interoperability between ISO 15022 and 20022 users. Compliance to
 * these rules is mandatory in a coexistence environment. The coexistence
 * restrictions are described in a Textual Rule linked to the Message Items they
 * concern. These coexistence textual rules are clearly identified as follows:
 * “CoexistenceXxxxRule”.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV02#mmTransactionIdentification
 * SecuritiesFinancingStatusAdviceV02.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV02#mmProcessingStatus
 * SecuritiesFinancingStatusAdviceV02.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV02#mmMatchingStatus
 * SecuritiesFinancingStatusAdviceV02.mmMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV02#mmInferredMatchingStatus
 * SecuritiesFinancingStatusAdviceV02.mmInferredMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV02#mmSettlementStatus
 * SecuritiesFinancingStatusAdviceV02.mmSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV02#mmRepoCallRequestStatus
 * SecuritiesFinancingStatusAdviceV02.mmRepoCallRequestStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV02#mmTransactionDetails
 * SecuritiesFinancingStatusAdviceV02.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV02#mmSupplementaryData
 * SecuritiesFinancingStatusAdviceV02.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesFincgStsAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementArchive
 * SecuritiesSettlementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.034.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesFinancingStatusAdviceV02
 * ConstraintCoexistenceCharacterSetXRule.
 * for_sese_SecuritiesFinancingStatusAdviceV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule#for_sese_SecuritiesFinancingStatusAdviceV02
 * ConstraintCoexistenceIdentificationRule.
 * for_sese_SecuritiesFinancingStatusAdviceV02}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#for_sese_SecuritiesFinancingStatusAdviceV02
 * ConstraintSettlementStatusAndMatchedRule.
 * for_sese_SecuritiesFinancingStatusAdviceV02}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesFinancingStatusAdviceV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn securities financing transaction account servicer sends a SecuritiesFinancingStatusAdvice to an account owner to advise the status of a securities financing transaction previously instructed by the account owner.\r\nThe status advice may be sent as a response to the request of the account owner or not.\r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure managing securities financing transactions on behalf of their participants\r\n- an agent (sub-custodian) managing securities financing transactions on behalf of their global custodian customer, or\r\n- a custodian managing securities financing transactions on behalf of an investment management institution or a broker/dealer.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information.\r\nusing the relevant elements in the Business Application Header.\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV03
 * SecuritiesFinancingStatusAdviceV03}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV01
 * SecuritiesFinancingStatusAdviceV01}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesFinancingStatusAdviceV02", propOrder = {"transactionIdentification", "processingStatus", "matchingStatus", "inferredMatchingStatus", "settlementStatus", "repoCallRequestStatus", "transactionDetails",
		"supplementaryData"})
public class SecuritiesFinancingStatusAdviceV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxId", required = true)
	protected TransactionIdentifications1 transactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications1
	 * TransactionIdentifications1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides unambiguous transaction identification information."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingStatusAdviceV02, TransactionIdentifications1> mmTransactionIdentification = new MMMessageBuildingBlock<SecuritiesFinancingStatusAdviceV02, TransactionIdentifications1>() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Provides unambiguous transaction identification information.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransactionIdentifications1.mmObject();
		}

		@Override
		public TransactionIdentifications1 getValue(SecuritiesFinancingStatusAdviceV02 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(SecuritiesFinancingStatusAdviceV02 obj, TransactionIdentifications1 value) {
			obj.setTransactionIdentification(value);
		}
	};
	@XmlElement(name = "PrcgSts")
	protected ProcessingStatus3Choice processingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus3Choice
	 * ProcessingStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Processing status of the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingStatusAdviceV02, Optional<ProcessingStatus3Choice>> mmProcessingStatus = new MMMessageBuildingBlock<SecuritiesFinancingStatusAdviceV02, Optional<ProcessingStatus3Choice>>() {
		{
			xmlTag = "PrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Processing status of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ProcessingStatus3Choice.mmObject();
		}

		@Override
		public Optional<ProcessingStatus3Choice> getValue(SecuritiesFinancingStatusAdviceV02 obj) {
			return obj.getProcessingStatus();
		}

		@Override
		public void setValue(SecuritiesFinancingStatusAdviceV02 obj, Optional<ProcessingStatus3Choice> value) {
			obj.setProcessingStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "MtchgSts")
	protected MatchingStatus3Choice matchingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus3Choice
	 * MatchingStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the matching status of the instruction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingStatusAdviceV02, Optional<MatchingStatus3Choice>> mmMatchingStatus = new MMMessageBuildingBlock<SecuritiesFinancingStatusAdviceV02, Optional<MatchingStatus3Choice>>() {
		{
			xmlTag = "MtchgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingStatus";
			definition = "Provides the matching status of the instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MatchingStatus3Choice.mmObject();
		}

		@Override
		public Optional<MatchingStatus3Choice> getValue(SecuritiesFinancingStatusAdviceV02 obj) {
			return obj.getMatchingStatus();
		}

		@Override
		public void setValue(SecuritiesFinancingStatusAdviceV02 obj, Optional<MatchingStatus3Choice> value) {
			obj.setMatchingStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "IfrrdMtchgSts")
	protected MatchingStatus3Choice inferredMatchingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus3Choice
	 * MatchingStatus3Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IfrrdMtchgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InferredMatchingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the matching status of an instruction as per the account servicer based on an allegement. At this time no matching took place on the market (at the CSD/ICSD)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingStatusAdviceV02, Optional<MatchingStatus3Choice>> mmInferredMatchingStatus = new MMMessageBuildingBlock<SecuritiesFinancingStatusAdviceV02, Optional<MatchingStatus3Choice>>() {
		{
			xmlTag = "IfrrdMtchgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InferredMatchingStatus";
			definition = "Provides the matching status of an instruction as per the account servicer based on an allegement. At this time no matching took place on the market (at the CSD/ICSD).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MatchingStatus3Choice.mmObject();
		}

		@Override
		public Optional<MatchingStatus3Choice> getValue(SecuritiesFinancingStatusAdviceV02 obj) {
			return obj.getInferredMatchingStatus();
		}

		@Override
		public void setValue(SecuritiesFinancingStatusAdviceV02 obj, Optional<MatchingStatus3Choice> value) {
			obj.setInferredMatchingStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmSts")
	protected SettlementStatus2Choice settlementStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus2Choice
	 * SettlementStatus2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the status of settlement of a transaction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingStatusAdviceV02, Optional<SettlementStatus2Choice>> mmSettlementStatus = new MMMessageBuildingBlock<SecuritiesFinancingStatusAdviceV02, Optional<SettlementStatus2Choice>>() {
		{
			xmlTag = "SttlmSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatus";
			definition = "Provides the status of settlement of a transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementStatus2Choice.mmObject();
		}

		@Override
		public Optional<SettlementStatus2Choice> getValue(SecuritiesFinancingStatusAdviceV02 obj) {
			return obj.getSettlementStatus();
		}

		@Override
		public void setValue(SecuritiesFinancingStatusAdviceV02 obj, Optional<SettlementStatus2Choice> value) {
			obj.setSettlementStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "RepoCallReqSts")
	protected RepoCallRequestStatus2Choice repoCallRequestStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus2Choice
	 * RepoCallRequestStatus2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RepoCallReqSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepoCallRequestStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the status of the repurchase agreement call request."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingStatusAdviceV02, Optional<RepoCallRequestStatus2Choice>> mmRepoCallRequestStatus = new MMMessageBuildingBlock<SecuritiesFinancingStatusAdviceV02, Optional<RepoCallRequestStatus2Choice>>() {
		{
			xmlTag = "RepoCallReqSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepoCallRequestStatus";
			definition = "Provides the status of the repurchase agreement call request.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RepoCallRequestStatus2Choice.mmObject();
		}

		@Override
		public Optional<RepoCallRequestStatus2Choice> getValue(SecuritiesFinancingStatusAdviceV02 obj) {
			return obj.getRepoCallRequestStatus();
		}

		@Override
		public void setValue(SecuritiesFinancingStatusAdviceV02 obj, Optional<RepoCallRequestStatus2Choice> value) {
			obj.setRepoCallRequestStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "TxDtls")
	protected SecuritiesFinancingTransactionDetails8 transactionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails8
	 * SecuritiesFinancingTransactionDetails8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the details of the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingStatusAdviceV02, Optional<SecuritiesFinancingTransactionDetails8>> mmTransactionDetails = new MMMessageBuildingBlock<SecuritiesFinancingStatusAdviceV02, Optional<SecuritiesFinancingTransactionDetails8>>() {
		{
			xmlTag = "TxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDetails";
			definition = "Identifies the details of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecuritiesFinancingTransactionDetails8.mmObject();
		}

		@Override
		public Optional<SecuritiesFinancingTransactionDetails8> getValue(SecuritiesFinancingStatusAdviceV02 obj) {
			return obj.getTransactionDetails();
		}

		@Override
		public void setValue(SecuritiesFinancingStatusAdviceV02 obj, Optional<SecuritiesFinancingTransactionDetails8> value) {
			obj.setTransactionDetails(value.orElse(null));
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingStatusAdviceV02, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<SecuritiesFinancingStatusAdviceV02, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(SecuritiesFinancingStatusAdviceV02 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(SecuritiesFinancingStatusAdviceV02 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesFinancingStatusAdviceV02,
						com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule.for_sese_SecuritiesFinancingStatusAdviceV02,
						com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.for_sese_SecuritiesFinancingStatusAdviceV02);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesFinancingStatusAdviceV02";
				definition = "Scope\r\nAn securities financing transaction account servicer sends a SecuritiesFinancingStatusAdvice to an account owner to advise the status of a securities financing transaction previously instructed by the account owner.\r\nThe status advice may be sent as a response to the request of the account owner or not.\r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure managing securities financing transactions on behalf of their participants\r\n- an agent (sub-custodian) managing securities financing transactions on behalf of their global custodian customer, or\r\n- a custodian managing securities financing transactions on behalf of an investment management institution or a broker/dealer.\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information.\r\nusing the relevant elements in the Business Application Header.\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingStatusAdviceV03.mmObject());
				previousVersion_lazy = () -> SecuritiesFinancingStatusAdviceV01.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesFincgStsAdvc";
				businessArea_lazy = () -> SecuritiesSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV02.mmTransactionIdentification,
						com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV02.mmProcessingStatus, com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV02.mmMatchingStatus,
						com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV02.mmInferredMatchingStatus, com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV02.mmSettlementStatus,
						com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV02.mmRepoCallRequestStatus, com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV02.mmTransactionDetails,
						com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV02.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "034";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesFinancingStatusAdviceV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TransactionIdentifications1 getTransactionIdentification() {
		return transactionIdentification;
	}

	public SecuritiesFinancingStatusAdviceV02 setTransactionIdentification(TransactionIdentifications1 transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Optional<ProcessingStatus3Choice> getProcessingStatus() {
		return processingStatus == null ? Optional.empty() : Optional.of(processingStatus);
	}

	public SecuritiesFinancingStatusAdviceV02 setProcessingStatus(ProcessingStatus3Choice processingStatus) {
		this.processingStatus = processingStatus;
		return this;
	}

	public Optional<MatchingStatus3Choice> getMatchingStatus() {
		return matchingStatus == null ? Optional.empty() : Optional.of(matchingStatus);
	}

	public SecuritiesFinancingStatusAdviceV02 setMatchingStatus(MatchingStatus3Choice matchingStatus) {
		this.matchingStatus = matchingStatus;
		return this;
	}

	public Optional<MatchingStatus3Choice> getInferredMatchingStatus() {
		return inferredMatchingStatus == null ? Optional.empty() : Optional.of(inferredMatchingStatus);
	}

	public SecuritiesFinancingStatusAdviceV02 setInferredMatchingStatus(MatchingStatus3Choice inferredMatchingStatus) {
		this.inferredMatchingStatus = inferredMatchingStatus;
		return this;
	}

	public Optional<SettlementStatus2Choice> getSettlementStatus() {
		return settlementStatus == null ? Optional.empty() : Optional.of(settlementStatus);
	}

	public SecuritiesFinancingStatusAdviceV02 setSettlementStatus(SettlementStatus2Choice settlementStatus) {
		this.settlementStatus = settlementStatus;
		return this;
	}

	public Optional<RepoCallRequestStatus2Choice> getRepoCallRequestStatus() {
		return repoCallRequestStatus == null ? Optional.empty() : Optional.of(repoCallRequestStatus);
	}

	public SecuritiesFinancingStatusAdviceV02 setRepoCallRequestStatus(RepoCallRequestStatus2Choice repoCallRequestStatus) {
		this.repoCallRequestStatus = repoCallRequestStatus;
		return this;
	}

	public Optional<SecuritiesFinancingTransactionDetails8> getTransactionDetails() {
		return transactionDetails == null ? Optional.empty() : Optional.of(transactionDetails);
	}

	public SecuritiesFinancingStatusAdviceV02 setTransactionDetails(SecuritiesFinancingTransactionDetails8 transactionDetails) {
		this.transactionDetails = transactionDetails;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public SecuritiesFinancingStatusAdviceV02 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.034.001.02")
	static public class Document {
		@XmlElement(name = "SctiesFincgStsAdvc", required = true)
		public SecuritiesFinancingStatusAdviceV02 messageBody;
	}
}
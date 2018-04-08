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
import com.tools20022.repository.choice.MatchingStatus20Choice;
import com.tools20022.repository.choice.ProcessingStatus38Choice;
import com.tools20022.repository.choice.RepoCallRequestStatus5Choice;
import com.tools20022.repository.choice.SettlementStatus10Choice;
import com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msg.TransactionIdentifications1;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * Scope An securities financing transaction account servicer sends a
 * SecuritiesFinancingStatusAdvice to an account owner to advise the status of a
 * securities financing transaction previously instructed by the account owner.
 * The status advice may be sent as a response to the request of the account
 * owner or not. The account servicer/owner relationship may be: - a central
 * securities depository or another settlement market infrastructure managing
 * securities financing transactions on behalf of their participants - an agent
 * (sub-custodian) managing securities financing transactions on behalf of their
 * global custodian customer, or - a custodian managing securities financing
 * transactions on behalf of an investment management institution or a
 * broker/dealer.
 * 
 * Usage The message may also be used to: - re-send a message previously sent, -
 * provide a third party with a copy of a message for information, - re-send to
 * a third party a copy of a message for information using the relevant elements
 * in the Business Application Header.
 * 
 * ISO 15022 - 20022 Coexistence This ISO 20022 message is reversed engineered
 * from ISO 15022. Both standards will coexist for a certain number of years.
 * Until this coexistence period ends, the usage of certain data types is
 * restricted to ensure interoperability between ISO 15022 and 20022 users.
 * Compliance to these rules is mandatory in a coexistence environment. The
 * coexistence restrictions are described in a Textual Rule linked to the
 * Message Items they concern. These coexistence textual rules are clearly
 * identified as follows: “CoexistenceXxxxRule”.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV04#mmTransactionIdentification
 * SecuritiesFinancingStatusAdviceV04.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV04#mmProcessingStatus
 * SecuritiesFinancingStatusAdviceV04.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV04#mmMatchingStatus
 * SecuritiesFinancingStatusAdviceV04.mmMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV04#mmInferredMatchingStatus
 * SecuritiesFinancingStatusAdviceV04.mmInferredMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV04#mmSettlementStatus
 * SecuritiesFinancingStatusAdviceV04.mmSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV04#mmRepoCallRequestStatus
 * SecuritiesFinancingStatusAdviceV04.mmRepoCallRequestStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV04#mmTransactionDetails
 * SecuritiesFinancingStatusAdviceV04.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV04#mmSupplementaryData
 * SecuritiesFinancingStatusAdviceV04.mmSupplementaryData}</li>
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
 * messageDefinitionIdentifier} = {@code sese.034.001.04}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule#for_sese_SecuritiesFinancingStatusAdviceV04
 * ConstraintCoexistenceCharacterSetXRule.
 * for_sese_SecuritiesFinancingStatusAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule#for_sese_SecuritiesFinancingStatusAdviceV04
 * ConstraintCoexistenceIdentificationRule.
 * for_sese_SecuritiesFinancingStatusAdviceV04}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#for_sese_SecuritiesFinancingStatusAdviceV04
 * ConstraintSettlementStatusAndMatchedRule.
 * for_sese_SecuritiesFinancingStatusAdviceV04}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesFinancingStatusAdviceV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\nAn securities financing transaction account servicer sends a SecuritiesFinancingStatusAdvice to an account owner to advise the status of a securities financing transaction previously instructed by the account owner.\nThe status advice may be sent as a response to the request of the account owner or not.\nThe account servicer/owner relationship may be:\n- a central securities depository or another settlement market infrastructure managing securities financing transactions on behalf of their participants\n- an agent (sub-custodian) managing securities financing transactions on behalf of their global custodian customer, or\n- a custodian managing securities financing transactions on behalf of an investment management institution or a broker/dealer.\n\nUsage\nThe message may also be used to:\n- re-send a message previously sent,\n- provide a third party with a copy of a message for information,\n- re-send to a third party a copy of a message for information\nusing the relevant elements in the Business Application Header.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV05
 * SecuritiesFinancingStatusAdviceV05}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV03
 * SecuritiesFinancingStatusAdviceV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesFinancingStatusAdviceV04", propOrder = {"transactionIdentification", "processingStatus", "matchingStatus", "inferredMatchingStatus", "settlementStatus", "repoCallRequestStatus", "transactionDetails",
		"supplementaryData"})
public class SecuritiesFinancingStatusAdviceV04 {

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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV05#mmTransactionIdentification
	 * SecuritiesFinancingStatusAdviceV05.mmTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV03#mmTransactionIdentification
	 * SecuritiesFinancingStatusAdviceV03.mmTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingStatusAdviceV04, TransactionIdentifications1> mmTransactionIdentification = new MMMessageBuildingBlock<SecuritiesFinancingStatusAdviceV04, TransactionIdentifications1>() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Provides unambiguous transaction identification information.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingStatusAdviceV05.mmTransactionIdentification);
			previousVersion_lazy = () -> SecuritiesFinancingStatusAdviceV03.mmTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransactionIdentifications1.mmObject();
		}

		@Override
		public TransactionIdentifications1 getValue(SecuritiesFinancingStatusAdviceV04 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(SecuritiesFinancingStatusAdviceV04 obj, TransactionIdentifications1 value) {
			obj.setTransactionIdentification(value);
		}
	};
	@XmlElement(name = "PrcgSts")
	protected ProcessingStatus38Choice processingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus38Choice
	 * ProcessingStatus38Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV05#mmProcessingStatus
	 * SecuritiesFinancingStatusAdviceV05.mmProcessingStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV03#mmProcessingStatus
	 * SecuritiesFinancingStatusAdviceV03.mmProcessingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingStatusAdviceV04, Optional<ProcessingStatus38Choice>> mmProcessingStatus = new MMMessageBuildingBlock<SecuritiesFinancingStatusAdviceV04, Optional<ProcessingStatus38Choice>>() {
		{
			xmlTag = "PrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Processing status of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingStatusAdviceV05.mmProcessingStatus);
			previousVersion_lazy = () -> SecuritiesFinancingStatusAdviceV03.mmProcessingStatus;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ProcessingStatus38Choice.mmObject();
		}

		@Override
		public Optional<ProcessingStatus38Choice> getValue(SecuritiesFinancingStatusAdviceV04 obj) {
			return obj.getProcessingStatus();
		}

		@Override
		public void setValue(SecuritiesFinancingStatusAdviceV04 obj, Optional<ProcessingStatus38Choice> value) {
			obj.setProcessingStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "MtchgSts")
	protected MatchingStatus20Choice matchingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus20Choice
	 * MatchingStatus20Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV05#mmMatchingStatus
	 * SecuritiesFinancingStatusAdviceV05.mmMatchingStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV03#mmMatchingStatus
	 * SecuritiesFinancingStatusAdviceV03.mmMatchingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingStatusAdviceV04, Optional<MatchingStatus20Choice>> mmMatchingStatus = new MMMessageBuildingBlock<SecuritiesFinancingStatusAdviceV04, Optional<MatchingStatus20Choice>>() {
		{
			xmlTag = "MtchgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingStatus";
			definition = "Provides the matching status of the instruction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingStatusAdviceV05.mmMatchingStatus);
			previousVersion_lazy = () -> SecuritiesFinancingStatusAdviceV03.mmMatchingStatus;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MatchingStatus20Choice.mmObject();
		}

		@Override
		public Optional<MatchingStatus20Choice> getValue(SecuritiesFinancingStatusAdviceV04 obj) {
			return obj.getMatchingStatus();
		}

		@Override
		public void setValue(SecuritiesFinancingStatusAdviceV04 obj, Optional<MatchingStatus20Choice> value) {
			obj.setMatchingStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "IfrrdMtchgSts")
	protected MatchingStatus20Choice inferredMatchingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus20Choice
	 * MatchingStatus20Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV05#mmInferredMatchingStatus
	 * SecuritiesFinancingStatusAdviceV05.mmInferredMatchingStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV03#mmInferredMatchingStatus
	 * SecuritiesFinancingStatusAdviceV03.mmInferredMatchingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingStatusAdviceV04, Optional<MatchingStatus20Choice>> mmInferredMatchingStatus = new MMMessageBuildingBlock<SecuritiesFinancingStatusAdviceV04, Optional<MatchingStatus20Choice>>() {
		{
			xmlTag = "IfrrdMtchgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InferredMatchingStatus";
			definition = "Provides the matching status of an instruction as per the account servicer based on an allegement. At this time no matching took place on the market (at the CSD/ICSD).";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingStatusAdviceV05.mmInferredMatchingStatus);
			previousVersion_lazy = () -> SecuritiesFinancingStatusAdviceV03.mmInferredMatchingStatus;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MatchingStatus20Choice.mmObject();
		}

		@Override
		public Optional<MatchingStatus20Choice> getValue(SecuritiesFinancingStatusAdviceV04 obj) {
			return obj.getInferredMatchingStatus();
		}

		@Override
		public void setValue(SecuritiesFinancingStatusAdviceV04 obj, Optional<MatchingStatus20Choice> value) {
			obj.setInferredMatchingStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmSts")
	protected SettlementStatus10Choice settlementStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus10Choice
	 * SettlementStatus10Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV05#mmSettlementStatus
	 * SecuritiesFinancingStatusAdviceV05.mmSettlementStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV03#mmSettlementStatus
	 * SecuritiesFinancingStatusAdviceV03.mmSettlementStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingStatusAdviceV04, Optional<SettlementStatus10Choice>> mmSettlementStatus = new MMMessageBuildingBlock<SecuritiesFinancingStatusAdviceV04, Optional<SettlementStatus10Choice>>() {
		{
			xmlTag = "SttlmSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatus";
			definition = "Provides the status of settlement of a transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingStatusAdviceV05.mmSettlementStatus);
			previousVersion_lazy = () -> SecuritiesFinancingStatusAdviceV03.mmSettlementStatus;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementStatus10Choice.mmObject();
		}

		@Override
		public Optional<SettlementStatus10Choice> getValue(SecuritiesFinancingStatusAdviceV04 obj) {
			return obj.getSettlementStatus();
		}

		@Override
		public void setValue(SecuritiesFinancingStatusAdviceV04 obj, Optional<SettlementStatus10Choice> value) {
			obj.setSettlementStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "RepoCallReqSts")
	protected RepoCallRequestStatus5Choice repoCallRequestStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus5Choice
	 * RepoCallRequestStatus5Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV05#mmRepoCallRequestStatus
	 * SecuritiesFinancingStatusAdviceV05.mmRepoCallRequestStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV03#mmRepoCallRequestStatus
	 * SecuritiesFinancingStatusAdviceV03.mmRepoCallRequestStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingStatusAdviceV04, Optional<RepoCallRequestStatus5Choice>> mmRepoCallRequestStatus = new MMMessageBuildingBlock<SecuritiesFinancingStatusAdviceV04, Optional<RepoCallRequestStatus5Choice>>() {
		{
			xmlTag = "RepoCallReqSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepoCallRequestStatus";
			definition = "Provides the status of the repurchase agreement call request.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingStatusAdviceV05.mmRepoCallRequestStatus);
			previousVersion_lazy = () -> SecuritiesFinancingStatusAdviceV03.mmRepoCallRequestStatus;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RepoCallRequestStatus5Choice.mmObject();
		}

		@Override
		public Optional<RepoCallRequestStatus5Choice> getValue(SecuritiesFinancingStatusAdviceV04 obj) {
			return obj.getRepoCallRequestStatus();
		}

		@Override
		public void setValue(SecuritiesFinancingStatusAdviceV04 obj, Optional<RepoCallRequestStatus5Choice> value) {
			obj.setRepoCallRequestStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "TxDtls")
	protected SecuritiesFinancingTransactionDetails21 transactionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails21
	 * SecuritiesFinancingTransactionDetails21}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV05#mmTransactionDetails
	 * SecuritiesFinancingStatusAdviceV05.mmTransactionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV03#mmTransactionDetails
	 * SecuritiesFinancingStatusAdviceV03.mmTransactionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingStatusAdviceV04, Optional<SecuritiesFinancingTransactionDetails21>> mmTransactionDetails = new MMMessageBuildingBlock<SecuritiesFinancingStatusAdviceV04, Optional<SecuritiesFinancingTransactionDetails21>>() {
		{
			xmlTag = "TxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDetails";
			definition = "Identifies the details of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingStatusAdviceV05.mmTransactionDetails);
			previousVersion_lazy = () -> SecuritiesFinancingStatusAdviceV03.mmTransactionDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecuritiesFinancingTransactionDetails21.mmObject();
		}

		@Override
		public Optional<SecuritiesFinancingTransactionDetails21> getValue(SecuritiesFinancingStatusAdviceV04 obj) {
			return obj.getTransactionDetails();
		}

		@Override
		public void setValue(SecuritiesFinancingStatusAdviceV04 obj, Optional<SecuritiesFinancingTransactionDetails21> value) {
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV05#mmSupplementaryData
	 * SecuritiesFinancingStatusAdviceV05.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV03#mmSupplementaryData
	 * SecuritiesFinancingStatusAdviceV03.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesFinancingStatusAdviceV04, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<SecuritiesFinancingStatusAdviceV04, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingStatusAdviceV05.mmSupplementaryData);
			previousVersion_lazy = () -> SecuritiesFinancingStatusAdviceV03.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(SecuritiesFinancingStatusAdviceV04 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(SecuritiesFinancingStatusAdviceV04 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceCharacterSetXRule.for_sese_SecuritiesFinancingStatusAdviceV04,
						com.tools20022.repository.constraints.ConstraintCoexistenceIdentificationRule.for_sese_SecuritiesFinancingStatusAdviceV04,
						com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.for_sese_SecuritiesFinancingStatusAdviceV04);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesFinancingStatusAdviceV04";
				definition = "Scope\nAn securities financing transaction account servicer sends a SecuritiesFinancingStatusAdvice to an account owner to advise the status of a securities financing transaction previously instructed by the account owner.\nThe status advice may be sent as a response to the request of the account owner or not.\nThe account servicer/owner relationship may be:\n- a central securities depository or another settlement market infrastructure managing securities financing transactions on behalf of their participants\n- an agent (sub-custodian) managing securities financing transactions on behalf of their global custodian customer, or\n- a custodian managing securities financing transactions on behalf of an investment management institution or a broker/dealer.\n\nUsage\nThe message may also be used to:\n- re-send a message previously sent,\n- provide a third party with a copy of a message for information,\n- re-send to a third party a copy of a message for information\nusing the relevant elements in the Business Application Header.\n\nISO 15022 - 20022 Coexistence\nThis ISO 20022 message is reversed engineered from ISO 15022. Both standards will coexist for a certain number of years. Until this coexistence period ends, the usage of certain data types is restricted to ensure interoperability between ISO 15022 and 20022 users. Compliance to these rules is mandatory in a coexistence environment. The coexistence restrictions are described in a Textual Rule linked to the Message Items they concern. These coexistence textual rules are clearly identified as follows: “CoexistenceXxxxRule”.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesFinancingStatusAdviceV05.mmObject());
				previousVersion_lazy = () -> SecuritiesFinancingStatusAdviceV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesFincgStsAdvc";
				businessArea_lazy = () -> SecuritiesSettlementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV04.mmTransactionIdentification,
						com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV04.mmProcessingStatus, com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV04.mmMatchingStatus,
						com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV04.mmInferredMatchingStatus, com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV04.mmSettlementStatus,
						com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV04.mmRepoCallRequestStatus, com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV04.mmTransactionDetails,
						com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV04.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "034";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesFinancingStatusAdviceV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TransactionIdentifications1 getTransactionIdentification() {
		return transactionIdentification;
	}

	public SecuritiesFinancingStatusAdviceV04 setTransactionIdentification(TransactionIdentifications1 transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Optional<ProcessingStatus38Choice> getProcessingStatus() {
		return processingStatus == null ? Optional.empty() : Optional.of(processingStatus);
	}

	public SecuritiesFinancingStatusAdviceV04 setProcessingStatus(ProcessingStatus38Choice processingStatus) {
		this.processingStatus = processingStatus;
		return this;
	}

	public Optional<MatchingStatus20Choice> getMatchingStatus() {
		return matchingStatus == null ? Optional.empty() : Optional.of(matchingStatus);
	}

	public SecuritiesFinancingStatusAdviceV04 setMatchingStatus(MatchingStatus20Choice matchingStatus) {
		this.matchingStatus = matchingStatus;
		return this;
	}

	public Optional<MatchingStatus20Choice> getInferredMatchingStatus() {
		return inferredMatchingStatus == null ? Optional.empty() : Optional.of(inferredMatchingStatus);
	}

	public SecuritiesFinancingStatusAdviceV04 setInferredMatchingStatus(MatchingStatus20Choice inferredMatchingStatus) {
		this.inferredMatchingStatus = inferredMatchingStatus;
		return this;
	}

	public Optional<SettlementStatus10Choice> getSettlementStatus() {
		return settlementStatus == null ? Optional.empty() : Optional.of(settlementStatus);
	}

	public SecuritiesFinancingStatusAdviceV04 setSettlementStatus(SettlementStatus10Choice settlementStatus) {
		this.settlementStatus = settlementStatus;
		return this;
	}

	public Optional<RepoCallRequestStatus5Choice> getRepoCallRequestStatus() {
		return repoCallRequestStatus == null ? Optional.empty() : Optional.of(repoCallRequestStatus);
	}

	public SecuritiesFinancingStatusAdviceV04 setRepoCallRequestStatus(RepoCallRequestStatus5Choice repoCallRequestStatus) {
		this.repoCallRequestStatus = repoCallRequestStatus;
		return this;
	}

	public Optional<SecuritiesFinancingTransactionDetails21> getTransactionDetails() {
		return transactionDetails == null ? Optional.empty() : Optional.of(transactionDetails);
	}

	public SecuritiesFinancingStatusAdviceV04 setTransactionDetails(SecuritiesFinancingTransactionDetails21 transactionDetails) {
		this.transactionDetails = transactionDetails;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public SecuritiesFinancingStatusAdviceV04 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.034.001.04")
	static public class Document {
		@XmlElement(name = "SctiesFincgStsAdvc", required = true)
		public SecuritiesFinancingStatusAdviceV04 messageBody;
	}
}
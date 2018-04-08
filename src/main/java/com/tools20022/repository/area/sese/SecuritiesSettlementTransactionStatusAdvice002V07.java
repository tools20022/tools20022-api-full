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
import com.tools20022.repository.area.SecuritiesSettlementArchivesubsetsvariants;
import com.tools20022.repository.choice.MatchingStatus32Choice;
import com.tools20022.repository.choice.ProcessingStatus63Choice;
import com.tools20022.repository.choice.SettlementStatus22Choice;
import com.tools20022.repository.msg.Linkages50;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msg.TransactionDetails87;
import com.tools20022.repository.msg.TransactionIdentifications38;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer sends a SecuritiesSettlementTransactionStatusAdvice to an
 * account owner to advise the status of a securities settlement transaction
 * instruction previously sent by the account owner or the status of a
 * settlement transaction existing in the books of the servicer for the account
 * of the owner. The status may be a processing, pending processing, internal
 * matching, matching and/or settlement status.<br>
 * The status advice may be sent as a response to the request of the account
 * owner or not.<br>
 * The account servicer/owner relationship may be:<br>
 * - a central securities depository or another settlement market infrastructure
 * acting on behalf of their participants<br>
 * - an agent (sub-custodian) acting on behalf of their global custodian
 * customer, or<br>
 * - a custodian acting on behalf of an investment management institution or a
 * broker/dealer.<br>
 * <br>
 * <b>Usage</b><br>
 * The message may also be used to:<br>
 * - re-send a message previously sent,<br>
 * - provide a third party with a copy of a message for information,<br>
 * - re-send to a third party a copy of a message for information<br>
 * using the relevant elements in the Business Application Header.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V07#mmTransactionIdentification
 * SecuritiesSettlementTransactionStatusAdvice002V07.mmTransactionIdentification
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V07#mmLinkages
 * SecuritiesSettlementTransactionStatusAdvice002V07.mmLinkages}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V07#mmProcessingStatus
 * SecuritiesSettlementTransactionStatusAdvice002V07.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V07#mmInferredMatchingStatus
 * SecuritiesSettlementTransactionStatusAdvice002V07.mmInferredMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V07#mmMatchingStatus
 * SecuritiesSettlementTransactionStatusAdvice002V07.mmMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V07#mmSettlementStatus
 * SecuritiesSettlementTransactionStatusAdvice002V07.mmSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V07#mmTransactionDetails
 * SecuritiesSettlementTransactionStatusAdvice002V07.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V07#mmSupplementaryData
 * SecuritiesSettlementTransactionStatusAdvice002V07.mmSupplementaryData}</li>
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
 * xmlTag} = "SctiesSttlmTxStsAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementArchivesubsetsvariants
 * SecuritiesSettlementArchivesubsetsvariants}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.024.002.07}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintProcessingStatusPresenceRule#for_sese_SecuritiesSettlementTransactionStatusAdvice002V07
 * ConstraintProcessingStatusPresenceRule.
 * for_sese_SecuritiesSettlementTransactionStatusAdvice002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMatchingStatusPresenceRule#for_sese_SecuritiesSettlementTransactionStatusAdvice002V07
 * ConstraintMatchingStatusPresenceRule.
 * for_sese_SecuritiesSettlementTransactionStatusAdvice002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusPresenceRule#for_sese_SecuritiesSettlementTransactionStatusAdvice002V07
 * ConstraintSettlementStatusPresenceRule.
 * for_sese_SecuritiesSettlementTransactionStatusAdvice002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInferredMatchingStatusStatusPresenceRule#for_sese_SecuritiesSettlementTransactionStatusAdvice002V07
 * ConstraintInferredMatchingStatusStatusPresenceRule.
 * for_sese_SecuritiesSettlementTransactionStatusAdvice002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#for_sese_SecuritiesSettlementTransactionStatusAdvice002V07
 * ConstraintSettlementStatusAndMatchedRule.
 * for_sese_SecuritiesSettlementTransactionStatusAdvice002V07}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesSettlementTransactionStatusAdvice002V07
 * ConstraintSecuritiesMarketPracticeGroupGuideline.
 * for_sese_SecuritiesSettlementTransactionStatusAdvice002V07}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesSettlementTransactionStatusAdvice002V07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends a SecuritiesSettlementTransactionStatusAdvice to an account owner to advise the status of a securities settlement transaction instruction previously sent by the account owner or the status of a settlement transaction existing in the books of the servicer for the account of the owner. The status may be a processing, pending processing, internal matching, matching and/or settlement status.\r\nThe status advice may be sent as a response to the request of the account owner or not.\r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\r\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or\r\n- a custodian acting on behalf of an investment management institution or a broker/dealer.\r\n\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information\r\nusing the relevant elements in the Business Application Header."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V08
 * SecuritiesSettlementTransactionStatusAdvice002V08}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesSettlementTransactionStatusAdvice002V07", propOrder = {"transactionIdentification", "linkages", "processingStatus", "inferredMatchingStatus", "matchingStatus", "settlementStatus", "transactionDetails",
		"supplementaryData"})
public class SecuritiesSettlementTransactionStatusAdvice002V07 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxId", required = true)
	protected TransactionIdentifications38 transactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications38
	 * TransactionIdentifications38}</li>
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
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionStatusAdvice002V07, TransactionIdentifications38> mmTransactionIdentification = new MMMessageBuildingBlock<SecuritiesSettlementTransactionStatusAdvice002V07, TransactionIdentifications38>() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Provides unambiguous transaction identification information.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransactionIdentifications38.mmObject();
		}

		@Override
		public TransactionIdentifications38 getValue(SecuritiesSettlementTransactionStatusAdvice002V07 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionStatusAdvice002V07 obj, TransactionIdentifications38 value) {
			obj.setTransactionIdentification(value);
		}
	};
	@XmlElement(name = "Lnkgs")
	protected Linkages50 linkages;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Linkages50
	 * Linkages50}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lnkgs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Linkages"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Link to another transaction - provided for information only."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionStatusAdvice002V07, Optional<Linkages50>> mmLinkages = new MMMessageBuildingBlock<SecuritiesSettlementTransactionStatusAdvice002V07, Optional<Linkages50>>() {
		{
			xmlTag = "Lnkgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Linkages";
			definition = "Link to another transaction - provided for information only.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Linkages50.mmObject();
		}

		@Override
		public Optional<Linkages50> getValue(SecuritiesSettlementTransactionStatusAdvice002V07 obj) {
			return obj.getLinkages();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionStatusAdvice002V07 obj, Optional<Linkages50> value) {
			obj.setLinkages(value.orElse(null));
		}
	};
	@XmlElement(name = "PrcgSts")
	protected ProcessingStatus63Choice processingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus63Choice
	 * ProcessingStatus63Choice}</li>
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
	 * definition} =
	 * "Provides details on the processing status of the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionStatusAdvice002V07, Optional<ProcessingStatus63Choice>> mmProcessingStatus = new MMMessageBuildingBlock<SecuritiesSettlementTransactionStatusAdvice002V07, Optional<ProcessingStatus63Choice>>() {
		{
			xmlTag = "PrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Provides details on the processing status of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ProcessingStatus63Choice.mmObject();
		}

		@Override
		public Optional<ProcessingStatus63Choice> getValue(SecuritiesSettlementTransactionStatusAdvice002V07 obj) {
			return obj.getProcessingStatus();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionStatusAdvice002V07 obj, Optional<ProcessingStatus63Choice> value) {
			obj.setProcessingStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "IfrrdMtchgSts")
	protected MatchingStatus32Choice inferredMatchingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus32Choice
	 * MatchingStatus32Choice}</li>
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
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionStatusAdvice002V07, Optional<MatchingStatus32Choice>> mmInferredMatchingStatus = new MMMessageBuildingBlock<SecuritiesSettlementTransactionStatusAdvice002V07, Optional<MatchingStatus32Choice>>() {
		{
			xmlTag = "IfrrdMtchgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InferredMatchingStatus";
			definition = "Provides the matching status of an instruction as per the account servicer based on an allegement. At this time no matching took place on the market (at the CSD/ICSD).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MatchingStatus32Choice.mmObject();
		}

		@Override
		public Optional<MatchingStatus32Choice> getValue(SecuritiesSettlementTransactionStatusAdvice002V07 obj) {
			return obj.getInferredMatchingStatus();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionStatusAdvice002V07 obj, Optional<MatchingStatus32Choice> value) {
			obj.setInferredMatchingStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "MtchgSts")
	protected MatchingStatus32Choice matchingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus32Choice
	 * MatchingStatus32Choice}</li>
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
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionStatusAdvice002V07, Optional<MatchingStatus32Choice>> mmMatchingStatus = new MMMessageBuildingBlock<SecuritiesSettlementTransactionStatusAdvice002V07, Optional<MatchingStatus32Choice>>() {
		{
			xmlTag = "MtchgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingStatus";
			definition = "Provides the matching status of the instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MatchingStatus32Choice.mmObject();
		}

		@Override
		public Optional<MatchingStatus32Choice> getValue(SecuritiesSettlementTransactionStatusAdvice002V07 obj) {
			return obj.getMatchingStatus();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionStatusAdvice002V07 obj, Optional<MatchingStatus32Choice> value) {
			obj.setMatchingStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "SttlmSts")
	protected SettlementStatus22Choice settlementStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus22Choice
	 * SettlementStatus22Choice}</li>
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
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionStatusAdvice002V07, Optional<SettlementStatus22Choice>> mmSettlementStatus = new MMMessageBuildingBlock<SecuritiesSettlementTransactionStatusAdvice002V07, Optional<SettlementStatus22Choice>>() {
		{
			xmlTag = "SttlmSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatus";
			definition = "Provides the status of settlement of a transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementStatus22Choice.mmObject();
		}

		@Override
		public Optional<SettlementStatus22Choice> getValue(SecuritiesSettlementTransactionStatusAdvice002V07 obj) {
			return obj.getSettlementStatus();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionStatusAdvice002V07 obj, Optional<SettlementStatus22Choice> value) {
			obj.setSettlementStatus(value.orElse(null));
		}
	};
	@XmlElement(name = "TxDtls")
	protected TransactionDetails87 transactionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails87
	 * TransactionDetails87}</li>
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
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionStatusAdvice002V07, Optional<TransactionDetails87>> mmTransactionDetails = new MMMessageBuildingBlock<SecuritiesSettlementTransactionStatusAdvice002V07, Optional<TransactionDetails87>>() {
		{
			xmlTag = "TxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDetails";
			definition = "Identifies the details of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TransactionDetails87.mmObject();
		}

		@Override
		public Optional<TransactionDetails87> getValue(SecuritiesSettlementTransactionStatusAdvice002V07 obj) {
			return obj.getTransactionDetails();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionStatusAdvice002V07 obj, Optional<TransactionDetails87> value) {
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
	public static final MMMessageBuildingBlock<SecuritiesSettlementTransactionStatusAdvice002V07, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<SecuritiesSettlementTransactionStatusAdvice002V07, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(SecuritiesSettlementTransactionStatusAdvice002V07 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(SecuritiesSettlementTransactionStatusAdvice002V07 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintProcessingStatusPresenceRule.for_sese_SecuritiesSettlementTransactionStatusAdvice002V07,
						com.tools20022.repository.constraints.ConstraintMatchingStatusPresenceRule.for_sese_SecuritiesSettlementTransactionStatusAdvice002V07,
						com.tools20022.repository.constraints.ConstraintSettlementStatusPresenceRule.for_sese_SecuritiesSettlementTransactionStatusAdvice002V07,
						com.tools20022.repository.constraints.ConstraintInferredMatchingStatusStatusPresenceRule.for_sese_SecuritiesSettlementTransactionStatusAdvice002V07,
						com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.for_sese_SecuritiesSettlementTransactionStatusAdvice002V07,
						com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesSettlementTransactionStatusAdvice002V07);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlementTransactionStatusAdvice002V07";
				definition = "Scope\r\nAn account servicer sends a SecuritiesSettlementTransactionStatusAdvice to an account owner to advise the status of a securities settlement transaction instruction previously sent by the account owner or the status of a settlement transaction existing in the books of the servicer for the account of the owner. The status may be a processing, pending processing, internal matching, matching and/or settlement status.\r\nThe status advice may be sent as a response to the request of the account owner or not.\r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\r\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or\r\n- a custodian acting on behalf of an investment management institution or a broker/dealer.\r\n\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information\r\nusing the relevant elements in the Business Application Header.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionStatusAdvice002V08.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesSttlmTxStsAdvc";
				businessArea_lazy = () -> SecuritiesSettlementArchivesubsetsvariants.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V07.mmTransactionIdentification,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V07.mmLinkages, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V07.mmProcessingStatus,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V07.mmInferredMatchingStatus, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V07.mmMatchingStatus,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V07.mmSettlementStatus, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V07.mmTransactionDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdvice002V07.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "024";
						version = "07";
						flavour = "002";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesSettlementTransactionStatusAdvice002V07.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TransactionIdentifications38 getTransactionIdentification() {
		return transactionIdentification;
	}

	public SecuritiesSettlementTransactionStatusAdvice002V07 setTransactionIdentification(TransactionIdentifications38 transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Optional<Linkages50> getLinkages() {
		return linkages == null ? Optional.empty() : Optional.of(linkages);
	}

	public SecuritiesSettlementTransactionStatusAdvice002V07 setLinkages(Linkages50 linkages) {
		this.linkages = linkages;
		return this;
	}

	public Optional<ProcessingStatus63Choice> getProcessingStatus() {
		return processingStatus == null ? Optional.empty() : Optional.of(processingStatus);
	}

	public SecuritiesSettlementTransactionStatusAdvice002V07 setProcessingStatus(ProcessingStatus63Choice processingStatus) {
		this.processingStatus = processingStatus;
		return this;
	}

	public Optional<MatchingStatus32Choice> getInferredMatchingStatus() {
		return inferredMatchingStatus == null ? Optional.empty() : Optional.of(inferredMatchingStatus);
	}

	public SecuritiesSettlementTransactionStatusAdvice002V07 setInferredMatchingStatus(MatchingStatus32Choice inferredMatchingStatus) {
		this.inferredMatchingStatus = inferredMatchingStatus;
		return this;
	}

	public Optional<MatchingStatus32Choice> getMatchingStatus() {
		return matchingStatus == null ? Optional.empty() : Optional.of(matchingStatus);
	}

	public SecuritiesSettlementTransactionStatusAdvice002V07 setMatchingStatus(MatchingStatus32Choice matchingStatus) {
		this.matchingStatus = matchingStatus;
		return this;
	}

	public Optional<SettlementStatus22Choice> getSettlementStatus() {
		return settlementStatus == null ? Optional.empty() : Optional.of(settlementStatus);
	}

	public SecuritiesSettlementTransactionStatusAdvice002V07 setSettlementStatus(SettlementStatus22Choice settlementStatus) {
		this.settlementStatus = settlementStatus;
		return this;
	}

	public Optional<TransactionDetails87> getTransactionDetails() {
		return transactionDetails == null ? Optional.empty() : Optional.of(transactionDetails);
	}

	public SecuritiesSettlementTransactionStatusAdvice002V07 setTransactionDetails(TransactionDetails87 transactionDetails) {
		this.transactionDetails = transactionDetails;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public SecuritiesSettlementTransactionStatusAdvice002V07 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.024.002.07")
	static public class Document {
		@XmlElement(name = "SctiesSttlmTxStsAdvc", required = true)
		public SecuritiesSettlementTransactionStatusAdvice002V07 messageBody;
	}
}
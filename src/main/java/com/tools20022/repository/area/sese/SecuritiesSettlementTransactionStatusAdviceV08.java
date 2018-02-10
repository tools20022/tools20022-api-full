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
import com.tools20022.repository.area.SecuritiesSettlementPreviousVersion;
import com.tools20022.repository.choice.MatchingStatus24Choice;
import com.tools20022.repository.choice.ProcessingStatus48Choice;
import com.tools20022.repository.choice.SettlementStatus17Choice;
import com.tools20022.repository.msg.Linkages41;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msg.TransactionDetails97;
import com.tools20022.repository.msg.TransactionIdentifications31;
import com.tools20022.repository.msgset.SettlementAndReconciliationISOLatestversion;
import com.tools20022.repository.msgset.SettlementandReconciliationMaintenance20162017;
import java.lang.reflect.Method;
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
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV08#mmTransactionIdentification
 * SecuritiesSettlementTransactionStatusAdviceV08.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV08#mmLinkages
 * SecuritiesSettlementTransactionStatusAdviceV08.mmLinkages}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV08#mmProcessingStatus
 * SecuritiesSettlementTransactionStatusAdviceV08.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV08#mmInferredMatchingStatus
 * SecuritiesSettlementTransactionStatusAdviceV08.mmInferredMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV08#mmMatchingStatus
 * SecuritiesSettlementTransactionStatusAdviceV08.mmMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV08#mmSettlementStatus
 * SecuritiesSettlementTransactionStatusAdviceV08.mmSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV08#mmTransactionDetails
 * SecuritiesSettlementTransactionStatusAdviceV08.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV08#mmSupplementaryData
 * SecuritiesSettlementTransactionStatusAdviceV08.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.SettlementAndReconciliationISOLatestversion
 * SettlementAndReconciliationISOLatestversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.SettlementandReconciliationMaintenance20162017
 * SettlementandReconciliationMaintenance20162017}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesSttlmTxStsAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementPreviousVersion
 * SecuritiesSettlementPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.024.001.08}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintProcessingStatusPresenceRule#forSecuritiesSettlementTransactionStatusAdviceV08
 * ConstraintProcessingStatusPresenceRule.
 * forSecuritiesSettlementTransactionStatusAdviceV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintMatchingStatusPresenceRule#forSecuritiesSettlementTransactionStatusAdviceV08
 * ConstraintMatchingStatusPresenceRule.
 * forSecuritiesSettlementTransactionStatusAdviceV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusPresenceRule#forSecuritiesSettlementTransactionStatusAdviceV08
 * ConstraintSettlementStatusPresenceRule.
 * forSecuritiesSettlementTransactionStatusAdviceV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintInferredMatchingStatusStatusPresenceRule#forSecuritiesSettlementTransactionStatusAdviceV08
 * ConstraintInferredMatchingStatusStatusPresenceRule.
 * forSecuritiesSettlementTransactionStatusAdviceV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#forSecuritiesSettlementTransactionStatusAdviceV08
 * ConstraintSettlementStatusAndMatchedRule.
 * forSecuritiesSettlementTransactionStatusAdviceV08}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#forSecuritiesSettlementTransactionStatusAdviceV08
 * ConstraintSecuritiesMarketPracticeGroupGuideline.
 * forSecuritiesSettlementTransactionStatusAdviceV08}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesSettlementTransactionStatusAdviceV08"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends a SecuritiesSettlementTransactionStatusAdvice to an account owner to advise the status of a securities settlement transaction instruction previously sent by the account owner or the status of a settlement transaction existing in the books of the servicer for the account of the owner. The status may be a processing, pending processing, internal matching, matching and/or settlement status.\r\nThe status advice may be sent as a response to the request of the account owner or not.\r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\r\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or\r\n- a custodian acting on behalf of an investment management institution or a broker/dealer.\r\n\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information\r\nusing the relevant elements in the Business Application Header."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV09
 * SecuritiesSettlementTransactionStatusAdviceV09}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV07
 * SecuritiesSettlementTransactionStatusAdviceV07}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesSettlementTransactionStatusAdviceV08", propOrder = {"transactionIdentification", "linkages", "processingStatus", "inferredMatchingStatus", "matchingStatus", "settlementStatus", "transactionDetails",
		"supplementaryData"})
public class SecuritiesSettlementTransactionStatusAdviceV08 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxId", required = true)
	protected TransactionIdentifications31 transactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications31
	 * TransactionIdentifications31}</li>
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV09#mmTransactionIdentification
	 * SecuritiesSettlementTransactionStatusAdviceV09.
	 * mmTransactionIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV07#mmTransactionIdentification
	 * SecuritiesSettlementTransactionStatusAdviceV07.
	 * mmTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Provides unambiguous transaction identification information.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionStatusAdviceV09.mmTransactionIdentification);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV07.mmTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransactionIdentifications31.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionStatusAdviceV08.class.getMethod("getTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Lnkgs")
	protected Linkages41 linkages;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Linkages41
	 * Linkages41}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV09#mmLinkages
	 * SecuritiesSettlementTransactionStatusAdviceV09.mmLinkages}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV07#mmLinkages
	 * SecuritiesSettlementTransactionStatusAdviceV07.mmLinkages}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmLinkages = new MMMessageBuildingBlock() {
		{
			xmlTag = "Lnkgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Linkages";
			definition = "Link to another transaction - provided for information only.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionStatusAdviceV09.mmLinkages);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV07.mmLinkages;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Linkages41.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionStatusAdviceV08.class.getMethod("getLinkages", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "PrcgSts")
	protected ProcessingStatus48Choice processingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus48Choice
	 * ProcessingStatus48Choice}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV09#mmProcessingStatus
	 * SecuritiesSettlementTransactionStatusAdviceV09.mmProcessingStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV07#mmProcessingStatus
	 * SecuritiesSettlementTransactionStatusAdviceV07.mmProcessingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmProcessingStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Provides details on the processing status of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionStatusAdviceV09.mmProcessingStatus);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV07.mmProcessingStatus;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ProcessingStatus48Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionStatusAdviceV08.class.getMethod("getProcessingStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "IfrrdMtchgSts")
	protected MatchingStatus24Choice inferredMatchingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus24Choice
	 * MatchingStatus24Choice}</li>
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV09#mmInferredMatchingStatus
	 * SecuritiesSettlementTransactionStatusAdviceV09.mmInferredMatchingStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV07#mmInferredMatchingStatus
	 * SecuritiesSettlementTransactionStatusAdviceV07.mmInferredMatchingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInferredMatchingStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "IfrrdMtchgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InferredMatchingStatus";
			definition = "Provides the matching status of an instruction as per the account servicer based on an allegement. At this time no matching took place on the market (at the CSD/ICSD).";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionStatusAdviceV09.mmInferredMatchingStatus);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV07.mmInferredMatchingStatus;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MatchingStatus24Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionStatusAdviceV08.class.getMethod("getInferredMatchingStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "MtchgSts")
	protected MatchingStatus24Choice matchingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus24Choice
	 * MatchingStatus24Choice}</li>
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV09#mmMatchingStatus
	 * SecuritiesSettlementTransactionStatusAdviceV09.mmMatchingStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV07#mmMatchingStatus
	 * SecuritiesSettlementTransactionStatusAdviceV07.mmMatchingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMatchingStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "MtchgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingStatus";
			definition = "Provides the matching status of the instruction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionStatusAdviceV09.mmMatchingStatus);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV07.mmMatchingStatus;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MatchingStatus24Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionStatusAdviceV08.class.getMethod("getMatchingStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SttlmSts")
	protected SettlementStatus17Choice settlementStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus17Choice
	 * SettlementStatus17Choice}</li>
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV09#mmSettlementStatus
	 * SecuritiesSettlementTransactionStatusAdviceV09.mmSettlementStatus}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV07#mmSettlementStatus
	 * SecuritiesSettlementTransactionStatusAdviceV07.mmSettlementStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSettlementStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "SttlmSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatus";
			definition = "Provides the status of settlement of a transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionStatusAdviceV09.mmSettlementStatus);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV07.mmSettlementStatus;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementStatus17Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionStatusAdviceV08.class.getMethod("getSettlementStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "TxDtls")
	protected TransactionDetails97 transactionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails97
	 * TransactionDetails97}</li>
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV09#mmTransactionDetails
	 * SecuritiesSettlementTransactionStatusAdviceV09.mmTransactionDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV07#mmTransactionDetails
	 * SecuritiesSettlementTransactionStatusAdviceV07.mmTransactionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDetails";
			definition = "Identifies the details of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionStatusAdviceV09.mmTransactionDetails);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV07.mmTransactionDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TransactionDetails97.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionStatusAdviceV08.class.getMethod("getTransactionDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV09#mmSupplementaryData
	 * SecuritiesSettlementTransactionStatusAdviceV09.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV07#mmSupplementaryData
	 * SecuritiesSettlementTransactionStatusAdviceV07.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionStatusAdviceV09.mmSupplementaryData);
			previousVersion_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV07.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesSettlementTransactionStatusAdviceV08.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintProcessingStatusPresenceRule.forSecuritiesSettlementTransactionStatusAdviceV08,
						com.tools20022.repository.constraints.ConstraintMatchingStatusPresenceRule.forSecuritiesSettlementTransactionStatusAdviceV08,
						com.tools20022.repository.constraints.ConstraintSettlementStatusPresenceRule.forSecuritiesSettlementTransactionStatusAdviceV08,
						com.tools20022.repository.constraints.ConstraintInferredMatchingStatusStatusPresenceRule.forSecuritiesSettlementTransactionStatusAdviceV08,
						com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.forSecuritiesSettlementTransactionStatusAdviceV08,
						com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.forSecuritiesSettlementTransactionStatusAdviceV08);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlementTransactionStatusAdviceV08";
				definition = "Scope\r\nAn account servicer sends a SecuritiesSettlementTransactionStatusAdvice to an account owner to advise the status of a securities settlement transaction instruction previously sent by the account owner or the status of a settlement transaction existing in the books of the servicer for the account of the owner. The status may be a processing, pending processing, internal matching, matching and/or settlement status.\r\nThe status advice may be sent as a response to the request of the account owner or not.\r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\r\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or\r\n- a custodian acting on behalf of an investment management institution or a broker/dealer.\r\n\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information\r\nusing the relevant elements in the Business Application Header.";
				nextVersions_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionStatusAdviceV09.mmObject());
				previousVersion_lazy = () -> SecuritiesSettlementTransactionStatusAdviceV07.mmObject();
				messageSet_lazy = () -> Arrays.asList(SettlementAndReconciliationISOLatestversion.mmObject(), SettlementandReconciliationMaintenance20162017.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesSttlmTxStsAdvc";
				businessArea_lazy = () -> SecuritiesSettlementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV08.mmTransactionIdentification,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV08.mmLinkages, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV08.mmProcessingStatus,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV08.mmInferredMatchingStatus, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV08.mmMatchingStatus,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV08.mmSettlementStatus, com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV08.mmTransactionDetails,
						com.tools20022.repository.area.sese.SecuritiesSettlementTransactionStatusAdviceV08.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "024";
						version = "08";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesSettlementTransactionStatusAdviceV08.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TransactionIdentifications31 getTransactionIdentification() {
		return transactionIdentification;
	}

	public SecuritiesSettlementTransactionStatusAdviceV08 setTransactionIdentification(TransactionIdentifications31 transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Optional<Linkages41> getLinkages() {
		return linkages == null ? Optional.empty() : Optional.of(linkages);
	}

	public SecuritiesSettlementTransactionStatusAdviceV08 setLinkages(Linkages41 linkages) {
		this.linkages = linkages;
		return this;
	}

	public Optional<ProcessingStatus48Choice> getProcessingStatus() {
		return processingStatus == null ? Optional.empty() : Optional.of(processingStatus);
	}

	public SecuritiesSettlementTransactionStatusAdviceV08 setProcessingStatus(ProcessingStatus48Choice processingStatus) {
		this.processingStatus = processingStatus;
		return this;
	}

	public Optional<MatchingStatus24Choice> getInferredMatchingStatus() {
		return inferredMatchingStatus == null ? Optional.empty() : Optional.of(inferredMatchingStatus);
	}

	public SecuritiesSettlementTransactionStatusAdviceV08 setInferredMatchingStatus(MatchingStatus24Choice inferredMatchingStatus) {
		this.inferredMatchingStatus = inferredMatchingStatus;
		return this;
	}

	public Optional<MatchingStatus24Choice> getMatchingStatus() {
		return matchingStatus == null ? Optional.empty() : Optional.of(matchingStatus);
	}

	public SecuritiesSettlementTransactionStatusAdviceV08 setMatchingStatus(MatchingStatus24Choice matchingStatus) {
		this.matchingStatus = matchingStatus;
		return this;
	}

	public Optional<SettlementStatus17Choice> getSettlementStatus() {
		return settlementStatus == null ? Optional.empty() : Optional.of(settlementStatus);
	}

	public SecuritiesSettlementTransactionStatusAdviceV08 setSettlementStatus(SettlementStatus17Choice settlementStatus) {
		this.settlementStatus = settlementStatus;
		return this;
	}

	public Optional<TransactionDetails97> getTransactionDetails() {
		return transactionDetails == null ? Optional.empty() : Optional.of(transactionDetails);
	}

	public SecuritiesSettlementTransactionStatusAdviceV08 setTransactionDetails(TransactionDetails97 transactionDetails) {
		this.transactionDetails = transactionDetails;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public SecuritiesSettlementTransactionStatusAdviceV08 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.024.001.08")
	static public class Document {
		@XmlElement(name = "SctiesSttlmTxStsAdvc", required = true)
		public SecuritiesSettlementTransactionStatusAdviceV08 messageBody;
	}
}
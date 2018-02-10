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
import com.tools20022.repository.area.SecuritiesSettlementLatestVersion;
import com.tools20022.repository.choice.MatchingStatus26Choice;
import com.tools20022.repository.choice.ProcessingStatus51Choice;
import com.tools20022.repository.choice.RepoCallRequestStatus7Choice;
import com.tools20022.repository.choice.SettlementStatus18Choice;
import com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msg.TransactionIdentifications32;
import com.tools20022.repository.msgset.SettlementAndReconciliationISOLatestversion;
import com.tools20022.repository.msgset.SettlementandReconciliationMaintenance20162017;
import java.lang.reflect.Method;
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
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV07#mmTransactionIdentification
 * SecuritiesFinancingStatusAdviceV07.mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV07#mmProcessingStatus
 * SecuritiesFinancingStatusAdviceV07.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV07#mmMatchingStatus
 * SecuritiesFinancingStatusAdviceV07.mmMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV07#mmInferredMatchingStatus
 * SecuritiesFinancingStatusAdviceV07.mmInferredMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV07#mmSettlementStatus
 * SecuritiesFinancingStatusAdviceV07.mmSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV07#mmRepoCallRequestStatus
 * SecuritiesFinancingStatusAdviceV07.mmRepoCallRequestStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV07#mmTransactionDetails
 * SecuritiesFinancingStatusAdviceV07.mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV07#mmSupplementaryData
 * SecuritiesFinancingStatusAdviceV07.mmSupplementaryData}</li>
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
 * xmlTag} = "SctiesFincgStsAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementLatestVersion
 * SecuritiesSettlementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.034.001.07}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule#forSecuritiesFinancingStatusAdviceV07
 * ConstraintSettlementStatusAndMatchedRule.
 * forSecuritiesFinancingStatusAdviceV07}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesFinancingStatusAdviceV07"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn securities financing transaction account servicer sends a SecuritiesFinancingStatusAdvice to an account owner to advise the status of a securities financing transaction previously instructed by the account owner.\r\nThe status advice may be sent as a response to the request of the account owner or not.\r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure managing securities financing transactions on behalf of their participants\r\n- an agent (sub-custodian) managing securities financing transactions on behalf of their global custodian customer, or\r\n- a custodian managing securities financing transactions on behalf of an investment management institution or a broker/dealer.\r\n\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information\r\nusing the relevant elements in the Business Application Header."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV06
 * SecuritiesFinancingStatusAdviceV06}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesFinancingStatusAdviceV07", propOrder = {"transactionIdentification", "processingStatus", "matchingStatus", "inferredMatchingStatus", "settlementStatus", "repoCallRequestStatus", "transactionDetails",
		"supplementaryData"})
public class SecuritiesFinancingStatusAdviceV07 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxId", required = true)
	protected TransactionIdentifications32 transactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications32
	 * TransactionIdentifications32}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV06#mmTransactionIdentification
	 * SecuritiesFinancingStatusAdviceV06.mmTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Provides unambiguous transaction identification information.";
			previousVersion_lazy = () -> SecuritiesFinancingStatusAdviceV06.mmTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TransactionIdentifications32.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingStatusAdviceV07.class.getMethod("getTransactionIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "PrcgSts")
	protected ProcessingStatus51Choice processingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus51Choice
	 * ProcessingStatus51Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV06#mmProcessingStatus
	 * SecuritiesFinancingStatusAdviceV06.mmProcessingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmProcessingStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "PrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Processing status of the transaction.";
			previousVersion_lazy = () -> SecuritiesFinancingStatusAdviceV06.mmProcessingStatus;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ProcessingStatus51Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingStatusAdviceV07.class.getMethod("getProcessingStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "MtchgSts")
	protected MatchingStatus26Choice matchingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus26Choice
	 * MatchingStatus26Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV06#mmMatchingStatus
	 * SecuritiesFinancingStatusAdviceV06.mmMatchingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMatchingStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "MtchgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingStatus";
			definition = "Provides the matching status of the instruction.";
			previousVersion_lazy = () -> SecuritiesFinancingStatusAdviceV06.mmMatchingStatus;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MatchingStatus26Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingStatusAdviceV07.class.getMethod("getMatchingStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "IfrrdMtchgSts")
	protected MatchingStatus26Choice inferredMatchingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus26Choice
	 * MatchingStatus26Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV06#mmInferredMatchingStatus
	 * SecuritiesFinancingStatusAdviceV06.mmInferredMatchingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmInferredMatchingStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "IfrrdMtchgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InferredMatchingStatus";
			definition = "Provides the matching status of an instruction as per the account servicer based on an allegement. At this time no matching took place on the market (at the CSD/ICSD).";
			previousVersion_lazy = () -> SecuritiesFinancingStatusAdviceV06.mmInferredMatchingStatus;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MatchingStatus26Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingStatusAdviceV07.class.getMethod("getInferredMatchingStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "SttlmSts")
	protected SettlementStatus18Choice settlementStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus18Choice
	 * SettlementStatus18Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV06#mmSettlementStatus
	 * SecuritiesFinancingStatusAdviceV06.mmSettlementStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSettlementStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "SttlmSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatus";
			definition = "Provides the status of settlement of a transaction.";
			previousVersion_lazy = () -> SecuritiesFinancingStatusAdviceV06.mmSettlementStatus;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SettlementStatus18Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingStatusAdviceV07.class.getMethod("getSettlementStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RepoCallReqSts")
	protected RepoCallRequestStatus7Choice repoCallRequestStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RepoCallRequestStatus7Choice
	 * RepoCallRequestStatus7Choice}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV06#mmRepoCallRequestStatus
	 * SecuritiesFinancingStatusAdviceV06.mmRepoCallRequestStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmRepoCallRequestStatus = new MMMessageBuildingBlock() {
		{
			xmlTag = "RepoCallReqSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepoCallRequestStatus";
			definition = "Provides the status of the repurchase agreement call request.";
			previousVersion_lazy = () -> SecuritiesFinancingStatusAdviceV06.mmRepoCallRequestStatus;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RepoCallRequestStatus7Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingStatusAdviceV07.class.getMethod("getRepoCallRequestStatus", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "TxDtls")
	protected SecuritiesFinancingTransactionDetails35 transactionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesFinancingTransactionDetails35
	 * SecuritiesFinancingTransactionDetails35}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV06#mmTransactionDetails
	 * SecuritiesFinancingStatusAdviceV06.mmTransactionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransactionDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "TxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDetails";
			definition = "Identifies the details of the transaction.";
			previousVersion_lazy = () -> SecuritiesFinancingStatusAdviceV06.mmTransactionDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> SecuritiesFinancingTransactionDetails35.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingStatusAdviceV07.class.getMethod("getTransactionDetails", new Class[]{});
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV06#mmSupplementaryData
	 * SecuritiesFinancingStatusAdviceV06.mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSupplementaryData = new MMMessageBuildingBlock() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			previousVersion_lazy = () -> SecuritiesFinancingStatusAdviceV06.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return SecuritiesFinancingStatusAdviceV07.class.getMethod("getSupplementaryData", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSettlementStatusAndMatchedRule.forSecuritiesFinancingStatusAdviceV07);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesFinancingStatusAdviceV07";
				definition = "Scope\r\nAn securities financing transaction account servicer sends a SecuritiesFinancingStatusAdvice to an account owner to advise the status of a securities financing transaction previously instructed by the account owner.\r\nThe status advice may be sent as a response to the request of the account owner or not.\r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure managing securities financing transactions on behalf of their participants\r\n- an agent (sub-custodian) managing securities financing transactions on behalf of their global custodian customer, or\r\n- a custodian managing securities financing transactions on behalf of an investment management institution or a broker/dealer.\r\n\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information\r\nusing the relevant elements in the Business Application Header.";
				previousVersion_lazy = () -> SecuritiesFinancingStatusAdviceV06.mmObject();
				messageSet_lazy = () -> Arrays.asList(SettlementAndReconciliationISOLatestversion.mmObject(), SettlementandReconciliationMaintenance20162017.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesFincgStsAdvc";
				businessArea_lazy = () -> SecuritiesSettlementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV07.mmTransactionIdentification,
						com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV07.mmProcessingStatus, com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV07.mmMatchingStatus,
						com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV07.mmInferredMatchingStatus, com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV07.mmSettlementStatus,
						com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV07.mmRepoCallRequestStatus, com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV07.mmTransactionDetails,
						com.tools20022.repository.area.sese.SecuritiesFinancingStatusAdviceV07.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "034";
						version = "07";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesFinancingStatusAdviceV07.class;
			}
		});
		return mmObject_lazy.get();
	}

	public TransactionIdentifications32 getTransactionIdentification() {
		return transactionIdentification;
	}

	public SecuritiesFinancingStatusAdviceV07 setTransactionIdentification(TransactionIdentifications32 transactionIdentification) {
		this.transactionIdentification = Objects.requireNonNull(transactionIdentification);
		return this;
	}

	public Optional<ProcessingStatus51Choice> getProcessingStatus() {
		return processingStatus == null ? Optional.empty() : Optional.of(processingStatus);
	}

	public SecuritiesFinancingStatusAdviceV07 setProcessingStatus(ProcessingStatus51Choice processingStatus) {
		this.processingStatus = processingStatus;
		return this;
	}

	public Optional<MatchingStatus26Choice> getMatchingStatus() {
		return matchingStatus == null ? Optional.empty() : Optional.of(matchingStatus);
	}

	public SecuritiesFinancingStatusAdviceV07 setMatchingStatus(MatchingStatus26Choice matchingStatus) {
		this.matchingStatus = matchingStatus;
		return this;
	}

	public Optional<MatchingStatus26Choice> getInferredMatchingStatus() {
		return inferredMatchingStatus == null ? Optional.empty() : Optional.of(inferredMatchingStatus);
	}

	public SecuritiesFinancingStatusAdviceV07 setInferredMatchingStatus(MatchingStatus26Choice inferredMatchingStatus) {
		this.inferredMatchingStatus = inferredMatchingStatus;
		return this;
	}

	public Optional<SettlementStatus18Choice> getSettlementStatus() {
		return settlementStatus == null ? Optional.empty() : Optional.of(settlementStatus);
	}

	public SecuritiesFinancingStatusAdviceV07 setSettlementStatus(SettlementStatus18Choice settlementStatus) {
		this.settlementStatus = settlementStatus;
		return this;
	}

	public Optional<RepoCallRequestStatus7Choice> getRepoCallRequestStatus() {
		return repoCallRequestStatus == null ? Optional.empty() : Optional.of(repoCallRequestStatus);
	}

	public SecuritiesFinancingStatusAdviceV07 setRepoCallRequestStatus(RepoCallRequestStatus7Choice repoCallRequestStatus) {
		this.repoCallRequestStatus = repoCallRequestStatus;
		return this;
	}

	public Optional<SecuritiesFinancingTransactionDetails35> getTransactionDetails() {
		return transactionDetails == null ? Optional.empty() : Optional.of(transactionDetails);
	}

	public SecuritiesFinancingStatusAdviceV07 setTransactionDetails(SecuritiesFinancingTransactionDetails35 transactionDetails) {
		this.transactionDetails = transactionDetails;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public SecuritiesFinancingStatusAdviceV07 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.034.001.07")
	static public class Document {
		@XmlElement(name = "SctiesFincgStsAdvc", required = true)
		public SecuritiesFinancingStatusAdviceV07 messageBody;
	}
}
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
import com.tools20022.repository.choice.ProcessingStatus54Choice;
import com.tools20022.repository.msg.Identification14;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msg.TransactionDetails80;
import com.tools20022.repository.msg.TransactionIdentifications30;
import com.tools20022.repository.msgset.SettlementAndReconciliationISOLatestversion;
import com.tools20022.repository.msgset.SettlementandReconciliationMaintenance20162017;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer sends an
 * SecuritiesTransactionCancellationRequestStatusAdvice to an account owner to
 * advise the status of a securities transaction cancellation request previously
 * sent by the account owner.<br>
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
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV05#mmCancellationRequestReference
 * SecuritiesTransactionCancellationRequestStatusAdviceV05.
 * mmCancellationRequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV05#mmTransactionIdentification
 * SecuritiesTransactionCancellationRequestStatusAdviceV05.
 * mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV05#mmProcessingStatus
 * SecuritiesTransactionCancellationRequestStatusAdviceV05.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV05#mmTransactionDetails
 * SecuritiesTransactionCancellationRequestStatusAdviceV05.mmTransactionDetails}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV05#mmSupplementaryData
 * SecuritiesTransactionCancellationRequestStatusAdviceV05.mmSupplementaryData}</li>
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
 * xmlTag} = "SctiesTxCxlReqStsAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementLatestVersion
 * SecuritiesSettlementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.027.001.05}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesTransactionCancellationRequestStatusAdviceV05
 * ConstraintSecuritiesMarketPracticeGroupGuideline.
 * for_sese_SecuritiesTransactionCancellationRequestStatusAdviceV05}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesTransactionCancellationRequestStatusAdviceV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends an SecuritiesTransactionCancellationRequestStatusAdvice to an account owner to advise the status of a securities transaction cancellation request previously sent by the account owner.\r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\r\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or\r\n- a custodian acting on behalf of an investment management institution or a broker/dealer.\r\n\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information\r\nusing the relevant elements in the Business Application Header."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV04
 * SecuritiesTransactionCancellationRequestStatusAdviceV04}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesTransactionCancellationRequestStatusAdviceV05", propOrder = {"cancellationRequestReference", "transactionIdentification", "processingStatus", "transactionDetails", "supplementaryData"})
public class SecuritiesTransactionCancellationRequestStatusAdviceV05 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CxlReqRef", required = true)
	protected Identification14 cancellationRequestReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.Identification14
	 * Identification14}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlReqRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationRequestReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the unambiguous identification of the cancellation request as per the account owner."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV04#mmCancellationRequestReference
	 * SecuritiesTransactionCancellationRequestStatusAdviceV04.
	 * mmCancellationRequestReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTransactionCancellationRequestStatusAdviceV05, Identification14> mmCancellationRequestReference = new MMMessageBuildingBlock<SecuritiesTransactionCancellationRequestStatusAdviceV05, Identification14>() {
		{
			xmlTag = "CxlReqRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRequestReference";
			definition = "Reference to the unambiguous identification of the cancellation request as per the account owner.";
			previousVersion_lazy = () -> SecuritiesTransactionCancellationRequestStatusAdviceV04.mmCancellationRequestReference;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Identification14.mmObject();
		}

		@Override
		public Identification14 getValue(SecuritiesTransactionCancellationRequestStatusAdviceV05 obj) {
			return obj.getCancellationRequestReference();
		}

		@Override
		public void setValue(SecuritiesTransactionCancellationRequestStatusAdviceV05 obj, Identification14 value) {
			obj.setCancellationRequestReference(value);
		}
	};
	@XmlElement(name = "TxId")
	protected TransactionIdentifications30 transactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications30
	 * TransactionIdentifications30}</li>
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
	 * "Unambiguous identification of the transaction as known by the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV04#mmTransactionIdentification
	 * SecuritiesTransactionCancellationRequestStatusAdviceV04.
	 * mmTransactionIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTransactionCancellationRequestStatusAdviceV05, Optional<TransactionIdentifications30>> mmTransactionIdentification = new MMMessageBuildingBlock<SecuritiesTransactionCancellationRequestStatusAdviceV05, Optional<TransactionIdentifications30>>() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unambiguous identification of the transaction as known by the account servicer.";
			previousVersion_lazy = () -> SecuritiesTransactionCancellationRequestStatusAdviceV04.mmTransactionIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TransactionIdentifications30.mmObject();
		}

		@Override
		public Optional<TransactionIdentifications30> getValue(SecuritiesTransactionCancellationRequestStatusAdviceV05 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(SecuritiesTransactionCancellationRequestStatusAdviceV05 obj, Optional<TransactionIdentifications30> value) {
			obj.setTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "PrcgSts", required = true)
	protected ProcessingStatus54Choice processingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus54Choice
	 * ProcessingStatus54Choice}</li>
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
	 * definition} = "Provides details on the processing status of the request."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV04#mmProcessingStatus
	 * SecuritiesTransactionCancellationRequestStatusAdviceV04.
	 * mmProcessingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTransactionCancellationRequestStatusAdviceV05, ProcessingStatus54Choice> mmProcessingStatus = new MMMessageBuildingBlock<SecuritiesTransactionCancellationRequestStatusAdviceV05, ProcessingStatus54Choice>() {
		{
			xmlTag = "PrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Provides details on the processing status of the request.";
			previousVersion_lazy = () -> SecuritiesTransactionCancellationRequestStatusAdviceV04.mmProcessingStatus;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ProcessingStatus54Choice.mmObject();
		}

		@Override
		public ProcessingStatus54Choice getValue(SecuritiesTransactionCancellationRequestStatusAdviceV05 obj) {
			return obj.getProcessingStatus();
		}

		@Override
		public void setValue(SecuritiesTransactionCancellationRequestStatusAdviceV05 obj, ProcessingStatus54Choice value) {
			obj.setProcessingStatus(value);
		}
	};
	@XmlElement(name = "TxDtls")
	protected TransactionDetails80 transactionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails80
	 * TransactionDetails80}</li>
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
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV04#mmTransactionDetails
	 * SecuritiesTransactionCancellationRequestStatusAdviceV04.
	 * mmTransactionDetails}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTransactionCancellationRequestStatusAdviceV05, Optional<TransactionDetails80>> mmTransactionDetails = new MMMessageBuildingBlock<SecuritiesTransactionCancellationRequestStatusAdviceV05, Optional<TransactionDetails80>>() {
		{
			xmlTag = "TxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDetails";
			definition = "Identifies the details of the transaction.";
			previousVersion_lazy = () -> SecuritiesTransactionCancellationRequestStatusAdviceV04.mmTransactionDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TransactionDetails80.mmObject();
		}

		@Override
		public Optional<TransactionDetails80> getValue(SecuritiesTransactionCancellationRequestStatusAdviceV05 obj) {
			return obj.getTransactionDetails();
		}

		@Override
		public void setValue(SecuritiesTransactionCancellationRequestStatusAdviceV05 obj, Optional<TransactionDetails80> value) {
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV04#mmSupplementaryData
	 * SecuritiesTransactionCancellationRequestStatusAdviceV04.
	 * mmSupplementaryData}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTransactionCancellationRequestStatusAdviceV05, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<SecuritiesTransactionCancellationRequestStatusAdviceV05, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			previousVersion_lazy = () -> SecuritiesTransactionCancellationRequestStatusAdviceV04.mmSupplementaryData;
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(SecuritiesTransactionCancellationRequestStatusAdviceV05 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(SecuritiesTransactionCancellationRequestStatusAdviceV05 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesTransactionCancellationRequestStatusAdviceV05);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransactionCancellationRequestStatusAdviceV05";
				definition = "Scope\r\nAn account servicer sends an SecuritiesTransactionCancellationRequestStatusAdvice to an account owner to advise the status of a securities transaction cancellation request previously sent by the account owner.\r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\r\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or\r\n- a custodian acting on behalf of an investment management institution or a broker/dealer.\r\n\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information\r\nusing the relevant elements in the Business Application Header.";
				previousVersion_lazy = () -> SecuritiesTransactionCancellationRequestStatusAdviceV04.mmObject();
				messageSet_lazy = () -> Arrays.asList(SettlementAndReconciliationISOLatestversion.mmObject(), SettlementandReconciliationMaintenance20162017.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesTxCxlReqStsAdvc";
				businessArea_lazy = () -> SecuritiesSettlementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV05.mmCancellationRequestReference,
						com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV05.mmTransactionIdentification,
						com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV05.mmProcessingStatus,
						com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV05.mmTransactionDetails,
						com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdviceV05.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "027";
						version = "05";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesTransactionCancellationRequestStatusAdviceV05.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Identification14 getCancellationRequestReference() {
		return cancellationRequestReference;
	}

	public SecuritiesTransactionCancellationRequestStatusAdviceV05 setCancellationRequestReference(Identification14 cancellationRequestReference) {
		this.cancellationRequestReference = Objects.requireNonNull(cancellationRequestReference);
		return this;
	}

	public Optional<TransactionIdentifications30> getTransactionIdentification() {
		return transactionIdentification == null ? Optional.empty() : Optional.of(transactionIdentification);
	}

	public SecuritiesTransactionCancellationRequestStatusAdviceV05 setTransactionIdentification(TransactionIdentifications30 transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
		return this;
	}

	public ProcessingStatus54Choice getProcessingStatus() {
		return processingStatus;
	}

	public SecuritiesTransactionCancellationRequestStatusAdviceV05 setProcessingStatus(ProcessingStatus54Choice processingStatus) {
		this.processingStatus = Objects.requireNonNull(processingStatus);
		return this;
	}

	public Optional<TransactionDetails80> getTransactionDetails() {
		return transactionDetails == null ? Optional.empty() : Optional.of(transactionDetails);
	}

	public SecuritiesTransactionCancellationRequestStatusAdviceV05 setTransactionDetails(TransactionDetails80 transactionDetails) {
		this.transactionDetails = transactionDetails;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public SecuritiesTransactionCancellationRequestStatusAdviceV05 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.027.001.05")
	static public class Document {
		@XmlElement(name = "SctiesTxCxlReqStsAdvc", required = true)
		public SecuritiesTransactionCancellationRequestStatusAdviceV05 messageBody;
	}
}
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
import com.tools20022.repository.area.SecuritiesSettlementLatestversionsubsetvariant;
import com.tools20022.repository.choice.ProcessingStatus65Choice;
import com.tools20022.repository.msg.Identification16;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msg.TransactionDetails88;
import com.tools20022.repository.msg.TransactionIdentifications39;
import com.tools20022.repository.msgset.SettlementAndReconciliationISO15022VariantsISOLatestversion;
import com.tools20022.repository.msgset.SettlementAndReconciliationISO15022VariantsISOPreviousversion;
import com.tools20022.repository.msgset.SettlementandReconciliationMaintenance20162017ISO15022Variants;
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
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdvice002V05#mmCancellationRequestReference
 * SecuritiesTransactionCancellationRequestStatusAdvice002V05.
 * mmCancellationRequestReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdvice002V05#mmTransactionIdentification
 * SecuritiesTransactionCancellationRequestStatusAdvice002V05.
 * mmTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdvice002V05#mmProcessingStatus
 * SecuritiesTransactionCancellationRequestStatusAdvice002V05.mmProcessingStatus
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdvice002V05#mmTransactionDetails
 * SecuritiesTransactionCancellationRequestStatusAdvice002V05.
 * mmTransactionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdvice002V05#mmSupplementaryData
 * SecuritiesTransactionCancellationRequestStatusAdvice002V05.
 * mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.SettlementAndReconciliationISO15022VariantsISOLatestversion
 * SettlementAndReconciliationISO15022VariantsISOLatestversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.SettlementandReconciliationMaintenance20162017ISO15022Variants
 * SettlementandReconciliationMaintenance20162017ISO15022Variants}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.SettlementAndReconciliationISO15022VariantsISOPreviousversion
 * SettlementAndReconciliationISO15022VariantsISOPreviousversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "SctiesTxCxlReqStsAdvc"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesSettlementLatestversionsubsetvariant
 * SecuritiesSettlementLatestversionsubsetvariant}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code sese.027.002.05}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline#for_sese_SecuritiesTransactionCancellationRequestStatusAdvice002V05
 * ConstraintSecuritiesMarketPracticeGroupGuideline.
 * for_sese_SecuritiesTransactionCancellationRequestStatusAdvice002V05}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SecuritiesTransactionCancellationRequestStatusAdvice002V05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends an SecuritiesTransactionCancellationRequestStatusAdvice to an account owner to advise the status of a securities transaction cancellation request previously sent by the account owner.\r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\r\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or\r\n- a custodian acting on behalf of an investment management institution or a broker/dealer.\r\n\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information\r\nusing the relevant elements in the Business Application Header."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesTransactionCancellationRequestStatusAdvice002V05", propOrder = {"cancellationRequestReference", "transactionIdentification", "processingStatus", "transactionDetails", "supplementaryData"})
public class SecuritiesTransactionCancellationRequestStatusAdvice002V05 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CxlReqRef", required = true)
	protected Identification16 cancellationRequestReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.Identification16
	 * Identification16}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTransactionCancellationRequestStatusAdvice002V05, Identification16> mmCancellationRequestReference = new MMMessageBuildingBlock<SecuritiesTransactionCancellationRequestStatusAdvice002V05, Identification16>() {
		{
			xmlTag = "CxlReqRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationRequestReference";
			definition = "Reference to the unambiguous identification of the cancellation request as per the account owner.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Identification16.mmObject();
		}

		@Override
		public Identification16 getValue(SecuritiesTransactionCancellationRequestStatusAdvice002V05 obj) {
			return obj.getCancellationRequestReference();
		}

		@Override
		public void setValue(SecuritiesTransactionCancellationRequestStatusAdvice002V05 obj, Identification16 value) {
			obj.setCancellationRequestReference(value);
		}
	};
	@XmlElement(name = "TxId")
	protected TransactionIdentifications39 transactionIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionIdentifications39
	 * TransactionIdentifications39}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTransactionCancellationRequestStatusAdvice002V05, Optional<TransactionIdentifications39>> mmTransactionIdentification = new MMMessageBuildingBlock<SecuritiesTransactionCancellationRequestStatusAdvice002V05, Optional<TransactionIdentifications39>>() {
		{
			xmlTag = "TxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionIdentification";
			definition = "Unambiguous identification of the transaction as known by the account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TransactionIdentifications39.mmObject();
		}

		@Override
		public Optional<TransactionIdentifications39> getValue(SecuritiesTransactionCancellationRequestStatusAdvice002V05 obj) {
			return obj.getTransactionIdentification();
		}

		@Override
		public void setValue(SecuritiesTransactionCancellationRequestStatusAdvice002V05 obj, Optional<TransactionIdentifications39> value) {
			obj.setTransactionIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "PrcgSts", required = true)
	protected ProcessingStatus65Choice processingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus65Choice
	 * ProcessingStatus65Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<SecuritiesTransactionCancellationRequestStatusAdvice002V05, ProcessingStatus65Choice> mmProcessingStatus = new MMMessageBuildingBlock<SecuritiesTransactionCancellationRequestStatusAdvice002V05, ProcessingStatus65Choice>() {
		{
			xmlTag = "PrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Provides details on the processing status of the request.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ProcessingStatus65Choice.mmObject();
		}

		@Override
		public ProcessingStatus65Choice getValue(SecuritiesTransactionCancellationRequestStatusAdvice002V05 obj) {
			return obj.getProcessingStatus();
		}

		@Override
		public void setValue(SecuritiesTransactionCancellationRequestStatusAdvice002V05 obj, ProcessingStatus65Choice value) {
			obj.setProcessingStatus(value);
		}
	};
	@XmlElement(name = "TxDtls")
	protected TransactionDetails88 transactionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TransactionDetails88
	 * TransactionDetails88}</li>
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
	public static final MMMessageBuildingBlock<SecuritiesTransactionCancellationRequestStatusAdvice002V05, Optional<TransactionDetails88>> mmTransactionDetails = new MMMessageBuildingBlock<SecuritiesTransactionCancellationRequestStatusAdvice002V05, Optional<TransactionDetails88>>() {
		{
			xmlTag = "TxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDetails";
			definition = "Identifies the details of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TransactionDetails88.mmObject();
		}

		@Override
		public Optional<TransactionDetails88> getValue(SecuritiesTransactionCancellationRequestStatusAdvice002V05 obj) {
			return obj.getTransactionDetails();
		}

		@Override
		public void setValue(SecuritiesTransactionCancellationRequestStatusAdvice002V05 obj, Optional<TransactionDetails88> value) {
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
	public static final MMMessageBuildingBlock<SecuritiesTransactionCancellationRequestStatusAdvice002V05, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<SecuritiesTransactionCancellationRequestStatusAdvice002V05, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(SecuritiesTransactionCancellationRequestStatusAdvice002V05 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(SecuritiesTransactionCancellationRequestStatusAdvice002V05 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintSecuritiesMarketPracticeGroupGuideline.for_sese_SecuritiesTransactionCancellationRequestStatusAdvice002V05);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransactionCancellationRequestStatusAdvice002V05";
				definition = "Scope\r\nAn account servicer sends an SecuritiesTransactionCancellationRequestStatusAdvice to an account owner to advise the status of a securities transaction cancellation request previously sent by the account owner.\r\nThe account servicer/owner relationship may be:\r\n- a central securities depository or another settlement market infrastructure acting on behalf of their participants\r\n- an agent (sub-custodian) acting on behalf of their global custodian customer, or\r\n- a custodian acting on behalf of an investment management institution or a broker/dealer.\r\n\r\nUsage\r\nThe message may also be used to:\r\n- re-send a message previously sent,\r\n- provide a third party with a copy of a message for information,\r\n- re-send to a third party a copy of a message for information\r\nusing the relevant elements in the Business Application Header.";
				messageSet_lazy = () -> Arrays.asList(SettlementAndReconciliationISO15022VariantsISOLatestversion.mmObject(), SettlementandReconciliationMaintenance20162017ISO15022Variants.mmObject(),
						SettlementAndReconciliationISO15022VariantsISOPreviousversion.mmObject());
				rootElement = "Document";
				xmlTag = "SctiesTxCxlReqStsAdvc";
				businessArea_lazy = () -> SecuritiesSettlementLatestversionsubsetvariant.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdvice002V05.mmCancellationRequestReference,
						com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdvice002V05.mmTransactionIdentification,
						com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdvice002V05.mmProcessingStatus,
						com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdvice002V05.mmTransactionDetails,
						com.tools20022.repository.area.sese.SecuritiesTransactionCancellationRequestStatusAdvice002V05.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "sese";
						messageFunctionality = "027";
						version = "05";
						flavour = "002";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return SecuritiesTransactionCancellationRequestStatusAdvice002V05.class;
			}
		});
		return mmObject_lazy.get();
	}

	public Identification16 getCancellationRequestReference() {
		return cancellationRequestReference;
	}

	public SecuritiesTransactionCancellationRequestStatusAdvice002V05 setCancellationRequestReference(Identification16 cancellationRequestReference) {
		this.cancellationRequestReference = Objects.requireNonNull(cancellationRequestReference);
		return this;
	}

	public Optional<TransactionIdentifications39> getTransactionIdentification() {
		return transactionIdentification == null ? Optional.empty() : Optional.of(transactionIdentification);
	}

	public SecuritiesTransactionCancellationRequestStatusAdvice002V05 setTransactionIdentification(TransactionIdentifications39 transactionIdentification) {
		this.transactionIdentification = transactionIdentification;
		return this;
	}

	public ProcessingStatus65Choice getProcessingStatus() {
		return processingStatus;
	}

	public SecuritiesTransactionCancellationRequestStatusAdvice002V05 setProcessingStatus(ProcessingStatus65Choice processingStatus) {
		this.processingStatus = Objects.requireNonNull(processingStatus);
		return this;
	}

	public Optional<TransactionDetails88> getTransactionDetails() {
		return transactionDetails == null ? Optional.empty() : Optional.of(transactionDetails);
	}

	public SecuritiesTransactionCancellationRequestStatusAdvice002V05 setTransactionDetails(TransactionDetails88 transactionDetails) {
		this.transactionDetails = transactionDetails;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public SecuritiesTransactionCancellationRequestStatusAdvice002V05 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:sese.027.002.05")
	static public class Document {
		@XmlElement(name = "SctiesTxCxlReqStsAdvc", required = true)
		public SecuritiesTransactionCancellationRequestStatusAdvice002V05 messageBody;
	}
}
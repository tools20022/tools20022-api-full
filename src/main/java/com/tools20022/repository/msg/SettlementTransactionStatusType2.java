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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.MatchingStatus27Choice;
import com.tools20022.repository.choice.ProcessingStatus70Choice;
import com.tools20022.repository.choice.SettlementStatus26Choice;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ProprietaryReason4;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of the securities settlement instruction status type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementTransactionStatusType2#mmProcessingStatus
 * SettlementTransactionStatusType2.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementTransactionStatusType2#mmInferredMatchingStatus
 * SettlementTransactionStatusType2.mmInferredMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementTransactionStatusType2#mmMatchingStatus
 * SettlementTransactionStatusType2.mmMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementTransactionStatusType2#mmSettlementStatus
 * SettlementTransactionStatusType2.mmSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementTransactionStatusType2#mmSettled
 * SettlementTransactionStatusType2.mmSettled}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementTransactionStatusType2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of the securities settlement instruction status type."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.SettlementTransactionStatusType1
 * SettlementTransactionStatusType1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementTransactionStatusType2", propOrder = {"processingStatus", "inferredMatchingStatus", "matchingStatus", "settlementStatus", "settled"})
public class SettlementTransactionStatusType2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PrcgSts")
	protected List<ProcessingStatus70Choice> processingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus70Choice
	 * ProcessingStatus70Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTransactionStatusType2
	 * SettlementTransactionStatusType2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcgSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details on the processing status of the transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTransactionStatusType1#mmProcessingStatus
	 * SettlementTransactionStatusType1.mmProcessingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementTransactionStatusType2, List<ProcessingStatus70Choice>> mmProcessingStatus = new MMMessageAssociationEnd<SettlementTransactionStatusType2, List<ProcessingStatus70Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementTransactionStatusType2.mmObject();
			isDerived = false;
			xmlTag = "PrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Provides details on the processing status of the transaction.";
			previousVersion_lazy = () -> SettlementTransactionStatusType1.mmProcessingStatus;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProcessingStatus70Choice.mmObject();
		}

		@Override
		public List<ProcessingStatus70Choice> getValue(SettlementTransactionStatusType2 obj) {
			return obj.getProcessingStatus();
		}

		@Override
		public void setValue(SettlementTransactionStatusType2 obj, List<ProcessingStatus70Choice> value) {
			obj.setProcessingStatus(value);
		}
	};
	@XmlElement(name = "IfrrdMtchgSts")
	protected List<MatchingStatus27Choice> inferredMatchingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus27Choice
	 * MatchingStatus27Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTransactionStatusType2
	 * SettlementTransactionStatusType2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IfrrdMtchgSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InferredMatchingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the matching status of an instruction as known by the account servicer based on an allegement. At this time no matching took place on the market (at the CSD/ICSD)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTransactionStatusType1#mmInferredMatchingStatus
	 * SettlementTransactionStatusType1.mmInferredMatchingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementTransactionStatusType2, List<MatchingStatus27Choice>> mmInferredMatchingStatus = new MMMessageAssociationEnd<SettlementTransactionStatusType2, List<MatchingStatus27Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementTransactionStatusType2.mmObject();
			isDerived = false;
			xmlTag = "IfrrdMtchgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InferredMatchingStatus";
			definition = "Provides the matching status of an instruction as known by the account servicer based on an allegement. At this time no matching took place on the market (at the CSD/ICSD).";
			previousVersion_lazy = () -> SettlementTransactionStatusType1.mmInferredMatchingStatus;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MatchingStatus27Choice.mmObject();
		}

		@Override
		public List<MatchingStatus27Choice> getValue(SettlementTransactionStatusType2 obj) {
			return obj.getInferredMatchingStatus();
		}

		@Override
		public void setValue(SettlementTransactionStatusType2 obj, List<MatchingStatus27Choice> value) {
			obj.setInferredMatchingStatus(value);
		}
	};
	@XmlElement(name = "MtchgSts")
	protected List<MatchingStatus27Choice> matchingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus27Choice
	 * MatchingStatus27Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTransactionStatusType2
	 * SettlementTransactionStatusType2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchgSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the matching status of the instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTransactionStatusType1#mmMatchingStatus
	 * SettlementTransactionStatusType1.mmMatchingStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementTransactionStatusType2, List<MatchingStatus27Choice>> mmMatchingStatus = new MMMessageAssociationEnd<SettlementTransactionStatusType2, List<MatchingStatus27Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementTransactionStatusType2.mmObject();
			isDerived = false;
			xmlTag = "MtchgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingStatus";
			definition = "Provides the matching status of the instruction.";
			previousVersion_lazy = () -> SettlementTransactionStatusType1.mmMatchingStatus;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MatchingStatus27Choice.mmObject();
		}

		@Override
		public List<MatchingStatus27Choice> getValue(SettlementTransactionStatusType2 obj) {
			return obj.getMatchingStatus();
		}

		@Override
		public void setValue(SettlementTransactionStatusType2 obj, List<MatchingStatus27Choice> value) {
			obj.setMatchingStatus(value);
		}
	};
	@XmlElement(name = "SttlmSts")
	protected List<SettlementStatus26Choice> settlementStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus26Choice
	 * SettlementStatus26Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTransactionStatusType2
	 * SettlementTransactionStatusType2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the settlement status of a transaction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTransactionStatusType1#mmSettlementStatus
	 * SettlementTransactionStatusType1.mmSettlementStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementTransactionStatusType2, List<SettlementStatus26Choice>> mmSettlementStatus = new MMMessageAssociationEnd<SettlementTransactionStatusType2, List<SettlementStatus26Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementTransactionStatusType2.mmObject();
			isDerived = false;
			xmlTag = "SttlmSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatus";
			definition = "Provides the settlement status of a transaction.";
			previousVersion_lazy = () -> SettlementTransactionStatusType1.mmSettlementStatus;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementStatus26Choice.mmObject();
		}

		@Override
		public List<SettlementStatus26Choice> getValue(SettlementTransactionStatusType2 obj) {
			return obj.getSettlementStatus();
		}

		@Override
		public void setValue(SettlementTransactionStatusType2 obj, List<SettlementStatus26Choice> value) {
			obj.setSettlementStatus(value);
		}
	};
	@XmlElement(name = "Sttld")
	protected ProprietaryReason4 settled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason4
	 * ProprietaryReason4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTransactionStatusType2
	 * SettlementTransactionStatusType2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sttld"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settled"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines that the transaction has been settled."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTransactionStatusType1#mmSettled
	 * SettlementTransactionStatusType1.mmSettled}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementTransactionStatusType2, Optional<ProprietaryReason4>> mmSettled = new MMMessageAssociationEnd<SettlementTransactionStatusType2, Optional<ProprietaryReason4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementTransactionStatusType2.mmObject();
			isDerived = false;
			xmlTag = "Sttld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settled";
			definition = "Defines that the transaction has been settled.";
			previousVersion_lazy = () -> SettlementTransactionStatusType1.mmSettled;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProprietaryReason4.mmObject();
		}

		@Override
		public Optional<ProprietaryReason4> getValue(SettlementTransactionStatusType2 obj) {
			return obj.getSettled();
		}

		@Override
		public void setValue(SettlementTransactionStatusType2 obj, Optional<ProprietaryReason4> value) {
			obj.setSettled(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementTransactionStatusType2.mmProcessingStatus, com.tools20022.repository.msg.SettlementTransactionStatusType2.mmInferredMatchingStatus,
						com.tools20022.repository.msg.SettlementTransactionStatusType2.mmMatchingStatus, com.tools20022.repository.msg.SettlementTransactionStatusType2.mmSettlementStatus,
						com.tools20022.repository.msg.SettlementTransactionStatusType2.mmSettled);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SettlementTransactionStatusType2";
				definition = "Choice of the securities settlement instruction status type.";
				previousVersion_lazy = () -> SettlementTransactionStatusType1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<ProcessingStatus70Choice> getProcessingStatus() {
		return processingStatus == null ? processingStatus = new ArrayList<>() : processingStatus;
	}

	public SettlementTransactionStatusType2 setProcessingStatus(List<ProcessingStatus70Choice> processingStatus) {
		this.processingStatus = Objects.requireNonNull(processingStatus);
		return this;
	}

	public List<MatchingStatus27Choice> getInferredMatchingStatus() {
		return inferredMatchingStatus == null ? inferredMatchingStatus = new ArrayList<>() : inferredMatchingStatus;
	}

	public SettlementTransactionStatusType2 setInferredMatchingStatus(List<MatchingStatus27Choice> inferredMatchingStatus) {
		this.inferredMatchingStatus = Objects.requireNonNull(inferredMatchingStatus);
		return this;
	}

	public List<MatchingStatus27Choice> getMatchingStatus() {
		return matchingStatus == null ? matchingStatus = new ArrayList<>() : matchingStatus;
	}

	public SettlementTransactionStatusType2 setMatchingStatus(List<MatchingStatus27Choice> matchingStatus) {
		this.matchingStatus = Objects.requireNonNull(matchingStatus);
		return this;
	}

	public List<SettlementStatus26Choice> getSettlementStatus() {
		return settlementStatus == null ? settlementStatus = new ArrayList<>() : settlementStatus;
	}

	public SettlementTransactionStatusType2 setSettlementStatus(List<SettlementStatus26Choice> settlementStatus) {
		this.settlementStatus = Objects.requireNonNull(settlementStatus);
		return this;
	}

	public Optional<ProprietaryReason4> getSettled() {
		return settled == null ? Optional.empty() : Optional.of(settled);
	}

	public SettlementTransactionStatusType2 setSettled(ProprietaryReason4 settled) {
		this.settled = settled;
		return this;
	}
}
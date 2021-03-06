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
import com.tools20022.repository.choice.MatchingStatus8Choice;
import com.tools20022.repository.choice.ProcessingStatus30Choice;
import com.tools20022.repository.choice.SettlementStatus1Choice;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ProprietaryReason1;
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
 * {@linkplain com.tools20022.repository.msg.SettlementTransactionStatusType1#mmProcessingStatus
 * SettlementTransactionStatusType1.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementTransactionStatusType1#mmInferredMatchingStatus
 * SettlementTransactionStatusType1.mmInferredMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementTransactionStatusType1#mmMatchingStatus
 * SettlementTransactionStatusType1.mmMatchingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementTransactionStatusType1#mmSettlementStatus
 * SettlementTransactionStatusType1.mmSettlementStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementTransactionStatusType1#mmSettled
 * SettlementTransactionStatusType1.mmSettled}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementTransactionStatusType1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of the securities settlement instruction status type."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementTransactionStatusType2
 * SettlementTransactionStatusType2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementTransactionStatusType1", propOrder = {"processingStatus", "inferredMatchingStatus", "matchingStatus", "settlementStatus", "settled"})
public class SettlementTransactionStatusType1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PrcgSts")
	protected List<ProcessingStatus30Choice> processingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ProcessingStatus30Choice
	 * ProcessingStatus30Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTransactionStatusType1
	 * SettlementTransactionStatusType1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTransactionStatusType2#mmProcessingStatus
	 * SettlementTransactionStatusType2.mmProcessingStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementTransactionStatusType1, List<ProcessingStatus30Choice>> mmProcessingStatus = new MMMessageAssociationEnd<SettlementTransactionStatusType1, List<ProcessingStatus30Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementTransactionStatusType1.mmObject();
			isDerived = false;
			xmlTag = "PrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Provides details on the processing status of the transaction.";
			nextVersions_lazy = () -> Arrays.asList(SettlementTransactionStatusType2.mmProcessingStatus);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProcessingStatus30Choice.mmObject();
		}

		@Override
		public List<ProcessingStatus30Choice> getValue(SettlementTransactionStatusType1 obj) {
			return obj.getProcessingStatus();
		}

		@Override
		public void setValue(SettlementTransactionStatusType1 obj, List<ProcessingStatus30Choice> value) {
			obj.setProcessingStatus(value);
		}
	};
	@XmlElement(name = "IfrrdMtchgSts")
	protected List<MatchingStatus8Choice> inferredMatchingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus8Choice
	 * MatchingStatus8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTransactionStatusType1
	 * SettlementTransactionStatusType1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTransactionStatusType2#mmInferredMatchingStatus
	 * SettlementTransactionStatusType2.mmInferredMatchingStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementTransactionStatusType1, List<MatchingStatus8Choice>> mmInferredMatchingStatus = new MMMessageAssociationEnd<SettlementTransactionStatusType1, List<MatchingStatus8Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementTransactionStatusType1.mmObject();
			isDerived = false;
			xmlTag = "IfrrdMtchgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InferredMatchingStatus";
			definition = "Provides the matching status of an instruction as known by the account servicer based on an allegement. At this time no matching took place on the market (at the CSD/ICSD).";
			nextVersions_lazy = () -> Arrays.asList(SettlementTransactionStatusType2.mmInferredMatchingStatus);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MatchingStatus8Choice.mmObject();
		}

		@Override
		public List<MatchingStatus8Choice> getValue(SettlementTransactionStatusType1 obj) {
			return obj.getInferredMatchingStatus();
		}

		@Override
		public void setValue(SettlementTransactionStatusType1 obj, List<MatchingStatus8Choice> value) {
			obj.setInferredMatchingStatus(value);
		}
	};
	@XmlElement(name = "MtchgSts")
	protected List<MatchingStatus8Choice> matchingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus8Choice
	 * MatchingStatus8Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTransactionStatusType1
	 * SettlementTransactionStatusType1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTransactionStatusType2#mmMatchingStatus
	 * SettlementTransactionStatusType2.mmMatchingStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementTransactionStatusType1, List<MatchingStatus8Choice>> mmMatchingStatus = new MMMessageAssociationEnd<SettlementTransactionStatusType1, List<MatchingStatus8Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementTransactionStatusType1.mmObject();
			isDerived = false;
			xmlTag = "MtchgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingStatus";
			definition = "Provides the matching status of the instruction.";
			nextVersions_lazy = () -> Arrays.asList(SettlementTransactionStatusType2.mmMatchingStatus);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MatchingStatus8Choice.mmObject();
		}

		@Override
		public List<MatchingStatus8Choice> getValue(SettlementTransactionStatusType1 obj) {
			return obj.getMatchingStatus();
		}

		@Override
		public void setValue(SettlementTransactionStatusType1 obj, List<MatchingStatus8Choice> value) {
			obj.setMatchingStatus(value);
		}
	};
	@XmlElement(name = "SttlmSts")
	protected List<SettlementStatus1Choice> settlementStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SettlementStatus1Choice
	 * SettlementStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTransactionStatusType1
	 * SettlementTransactionStatusType1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTransactionStatusType2#mmSettlementStatus
	 * SettlementTransactionStatusType2.mmSettlementStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementTransactionStatusType1, List<SettlementStatus1Choice>> mmSettlementStatus = new MMMessageAssociationEnd<SettlementTransactionStatusType1, List<SettlementStatus1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementTransactionStatusType1.mmObject();
			isDerived = false;
			xmlTag = "SttlmSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementStatus";
			definition = "Provides the settlement status of a transaction.";
			nextVersions_lazy = () -> Arrays.asList(SettlementTransactionStatusType2.mmSettlementStatus);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> SettlementStatus1Choice.mmObject();
		}

		@Override
		public List<SettlementStatus1Choice> getValue(SettlementTransactionStatusType1 obj) {
			return obj.getSettlementStatus();
		}

		@Override
		public void setValue(SettlementTransactionStatusType1 obj, List<SettlementStatus1Choice> value) {
			obj.setSettlementStatus(value);
		}
	};
	@XmlElement(name = "Sttld")
	protected ProprietaryReason1 settled;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTransactionStatusType1
	 * SettlementTransactionStatusType1}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SettlementTransactionStatusType2#mmSettled
	 * SettlementTransactionStatusType2.mmSettled}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SettlementTransactionStatusType1, Optional<ProprietaryReason1>> mmSettled = new MMMessageAssociationEnd<SettlementTransactionStatusType1, Optional<ProprietaryReason1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementTransactionStatusType1.mmObject();
			isDerived = false;
			xmlTag = "Sttld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settled";
			definition = "Defines that the transaction has been settled.";
			nextVersions_lazy = () -> Arrays.asList(SettlementTransactionStatusType2.mmSettled);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProprietaryReason1.mmObject();
		}

		@Override
		public Optional<ProprietaryReason1> getValue(SettlementTransactionStatusType1 obj) {
			return obj.getSettled();
		}

		@Override
		public void setValue(SettlementTransactionStatusType1 obj, Optional<ProprietaryReason1> value) {
			obj.setSettled(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementTransactionStatusType1.mmProcessingStatus, com.tools20022.repository.msg.SettlementTransactionStatusType1.mmInferredMatchingStatus,
						com.tools20022.repository.msg.SettlementTransactionStatusType1.mmMatchingStatus, com.tools20022.repository.msg.SettlementTransactionStatusType1.mmSettlementStatus,
						com.tools20022.repository.msg.SettlementTransactionStatusType1.mmSettled);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SettlementTransactionStatusType1";
				definition = "Choice of the securities settlement instruction status type.";
				nextVersions_lazy = () -> Arrays.asList(SettlementTransactionStatusType2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<ProcessingStatus30Choice> getProcessingStatus() {
		return processingStatus == null ? processingStatus = new ArrayList<>() : processingStatus;
	}

	public SettlementTransactionStatusType1 setProcessingStatus(List<ProcessingStatus30Choice> processingStatus) {
		this.processingStatus = Objects.requireNonNull(processingStatus);
		return this;
	}

	public List<MatchingStatus8Choice> getInferredMatchingStatus() {
		return inferredMatchingStatus == null ? inferredMatchingStatus = new ArrayList<>() : inferredMatchingStatus;
	}

	public SettlementTransactionStatusType1 setInferredMatchingStatus(List<MatchingStatus8Choice> inferredMatchingStatus) {
		this.inferredMatchingStatus = Objects.requireNonNull(inferredMatchingStatus);
		return this;
	}

	public List<MatchingStatus8Choice> getMatchingStatus() {
		return matchingStatus == null ? matchingStatus = new ArrayList<>() : matchingStatus;
	}

	public SettlementTransactionStatusType1 setMatchingStatus(List<MatchingStatus8Choice> matchingStatus) {
		this.matchingStatus = Objects.requireNonNull(matchingStatus);
		return this;
	}

	public List<SettlementStatus1Choice> getSettlementStatus() {
		return settlementStatus == null ? settlementStatus = new ArrayList<>() : settlementStatus;
	}

	public SettlementTransactionStatusType1 setSettlementStatus(List<SettlementStatus1Choice> settlementStatus) {
		this.settlementStatus = Objects.requireNonNull(settlementStatus);
		return this;
	}

	public Optional<ProprietaryReason1> getSettled() {
		return settled == null ? Optional.empty() : Optional.of(settled);
	}

	public SettlementTransactionStatusType1 setSettled(ProprietaryReason1 settled) {
		this.settled = settled;
		return this;
	}
}
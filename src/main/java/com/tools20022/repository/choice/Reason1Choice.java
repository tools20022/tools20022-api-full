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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.*;
import com.tools20022.repository.entity.SecuritiesTradeStatusReason;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of reason.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason1Choice#mmRepoCallAcknowledgementReason
 * Reason1Choice.mmRepoCallAcknowledgementReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason1Choice#mmCancellationReason
 * Reason1Choice.mmCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason1Choice#mmPendingCancellationReason
 * Reason1Choice.mmPendingCancellationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason1Choice#mmGeneratedReason
 * Reason1Choice.mmGeneratedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason1Choice#mmDeniedReason
 * Reason1Choice.mmDeniedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason1Choice#mmAcknowledgedAcceptedReason
 * Reason1Choice.mmAcknowledgedAcceptedReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason1Choice#mmPendingReason
 * Reason1Choice.mmPendingReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason1Choice#mmFailingReason
 * Reason1Choice.mmFailingReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason1Choice#mmPendingProcessingReason
 * Reason1Choice.mmPendingProcessingReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason1Choice#mmRejectionReason
 * Reason1Choice.mmRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason1Choice#mmRepairReason
 * Reason1Choice.mmRepairReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason1Choice#mmPendingModificationReason
 * Reason1Choice.mmPendingModificationReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.Reason1Choice#mmUnmatchedReason
 * Reason1Choice.mmUnmatchedReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
 * SecuritiesTradeStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReasonRule#forReason1Choice
 * ConstraintReasonRule.forReason1Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Reason1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of reason."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Reason1Choice", propOrder = {"repoCallAcknowledgementReason", "cancellationReason", "pendingCancellationReason", "generatedReason", "deniedReason", "acknowledgedAcceptedReason", "pendingReason", "failingReason",
		"pendingProcessingReason", "rejectionReason", "repairReason", "pendingModificationReason", "unmatchedReason"})
public class Reason1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RepoCallAckRsn")
	protected AcknowledgementReason3Choice repoCallAcknowledgementReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason3Choice
	 * AcknowledgementReason3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmRepoCallAcknowledgementReason
	 * SecuritiesTradeStatusReason.mmRepoCallAcknowledgementReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice Reason1Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RepoCallAckRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :24B::CACK</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepoCallAcknowledgementReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies additional information on the repurchase agreement call request acknowledgement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reason1Choice, Optional<AcknowledgementReason3Choice>> mmRepoCallAcknowledgementReason = new MMMessageAttribute<Reason1Choice, Optional<AcknowledgementReason3Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmRepoCallAcknowledgementReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason1Choice.mmObject();
			isDerived = false;
			xmlTag = "RepoCallAckRsn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":24B::CACK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepoCallAcknowledgementReason";
			definition = "Specifies additional information on the repurchase agreement call request acknowledgement.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AcknowledgementReason3Choice.mmObject();
		}

		@Override
		public Optional<AcknowledgementReason3Choice> getValue(Reason1Choice obj) {
			return obj.getRepoCallAcknowledgementReason();
		}

		@Override
		public void setValue(Reason1Choice obj, Optional<AcknowledgementReason3Choice> value) {
			obj.setRepoCallAcknowledgementReason(value.orElse(null));
		}
	};
	@XmlElement(name = "CxlRsn")
	protected CancellationReason4Choice cancellationReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CancellationReason4Choice
	 * CancellationReason4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmCancellationReason
	 * StatusReason.mmCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice Reason1Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :24B::CAND</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the related instruction is cancelled, or the related cancellation request is executed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reason1Choice, Optional<CancellationReason4Choice>> mmCancellationReason = new MMMessageAttribute<Reason1Choice, Optional<CancellationReason4Choice>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmCancellationReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason1Choice.mmObject();
			isDerived = false;
			xmlTag = "CxlRsn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":24B::CAND"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReason";
			definition = "Specifies the reason why the related instruction is cancelled, or the related cancellation request is executed.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CancellationReason4Choice.mmObject();
		}

		@Override
		public Optional<CancellationReason4Choice> getValue(Reason1Choice obj) {
			return obj.getCancellationReason();
		}

		@Override
		public void setValue(Reason1Choice obj, Optional<CancellationReason4Choice> value) {
			obj.setCancellationReason(value.orElse(null));
		}
	};
	@XmlElement(name = "PdgCxlRsn")
	protected PendingCancellationReasons2Choice pendingCancellationReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PendingCancellationReasons2Choice
	 * PendingCancellationReasons2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice Reason1Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgCxlRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :24B::CANP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingCancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the cancellation request is pending."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reason1Choice, Optional<PendingCancellationReasons2Choice>> mmPendingCancellationReason = new MMMessageAttribute<Reason1Choice, Optional<PendingCancellationReasons2Choice>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason1Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgCxlRsn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":24B::CANP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingCancellationReason";
			definition = "Specifies the reason why the cancellation request is pending.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PendingCancellationReasons2Choice.mmObject();
		}

		@Override
		public Optional<PendingCancellationReasons2Choice> getValue(Reason1Choice obj) {
			return obj.getPendingCancellationReason();
		}

		@Override
		public void setValue(Reason1Choice obj, Optional<PendingCancellationReasons2Choice> value) {
			obj.setPendingCancellationReason(value.orElse(null));
		}
	};
	@XmlElement(name = "GnrtdRsn")
	protected GeneratedReasons1Choice generatedReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.GeneratedReasons1Choice
	 * GeneratedReasons1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmGeneratedReason
	 * SecuritiesTradeStatusReason.mmGeneratedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice Reason1Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GnrtdRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :24B::CGEN</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GeneratedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason why the transaction was generated."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reason1Choice, Optional<GeneratedReasons1Choice>> mmGeneratedReason = new MMMessageAttribute<Reason1Choice, Optional<GeneratedReasons1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmGeneratedReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason1Choice.mmObject();
			isDerived = false;
			xmlTag = "GnrtdRsn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":24B::CGEN"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GeneratedReason";
			definition = "Specifies the reason why the transaction was generated.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> GeneratedReasons1Choice.mmObject();
		}

		@Override
		public Optional<GeneratedReasons1Choice> getValue(Reason1Choice obj) {
			return obj.getGeneratedReason();
		}

		@Override
		public void setValue(Reason1Choice obj, Optional<GeneratedReasons1Choice> value) {
			obj.setGeneratedReason(value.orElse(null));
		}
	};
	@XmlElement(name = "DndRsn")
	protected DeniedReason1Choice deniedReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DeniedReason1Choice
	 * DeniedReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmDeniedReason
	 * SecuritiesTradeStatusReason.mmDeniedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice Reason1Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DndRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :24B::DEND</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeniedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason why the request was denied."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reason1Choice, Optional<DeniedReason1Choice>> mmDeniedReason = new MMMessageAttribute<Reason1Choice, Optional<DeniedReason1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmDeniedReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason1Choice.mmObject();
			isDerived = false;
			xmlTag = "DndRsn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":24B::DEND"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeniedReason";
			definition = "Specifies the reason why the request was denied.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DeniedReason1Choice.mmObject();
		}

		@Override
		public Optional<DeniedReason1Choice> getValue(Reason1Choice obj) {
			return obj.getDeniedReason();
		}

		@Override
		public void setValue(Reason1Choice obj, Optional<DeniedReason1Choice> value) {
			obj.setDeniedReason(value.orElse(null));
		}
	};
	@XmlElement(name = "AckdAccptdRsn")
	protected AcknowledgementReason2Choice acknowledgedAcceptedReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AcknowledgementReason2Choice
	 * AcknowledgementReason2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmAcknowledgedAcceptedReason
	 * StatusReason.mmAcknowledgedAcceptedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice Reason1Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AckdAccptdRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :24B::PACK</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgedAcceptedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies additional information about the processed instruction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reason1Choice, Optional<AcknowledgementReason2Choice>> mmAcknowledgedAcceptedReason = new MMMessageAttribute<Reason1Choice, Optional<AcknowledgementReason2Choice>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmAcknowledgedAcceptedReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason1Choice.mmObject();
			isDerived = false;
			xmlTag = "AckdAccptdRsn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":24B::PACK"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgedAcceptedReason";
			definition = "Specifies additional information about the processed instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AcknowledgementReason2Choice.mmObject();
		}

		@Override
		public Optional<AcknowledgementReason2Choice> getValue(Reason1Choice obj) {
			return obj.getAcknowledgedAcceptedReason();
		}

		@Override
		public void setValue(Reason1Choice obj, Optional<AcknowledgementReason2Choice> value) {
			obj.setAcknowledgedAcceptedReason(value.orElse(null));
		}
	};
	@XmlElement(name = "PdgRsn")
	protected PendingReason3Choice pendingReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PendingReason3Choice
	 * PendingReason3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice Reason1Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :24B::PEND</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction has a pending status."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reason1Choice, Optional<PendingReason3Choice>> mmPendingReason = new MMMessageAttribute<Reason1Choice, Optional<PendingReason3Choice>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason1Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgRsn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":24B::PEND"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingReason";
			definition = "Specifies the reason why the instruction has a pending status.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PendingReason3Choice.mmObject();
		}

		@Override
		public Optional<PendingReason3Choice> getValue(Reason1Choice obj) {
			return obj.getPendingReason();
		}

		@Override
		public void setValue(Reason1Choice obj, Optional<PendingReason3Choice> value) {
			obj.setPendingReason(value.orElse(null));
		}
	};
	@XmlElement(name = "FlngRsn")
	protected FailingReason1Choice failingReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.FailingReason1Choice
	 * FailingReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmFailingReason
	 * StatusReason.mmFailingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice Reason1Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FlngRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :24B::PENF</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FailingReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction has a failing settlement status."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reason1Choice, Optional<FailingReason1Choice>> mmFailingReason = new MMMessageAttribute<Reason1Choice, Optional<FailingReason1Choice>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmFailingReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason1Choice.mmObject();
			isDerived = false;
			xmlTag = "FlngRsn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":24B::PENF"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FailingReason";
			definition = "Specifies the reason why the instruction has a failing settlement status.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> FailingReason1Choice.mmObject();
		}

		@Override
		public Optional<FailingReason1Choice> getValue(Reason1Choice obj) {
			return obj.getFailingReason();
		}

		@Override
		public void setValue(Reason1Choice obj, Optional<FailingReason1Choice> value) {
			obj.setFailingReason(value.orElse(null));
		}
	};
	@XmlElement(name = "PdgPrcgRsn")
	protected PendingProcessingReason1Choice pendingProcessingReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PendingProcessingReason1Choice
	 * PendingProcessingReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice Reason1Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgPrcgRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :24B::PPRC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingProcessingReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction has a pending processing status."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reason1Choice, Optional<PendingProcessingReason1Choice>> mmPendingProcessingReason = new MMMessageAttribute<Reason1Choice, Optional<PendingProcessingReason1Choice>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason1Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgPrcgRsn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":24B::PPRC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingProcessingReason";
			definition = "Specifies the reason why the instruction has a pending processing status.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PendingProcessingReason1Choice.mmObject();
		}

		@Override
		public Optional<PendingProcessingReason1Choice> getValue(Reason1Choice obj) {
			return obj.getPendingProcessingReason();
		}

		@Override
		public void setValue(Reason1Choice obj, Optional<PendingProcessingReason1Choice> value) {
			obj.setPendingProcessingReason(value.orElse(null));
		}
	};
	@XmlElement(name = "RjctnRsn")
	protected RejectionReason5Choice rejectionReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RejectionReason5Choice
	 * RejectionReason5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectionReason
	 * StatusReason.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice Reason1Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctnRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :24B::REJT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction/request has a rejected status."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reason1Choice, Optional<RejectionReason5Choice>> mmRejectionReason = new MMMessageAttribute<Reason1Choice, Optional<RejectionReason5Choice>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectionReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason1Choice.mmObject();
			isDerived = false;
			xmlTag = "RjctnRsn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":24B::REJT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionReason";
			definition = "Specifies the reason why the instruction/request has a rejected status.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RejectionReason5Choice.mmObject();
		}

		@Override
		public Optional<RejectionReason5Choice> getValue(Reason1Choice obj) {
			return obj.getRejectionReason();
		}

		@Override
		public void setValue(Reason1Choice obj, Optional<RejectionReason5Choice> value) {
			obj.setRejectionReason(value.orElse(null));
		}
	};
	@XmlElement(name = "RprRsn")
	protected RepairReason3Choice repairReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RepairReason3Choice
	 * RepairReason3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmRepairReason
	 * SecuritiesTradeStatusReason.mmRepairReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice Reason1Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RprRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :24B::REPR</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepairReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the reason why the instruction is in repair."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reason1Choice, Optional<RepairReason3Choice>> mmRepairReason = new MMMessageAttribute<Reason1Choice, Optional<RepairReason3Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmRepairReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason1Choice.mmObject();
			isDerived = false;
			xmlTag = "RprRsn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":24B::REPR"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepairReason";
			definition = "Specifies the reason why the instruction is in repair.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RepairReason3Choice.mmObject();
		}

		@Override
		public Optional<RepairReason3Choice> getValue(Reason1Choice obj) {
			return obj.getRepairReason();
		}

		@Override
		public void setValue(Reason1Choice obj, Optional<RepairReason3Choice> value) {
			obj.setRepairReason(value.orElse(null));
		}
	};
	@XmlElement(name = "PdgModRsn")
	protected PendingReason2Choice pendingModificationReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PendingReason2Choice
	 * PendingReason2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmPendingReason
	 * StatusReason.mmPendingReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice Reason1Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PdgModRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :24B::CANP</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PendingModificationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the modification request is pending."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reason1Choice, Optional<PendingReason2Choice>> mmPendingModificationReason = new MMMessageAttribute<Reason1Choice, Optional<PendingReason2Choice>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmPendingReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason1Choice.mmObject();
			isDerived = false;
			xmlTag = "PdgModRsn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":24B::CANP"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PendingModificationReason";
			definition = "Specifies the reason why the modification request is pending.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PendingReason2Choice.mmObject();
		}

		@Override
		public Optional<PendingReason2Choice> getValue(Reason1Choice obj) {
			return obj.getPendingModificationReason();
		}

		@Override
		public void setValue(Reason1Choice obj, Optional<PendingReason2Choice> value) {
			obj.setPendingModificationReason(value.orElse(null));
		}
	};
	@XmlElement(name = "UmtchdRsn")
	protected UnmatchedReason2Choice unmatchedReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnmatchedReason2Choice
	 * UnmatchedReason2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason#mmUnmatchedReason
	 * SecuritiesTradeStatusReason.mmUnmatchedReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.Reason1Choice Reason1Choice}
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UmtchdRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :24B::NMAT</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnmatchedReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction has an unmatched status."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Reason1Choice, Optional<UnmatchedReason2Choice>> mmUnmatchedReason = new MMMessageAttribute<Reason1Choice, Optional<UnmatchedReason2Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatusReason.mmUnmatchedReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.Reason1Choice.mmObject();
			isDerived = false;
			xmlTag = "UmtchdRsn";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":24B::NMAT"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnmatchedReason";
			definition = "Specifies the reason why the instruction has an unmatched status.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> UnmatchedReason2Choice.mmObject();
		}

		@Override
		public Optional<UnmatchedReason2Choice> getValue(Reason1Choice obj) {
			return obj.getUnmatchedReason();
		}

		@Override
		public void setValue(Reason1Choice obj, Optional<UnmatchedReason2Choice> value) {
			obj.setUnmatchedReason(value.orElse(null));
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.Reason1Choice.mmRepoCallAcknowledgementReason, com.tools20022.repository.choice.Reason1Choice.mmCancellationReason,
						com.tools20022.repository.choice.Reason1Choice.mmPendingCancellationReason, com.tools20022.repository.choice.Reason1Choice.mmGeneratedReason, com.tools20022.repository.choice.Reason1Choice.mmDeniedReason,
						com.tools20022.repository.choice.Reason1Choice.mmAcknowledgedAcceptedReason, com.tools20022.repository.choice.Reason1Choice.mmPendingReason, com.tools20022.repository.choice.Reason1Choice.mmFailingReason,
						com.tools20022.repository.choice.Reason1Choice.mmPendingProcessingReason, com.tools20022.repository.choice.Reason1Choice.mmRejectionReason, com.tools20022.repository.choice.Reason1Choice.mmRepairReason,
						com.tools20022.repository.choice.Reason1Choice.mmPendingModificationReason, com.tools20022.repository.choice.Reason1Choice.mmUnmatchedReason);
				trace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReasonRule.forReason1Choice);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Reason1Choice";
				definition = "Choice of reason.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<AcknowledgementReason3Choice> getRepoCallAcknowledgementReason() {
		return repoCallAcknowledgementReason == null ? Optional.empty() : Optional.of(repoCallAcknowledgementReason);
	}

	public Reason1Choice setRepoCallAcknowledgementReason(AcknowledgementReason3Choice repoCallAcknowledgementReason) {
		this.repoCallAcknowledgementReason = repoCallAcknowledgementReason;
		return this;
	}

	public Optional<CancellationReason4Choice> getCancellationReason() {
		return cancellationReason == null ? Optional.empty() : Optional.of(cancellationReason);
	}

	public Reason1Choice setCancellationReason(CancellationReason4Choice cancellationReason) {
		this.cancellationReason = cancellationReason;
		return this;
	}

	public Optional<PendingCancellationReasons2Choice> getPendingCancellationReason() {
		return pendingCancellationReason == null ? Optional.empty() : Optional.of(pendingCancellationReason);
	}

	public Reason1Choice setPendingCancellationReason(PendingCancellationReasons2Choice pendingCancellationReason) {
		this.pendingCancellationReason = pendingCancellationReason;
		return this;
	}

	public Optional<GeneratedReasons1Choice> getGeneratedReason() {
		return generatedReason == null ? Optional.empty() : Optional.of(generatedReason);
	}

	public Reason1Choice setGeneratedReason(GeneratedReasons1Choice generatedReason) {
		this.generatedReason = generatedReason;
		return this;
	}

	public Optional<DeniedReason1Choice> getDeniedReason() {
		return deniedReason == null ? Optional.empty() : Optional.of(deniedReason);
	}

	public Reason1Choice setDeniedReason(DeniedReason1Choice deniedReason) {
		this.deniedReason = deniedReason;
		return this;
	}

	public Optional<AcknowledgementReason2Choice> getAcknowledgedAcceptedReason() {
		return acknowledgedAcceptedReason == null ? Optional.empty() : Optional.of(acknowledgedAcceptedReason);
	}

	public Reason1Choice setAcknowledgedAcceptedReason(AcknowledgementReason2Choice acknowledgedAcceptedReason) {
		this.acknowledgedAcceptedReason = acknowledgedAcceptedReason;
		return this;
	}

	public Optional<PendingReason3Choice> getPendingReason() {
		return pendingReason == null ? Optional.empty() : Optional.of(pendingReason);
	}

	public Reason1Choice setPendingReason(PendingReason3Choice pendingReason) {
		this.pendingReason = pendingReason;
		return this;
	}

	public Optional<FailingReason1Choice> getFailingReason() {
		return failingReason == null ? Optional.empty() : Optional.of(failingReason);
	}

	public Reason1Choice setFailingReason(FailingReason1Choice failingReason) {
		this.failingReason = failingReason;
		return this;
	}

	public Optional<PendingProcessingReason1Choice> getPendingProcessingReason() {
		return pendingProcessingReason == null ? Optional.empty() : Optional.of(pendingProcessingReason);
	}

	public Reason1Choice setPendingProcessingReason(PendingProcessingReason1Choice pendingProcessingReason) {
		this.pendingProcessingReason = pendingProcessingReason;
		return this;
	}

	public Optional<RejectionReason5Choice> getRejectionReason() {
		return rejectionReason == null ? Optional.empty() : Optional.of(rejectionReason);
	}

	public Reason1Choice setRejectionReason(RejectionReason5Choice rejectionReason) {
		this.rejectionReason = rejectionReason;
		return this;
	}

	public Optional<RepairReason3Choice> getRepairReason() {
		return repairReason == null ? Optional.empty() : Optional.of(repairReason);
	}

	public Reason1Choice setRepairReason(RepairReason3Choice repairReason) {
		this.repairReason = repairReason;
		return this;
	}

	public Optional<PendingReason2Choice> getPendingModificationReason() {
		return pendingModificationReason == null ? Optional.empty() : Optional.of(pendingModificationReason);
	}

	public Reason1Choice setPendingModificationReason(PendingReason2Choice pendingModificationReason) {
		this.pendingModificationReason = pendingModificationReason;
		return this;
	}

	public Optional<UnmatchedReason2Choice> getUnmatchedReason() {
		return unmatchedReason == null ? Optional.empty() : Optional.of(unmatchedReason);
	}

	public Reason1Choice setUnmatchedReason(UnmatchedReason2Choice unmatchedReason) {
		this.unmatchedReason = unmatchedReason;
		return this;
	}
}
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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V07;
import com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V07;
import com.tools20022.repository.choice.AdditionalBusinessProcessFormat14Choice;
import com.tools20022.repository.choice.CorporateActionEventStageFormat15Choice;
import com.tools20022.repository.choice.LotteryTypeFormat5Choice;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.Lottery;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CorporateActionDate50;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about the corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction36#mmDateDetails
 * CorporateAction36.mmDateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction36#mmEventStage
 * CorporateAction36.mmEventStage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction36#mmAdditionalBusinessProcessIndicator
 * CorporateAction36.mmAdditionalBusinessProcessIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction36#mmLotteryType
 * CorporateAction36.mmLotteryType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdvice002V07#mmCorporateActionDetails
 * CorporateActionMovementReversalAdvice002V07.mmCorporateActionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmation002V07#mmCorporateActionDetails
 * CorporateActionMovementConfirmation002V07.mmCorporateActionDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateAction36"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the corporate action event."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateAction36", propOrder = {"dateDetails", "eventStage", "additionalBusinessProcessIndicator", "lotteryType"})
public class CorporateAction36 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DtDtls")
	protected CorporateActionDate50 dateDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionDate50
	 * CorporateActionDate50}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction36
	 * CorporateAction36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the dates related to a corporate action event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction36, Optional<CorporateActionDate50>> mmDateDetails = new MMMessageAssociationEnd<CorporateAction36, Optional<CorporateActionDate50>>() {
		{
			businessComponentTrace_lazy = () -> CorporateActionEvent.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction36.mmObject();
			isDerived = false;
			xmlTag = "DtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateDetails";
			definition = "Provides information about the dates related to a corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionDate50.mmObject();
		}

		@Override
		public Optional<CorporateActionDate50> getValue(CorporateAction36 obj) {
			return obj.getDateDetails();
		}

		@Override
		public void setValue(CorporateAction36 obj, Optional<CorporateActionDate50> value) {
			obj.setDateDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "EvtStag")
	protected CorporateActionEventStageFormat15Choice eventStage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat15Choice
	 * CorporateActionEventStageFormat15Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmEventStage
	 * CorporateActionEvent.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction36
	 * CorporateAction36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtStag"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventStage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stage in the corporate action event life cycle."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction36, Optional<CorporateActionEventStageFormat15Choice>> mmEventStage = new MMMessageAssociationEnd<CorporateAction36, Optional<CorporateActionEventStageFormat15Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmEventStage;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction36.mmObject();
			isDerived = false;
			xmlTag = "EvtStag";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventStage";
			definition = "Stage in the corporate action event life cycle.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionEventStageFormat15Choice.mmObject();
		}

		@Override
		public Optional<CorporateActionEventStageFormat15Choice> getValue(CorporateAction36 obj) {
			return obj.getEventStage();
		}

		@Override
		public void setValue(CorporateAction36 obj, Optional<CorporateActionEventStageFormat15Choice> value) {
			obj.setEventStage(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlBizPrcInd")
	protected AdditionalBusinessProcessFormat14Choice additionalBusinessProcessIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat14Choice
	 * AdditionalBusinessProcessFormat14Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmAdditionalBusinessProcess
	 * CorporateActionEvent.mmAdditionalBusinessProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction36
	 * CorporateAction36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlBizPrcInd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalBusinessProcessIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the additional business process relates to a claim on the associated corporate action event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::ADDB</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction36, Optional<AdditionalBusinessProcessFormat14Choice>> mmAdditionalBusinessProcessIndicator = new MMMessageAssociationEnd<CorporateAction36, Optional<AdditionalBusinessProcessFormat14Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmAdditionalBusinessProcess;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction36.mmObject();
			isDerived = false;
			xmlTag = "AddtlBizPrcInd";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::ADDB"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalBusinessProcessIndicator";
			definition = "Indicates that the additional business process relates to a claim on the associated corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AdditionalBusinessProcessFormat14Choice.mmObject();
		}

		@Override
		public Optional<AdditionalBusinessProcessFormat14Choice> getValue(CorporateAction36 obj) {
			return obj.getAdditionalBusinessProcessIndicator();
		}

		@Override
		public void setValue(CorporateAction36 obj, Optional<AdditionalBusinessProcessFormat14Choice> value) {
			obj.setAdditionalBusinessProcessIndicator(value.orElse(null));
		}
	};
	@XmlElement(name = "LtryTp")
	protected LotteryTypeFormat5Choice lotteryType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat5Choice
	 * LotteryTypeFormat5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Lottery#mmLotteryType
	 * Lottery.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction36
	 * CorporateAction36}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LtryTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotteryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of lottery announced."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :22F::LOTO</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CorporateAction36, Optional<LotteryTypeFormat5Choice>> mmLotteryType = new MMMessageAssociationEnd<CorporateAction36, Optional<LotteryTypeFormat5Choice>>() {
		{
			businessElementTrace_lazy = () -> Lottery.mmLotteryType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateAction36.mmObject();
			isDerived = false;
			xmlTag = "LtryTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":22F::LOTO"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotteryType";
			definition = "Specifies the type of lottery announced.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LotteryTypeFormat5Choice.mmObject();
		}

		@Override
		public Optional<LotteryTypeFormat5Choice> getValue(CorporateAction36 obj) {
			return obj.getLotteryType();
		}

		@Override
		public void setValue(CorporateAction36 obj, Optional<LotteryTypeFormat5Choice> value) {
			obj.setLotteryType(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateAction36.mmDateDetails, com.tools20022.repository.msg.CorporateAction36.mmEventStage,
						com.tools20022.repository.msg.CorporateAction36.mmAdditionalBusinessProcessIndicator, com.tools20022.repository.msg.CorporateAction36.mmLotteryType);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionMovementReversalAdvice002V07.mmCorporateActionDetails, CorporateActionMovementConfirmation002V07.mmCorporateActionDetails);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateAction36";
				definition = "Provides information about the corporate action event.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<CorporateActionDate50> getDateDetails() {
		return dateDetails == null ? Optional.empty() : Optional.of(dateDetails);
	}

	public CorporateAction36 setDateDetails(CorporateActionDate50 dateDetails) {
		this.dateDetails = dateDetails;
		return this;
	}

	public Optional<CorporateActionEventStageFormat15Choice> getEventStage() {
		return eventStage == null ? Optional.empty() : Optional.of(eventStage);
	}

	public CorporateAction36 setEventStage(CorporateActionEventStageFormat15Choice eventStage) {
		this.eventStage = eventStage;
		return this;
	}

	public Optional<AdditionalBusinessProcessFormat14Choice> getAdditionalBusinessProcessIndicator() {
		return additionalBusinessProcessIndicator == null ? Optional.empty() : Optional.of(additionalBusinessProcessIndicator);
	}

	public CorporateAction36 setAdditionalBusinessProcessIndicator(AdditionalBusinessProcessFormat14Choice additionalBusinessProcessIndicator) {
		this.additionalBusinessProcessIndicator = additionalBusinessProcessIndicator;
		return this;
	}

	public Optional<LotteryTypeFormat5Choice> getLotteryType() {
		return lotteryType == null ? Optional.empty() : Optional.of(lotteryType);
	}

	public CorporateAction36 setLotteryType(LotteryTypeFormat5Choice lotteryType) {
		this.lotteryType = lotteryType;
		return this;
	}
}
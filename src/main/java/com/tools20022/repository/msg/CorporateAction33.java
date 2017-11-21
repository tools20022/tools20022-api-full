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
import com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV07;
import com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV08;
import com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07;
import com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV08;
import com.tools20022.repository.choice.AdditionalBusinessProcessFormat11Choice;
import com.tools20022.repository.choice.CorporateActionEventStageFormat14Choice;
import com.tools20022.repository.choice.LotteryTypeFormat4Choice;
import com.tools20022.repository.entity.CorporateActionEvent;
import com.tools20022.repository.entity.Lottery;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.msg.CorporateAction33#mmDateDetails
 * CorporateAction33.mmDateDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateAction33#mmEventStage
 * CorporateAction33.mmEventStage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction33#mmAdditionalBusinessProcessIndicator
 * CorporateAction33.mmAdditionalBusinessProcessIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateAction33#mmLotteryType
 * CorporateAction33.mmLotteryType}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV07#mmCorporateActionDetails
 * CorporateActionMovementConfirmationV07.mmCorporateActionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV07#mmCorporateActionDetails
 * CorporateActionMovementReversalAdviceV07.mmCorporateActionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementConfirmationV08#mmCorporateActionDetails
 * CorporateActionMovementConfirmationV08.mmCorporateActionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementReversalAdviceV08#mmCorporateActionDetails
 * CorporateActionMovementReversalAdviceV08.mmCorporateActionDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateAction33"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the corporate action event."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CorporateAction13
 * CorporateAction13}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateAction33", propOrder = {"dateDetails", "eventStage", "additionalBusinessProcessIndicator", "lotteryType"})
public class CorporateAction33 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CorporateActionDate49 dateDetails;
	/**
	 * Provides information about the dates related to a corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionDate49
	 * CorporateActionDate49}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent
	 * CorporateActionEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction33
	 * CorporateAction33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information about the dates related to a corporate action event."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction13#mmDateDetails
	 * CorporateAction13.mmDateDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDateDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CorporateActionEvent.mmObject();
			componentContext_lazy = () -> CorporateAction33.mmObject();
			isDerived = false;
			xmlTag = "DtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateDetails";
			definition = "Provides information about the dates related to a corporate action event.";
			previousVersion_lazy = () -> CorporateAction13.mmDateDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionDate49.mmObject();
		}
	};
	protected CorporateActionEventStageFormat14Choice eventStage;
	/**
	 * Stage in the corporate action event life cycle.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionEventStageFormat14Choice
	 * CorporateActionEventStageFormat14Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmEventStage
	 * CorporateActionEvent.mmEventStage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction33
	 * CorporateAction33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtStag"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventStage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Stage in the corporate action event life cycle."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction13#mmEventStage
	 * CorporateAction13.mmEventStage}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEventStage = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmEventStage;
			componentContext_lazy = () -> CorporateAction33.mmObject();
			isDerived = false;
			xmlTag = "EvtStag";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventStage";
			definition = "Stage in the corporate action event life cycle.";
			previousVersion_lazy = () -> CorporateAction13.mmEventStage;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CorporateActionEventStageFormat14Choice.mmObject();
		}
	};
	protected AdditionalBusinessProcessFormat11Choice additionalBusinessProcessIndicator;
	/**
	 * Indicates that the additional business process relates to a claim on the
	 * associated corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AdditionalBusinessProcessFormat11Choice
	 * AdditionalBusinessProcessFormat11Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmAdditionalBusinessProcess
	 * CorporateActionEvent.mmAdditionalBusinessProcess}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction33
	 * CorporateAction33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlBizPrcInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalBusinessProcessIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the additional business process relates to a claim on the associated corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalBusinessProcessIndicator = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmAdditionalBusinessProcess;
			componentContext_lazy = () -> CorporateAction33.mmObject();
			isDerived = false;
			xmlTag = "AddtlBizPrcInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalBusinessProcessIndicator";
			definition = "Indicates that the additional business process relates to a claim on the associated corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AdditionalBusinessProcessFormat11Choice.mmObject();
		}
	};
	protected LotteryTypeFormat4Choice lotteryType;
	/**
	 * Specifies the type of lottery announced.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.LotteryTypeFormat4Choice
	 * LotteryTypeFormat4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Lottery#mmLotteryType
	 * Lottery.mmLotteryType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction33
	 * CorporateAction33}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LtryTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LotteryType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the type of lottery announced."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CorporateAction13#mmLotteryType
	 * CorporateAction13.mmLotteryType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLotteryType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Lottery.mmLotteryType;
			componentContext_lazy = () -> CorporateAction33.mmObject();
			isDerived = false;
			xmlTag = "LtryTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LotteryType";
			definition = "Specifies the type of lottery announced.";
			previousVersion_lazy = () -> CorporateAction13.mmLotteryType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> LotteryTypeFormat4Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateAction33.mmDateDetails, CorporateAction33.mmEventStage, CorporateAction33.mmAdditionalBusinessProcessIndicator, CorporateAction33.mmLotteryType);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionMovementConfirmationV07.mmCorporateActionDetails, CorporateActionMovementReversalAdviceV07.mmCorporateActionDetails,
						CorporateActionMovementConfirmationV08.mmCorporateActionDetails, CorporateActionMovementReversalAdviceV08.mmCorporateActionDetails);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateAction33";
				definition = "Provides information about the corporate action event.";
				previousVersion_lazy = () -> CorporateAction13.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "DtDtls")
	public CorporateActionDate49 getDateDetails() {
		return dateDetails;
	}

	public void setDateDetails(com.tools20022.repository.msg.CorporateActionDate49 dateDetails) {
		this.dateDetails = dateDetails;
	}

	@XmlElement(name = "EvtStag")
	public CorporateActionEventStageFormat14Choice getEventStage() {
		return eventStage;
	}

	public void setEventStage(CorporateActionEventStageFormat14Choice eventStage) {
		this.eventStage = eventStage;
	}

	@XmlElement(name = "AddtlBizPrcInd")
	public AdditionalBusinessProcessFormat11Choice getAdditionalBusinessProcessIndicator() {
		return additionalBusinessProcessIndicator;
	}

	public void setAdditionalBusinessProcessIndicator(AdditionalBusinessProcessFormat11Choice additionalBusinessProcessIndicator) {
		this.additionalBusinessProcessIndicator = additionalBusinessProcessIndicator;
	}

	@XmlElement(name = "LtryTp")
	public LotteryTypeFormat4Choice getLotteryType() {
		return lotteryType;
	}

	public void setLotteryType(LotteryTypeFormat4Choice lotteryType) {
		this.lotteryType = lotteryType;
	}
}
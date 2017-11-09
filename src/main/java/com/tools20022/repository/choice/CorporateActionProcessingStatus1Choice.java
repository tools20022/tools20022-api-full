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

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01;
import com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV02;
import com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03;
import com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.CorporateActionStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CorporateActionEventStatus1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the status of the details of the corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus1Choice#mmEventStatus
 * CorporateActionProcessingStatus1Choice.mmEventStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus1Choice#mmForInformationOnlyIndicator
 * CorporateActionProcessingStatus1Choice.mmForInformationOnlyIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionStatus
 * CorporateActionStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV01#mmCancellationAdviceGeneralInformation
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.
 * mmCancellationAdviceGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV02#mmCancellationAdviceGeneralInformation
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.
 * mmCancellationAdviceGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV03#mmCancellationAdviceGeneralInformation
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.
 * mmCancellationAdviceGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceCancellationAdviceV04#mmCancellationAdviceGeneralInformation
 * CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.
 * mmCancellationAdviceGeneralInformation}</li>
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
 * "CorporateActionProcessingStatus1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of the details of the corporate action event."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus2Choice
 * CorporateActionProcessingStatus2Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class CorporateActionProcessingStatus1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected CorporateActionEventStatus1 eventStatus;
	/**
	 * Specifies the status of the details of the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionEventStatus1
	 * CorporateActionEventStatus1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmProcessingStatus
	 * CorporateActionStatus.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus1Choice
	 * CorporateActionProcessingStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EvtSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EventStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of the details of the event."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmEventStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionStatus.mmProcessingStatus;
			componentContext_lazy = () -> CorporateActionProcessingStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "EvtSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EventStatus";
			definition = "Specifies the status of the details of the event.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionEventStatus1.mmObject();
		}
	};
	protected YesNoIndicator forInformationOnlyIndicator;
	/**
	 * Indicates that the message is for information only, that is processing of
	 * client's instruction will not be supported by the Account Servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus1Choice
	 * CorporateActionProcessingStatus1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ForInfOnlyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForInformationOnlyIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that the message is for information only, that is processing of client's instruction will not be supported by the Account Servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmForInformationOnlyIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionProcessingStatus1Choice.mmObject();
			isDerived = false;
			xmlTag = "ForInfOnlyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForInformationOnlyIndicator";
			definition = "Indicates that the message is for information only, that is processing of client's instruction will not be supported by the Account Servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionProcessingStatus1Choice.mmEventStatus, CorporateActionProcessingStatus1Choice.mmForInformationOnlyIndicator);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceCancellationAdviceV01.mmCancellationAdviceGeneralInformation,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV02.mmCancellationAdviceGeneralInformation, CorporateActionMovementPreliminaryAdviceCancellationAdviceV03.mmCancellationAdviceGeneralInformation,
						CorporateActionMovementPreliminaryAdviceCancellationAdviceV04.mmCancellationAdviceGeneralInformation);
				trace_lazy = () -> CorporateActionStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionProcessingStatus1Choice";
				definition = "Specifies the status of the details of the corporate action event.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionProcessingStatus2Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionEventStatus1 getEventStatus() {
		return eventStatus;
	}

	public void setEventStatus(CorporateActionEventStatus1 eventStatus) {
		this.eventStatus = eventStatus;
	}

	public YesNoIndicator getForInformationOnlyIndicator() {
		return forInformationOnlyIndicator;
	}

	public void setForInformationOnlyIndicator(YesNoIndicator forInformationOnlyIndicator) {
		this.forInformationOnlyIndicator = forInformationOnlyIndicator;
	}
}
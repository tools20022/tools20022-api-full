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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01;
import com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02;
import com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03;
import com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04;
import com.tools20022.repository.choice.CorporateActionProcessingStatus1Choice;
import com.tools20022.repository.codeset.CorporateActionPreliminaryAdviceType1Code;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.CorporateActionNotification;
import com.tools20022.repository.entity.CorporateActionStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Type of movement preliminary advice document.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPreliminaryAdviceType1#mmType
 * CorporateActionPreliminaryAdviceType1.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPreliminaryAdviceType1#mmProcessingStatus
 * CorporateActionPreliminaryAdviceType1.mmProcessingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPreliminaryAdviceType1#mmEligibilityIndicator
 * CorporateActionPreliminaryAdviceType1.mmEligibilityIndicator}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.CorporateActionNotification
 * CorporateActionNotification}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV01#mmMovementPreliminaryAdviceGeneralInformation
 * CorporateActionMovementPreliminaryAdviceV01.
 * mmMovementPreliminaryAdviceGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV02#mmMovementPreliminaryAdviceGeneralInformation
 * CorporateActionMovementPreliminaryAdviceV02.
 * mmMovementPreliminaryAdviceGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV03#mmMovementPreliminaryAdviceGeneralInformation
 * CorporateActionMovementPreliminaryAdviceV03.
 * mmMovementPreliminaryAdviceGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionMovementPreliminaryAdviceV04#mmMovementPreliminaryAdviceGeneralInformation
 * CorporateActionMovementPreliminaryAdviceV04.
 * mmMovementPreliminaryAdviceGeneralInformation}</li>
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
 * "CorporateActionPreliminaryAdviceType1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Type of movement preliminary advice document."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionPreliminaryAdviceType2
 * CorporateActionPreliminaryAdviceType2}</li>
 * </ul>
 * </li>
 * </ul>
 */
public class CorporateActionPreliminaryAdviceType1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CorporateActionPreliminaryAdviceType1Code type;
	/**
	 * Type of movement preliminary advice ie. new or replacement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionPreliminaryAdviceType1Code
	 * CorporateActionPreliminaryAdviceType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionNotification#mmNotificationType
	 * CorporateActionNotification.mmNotificationType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPreliminaryAdviceType1
	 * CorporateActionPreliminaryAdviceType1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of movement preliminary advice ie. new or replacement."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPreliminaryAdviceType2#mmType
	 * CorporateActionPreliminaryAdviceType2.mmType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionNotification.mmNotificationType;
			componentContext_lazy = () -> CorporateActionPreliminaryAdviceType1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Type of movement preliminary advice ie. new or replacement.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPreliminaryAdviceType2.mmType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionPreliminaryAdviceType1Code.mmObject();
		}
	};
	protected CorporateActionProcessingStatus1Choice processingStatus;
	/**
	 * Specifies the status of the details of the event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.CorporateActionProcessingStatus1Choice
	 * CorporateActionProcessingStatus1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionStatus#mmProcessingStatus
	 * CorporateActionStatus.mmProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPreliminaryAdviceType1
	 * CorporateActionPreliminaryAdviceType1}</li>
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
	 * definition} = "Specifies the status of the details of the event."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProcessingStatus = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionStatus.mmProcessingStatus;
			componentContext_lazy = () -> CorporateActionPreliminaryAdviceType1.mmObject();
			isDerived = false;
			xmlTag = "PrcgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessingStatus";
			definition = "Specifies the status of the details of the event.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CorporateActionProcessingStatus1Choice.mmObject();
		}
	};
	protected YesNoIndicator eligibilityIndicator;
	/**
	 * Indicates whether the movement preliminary advice is sent after
	 * entitlement date.<br>
	 * Value is Yes (true) if sent after entitlement date and No (false) if sent
	 * before entitlement date.
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
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPreliminaryAdviceType1
	 * CorporateActionPreliminaryAdviceType1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ElgbltyInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EligibilityIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the movement preliminary advice is sent after entitlement date.\r\nValue is Yes (true) if sent after entitlement date and No (false) if sent before entitlement date."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CorporateActionPreliminaryAdviceType2#mmEligibilityIndicator
	 * CorporateActionPreliminaryAdviceType2.mmEligibilityIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEligibilityIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CorporateActionPreliminaryAdviceType1.mmObject();
			isDerived = false;
			xmlTag = "ElgbltyInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EligibilityIndicator";
			definition = "Indicates whether the movement preliminary advice is sent after entitlement date.\r\nValue is Yes (true) if sent after entitlement date and No (false) if sent before entitlement date.";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionPreliminaryAdviceType2.mmEligibilityIndicator);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionPreliminaryAdviceType1.mmType, CorporateActionPreliminaryAdviceType1.mmProcessingStatus, CorporateActionPreliminaryAdviceType1.mmEligibilityIndicator);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionMovementPreliminaryAdviceV01.mmMovementPreliminaryAdviceGeneralInformation,
						CorporateActionMovementPreliminaryAdviceV02.mmMovementPreliminaryAdviceGeneralInformation, CorporateActionMovementPreliminaryAdviceV03.mmMovementPreliminaryAdviceGeneralInformation,
						CorporateActionMovementPreliminaryAdviceV04.mmMovementPreliminaryAdviceGeneralInformation);
				trace_lazy = () -> CorporateActionNotification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionPreliminaryAdviceType1";
				definition = "Type of movement preliminary advice document.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionPreliminaryAdviceType2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public CorporateActionPreliminaryAdviceType1Code getType() {
		return type;
	}

	public void setType(CorporateActionPreliminaryAdviceType1Code type) {
		this.type = type;
	}

	public CorporateActionProcessingStatus1Choice getProcessingStatus() {
		return processingStatus;
	}

	public void setProcessingStatus(CorporateActionProcessingStatus1Choice processingStatus) {
		this.processingStatus = processingStatus;
	}

	public YesNoIndicator getEligibilityIndicator() {
		return eligibilityIndicator;
	}

	public void setEligibilityIndicator(YesNoIndicator eligibilityIndicator) {
		this.eligibilityIndicator = eligibilityIndicator;
	}
}
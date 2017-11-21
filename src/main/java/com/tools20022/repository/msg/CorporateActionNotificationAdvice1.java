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
import com.tools20022.repository.area.seev.AgentCANotificationCancellationRequestV01;
import com.tools20022.repository.entity.CorporateActionNotification;
import com.tools20022.repository.entity.CorporateActionOptionServicing;
import com.tools20022.repository.entity.CorporateActionServicing;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides detailed information about an announcement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationAdvice1#mmCorporateActionDetails
 * CorporateActionNotificationAdvice1.mmCorporateActionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationAdvice1#mmCorporateActionOptionDetails
 * CorporateActionNotificationAdvice1.mmCorporateActionOptionDetails}</li>
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
 * {@linkplain com.tools20022.repository.area.seev.AgentCANotificationCancellationRequestV01#mmCorporateActionNotificationDetails
 * AgentCANotificationCancellationRequestV01.
 * mmCorporateActionNotificationDetails}</li>
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
 * "CorporateActionNotificationAdvice1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides detailed information about an announcement."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionNotificationAdvice1", propOrder = {"corporateActionDetails", "corporateActionOptionDetails"})
public class CorporateActionNotificationAdvice1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CorporateAction2 corporateActionDetails;
	/**
	 * Provides detailed information about the corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateAction2
	 * CorporateAction2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionServicing#mmEvent
	 * CorporateActionServicing.mmEvent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationAdvice1
	 * CorporateActionNotificationAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides detailed information about the corporate action event."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCorporateActionDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionServicing.mmEvent;
			componentContext_lazy = () -> CorporateActionNotificationAdvice1.mmObject();
			isDerived = false;
			xmlTag = "CorpActnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionDetails";
			definition = "Provides detailed information about the corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateAction2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.CorporateActionOption1> corporateActionOptionDetails;
	/**
	 * Provides information about an option of a CA event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CorporateActionOption1
	 * CorporateActionOption1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionOptionServicing#mmRelatedOption
	 * CorporateActionOptionServicing.mmRelatedOption}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionNotificationAdvice1
	 * CorporateActionNotificationAdvice1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnOptnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionOptionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information about an option of a CA event."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCorporateActionOptionDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionOptionServicing.mmRelatedOption;
			componentContext_lazy = () -> CorporateActionNotificationAdvice1.mmObject();
			isDerived = false;
			xmlTag = "CorpActnOptnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionOptionDetails";
			definition = "Provides information about an option of a CA event.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CorporateActionOption1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionNotificationAdvice1.mmCorporateActionDetails, CorporateActionNotificationAdvice1.mmCorporateActionOptionDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(AgentCANotificationCancellationRequestV01.mmCorporateActionNotificationDetails);
				trace_lazy = () -> CorporateActionNotification.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionNotificationAdvice1";
				definition = "Provides detailed information about an announcement.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CorpActnDtls", required = true)
	public CorporateAction2 getCorporateActionDetails() {
		return corporateActionDetails;
	}

	public void setCorporateActionDetails(com.tools20022.repository.msg.CorporateAction2 corporateActionDetails) {
		this.corporateActionDetails = corporateActionDetails;
	}

	@XmlElement(name = "CorpActnOptnDtls")
	public List<CorporateActionOption1> getCorporateActionOptionDetails() {
		return corporateActionOptionDetails;
	}

	public void setCorporateActionOptionDetails(List<com.tools20022.repository.msg.CorporateActionOption1> corporateActionOptionDetails) {
		this.corporateActionOptionDetails = corporateActionOptionDetails;
	}
}
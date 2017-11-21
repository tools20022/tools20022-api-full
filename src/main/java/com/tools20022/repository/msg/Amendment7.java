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
import com.tools20022.repository.area.tsrv.UndertakingAmendmentResponseV01;
import com.tools20022.repository.codeset.UndertakingStatus2Code;
import com.tools20022.repository.entity.AmendmentOfUndertaking;
import com.tools20022.repository.entity.Undertaking;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Details of the amendment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Amendment7#mmAmendmentIdentification
 * Amendment7.mmAmendmentIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Amendment7#mmAmendmentStatus
 * Amendment7.mmAmendmentStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking
 * AmendmentOfUndertaking}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsrv.UndertakingAmendmentResponseV01#mmUndertakingAmendmentResponseDetails
 * UndertakingAmendmentResponseV01.mmUndertakingAmendmentResponseDetails}</li>
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
 * "Amendment7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Details of the amendment."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Amendment7", propOrder = {"amendmentIdentification", "amendmentStatus"})
public class Amendment7 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Amendment8 amendmentIdentification;
	/**
	 * Identification of the proposed amendment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Amendment8 Amendment8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmendmentOfUndertaking#mmAmendmentIdentification
	 * AmendmentOfUndertaking.mmAmendmentIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment7
	 * Amendment7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmdmntId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the proposed amendment."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAmendmentIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AmendmentOfUndertaking.mmAmendmentIdentification;
			componentContext_lazy = () -> Amendment7.mmObject();
			isDerived = false;
			xmlTag = "AmdmntId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentIdentification";
			definition = "Identification of the proposed amendment.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Amendment8.mmObject();
		}
	};
	protected UndertakingStatus2Code amendmentStatus;
	/**
	 * Proposed undertaking amendment status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.UndertakingStatus2Code
	 * UndertakingStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Undertaking#mmUndertakingStatus
	 * Undertaking.mmUndertakingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Amendment7
	 * Amendment7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmdmntSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proposed undertaking amendment status."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmendmentStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Undertaking.mmUndertakingStatus;
			componentContext_lazy = () -> Amendment7.mmObject();
			isDerived = false;
			xmlTag = "AmdmntSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentStatus";
			definition = "Proposed undertaking amendment status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> UndertakingStatus2Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Amendment7.mmAmendmentIdentification, Amendment7.mmAmendmentStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(UndertakingAmendmentResponseV01.mmUndertakingAmendmentResponseDetails);
				trace_lazy = () -> AmendmentOfUndertaking.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Amendment7";
				definition = "Details of the amendment.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AmdmntId", required = true)
	public Amendment8 getAmendmentIdentification() {
		return amendmentIdentification;
	}

	public void setAmendmentIdentification(com.tools20022.repository.msg.Amendment8 amendmentIdentification) {
		this.amendmentIdentification = amendmentIdentification;
	}

	@XmlElement(name = "AmdmntSts", required = true)
	public UndertakingStatus2Code getAmendmentStatus() {
		return amendmentStatus;
	}

	public void setAmendmentStatus(UndertakingStatus2Code amendmentStatus) {
		this.amendmentStatus = amendmentStatus;
	}
}
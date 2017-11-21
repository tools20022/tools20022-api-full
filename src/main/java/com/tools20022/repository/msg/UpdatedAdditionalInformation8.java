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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.seev.CorporateActionNarrativeV04;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max8000Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Additional information with update description and date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation8#mmUpdateDescription
 * UpdatedAdditionalInformation8.mmUpdateDescription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation8#mmUpdateDate
 * UpdatedAdditionalInformation8.mmUpdateDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation8#mmAdditionalInformation
 * UpdatedAdditionalInformation8.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.CorporateActionNarrativeV04#mmAdditionalInformation
 * CorporateActionNarrativeV04.mmAdditionalInformation}</li>
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
 * "UpdatedAdditionalInformation8"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Additional information with update description and date."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation2
 * UpdatedAdditionalInformation2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "UpdatedAdditionalInformation8", propOrder = {"updateDescription", "updateDate", "additionalInformation"})
public class UpdatedAdditionalInformation8 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max140Text updateDescription;
	/**
	 * Specifies the amendments made to the narrative since the last message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation8
	 * UpdatedAdditionalInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UpdDesc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpdateDescription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the amendments made to the narrative since the last message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation2#mmUpdateDescription
	 * UpdatedAdditionalInformation2.mmUpdateDescription}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUpdateDescription = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> UpdatedAdditionalInformation8.mmObject();
			isDerived = false;
			xmlTag = "UpdDesc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateDescription";
			definition = "Specifies the amendments made to the narrative since the last message.";
			previousVersion_lazy = () -> UpdatedAdditionalInformation2.mmUpdateDescription;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected ISODate updateDate;
	/**
	 * Specifies the date at which the narrative has been updated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation8
	 * UpdatedAdditionalInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UpdDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UpdateDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the date at which the narrative has been updated."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation2#mmUpdateDate
	 * UpdatedAdditionalInformation2.mmUpdateDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUpdateDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> UpdatedAdditionalInformation8.mmObject();
			isDerived = false;
			xmlTag = "UpdDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UpdateDate";
			definition = "Specifies the date at which the narrative has been updated.";
			previousVersion_lazy = () -> UpdatedAdditionalInformation2.mmUpdateDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected List<Max8000Text> additionalInformation;
	/**
	 * Provides additional textual information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max8000Text
	 * Max8000Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation8
	 * UpdatedAdditionalInformation8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides additional textual information."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.UpdatedAdditionalInformation2#mmAdditionalInformation
	 * UpdatedAdditionalInformation2.mmAdditionalInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalInformation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> UpdatedAdditionalInformation8.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional textual information.";
			previousVersion_lazy = () -> UpdatedAdditionalInformation2.mmAdditionalInformation;
			minOccurs = 1;
			simpleType_lazy = () -> Max8000Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(UpdatedAdditionalInformation8.mmUpdateDescription, UpdatedAdditionalInformation8.mmUpdateDate, UpdatedAdditionalInformation8.mmAdditionalInformation);
				messageBuildingBlock_lazy = () -> Arrays.asList(CorporateActionNarrativeV04.mmAdditionalInformation);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "UpdatedAdditionalInformation8";
				definition = "Additional information with update description and date.";
				previousVersion_lazy = () -> UpdatedAdditionalInformation2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "UpdDesc")
	public Max140Text getUpdateDescription() {
		return updateDescription;
	}

	public void setUpdateDescription(Max140Text updateDescription) {
		this.updateDescription = updateDescription;
	}

	@XmlElement(name = "UpdDt")
	public ISODate getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(ISODate updateDate) {
		this.updateDate = updateDate;
	}

	@XmlElement(name = "AddtlInf", required = true)
	public List<Max8000Text> getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(List<Max8000Text> additionalInformation) {
		this.additionalInformation = additionalInformation;
	}
}
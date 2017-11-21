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
import com.tools20022.repository.area.seev.MeetingNotificationV05;
import com.tools20022.repository.choice.DateFormat29Choice;
import com.tools20022.repository.codeset.PowerOfAttorneyLegalisation1Code;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.entity.PowerOfAttorneyRequirements;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the conditions to be filled in to obtain a valid power of attorney.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PowerOfAttorneyRequirements3#mmLegalRequirement
 * PowerOfAttorneyRequirements3.mmLegalRequirement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PowerOfAttorneyRequirements3#mmOtherDocumentation
 * PowerOfAttorneyRequirements3.mmOtherDocumentation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PowerOfAttorneyRequirements3#mmDocumentSubmissionDeadline
 * PowerOfAttorneyRequirements3.mmDocumentSubmissionDeadline}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.PowerOfAttorneyRequirements
 * PowerOfAttorneyRequirements}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05#mmPowerOfAttorneyRequirements
 * MeetingNotificationV05.mmPowerOfAttorneyRequirements}</li>
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
 * "PowerOfAttorneyRequirements3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the conditions to be filled in to obtain a valid power of attorney."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PowerOfAttorneyRequirements2
 * PowerOfAttorneyRequirements2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PowerOfAttorneyRequirements3", propOrder = {"legalRequirement", "otherDocumentation", "documentSubmissionDeadline"})
public class PowerOfAttorneyRequirements3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<PowerOfAttorneyLegalisation1Code> legalRequirement;
	/**
	 * Specifies whether the power of attorney needs to be validated by some
	 * authority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PowerOfAttorneyLegalisation1Code
	 * PowerOfAttorneyLegalisation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorneyRequirements#mmLegalRequirement
	 * PowerOfAttorneyRequirements.mmLegalRequirement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PowerOfAttorneyRequirements3
	 * PowerOfAttorneyRequirements3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LglRqrmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegalRequirement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether the power of attorney needs to be validated by some authority."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PowerOfAttorneyRequirements2#mmLegalRequirement
	 * PowerOfAttorneyRequirements2.mmLegalRequirement}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegalRequirement = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PowerOfAttorneyRequirements.mmLegalRequirement;
			componentContext_lazy = () -> PowerOfAttorneyRequirements3.mmObject();
			isDerived = false;
			xmlTag = "LglRqrmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegalRequirement";
			definition = "Specifies whether the power of attorney needs to be validated by some authority.";
			previousVersion_lazy = () -> PowerOfAttorneyRequirements2.mmLegalRequirement;
			maxOccurs = 4;
			minOccurs = 0;
			simpleType_lazy = () -> PowerOfAttorneyLegalisation1Code.mmObject();
		}
	};
	protected Max350Text otherDocumentation;
	/**
	 * Specifies the documents needed to obtain a valid power of attorney.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PowerOfAttorneyRequirements#mmOtherDocumentation
	 * PowerOfAttorneyRequirements.mmOtherDocumentation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PowerOfAttorneyRequirements3
	 * PowerOfAttorneyRequirements3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrDcmnttn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherDocumentation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the documents needed to obtain a valid power of attorney."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PowerOfAttorneyRequirements2#mmOtherDocumentation
	 * PowerOfAttorneyRequirements2.mmOtherDocumentation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOtherDocumentation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PowerOfAttorneyRequirements.mmOtherDocumentation;
			componentContext_lazy = () -> PowerOfAttorneyRequirements3.mmObject();
			isDerived = false;
			xmlTag = "OthrDcmnttn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherDocumentation";
			definition = "Specifies the documents needed to obtain a valid power of attorney.";
			previousVersion_lazy = () -> PowerOfAttorneyRequirements2.mmOtherDocumentation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	protected DateFormat29Choice documentSubmissionDeadline;
	/**
	 * Date by which the requested documents must be provided.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.DateFormat29Choice
	 * DateFormat29Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PowerOfAttorneyRequirements3
	 * PowerOfAttorneyRequirements3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DocSubmissnDdln"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DocumentSubmissionDeadline"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date by which the requested documents must be provided."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDocumentSubmissionDeadline = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> PowerOfAttorneyRequirements3.mmObject();
			isDerived = false;
			xmlTag = "DocSubmissnDdln";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DocumentSubmissionDeadline";
			definition = "Date by which the requested documents must be provided.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DateFormat29Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PowerOfAttorneyRequirements3.mmLegalRequirement, PowerOfAttorneyRequirements3.mmOtherDocumentation, PowerOfAttorneyRequirements3.mmDocumentSubmissionDeadline);
				messageBuildingBlock_lazy = () -> Arrays.asList(MeetingNotificationV05.mmPowerOfAttorneyRequirements);
				trace_lazy = () -> PowerOfAttorneyRequirements.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PowerOfAttorneyRequirements3";
				definition = "Specifies the conditions to be filled in to obtain a valid power of attorney.";
				previousVersion_lazy = () -> PowerOfAttorneyRequirements2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "LglRqrmnt")
	public List<PowerOfAttorneyLegalisation1Code> getLegalRequirement() {
		return legalRequirement;
	}

	public void setLegalRequirement(List<PowerOfAttorneyLegalisation1Code> legalRequirement) {
		this.legalRequirement = legalRequirement;
	}

	@XmlElement(name = "OthrDcmnttn")
	public Max350Text getOtherDocumentation() {
		return otherDocumentation;
	}

	public void setOtherDocumentation(Max350Text otherDocumentation) {
		this.otherDocumentation = otherDocumentation;
	}

	@XmlElement(name = "DocSubmissnDdln")
	public DateFormat29Choice getDocumentSubmissionDeadline() {
		return documentSubmissionDeadline;
	}

	public void setDocumentSubmissionDeadline(DateFormat29Choice documentSubmissionDeadline) {
		this.documentSubmissionDeadline = documentSubmissionDeadline;
	}
}
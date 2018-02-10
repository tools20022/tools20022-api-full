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
import com.tools20022.repository.choice.CharacterSearchChoice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.SystemBusinessInformation;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria used to search for business information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralBusinessInformationSearchCriteria#mmReference
 * GeneralBusinessInformationSearchCriteria.mmReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralBusinessInformationSearchCriteria#mmSubject
 * GeneralBusinessInformationSearchCriteria.mmSubject}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.GeneralBusinessInformationSearchCriteria#mmQualifier
 * GeneralBusinessInformationSearchCriteria.mmQualifier}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation
 * SystemBusinessInformation}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "GeneralBusinessInformationSearchCriteria"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to search for business information."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "GeneralBusinessInformationSearchCriteria", propOrder = {"reference", "subject", "qualifier"})
public class GeneralBusinessInformationSearchCriteria {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Ref")
	protected List<Max35Text> reference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation#mmReference
	 * SystemBusinessInformation.mmReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessInformationSearchCriteria
	 * GeneralBusinessInformationSearchCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Ref"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous reference assigned to a general business information system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SystemBusinessInformation.mmReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.GeneralBusinessInformationSearchCriteria.mmObject();
			isDerived = false;
			xmlTag = "Ref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reference";
			definition = "Unique and unambiguous reference assigned to a general business information system.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "Sbjt")
	protected List<CharacterSearchChoice> subject;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CharacterSearchChoice
	 * CharacterSearchChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation#mmSubject
	 * SystemBusinessInformation.mmSubject}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessInformationSearchCriteria
	 * GeneralBusinessInformationSearchCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sbjt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Subject"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Subject line of an item of general business information, summarizing the topic and intended destination of the information."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSubject = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SystemBusinessInformation.mmSubject;
			componentContext_lazy = () -> com.tools20022.repository.msg.GeneralBusinessInformationSearchCriteria.mmObject();
			isDerived = false;
			xmlTag = "Sbjt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Subject";
			definition = "Subject line of an item of general business information, summarizing the topic and intended destination of the information.";
			minOccurs = 0;
			complexType_lazy = () -> CharacterSearchChoice.mmObject();
		}
	};
	@XmlElement(name = "Qlfr")
	protected List<com.tools20022.repository.msg.InformationQualifierType> qualifier;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.InformationQualifierType
	 * InformationQualifierType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SystemBusinessInformation#mmQualifier
	 * SystemBusinessInformation.mmQualifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.GeneralBusinessInformationSearchCriteria
	 * GeneralBusinessInformationSearchCriteria}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Qlfr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Qualifier"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Further information about the criticality or importance of a general business information system."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmQualifier = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SystemBusinessInformation.mmQualifier;
			componentContext_lazy = () -> com.tools20022.repository.msg.GeneralBusinessInformationSearchCriteria.mmObject();
			isDerived = false;
			xmlTag = "Qlfr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Qualifier";
			definition = "Further information about the criticality or importance of a general business information system.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InformationQualifierType.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.GeneralBusinessInformationSearchCriteria.mmReference, com.tools20022.repository.msg.GeneralBusinessInformationSearchCriteria.mmSubject,
						com.tools20022.repository.msg.GeneralBusinessInformationSearchCriteria.mmQualifier);
				trace_lazy = () -> SystemBusinessInformation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "GeneralBusinessInformationSearchCriteria";
				definition = "Defines the criteria used to search for business information.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<Max35Text> getReference() {
		return reference == null ? reference = new ArrayList<>() : reference;
	}

	public GeneralBusinessInformationSearchCriteria setReference(List<Max35Text> reference) {
		this.reference = Objects.requireNonNull(reference);
		return this;
	}

	public List<CharacterSearchChoice> getSubject() {
		return subject == null ? subject = new ArrayList<>() : subject;
	}

	public GeneralBusinessInformationSearchCriteria setSubject(List<CharacterSearchChoice> subject) {
		this.subject = Objects.requireNonNull(subject);
		return this;
	}

	public List<InformationQualifierType> getQualifier() {
		return qualifier == null ? qualifier = new ArrayList<>() : qualifier;
	}

	public GeneralBusinessInformationSearchCriteria setQualifier(List<com.tools20022.repository.msg.InformationQualifierType> qualifier) {
		this.qualifier = Objects.requireNonNull(qualifier);
		return this;
	}
}
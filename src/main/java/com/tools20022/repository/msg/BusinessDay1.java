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
import com.tools20022.repository.choice.BusinessDayReportOrError2Choice;
import com.tools20022.repository.choice.SystemIdentification2Choice;
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
 * Reports on business day information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDay1#mmSystemIdentification
 * BusinessDay1.mmSystemIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.BusinessDay1#mmBusinessDayOrError
 * BusinessDay1.mmBusinessDayOrError}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BusinessDay1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reports on business day information."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.BusinessDay3 BusinessDay3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.BusinessDay5 BusinessDay5}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "BusinessDay1", propOrder = {"systemIdentification", "businessDayOrError"})
public class BusinessDay1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SysId", required = true)
	protected List<SystemIdentification2Choice> systemIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.SystemIdentification2Choice
	 * SystemIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDay1 BusinessDay1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SysId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SystemIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of a particular market infrastructure."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BusinessDay3#mmSystemIdentification
	 * BusinessDay3.mmSystemIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BusinessDay5#mmSystemIdentification
	 * BusinessDay5.mmSystemIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BusinessDay1, List<SystemIdentification2Choice>> mmSystemIdentification = new MMMessageAssociationEnd<BusinessDay1, List<SystemIdentification2Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessDay1.mmObject();
			isDerived = false;
			xmlTag = "SysId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SystemIdentification";
			definition = "Identification of a particular market infrastructure.";
			nextVersions_lazy = () -> Arrays.asList(BusinessDay3.mmSystemIdentification, BusinessDay5.mmSystemIdentification);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SystemIdentification2Choice.mmObject();
		}

		@Override
		public List<SystemIdentification2Choice> getValue(BusinessDay1 obj) {
			return obj.getSystemIdentification();
		}

		@Override
		public void setValue(BusinessDay1 obj, List<SystemIdentification2Choice> value) {
			obj.setSystemIdentification(value);
		}
	};
	@XmlElement(name = "BizDayOrErr", required = true)
	protected BusinessDayReportOrError2Choice businessDayOrError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.BusinessDayReportOrError2Choice
	 * BusinessDayReportOrError2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.BusinessDay1 BusinessDay1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizDayOrErr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessDayOrError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Requested information on the system availability for a specific business day or business error when information has not been found."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BusinessDay3#mmBusinessDayOrError
	 * BusinessDay3.mmBusinessDayOrError}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.BusinessDay5#mmBusinessDayOrError
	 * BusinessDay5.mmBusinessDayOrError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<BusinessDay1, BusinessDayReportOrError2Choice> mmBusinessDayOrError = new MMMessageAssociationEnd<BusinessDay1, BusinessDayReportOrError2Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.BusinessDay1.mmObject();
			isDerived = false;
			xmlTag = "BizDayOrErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessDayOrError";
			definition = "Requested information on the system availability for a specific business day or business error when information has not been found.";
			nextVersions_lazy = () -> Arrays.asList(BusinessDay3.mmBusinessDayOrError, BusinessDay5.mmBusinessDayOrError);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BusinessDayReportOrError2Choice.mmObject();
		}

		@Override
		public BusinessDayReportOrError2Choice getValue(BusinessDay1 obj) {
			return obj.getBusinessDayOrError();
		}

		@Override
		public void setValue(BusinessDay1 obj, BusinessDayReportOrError2Choice value) {
			obj.setBusinessDayOrError(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.BusinessDay1.mmSystemIdentification, com.tools20022.repository.msg.BusinessDay1.mmBusinessDayOrError);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "BusinessDay1";
				definition = "Reports on business day information.";
				nextVersions_lazy = () -> Arrays.asList(BusinessDay3.mmObject(), BusinessDay5.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<SystemIdentification2Choice> getSystemIdentification() {
		return systemIdentification == null ? systemIdentification = new ArrayList<>() : systemIdentification;
	}

	public BusinessDay1 setSystemIdentification(List<SystemIdentification2Choice> systemIdentification) {
		this.systemIdentification = Objects.requireNonNull(systemIdentification);
		return this;
	}

	public BusinessDayReportOrError2Choice getBusinessDayOrError() {
		return businessDayOrError;
	}

	public BusinessDay1 setBusinessDayOrError(BusinessDayReportOrError2Choice businessDayOrError) {
		this.businessDayOrError = Objects.requireNonNull(businessDayOrError);
		return this;
	}
}
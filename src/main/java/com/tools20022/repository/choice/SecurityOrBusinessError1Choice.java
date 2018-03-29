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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.BusinessError1;
import com.tools20022.repository.msg.SecurityAttributes3;
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
 * Provides the financial instruments details or the business error.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityOrBusinessError1Choice#mmSecurityReport
 * SecurityOrBusinessError1Choice.mmSecurityReport}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityOrBusinessError1Choice#mmBusinessError
 * SecurityOrBusinessError1Choice.mmBusinessError}</li>
 * </ul>
 * </li>
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
 * "SecurityOrBusinessError1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the financial instruments details or the business error."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecurityOrBusinessError2Choice
 * SecurityOrBusinessError2Choice}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecurityOrBusinessError1Choice", propOrder = {"securityReport", "businessError"})
public class SecurityOrBusinessError1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "SctyRpt", required = true)
	protected List<SecurityAttributes3> securityReport;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SecurityAttributes3
	 * SecurityAttributes3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityOrBusinessError1Choice
	 * SecurityOrBusinessError1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctyRpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecurityReport"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the financial instruments details."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityOrBusinessError2Choice#mmSecurityReport
	 * SecurityOrBusinessError2Choice.mmSecurityReport}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityOrBusinessError1Choice, List<SecurityAttributes3>> mmSecurityReport = new MMMessageAssociationEnd<SecurityOrBusinessError1Choice, List<SecurityAttributes3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityOrBusinessError1Choice.mmObject();
			isDerived = false;
			xmlTag = "SctyRpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecurityReport";
			definition = "Provides the financial instruments details.";
			nextVersions_lazy = () -> Arrays.asList(SecurityOrBusinessError2Choice.mmSecurityReport);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SecurityAttributes3.mmObject();
		}

		@Override
		public List<SecurityAttributes3> getValue(SecurityOrBusinessError1Choice obj) {
			return obj.getSecurityReport();
		}

		@Override
		public void setValue(SecurityOrBusinessError1Choice obj, List<SecurityAttributes3> value) {
			obj.setSecurityReport(value);
		}
	};
	@XmlElement(name = "BizErr", required = true)
	protected List<BusinessError1> businessError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.BusinessError1
	 * BusinessError1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecurityOrBusinessError1Choice
	 * SecurityOrBusinessError1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizErr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides the business error details."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.SecurityOrBusinessError2Choice#mmBusinessError
	 * SecurityOrBusinessError2Choice.mmBusinessError}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecurityOrBusinessError1Choice, List<BusinessError1>> mmBusinessError = new MMMessageAssociationEnd<SecurityOrBusinessError1Choice, List<BusinessError1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.SecurityOrBusinessError1Choice.mmObject();
			isDerived = false;
			xmlTag = "BizErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessError";
			definition = "Provides the business error details.";
			nextVersions_lazy = () -> Arrays.asList(SecurityOrBusinessError2Choice.mmBusinessError);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> BusinessError1.mmObject();
		}

		@Override
		public List<BusinessError1> getValue(SecurityOrBusinessError1Choice obj) {
			return obj.getBusinessError();
		}

		@Override
		public void setValue(SecurityOrBusinessError1Choice obj, List<BusinessError1> value) {
			obj.setBusinessError(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecurityOrBusinessError1Choice.mmSecurityReport, com.tools20022.repository.choice.SecurityOrBusinessError1Choice.mmBusinessError);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "SecurityOrBusinessError1Choice";
				definition = "Provides the financial instruments details or the business error.";
				nextVersions_lazy = () -> Arrays.asList(SecurityOrBusinessError2Choice.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public List<SecurityAttributes3> getSecurityReport() {
		return securityReport == null ? securityReport = new ArrayList<>() : securityReport;
	}

	public SecurityOrBusinessError1Choice setSecurityReport(List<SecurityAttributes3> securityReport) {
		this.securityReport = Objects.requireNonNull(securityReport);
		return this;
	}

	public List<BusinessError1> getBusinessError() {
		return businessError == null ? businessError = new ArrayList<>() : businessError;
	}

	public SecurityOrBusinessError1Choice setBusinessError(List<BusinessError1> businessError) {
		this.businessError = Objects.requireNonNull(businessError);
		return this;
	}
}
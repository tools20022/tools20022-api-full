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
import com.tools20022.repository.choice.CRSSource1Choice;
import com.tools20022.repository.choice.CRSStatus3Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.entity.CRSStatus;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Common Reporting Standard (CRS) status information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.CRSStatus4#mmType
 * CRSStatus4.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CRSStatus4#mmSource
 * CRSStatus4.mmSource}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CRSStatus4#mmExceptionalReportingCountry
 * CRSStatus4.mmExceptionalReportingCountry}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CRSStatus CRSStatus}</li>
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
 * "CRSStatus4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Common Reporting Standard (CRS) status information."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CRSStatus4", propOrder = {"type", "source", "exceptionalReportingCountry"})
public class CRSStatus4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CRSStatus3Choice type;
	/**
	 * Common Reporting Standard (CRS) status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.CRSStatus3Choice
	 * CRSStatus3Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CRSStatus#mmCRSStatus
	 * CRSStatus.mmCRSStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.CRSStatus4
	 * CRSStatus4}</li>
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
	 * definition} = "Common Reporting Standard (CRS) status."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CRSStatus.mmCRSStatus;
			componentContext_lazy = () -> CRSStatus4.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Common Reporting Standard (CRS) status.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CRSStatus3Choice.mmObject();
		}
	};
	protected CRSSource1Choice source;
	/**
	 * Source of the Common Reporting Standard (CRS) status.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.CRSSource1Choice
	 * CRSSource1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CRSStatus#mmCRSSourceStatus
	 * CRSStatus.mmCRSSourceStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.CRSStatus4
	 * CRSStatus4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Src"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Source"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Source of the Common Reporting Standard (CRS) status."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSource = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CRSStatus.mmCRSSourceStatus;
			componentContext_lazy = () -> CRSStatus4.mmObject();
			isDerived = false;
			xmlTag = "Src";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Source";
			definition = "Source of the Common Reporting Standard (CRS) status.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CRSSource1Choice.mmObject();
		}
	};
	protected CountryCode exceptionalReportingCountry;
	/**
	 * Reporting country for the CRS status when there is an exception at the
	 * country level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CRSStatus#mmExceptionalReportingCountry
	 * CRSStatus.mmExceptionalReportingCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.CRSStatus4
	 * CRSStatus4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XcptnlRptgCtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExceptionalReportingCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reporting country for the CRS status when there is an exception at the country level."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExceptionalReportingCountry = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CRSStatus.mmExceptionalReportingCountry;
			componentContext_lazy = () -> CRSStatus4.mmObject();
			isDerived = false;
			xmlTag = "XcptnlRptgCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExceptionalReportingCountry";
			definition = "Reporting country for the CRS status when there is an exception at the country level.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CRSStatus4.mmType, CRSStatus4.mmSource, CRSStatus4.mmExceptionalReportingCountry);
				trace_lazy = () -> CRSStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CRSStatus4";
				definition = "Common Reporting Standard (CRS) status information.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Tp", required = true)
	public CRSStatus3Choice getType() {
		return type;
	}

	public void setType(CRSStatus3Choice type) {
		this.type = type;
	}

	@XmlElement(name = "Src")
	public CRSSource1Choice getSource() {
		return source;
	}

	public void setSource(CRSSource1Choice source) {
		this.source = source;
	}

	@XmlElement(name = "XcptnlRptgCtry")
	public CountryCode getExceptionalReportingCountry() {
		return exceptionalReportingCountry;
	}

	public void setExceptionalReportingCountry(CountryCode exceptionalReportingCountry) {
		this.exceptionalReportingCountry = exceptionalReportingCountry;
	}
}